package Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.*;

public class Telaprincipal extends JFrame {

    JDesktopPane desktopane = new JDesktopPane();
    ImageIcon view;
    ImageIcon logo01;
public Telaprincipal() {

        this.view = new ImageIcon(getClass().getResource("LOGO3.jpeg"));
        this.logo01 = new ImageIcon(getClass().getResource("LOGO1.jpeg"));

        JFrame main = new JFrame("Hospital Loidy Nguenha");
        main.setBounds(50, 50, 950, 840);
        main.setResizable(false);
        main.setLocationRelativeTo(null);
        main.setDefaultCloseOperation(EXIT_ON_CLOSE);
        main.setLayout(null);
        main.setVisible(true);

        JPanel painel1 = new JPanel();
        painel1.setLayout(null);
        painel1.setBackground(new Color(160, 160, 160));
        painel1.setBounds(1, 1, 942, 160);
        Font fonte = new Font("stencil", Font.BOLD, 36);

        JLabel logo1 = new JLabel(logo01);
        logo1.setBounds(90, 1, 200, 160);
        logo1.setHorizontalAlignment(JLabel.CENTER);
        logo1.setBackground(Color.GRAY);
        
        JLabel foto1 = new JLabel("foto");
        foto1.setBounds(30, 10, 100, 100);
        foto1.setHorizontalAlignment(JLabel.CENTER);
        foto1.setBackground(Color.GRAY);

        JLabel label1 = new JLabel("HOSPITAL LOIDY NGUENHA");
        label1.setBounds(300, 40, 650, 50);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setForeground(new Color(0, 0, 0));
        label1.setFont(fonte);

        JLabel label2 = new JLabel("O nosso maior valor e a vida");
        label2.setBounds(300, 90, 650, 50);
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setForeground(new Color(0, 0, 0));
        label2.setFont(new Font("Tahoma", Font.PLAIN, 24));

        JButton button1 = new JButton("Usuarios");
        button1.setBounds(715, 290, 205, 50);
        button1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                TelaUsuario cli = new TelaUsuario();
                desktopane.add(cli);
                cli.setVisible(true);
            }
        });

        JButton button2 = new JButton("Paciente");
        button2.setBounds(715, 360, 205, 50);
        button2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                TelaClientes cli = new TelaClientes();
                //desktopane.removeAll();
                desktopane.add(cli);
                cli.setVisible(true);
            }
        });

        JButton button3 = new JButton("Sobre nos");
        button3.setBounds(715, 430, 205, 50);

        JSeparator saparator = new JSeparator();
        saparator.setBounds(5, 770, 930, 5);
        saparator.setBackground(new Color(0, 0, 0));

        JLabel label4 = new JLabel(" O nosso maior valor e a vida");
        label4.setBounds(5, 765, 990, 50);
        label4.setHorizontalAlignment(JLabel.CENTER);
        label4.setForeground(new Color(0, 0, 0));
        label4.setFont(new Font("stencil", Font.ITALIC, 10));

        JSeparator saparator1 = new JSeparator();
        saparator1.setBounds(690, 185, 5, 570);
        saparator1.setBackground(new Color(0, 0, 0));
        saparator1.setOrientation(JSeparator.VERTICAL);

        desktopane.setBounds(1, 165, 680, 600);
        desktopane.setLayout(null);

        JLabel foto = new JLabel(view);
        foto.setBounds(1, 50, 670, 500);
        foto.setHorizontalAlignment(JLabel.CENTER);
        //foto.setOpaque(0.5);

        painel1.add(label1);
        painel1.add(label2);
        painel1.add(logo1);

        main.add(desktopane);
        main.add(painel1);
        main.add(button1);
        main.add(button2);
        main.add(button3);
        main.add(saparator);
        main.add(label4);
        desktopane.add(foto);

        main.add(saparator1);

    }

    public static void main(String[] args) {
        new Telaprincipal();
    }
}
