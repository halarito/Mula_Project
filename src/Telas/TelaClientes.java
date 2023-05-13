package Telas;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.JRadioButton;
import javax.swing.GroupLayout;

public class TelaClientes extends JInternalFrame {

    Connection conexao = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    JTextField txtNome = new JTextField();
    JTextField txtId = new JTextField();
    JTextField txtBairro = new JTextField();
    JTextField txtIdade = new JTextField();
    JTextField txtBi = new JTextField();
    JRadioButton radio1 = new JRadioButton("M");
    JRadioButton radio2 = new JRadioButton("F");
    JTextField txtnome1 = new JTextField();
    JTextField txtdata = new JTextField();
    JTextArea textsint = new JTextArea();
    JTextArea textrec = new JTextArea();
    JPanel painel = new JPanel();
    Font fonte = new Font("Stencil", Font.BOLD, 40);
    JLabel label1 = new JLabel("TELA DE CLIENTES");
    JLabel label2 = new JLabel("Dados Pessoais");
    JLabel label4 = new JLabel("Nome:");
    JSeparator saparator = new JSeparator();
    JLabel label5 = new JLabel("ID:");
    JLabel label6 = new JLabel("Bairro:");
    JLabel label7 = new JLabel("Idade:");
    JLabel label8 = new JLabel("BI nr.:");
    JLabel label9 = new JLabel("Gén.:");
    JLabel label3 = new JLabel("Doencas");
    JSeparator saparator1 = new JSeparator();
    JSeparator saparator2 = new JSeparator();
    JLabel label10 = new JLabel("Nome:");
    JLabel label11 = new JLabel("Data:");
    JLabel label12 = new JLabel("Sintomas:");
    JLabel label13 = new JLabel("Receita:");
    JButton bregistrar = new JButton("Cadastrar");
    JButton bmudar = new JButton("Editar");
    JButton beliminar = new JButton("Eliminar");
    JButton blimpar = new JButton("Limpar");
    String genero;
    GroupLayout layout;

