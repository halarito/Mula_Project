package Telas;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JTextField;
import Modulo.Conexaco;
import javax.swing.Action;
import javax.swing.GroupLayout;
import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;

public class TelaUsuario extends JInternalFrame{

    private Font fonte1;

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    GroupLayout layout;
    JTextField textfieldID = new JTextField();
    JTextField textfield1 = new JTextField();
    JTextField textfield2 = new JTextField();
    JTextField textfield3 = new JTextField();
    JTextField textfield4 = new JTextField();
    JTextField textfield5 = new JTextField();
    JTextField textfield6 = new JTextField();
    JTextField textfield7 = new JTextField();

    JComboBox cbnat = new JComboBox();
    JComboBox cbtempo = new JComboBox();
    JComboBox cbexpecializ = new JComboBox();

    public TelaUsuario() {

        conexao = Conexaco.conector();

        layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGap(0, 567, Short.MAX_VALUE)
        );
        
        JPanel painel1 = new JPanel();
        painel1.setLayout(null);
        painel1.setBackground(Color.LIGHT_GRAY);
        painel1.setBounds(1, 1, 888, 120);
        // ImageIcon view = new ImageIcon().getResource("IMG_4547.jpg"));
        Font fonte = new Font("stencil", Font.BOLD, 40);

        JLabel label1 = new JLabel(" TELA DE USUARIOS");
        label1.setBounds(60, 40, 600, 50);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setFont(new Font("Stencil", Font.BOLD, 36));

        JSeparator saparator = new JSeparator();
        saparator.setBounds(1, 30, 900, 5);
        saparator.setBackground(new Color(0, 0, 0));

        JLabel label2 = new JLabel(" Dados Pessoais");
        label2.setBounds(70, 145, 200, 20);
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setFont(new Font("Tahoma", Font.BOLD, 24));

        JSeparator saparator3 = new JSeparator();
        saparator3.setBounds(30, 175, 300, 5);
        saparator3.setBackground(new Color(0, 0, 0));
        saparator3.setOrientation(JSeparator.HORIZONTAL);

        JLabel label12 = new JLabel("ID:");
        label12.setBounds(5, 195, 100, 30);
        label12.setHorizontalAlignment(JLabel.CENTER);
        label12.setFont(new Font("Tahoma", Font.ITALIC, 12));

        textfieldID.setBounds(110, 195, 200, 30);

        JLabel label3 = new JLabel("NOME:");
        label3.setBounds(5, 230, 100, 30);
        label3.setHorizontalAlignment(JLabel.CENTER);
        label3.setFont(new Font("Tahoma", Font.ITALIC, 12));

        textfield1.setBounds(110, 230, 200, 30);

        JLabel label4 = new JLabel("APELIDO:");
        label4.setBounds(5, 265, 100, 30);
        label4.setHorizontalAlignment(JLabel.CENTER);
        label4.setFont(new Font("Tahoma", Font.ITALIC, 12));

        textfield2.setBounds(110, 265, 200, 30);

        JLabel label5 = new JLabel("BI:");
        label5.setBounds(5, 300, 100, 30);
        label5.setHorizontalAlignment(JLabel.CENTER);
        label5.setFont(new Font("Tahoma", Font.ITALIC, 12));

        //JTextField textfield3 = new JTextField();
        textfield3.setBounds(110, 300, 200, 30);

        JLabel label6 = new JLabel("IDADE:");
        label6.setBounds(5, 335, 100, 30);
        label6.setHorizontalAlignment(JLabel.CENTER);
        label6.setFont(new Font("timesnewroman", Font.ITALIC, 12));

        //JTextField textfield4 = new JTextField();
        textfield4.setBounds(110, 335, 200, 30);

        JLabel label7 = new JLabel("BAIRRO:");
        label7.setBounds(5, 370, 100, 30);
        label7.setHorizontalAlignment(JLabel.CENTER);
        label7.setFont(new Font("Tahoma", Font.ITALIC, 12));

        //JTextField textfield5 = new JTextField();
        textfield5.setBounds(110, 370, 200, 30);

        JLabel label18 = new JLabel("USUARIO:");
        label18.setBounds(5, 405, 100, 30);
        label18.setHorizontalAlignment(JLabel.CENTER);
        label18.setFont(new Font("Tahoma", Font.ITALIC, 12));

        //JTextField textfield5 = new JTextField();
        textfield6.setBounds(110, 405, 200, 30);
        
        JLabel label19 = new JLabel("SENHA:");
        label19.setBounds(5, 440, 100, 30);
        label19.setHorizontalAlignment(JLabel.CENTER);
        label19.setFont(new Font("Tahoma", Font.ITALIC, 12));

