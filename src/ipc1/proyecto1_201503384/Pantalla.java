/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc1.proyecto1_201503384;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.*;

/**
 *
 * @author diego
 */
public class Pantalla {

    private ListadoUsuario listadoUsuario = new ListadoUsuario();
    JFrame pantallaPrincipal;
    PanelPantallaPrincipal panelPantallaPrincipal;
    JFrame pantallaLogin;
    PantallaLogin panelPantallaLogin;
    JFrame pantallaUsuarioAdmin;
    PantallaUsuarioAdmin panelPantallaUsuarioAdmin;
    JFrame pantallaCrearUsuario;
    JFrame pantallaModificarUsuario;
    JFrame pantallaEliminarUsuario;
    PantallaCrudUsuario panelPantallaCrudUsuario;

    public void crearPantallaPrincipal() {
        pantallaPrincipal = new JFrame("IPC PROYECTO 1");
        pantallaPrincipal.setSize(1000, 700);
        pantallaPrincipal.setLocationRelativeTo(null);
        pantallaPrincipal.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelPantallaPrincipal = new PanelPantallaPrincipal();
        pantallaPrincipal.add(panelPantallaPrincipal);
        pantallaPrincipal.setVisible(true);
    }

    public void crearPantallaLogin() {
        pantallaLogin = new JFrame("LOGIN");
        pantallaLogin.setSize(400, 400);
        pantallaLogin.setLocationRelativeTo(null);
        pantallaLogin.setVisible(true);
        panelPantallaLogin = new PantallaLogin(pantallaPrincipal, pantallaLogin);
        pantallaLogin.add(panelPantallaLogin);

    }

    public void crearPantallaUsuarioAdmin() {
        pantallaUsuarioAdmin = new JFrame("USUARIO ADMINISTRADOR");
        pantallaUsuarioAdmin.setSize(650, 700);
        pantallaUsuarioAdmin.setLocationRelativeTo(null);
        pantallaUsuarioAdmin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelPantallaUsuarioAdmin = new PantallaUsuarioAdmin(pantallaUsuarioAdmin);
        pantallaUsuarioAdmin.add(panelPantallaUsuarioAdmin);
        pantallaUsuarioAdmin.setVisible(true);
    }

    public void crearUsuario() {
        pantallaCrearUsuario = new JFrame("CREAR USUARIO");
        pantallaCrearUsuario.setSize(650, 550);
        pantallaCrearUsuario.setLocationRelativeTo(null);
        pantallaCrearUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelPantallaCrudUsuario = new PantallaCrudUsuario("crear", pantallaCrearUsuario, pantallaUsuarioAdmin, listadoUsuario);
        pantallaCrearUsuario.add(panelPantallaCrudUsuario);
        pantallaCrearUsuario.setVisible(true);
    }

    public void modificarUsuario() {
        pantallaModificarUsuario = new JFrame("MODIFICAR USUARIO");
        pantallaModificarUsuario.setSize(650, 550);
        pantallaModificarUsuario.setLocationRelativeTo(null);
        pantallaModificarUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelPantallaCrudUsuario = new PantallaCrudUsuario("modificar", pantallaModificarUsuario, pantallaUsuarioAdmin, listadoUsuario);
        pantallaModificarUsuario.add(panelPantallaCrudUsuario);
        pantallaModificarUsuario.setVisible(true);
    }

    public void eliminarUsuario() {
        pantallaEliminarUsuario = new JFrame("ELIMINAR USUARIO");
        pantallaEliminarUsuario.setSize(650, 550);
        pantallaEliminarUsuario.setLocationRelativeTo(null);
        pantallaEliminarUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelPantallaCrudUsuario = new PantallaCrudUsuario("eliminar", pantallaEliminarUsuario, pantallaUsuarioAdmin, listadoUsuario);
        pantallaEliminarUsuario.add(panelPantallaCrudUsuario);
        pantallaEliminarUsuario.setVisible(true);
    }

    /*public void mostrarUsuario() {
        pantallaCrearUsuario = new JFrame("VER USUARIOS");
        pantallaCrearUsuario.setSize(650, 700);
        pantallaCrearUsuario.setLocationRelativeTo(null);
        pantallaCrearUsuario.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        panelPantallaCrudUsuario = new PantallaCrudUsuario("mostrar");
        pantallaCrearUsuario.add(panelPantallaCrudUsuario);
        pantallaCrearUsuario.setVisible(true);
    }*/

    class PanelPantallaPrincipal extends JPanel {

        JPanel panelLogo;
        JPanel panelInicio;
        private JButton btn_login;
        private JButton btn_logout;
        private JButton btn_about;
        private JLabel lbl_img;
        private JLabel lbl_titulo_noticias;
        private JTextArea txt_noticias;

        public PanelPantallaPrincipal() {
            setLayout(null);
            setBackground(Color.gray);

            ActionListener login = new Login();

            panelInicio = new JPanel();
            panelInicio.setLayout(null);
            panelInicio.setBounds(50, 40, 875, 80);
            panelInicio.setBackground(Color.gray);

            btn_login = new JButton("Login");
            btn_login.setBounds(645, 25, 80, 35);
            btn_login.addActionListener(login);

            btn_logout = new JButton("Logout");
            btn_logout.setBounds(760, 25, 80, 35);

            panelInicio.add(btn_login);
            panelInicio.add(btn_logout);
            add(panelInicio);

            panelLogo = new JPanel();
            panelLogo.setLayout(null);
            panelLogo.setBounds(65, 170, 400, 400);

            lbl_img = new JLabel(new ImageIcon("usac_logo.jpg"));
            lbl_img.setBounds(0, 0, 400, 400);

            panelLogo.add(lbl_img);
            add(panelLogo);

            lbl_titulo_noticias = new JLabel("NOTICIAS");
            lbl_titulo_noticias.setBounds(675, 200, 75, 25);

            add(lbl_titulo_noticias);

            txt_noticias = new JTextArea();
            txt_noticias.setBounds(500, 250, 400, 200);
            txt_noticias.setEditable(false);
            txt_noticias.setBackground(Color.gray);
            txt_noticias.setText("ddddddddddddddddddddddddddddddddddddddddddddddddd\n"
                    + "ddddddddddddddddd\ndddddddddddddddddddddddddddddd\ndddddddd"
                    + "ddddddddddddddd\ndddddddddddddddddddddddddddddddddd\nddddddd"
                    + "ddddddddddddddddddd\ndddddddddddddddddddddddddddddddd\nddddddd"
                    + "fdassssssssssssssssssfaaa\naaaaaaaaaaaaaaaaaaaaaaaaaa");

            add(txt_noticias);

            btn_about = new JButton("About");
            btn_about.setBounds(100, 600, 80, 30);

            add(btn_about);
        }

        private class Login implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e) {
                crearPantallaLogin();
            }
        }
    }

}
