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
public class PantallaPrincipal extends JFrame {

    boolean mostrar;
    PanelPantallaPrincipal panelPantallaPrincipal;

    public PantallaPrincipal() {
        setTitle("IPC PROYECTO 1");
        setSize(1000, 700);
        setLocationRelativeTo(null);
        panelPantallaPrincipal = new PanelPantallaPrincipal();
    }

    public void mostrarPantallaPrincipal(boolean mostrar) {
        if (mostrar == false) {

        } else {
            add(panelPantallaPrincipal);
            panelPantallaPrincipal.setVisible(true);
        }
    }

    public void mostrarPantallaLogin(boolean mostrar) {
        PantallaLogin pantallaLogin = new PantallaLogin();

        if (mostrar == true) {
            pantallaLogin.setVisible(mostrar);
        } else {
            pantallaLogin.setVisible(false);
        }
    }

    public void mostrarPantallaUsuarioAdmin(boolean mostrar) {

    }
}

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
        panelInicio.setBackground(Color.black);

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
            new PantallaPrincipal().mostrarPantallaLogin(true);
        }
    }
}
