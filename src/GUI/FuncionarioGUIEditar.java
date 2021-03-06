/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classe.Funcionario;
import Dados.DadosFuncionario;
import Negocio.NegocioFuncionario;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pichau
 */
public class FuncionarioGUIEditar extends javax.swing.JFrame {

    ArrayList<Funcionario> ListarMatricula = new ArrayList<>();

    public void ResetarTabela() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[]{"Matricula", "Nome", "Cpf", "Rg", "Sálario"});
        jTableEditarFuncionario.setModel(modelo);
    }

    public void ListarFuncionario() {

        try {
            Funcionario funcionario = new Funcionario();
            DadosFuncionario dados = new DadosFuncionario();

            this.ListarMatricula = dados.listarFuncionarios(funcionario);
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();

            for (Funcionario f : this.ListarMatricula) {

                modelo.addElement(f.getMatricula());
            }
            jComboBoxMatriculaFuncionario.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }

    }

    public FuncionarioGUIEditar() {
        initComponents();
        ListarFuncionario();
        ResetarTabela();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextFieldNovoNomeFuncionario = new javax.swing.JTextField();
        jTextFieldNovoCpfFuncionario = new javax.swing.JTextField();
        jTextFieldNovoRgFuncionario = new javax.swing.JTextField();
        jButtonEditarFuncionario = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        jLabelSelecionarCliente = new javax.swing.JLabel();
        jComboBoxMatriculaFuncionario = new javax.swing.JComboBox<>();
        jLabelNovoNomeFuncionario = new javax.swing.JLabel();
        jLabelNovoCpfFuncionario = new javax.swing.JLabel();
        jLabelNovoRgFuncionario = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextFieldNovoSalarioFuncionario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableEditarFuncionario = new javax.swing.JTable();
        jButtonConsultar = new javax.swing.JButton();
        jLabelInformacao = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextFieldNovoNomeFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNovoNomeFuncionarioActionPerformed(evt);
            }
        });

        jTextFieldNovoCpfFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldNovoCpfFuncionarioActionPerformed(evt);
            }
        });
        jTextFieldNovoCpfFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNovoCpfFuncionarioKeyTyped(evt);
            }
        });

        jTextFieldNovoRgFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNovoRgFuncionarioKeyTyped(evt);
            }
        });

        jButtonEditarFuncionario.setText("Editar");
        jButtonEditarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEditarFuncionarioActionPerformed(evt);
            }
        });

        jLabelTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelTitulo.setText("Editar Funcionario");

        jLabelSelecionarCliente.setText("Selecione o Funcionario para edição:");

        jComboBoxMatriculaFuncionario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxMatriculaFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jComboBoxMatriculaFuncionarioMouseClicked(evt);
            }
        });

        jLabelNovoNomeFuncionario.setText("Novo Nome:");

        jLabelNovoCpfFuncionario.setText("Novo Cpf:");

        jLabelNovoRgFuncionario.setText("Novo Rg:");

        jLabel1.setText("Novo Sálario:");

        jTextFieldNovoSalarioFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNovoSalarioFuncionarioKeyTyped(evt);
            }
        });

        jTableEditarFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableEditarFuncionario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTableEditarFuncionarioMousePressed(evt);
            }
        });
        jTableEditarFuncionario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTableEditarFuncionarioKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(jTableEditarFuncionario);

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jLabelInformacao.setText("Não é possivel editar um funcionario que tenha ordem de serviço vinculada");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(102, 102, 102)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabelNovoRgFuncionario)
                            .addComponent(jLabelNovoCpfFuncionario)
                            .addComponent(jLabelNovoNomeFuncionario))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextFieldNovoNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNovoCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNovoRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNovoSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelSelecionarCliente)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBoxMatriculaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(jButtonConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 554, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(185, 185, 185)
                                        .addComponent(jLabelTitulo))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(190, 190, 190)
                                        .addComponent(jButtonEditarFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(0, 81, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabelInformacao)
                .addGap(174, 174, 174))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(jLabelTitulo)
                .addGap(18, 18, 18)
                .addComponent(jLabelInformacao)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelSelecionarCliente)
                    .addComponent(jButtonConsultar)
                    .addComponent(jComboBoxMatriculaFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNovoNomeFuncionario)
                    .addComponent(jTextFieldNovoNomeFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNovoCpfFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNovoCpfFuncionario))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNovoRgFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNovoRgFuncionario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextFieldNovoSalarioFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButtonEditarFuncionario)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxMatriculaFuncionarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jComboBoxMatriculaFuncionarioMouseClicked
        // TODO add your handling code here:


    }//GEN-LAST:event_jComboBoxMatriculaFuncionarioMouseClicked

    private void jButtonEditarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditarFuncionarioActionPerformed
        // TODO add your handling code here:

        try {
            
            if (jComboBoxMatriculaFuncionario.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(rootPane, "Sem funcionario para Editar");
                dispose();
                return;
                
            }
            

            Funcionario funcionario = new Funcionario();

            funcionario.setMatricula(Integer.parseInt(jComboBoxMatriculaFuncionario.getSelectedItem().toString()));
            funcionario.setNome(jTextFieldNovoNomeFuncionario.getText());
            funcionario.setCpf(jTextFieldNovoCpfFuncionario.getText());
            funcionario.setRg(jTextFieldNovoRgFuncionario.getText());
            funcionario.setSalario(Float.parseFloat(jTextFieldNovoSalarioFuncionario.getText()));

            NegocioFuncionario negocio = new NegocioFuncionario();

            negocio.editarFuncionario(funcionario);

            int resposta = JOptionPane.showConfirmDialog(rootPane, "Funcionario Alterado! \nDeseja Editar outro funcionario ?", " Sucesso ", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

            if (resposta == JOptionPane.YES_OPTION) {
                ResetarTabela();
                ListarFuncionario();

                jTextFieldNovoNomeFuncionario.setText("");
                jTextFieldNovoCpfFuncionario.setText("");
                jTextFieldNovoRgFuncionario.setText("");
                jTextFieldNovoSalarioFuncionario.setText("");

                jTextFieldNovoNomeFuncionario.requestFocus();
            } else {
                dispose();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonEditarFuncionarioActionPerformed

    private void jTextFieldNovoCpfFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNovoCpfFuncionarioActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_jTextFieldNovoCpfFuncionarioActionPerformed

    private void jTextFieldNovoNomeFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldNovoNomeFuncionarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldNovoNomeFuncionarioActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:

        try {

            if (jComboBoxMatriculaFuncionario.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(rootPane, "Sem funcionario para editar");
                dispose();
                return;
            }

            Funcionario funcionario = new Funcionario();

            funcionario.setMatricula(Integer.parseInt(jComboBoxMatriculaFuncionario.getSelectedItem().toString()));

            DadosFuncionario dados = new DadosFuncionario();
            this.ListarMatricula = dados.listarFuncionarios(funcionario);

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"Matricula", "Nome", "Cpf", "Rg", "Sálario"});

            for (Funcionario f : this.ListarMatricula) {
                modelo.addRow(new Object[]{f.getMatricula(), f.getNome(), f.getCpf(), f.getRg(), f.getSalario()});
            }

            jTableEditarFuncionario.setModel(modelo);

        } catch (Exception ex) {
            JOptionPane.showMessageDialog(rootPane, ex.getMessage());
        }


    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jTextFieldNovoCpfFuncionarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNovoCpfFuncionarioKeyTyped
        // TODO add your handling code here:
        char digito = evt.getKeyChar();

        if (!(digito >= 48 && digito <= 57)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNovoCpfFuncionarioKeyTyped

    private void jTextFieldNovoRgFuncionarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNovoRgFuncionarioKeyTyped
        // TODO add your handling code here:
        char digito = evt.getKeyChar();

        if (!(digito >= 48 && digito <= 57)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNovoRgFuncionarioKeyTyped

    private void jTextFieldNovoSalarioFuncionarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNovoSalarioFuncionarioKeyTyped
        // TODO add your handling code here:
        
        char digito = evt.getKeyChar();

        if (!(digito >= 48 && digito <= 57)) {
            evt.consume();
        }
    }//GEN-LAST:event_jTextFieldNovoSalarioFuncionarioKeyTyped

    private void jTableEditarFuncionarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTableEditarFuncionarioKeyTyped
        // TODO add your handling code here:
        jTableEditarFuncionario.editingCanceled(null);
        jTableEditarFuncionario.editingStopped(null);
    }//GEN-LAST:event_jTableEditarFuncionarioKeyTyped

    private void jTableEditarFuncionarioMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableEditarFuncionarioMousePressed
        // TODO add your handling code here:
        jTableEditarFuncionario.editingCanceled(null);
        jTableEditarFuncionario.editingStopped(null);
    }//GEN-LAST:event_jTableEditarFuncionarioMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FuncionarioGUIEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FuncionarioGUIEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FuncionarioGUIEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FuncionarioGUIEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FuncionarioGUIEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonEditarFuncionario;
    private javax.swing.JComboBox<String> jComboBoxMatriculaFuncionario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabelInformacao;
    private javax.swing.JLabel jLabelNovoCpfFuncionario;
    private javax.swing.JLabel jLabelNovoNomeFuncionario;
    private javax.swing.JLabel jLabelNovoRgFuncionario;
    private javax.swing.JLabel jLabelSelecionarCliente;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableEditarFuncionario;
    private javax.swing.JTextField jTextFieldNovoCpfFuncionario;
    private javax.swing.JTextField jTextFieldNovoNomeFuncionario;
    private javax.swing.JTextField jTextFieldNovoRgFuncionario;
    private javax.swing.JTextField jTextFieldNovoSalarioFuncionario;
    // End of variables declaration//GEN-END:variables
}