        //JTextField textfield5 = new JTextField();
        textfield7.setBounds(110, 440, 200, 30);
        
        JSeparator saparator1 = new JSeparator();
        saparator1.setBounds(350, 130, 5, 350);
        saparator1.setBackground(new Color(0, 0, 0));
        saparator1.setOrientation(JSeparator.VERTICAL);

        JLabel label8 = new JLabel(" Dados Profissionais");
        label8.setBounds(270, 145, 500, 20);
        label8.setHorizontalAlignment(JLabel.CENTER);
        label8.setFont(new Font("Tahoma ", Font.BOLD, 24));

        JSeparator saparator4 = new JSeparator();
        saparator4.setBounds(380, 175, 300, 5);
        saparator4.setBackground(new Color(0, 0, 0));
        saparator4.setOrientation(JSeparator.HORIZONTAL);

        JLabel label9 = new JLabel("NIVEL ACADEMICO");
        label9.setBounds(360, 265, 150, 30);
        label9.setHorizontalAlignment(JLabel.CENTER);
        label9.setFont(new Font("Tahoma", Font.ITALIC, 12));

        cbnat.setBounds(515, 265, 140, 30);
        cbnat.setForeground(Color.BLACK);
        cbnat.setFont(fonte1);

        cbnat.addItem("LICENCIATURA");
        cbnat.addItem("MESTRADO");
        cbnat.addItem("DOUTORADO");
        cbnat.addItem("PHD");

        JLabel label10 = new JLabel("TEMPO DE EXPERIENCIA");
        label10.setBounds(360, 300, 150, 30);
        label10.setHorizontalAlignment(JLabel.CENTER);
        label10.setFont(new Font("Tahoma", Font.ITALIC, 12));

        cbtempo.setBounds(515, 300, 140, 30);
        cbtempo.setForeground(Color.BLACK);
        cbtempo.setFont(fonte1);

        cbtempo.addItem("1 ANO DE EXPERIENCIA");
        cbtempo.addItem("2 ANOS DE EXPERIENCIA");
        cbtempo.addItem("3 ANOS DE EXPERIENCIA");
        cbtempo.addItem("4 ANOS DE EXPERIENCIA");

        JLabel label11 = new JLabel("AREA DE EXPECIALIZ");
        label11.setBounds(360, 335, 150, 30);
        label11.setHorizontalAlignment(JLabel.CENTER);
        label11.setFont(new Font("Tahoma", Font.ITALIC, 12));

        cbexpecializ.setBounds(515, 335, 140, 30);
        cbexpecializ.setForeground(Color.BLACK);
        cbexpecializ.setFont(fonte1);

        cbexpecializ.addItem("ANATOMIA");
        cbexpecializ.addItem("PSIQUIATRIA");
        cbexpecializ.addItem("DERMATOLOGIA");
        cbexpecializ.addItem("OFTALMOLOGISTA");
        cbexpecializ.addItem("ANATOMIA");
        cbexpecializ.addItem("CLINICA");
        cbexpecializ.addItem("CIRUGIA");
        cbexpecializ.addItem("LABORATORIAL");

        JSeparator saparator2 = new JSeparator();
        saparator2.setBounds(1, 485, 800, 5);
        saparator2.setBackground(new Color(0, 0, 0));
        saparator2.setOrientation(JSeparator.HORIZONTAL);

        JButton bregistrar = new JButton("Cadastrar");
        bregistrar.setBounds(50, 515, 120, 40);
        bregistrar.setForeground(Color.BLACK);
        bregistrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
             