    private void Componentes() {

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

        painel.setLayout(null);
        painel.setBackground(Color.LIGHT_GRAY);
        painel.setBounds(1, 1, 888, 700);

        label1.setBounds(60, 20, 600, 40);
        label1.setHorizontalAlignment(JLabel.CENTER);
        label1.setFont(new Font("Stencil", Font.BOLD, 24));

        label2.setBounds(250, 115, 200, 20);
        label2.setHorizontalAlignment(JLabel.CENTER);
        label2.setFont(new Font("timesnewroman", Font.BOLD, 24));

        saparator.setBounds(200, 145, 300, 5);
        saparator.setBackground(new Color(0, 0, 0));

        label4.setBounds(100, 165, 80, 30);
        label4.setHorizontalAlignment(JLabel.CENTER);
        label4.setFont(new Font("Tahoma", Font.ITALIC, 16));

        txtNome.setBounds(185, 165, 250, 30);
        txtNome.setHorizontalAlignment(JTextField.CENTER);

        label5.setBounds(445, 165, 50, 30);
        label5.setHorizontalAlignment(JLabel.CENTER);
        label5.setFont(new Font("Tahoma", Font.ITALIC, 16));

        txtId.setBounds(500, 165, 80, 30);
        txtId.setHorizontalAlignment(JTextField.CENTER);

        label6.setBounds(100, 205, 80, 30);
        label6.setHorizontalAlignment(JLabel.CENTER);
        label6.setFont(new Font("Tahoma", Font.ITALIC, 16));

        txtBairro.setBounds(185, 205, 250, 30);
        txtBairro.setHorizontalAlignment(JTextField.CENTER);

        label7.setBounds(445, 205, 50, 30);
        label7.setHorizontalAlignment(JLabel.CENTER);
        label7.setFont(new Font("Tahoma", Font.ITALIC, 16));

        txtIdade.setBounds(500, 205, 80, 30);
        txtIdade.setHorizontalAlignment(JTextField.CENTER);

        label8.setBounds(100, 245, 80, 30);
        label8.setHorizontalAlignment(JLabel.CENTER);
        label8.setFont(new Font("Tahoma", Font.ITALIC, 16));

        txtBi.setBounds(185, 245, 250, 30);
        txtBi.setHorizontalAlignment(JTextField.CENTER);

        label9.setBounds(445, 245, 50, 30);
        label9.setHorizontalAlignment(JLabel.CENTER);
        label9.setFont(new Font("Tahoma", Font.ITALIC, 16));

        radio1.setBounds(500, 245, 35, 30);

        radio2.setBounds(545, 245, 35, 30);

        ButtonGroup bg = new ButtonGroup();

        bg.add(radio1);
        bg.add(radio2);

        label3.setBounds(240, 300, 200, 20);
        label3.setHorizontalAlignment(JLabel.CENTER);
        label3.setFont(new Font("timesnewroman", Font.BOLD, 24));

        saparator1.setBounds(200, 335, 290, 5);
        saparator1.setBackground(new Color(0, 0, 0));

        saparator2.setBounds(20, 510, 650, 5);
        saparator2.setBackground(new Color(0, 0, 0));

        label10.setBounds(100, 350, 80, 30);
        label10.setHorizontalAlignment(JLabel.CENTER);
        label10.setFont(new Font("Tahoma", Font.ITALIC, 16));

        txtnome1.setBounds(185, 350, 250, 30);
        txtnome1.setHorizontalAlignment(JTextField.CENTER);

        label11.setBounds(440, 350, 40, 30);
        label11.setHorizontalAlignment(JLabel.CENTER);
        label11.setFont(new Font("Tahoma", Font.ITALIC, 16));

        txtdata.setBounds(500, 350, 80, 30);
        txtdata.setHorizontalAlignment(JTextField.CENTER);

        textsint.setBounds(100, 420, 225, 80);

        textrec.setBounds(350, 420, 225, 80);

        label12.setBounds(100, 385, 100, 30);
        label12.setFont(new Font("Tahoma", Font.ITALIC, 16));

        label13.setBounds(350, 385, 100, 30);
        label13.setFont(new Font("Tahoma", Font.ITALIC, 16));

        bregistrar.setBounds(50, 520, 120, 40);
        bregistrar.setForeground(Color.BLACK);
        bregistrar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrar();
            }
        });

        bmudar.setBounds(200, 520, 120, 40);
        bmudar.setForeground(Color.BLACK);
        bmudar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                editar();
            }
        });

        beliminar.setBounds(350, 520, 120, 40);
        beliminar.setForeground(Color.BLACK);
        beliminar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                eliminar();
            }
        });

        blimpar.setBounds(500, 520, 120, 40);
        blimpar.setForeground(Color.BLACK);
        blimpar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                if (JOptionPane.showConfirmDialog(rootPane, "Limpar Campos?", "Confirme", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    limpar();
                }
            }
        });

        painel.add(label1);
        add(painel);
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
        add(label13);
        add(txtNome);
        add(txtId);
        add(txtBi);
        add(txtdata);
        add(radio1);
        add(radio2);
        add(txtIdade);
        add(textsint);
        add(textrec);
        add(txtBairro);
        add(txtnome1);

        add(beliminar);
        add(blimpar);
        add(bmudar);
        add(bregistrar);

        add(saparator);
        add(saparator1);
        add(saparator2);

        pack();
    }

    public TelaClientes() {

        Componentes();

        conexao = Modulo.Conexaco.conector();

    }

    private void cadastrar() {

        String cadastrar = "insert into utente (nome, bairro, bi, idade, genero, nomeD, dataD, sintomasD, receitaD) values(?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            pst = conexao.prepareStatement(cadastrar);

            //System.out.println(conexao);
            pst.setString(1, txtNome.getText());
            pst.setString(2, txtBairro.getText());
            pst.setString(3, txtBi.getText());
            pst.setString(4, txtIdade.getText());

            if (radio1.isSelected()) {
                genero = "Masculio";
            } else if (radio2.isSelected()) {
                genero = "Femenino";
            }

            pst.setString(5, genero);
            pst.setString(6, txtnome1.getText());
            pst.setString(7, txtdata.getText());
            pst.setString(8, textsint.getText());
            pst.setString(9, textsint.getText());

            if (txtNome.getText().isEmpty() || txtnome1.getText().isEmpty() || textrec.getText().isEmpty() || txtBairro.getText().isEmpty() || txtBi.getText().isEmpty() || textsint.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos por favor!");
            } else {
                int cad = JOptionPane.showConfirmDialog(rootPane, "Cadastrar novo utente?", "Confirme", JOptionPane.YES_NO_OPTION);
                if (cad == JOptionPane.YES_OPTION) {
                    int ca = pst.executeUpdate();
                    if (ca > 0) {
                        JOptionPane.showMessageDialog(null, "Utente registrado com sucesso");
                    } else {
                        JOptionPane.showMessageDialog(null, "registro não sucedida");
                    }
                }

            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }

    private void editar() {

        String edit = "update utente set nome = ?, bairro = ?, bi = ?, idade = ?, genero = ?, nomeD = ?, dataD = ?, sintomasD = ?, receitaD = ? where id = ?";

        try {

            String id = txtId.getText();

            pst = conexao.prepareStatement(edit);

            pst.setString(1, txtNome.getText());
            pst.setString(2, txtBairro.getText());
            pst.setString(3, txtBi.getText());
            pst.setString(4, txtIdade.getText());

            if (radio1.isSelected()) {
                genero = "Masculio";
            } else if (radio2.isSelected()) {
                genero = "Femenino";
            }

            pst.setString(5, genero);
            pst.setString(6, txtnome1.getText());
            pst.setString(7, txtdata.getText());
            pst.setString(8, textsint.getText());
            pst.setString(9, textsint.getText());

            pst.setString(10, id);

            if (txtNome.getText().isEmpty() || txtnome1.getText().isEmpty() || textrec.getText().isEmpty() || txtBairro.getText().isEmpty() || txtBi.getText().isEmpty() || textsint.getText().isEmpty()) {
                JOptionPane.showMessageDialog(null, "Preencha todos os campos por favor!");
            } else {
                int editar = JOptionPane.showConfirmDialog(rootPane, "Editar utente? ", "Confirme", JOptionPane.YES_NO_OPTION);

                if (editar == JOptionPane.YES_OPTION) {

                    int update = pst.executeUpdate();

                    if (update > 0) {
                        JOptionPane.showMessageDialog(rootPane, "Utente actualizado com sucesso!");

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

        String eliminar = "delete from utente where id = ?";

        try {

            if (!"".equals(txtId.getText())) {

                String id = txtId.getText();

                pst = conexao.prepareStatement(eliminar);

                pst.setString(1, id);

                int eliminar_ = JOptionPane.showConfirmDialog(rootPane, "Eliminar Usuário? ", "Confirme", JOptionPane.YES_NO_OPTION);

                if (eliminar_ == JOptionPane.YES_OPTION) {
                    int apagar = pst.executeUpdate();

                    if (apagar > 0) {
                        JOptionPane.showMessageDialog(rootPane, "Utente Eliminado com sucesso!");

                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Eliminação nao sucedida!");

                    }
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Insira o id do Utente");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);

        }

    }

    private void limpar() {

        txtId.setText(null);
        txtNome.setText(null);
        txtBairro.setText(null);
        textrec.setText(null);
        textsint.setText(null);
        txtBi.setText(null);
        txtIdade.setText(null);
        txtnome1.setText(null);
        txtdata.setText(null);

    }

}
