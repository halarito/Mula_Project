package Telas;

import javafx.scene.text.Font;
import javax.swing.*;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Modulo.Conexaco;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    JTextField t1 = new JTextField();
    JPasswordField t2 = new JPasswordField();
JFrame tela1 = new JFrame("Tela De Login");
    public Login() {
        conexao = Modulo.Conexaco.conector();
        
        tela1.setBounds(550, 200, 300, 400);
        tela1.setLayout(null);
       

        java.awt.Font letra3 = new java.awt.Font("Traditional Aribic", java.awt.Font.ITALIC, 18);
        JLabel l1 = new JLabel("Insira as suas credenciais");
        l1.setBounds(20, 130, 250, 30);
        l1.setHorizontalAlignment(JLabel.CENTER);
        l1.setFont(letra3);

        JLabel l2 = new JLabel("Nome do usuário: ");
        l2.setBounds(20, 170, 250, 30);

        t1.setBounds(20, 200, 250, 30);

        JLabel l3 = new JLabel("Palavra passe: ");
        l3.setBounds(20, 240, 250, 30);

        t2.setBounds(20, 270, 250, 30);

        JButton b1 = new JButton("Sair");
        b1.setBounds(20, 320, 80, 30);
        b1.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                System.exit(0);
            
            }
        });
        
        JButton b2 = new JButton("Entrar");
        b2.setBounds(190, 320, 80, 30);
     
b2.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                entrar();
            }
        });

        JSeparator js1 = new JSeparator();
        js1.setBounds(20, 120, 250, 10);

        java.awt.Font letra1 = new java.awt.Font("Stencil", java.awt.Font.BOLD, 36);
        java.awt.Font letra2 = new java.awt.Font("Stencil", java.awt.Font.BOLD, 27);
        JLabel l4 = new JLabel("LOIDY NGUENHA");
        l4.setBounds(10, 50, 260, 50);
        l4.setHorizontalAlignment(JLabel.CENTER);
        l4.setFont(letra2);

        JLabel l5 = new JLabel(" HOSPITAL");
        l5.setBounds(10, 10, 260, 50);
        l5.setHorizontalAlignment(JLabel.CENTER);
        l5.setFont(letra1);

        tela1.add(l1);
        tela1.add(l2);
        tela1.add(l3);
        tela1.add(l4);
        tela1.add(l5);

        tela1.add(t1);
        tela1.add(t2);

        tela1.add(b1);
        tela1.add(b2);

        tela1.add(js1);

        tela1.setVisible(true);

    }

    void entrar() {

        String centrar = "select * from usuario where usuario = ? and senha = ?";

        try {
            System.out.println(conexao);
            pst = conexao.prepareStatement(centrar);
            
            pst.setString(1, t1.getText());
            pst.setString(2, t2.getText());

            rs = pst.executeQuery();

            if (rs.next()) {

                
                Telaprincipal tela = new Telaprincipal();
                tela.setVisible(true);
                tela1.dispose();


            } else {
                System.out.println(conexao);
                JOptionPane.showMessageDialog(null, "Senha ou usuario incorrecto");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }

    }
    
    public static void main(String[] args) {

        new Login();
    }

}