                    cadastrar();
                
            }
        });
        //bregistrar.setFont(fonte);

        JButton bmudar = new JButton("Editar");
        bmudar.setBounds(200, 515, 120, 40);
        bmudar.setForeground(Color.BLACK);
        bmudar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                
                
                    editar();
                
                
            }
        });
        
        //bmudar.setFont(fonte);

        JButton beliminar = new JButton("Eliminar");
        beliminar.setBounds(350, 515, 120, 40);
        beliminar.setForeground(Color.BLACK);
        beliminar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                eliminar();
            }
        });
        

        JButton blimpar = new JButton("Limpar");
        blimpar.setBounds(500, 515, 120, 40);
        blimpar.setForeground(Color.BLACK);
        blimpar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (JOptionPane.showConfirmDialog(rootPane, "Limpar Campos?", "Confirme", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    limpar();
                }

            }
        });

       
        painel1.add(label1);
        add(painel1);

        add(label2);
        add(label3);
        add(label4);
        add(label5);
        add(label6);
        add(label7);
        add(label8);
        add(label9);
        add(label10);
        add(label11);
        add(label12);
        add(label18);
        add(label19);
        add(textfield1);
        add(textfield2);
        add(textfield3);
        add(textfield4);
        add(textfield5);
        add(textfield6);
        add(textfield7);
        add(textfieldID);
        add(saparator1);
        add(bregistrar);
        add(bmudar);
        add(beliminar);
        add(blimpar);

        add(cbnat);
        add(cbtempo);
        add(cbexpecializ);
        add(saparator2);
        add(saparator3);
        add(saparator4);

        
        pack();
    }

    private void cadastrar() {
        
        String cadastrar = "insert into usuario (nome, apelido, bi, idade, bairro, nivel_ac, t_experiencia, area, usuario, senha) values(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            pst = conexao.prepareStatement(cadastrar);

            pst.setString(1, textfield1.getText());
            pst.setString(2, textfield2.getText());
            pst.setString(3, textfield3.getText());
            pst.setString(4, textfield4.getText());
            pst.setString(5, textfield5.getText());
            pst.setString(6, (String) cbnat.getSelectedItem());
            pst.setString(7, (String) cbtempo.getSelectedItem());
            pst.setString(8, (String) cbexpecializ.getSelectedItem());
            pst.setString(9, textfield6.getText());
            pst.setString(10, textfield7.getText());

            if (textfield1.getText().isEmpty() || textfield2.getText().isEmpty() || textfield3.getText().isEmpty() || textfield4.getText().isEmpty() || textfield5.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos por favor!");
            } else {
                int cad = JOptionPane.showConfirmDialog(rootPane, "Cadastrar novo usuario?", "Confirme", JOptionPane.YES_NO_OPTION);
                if (cad == JOptionPane.YES_OPTION) {
                    int ca = pst.executeUpdate();
                    if (ca > 0) {
                        JOptionPane.showMessageDialog(null, "Usuário Cadastrado com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(null, "Cadastro não sucedida");
                    }
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void editar() {

        String edit = "update usuario set nome = ?, apelido = ?, bi = ?, idade = ?, bairro = ?, nivel_ac = ?, t_experiencia = ?, area = ?, usuario = ?, senha = ?,  where id = ?";

        try {

            String id = textfieldID.getText();

            pst = conexao.prepareStatement(edit);

            pst.setString(1, textfield1.getText());
            pst.setString(2, textfield2.getText());
            pst.setString(3, textfield3.getText());
            pst.setString(4, textfield4.getText());
            pst.setString(5, textfield5.getText());
            pst.setString(6, (String) cbnat.getSelectedItem());
            pst.setString(7, (String) cbtempo.getSelectedItem());
            pst.setString(8, (String) cbexpecializ.getSelectedItem());
            
            pst.setString(9, textfield6.getText());
            pst.setString(10, textfield7.getText());
            
            pst.setString(11, textfieldID.getText());

            if (textfield1.getText().isEmpty() || textfield2.getText().isEmpty() || textfield3.getText().isEmpty() || textfield4.getText().isEmpty() || textfield5.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos");
            } else {
                int editar = JOptionPane.showConfirmDialog(rootPane, "Editar usuário? ", "Confirme", JOptionPane.YES_NO_OPTION);

                if (editar == JOptionPane.YES_OPTION) {
                    
                    int update = pst.executeUpdate();

                    if (update > 0) {
                        JOptionPane.showMessageDialog(rootPane, "Usuário actualizado com sucesso!");

                    } else {
                        
                        JOptionPane.showMessageDialog(rootPane, "Edição nao sucedida!");

                    }
                }

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }

    }

    private void eliminar() {

        String eliminar = "delete from usuario where id = ?";

        try {

            if (!"".equals(textfieldID.getText())) {

                
                String id = textfieldID.getText();

                pst = conexao.prepareStatement(eliminar);

                pst.setString(1, id);

                int eliminar_ = JOptionPane.showConfirmDialog(rootPane, "Eliminar Usuário? ", "Confirme", JOptionPane.YES_NO_OPTION);

                if (eliminar_ == JOptionPane.YES_OPTION) {
                    int apagar = pst.executeUpdate();

                    if (apagar > 0) {
                        JOptionPane.showMessageDialog(rootPane, "Usuário Eliminado com sucesso!");
                  
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Eliminação nao sucedida!");

                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Insira o id do Usuário");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);

        }
    
        
    }

    private void limpar() {

        textfieldID.setText(null);
        textfield1.setText(null);
        textfield2.setText(null);
        textfield3.setText(null);
        textfield4.setText(null);
        textfield5.setText(null);
        textfield6.setText(null);
        textfield7.setText(null);

    }

}
