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
import java.net.URL;
import javax.swing.*;

/**
 *
 * @author diego
 */
public class PantallaPrincipal extends JFrame {

    public PantallaPrincipal() {
        setTitle("IPC PROYECTO 1");
        setSize(1000, 700);
        setLocationRelativeTo(null);

        Panel miPanel = new Panel();
        add(miPanel);
    }
}

class Panel extends JPanel {

    private JPanel panelLogo;
    private JPanel panelInicio;
    private JButton btn_login;
    private JButton btn_logout;
    private JLabel lbl_img;

    public Panel() {
        setLayout(null);

        panelInicio = new JPanel();
        panelInicio.setLayout(null);
        panelInicio.setBounds(50, 40, 850, 100);
        panelInicio.setBackground(Color.GRAY);
        
        btn_login = new JButton("Login");
        btn_login.setBounds(655, 25, 80, 50);
        
        btn_logout = new JButton("Logout");
        btn_logout.setBounds(740, 25, 80, 50);
        
        panelInicio.add(btn_login);
        panelInicio.add(btn_logout);
        add(panelInicio);
        
        
        panelLogo = new JPanel();
        panelLogo.setLayout(null);
        panelLogo.setBounds(65, 120, 400, 450);
        
        lbl_img = new JLabel(new ImageIcon("usac_logo.jpg"));
        lbl_img.setBounds(0, 50, 400, 400);
        
        panelLogo.add(lbl_img);
        
        add(panelLogo);
    }
}
