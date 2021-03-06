/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import Classe.ClassificacaoProblema;
import Dados.DadosClassificacaoProblema;
import Negocio.NegocioClassificacaoProblema;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pichau
 */
public class ProblemaGUIEditar extends javax.swing.JFrame {

    ArrayList<ClassificacaoProblema> respostaCodigo;

    public void ResetarDados() {
        jTextAreaDescricao.setText("");
        
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.setColumnIdentifiers(new Object[] {"Nome"});
        jTableNome.setModel(modelo);
    }

    public void ListarCodigo() {

        try {
            ClassificacaoProblema problema = new ClassificacaoProblema();
            DadosClassificacaoProblema dados = new DadosClassificacaoProblema();

            this.respostaCodigo = dados.listarClassificacaoProblemas(problema);
            DefaultComboBoxModel modelo = new DefaultComboBoxModel();

            for (ClassificacaoProblema c : this.respostaCodigo) {
                modelo.addElement(c.getCodigo());
            }

            jComboBoxCodigoProblema.setModel(modelo);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public ProblemaGUIEditar() {
        initComponents();
        ListarCodigo();
        jTextAreaDescricao.setWrapStyleWord(true);
        jTextAreaDescricao.setLineWrap(true);
        ResetarDados();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitulo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaNovaDescricaoProblema = new javax.swing.JTextArea();
        jTextFieldNovoNomeProblema = new javax.swing.JTextField();
        jLabelEscolhaEditarClassificacaoProblema = new javax.swing.JLabel();
        jButtonaAlterarClassificacaoProblema = new javax.swing.JButton();
        jComboBoxCodigoProblema = new javax.swing.JComboBox<>();
        jButtonConsultar = new javax.swing.JButton();
        jLabelNovoNomeProblema = new javax.swing.JLabel();
        jLabelNovaDescricaoProblema = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTableNome = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextAreaDescricao = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitulo.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabelTitulo.setText("Editar Problema");

        jTextAreaNovaDescricaoProblema.setColumns(20);
        jTextAreaNovaDescricaoProblema.setRows(5);
        jScrollPane2.setViewportView(jTextAreaNovaDescricaoProblema);

        jLabelEscolhaEditarClassificacaoProblema.setText("Selecione o Código da Classificação do Problema:");

        jButtonaAlterarClassificacaoProblema.setText("Alterar");
        jButtonaAlterarClassificacaoProblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonaAlterarClassificacaoProblemaActionPerformed(evt);
            }
        });

        jComboBoxCodigoProblema.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBoxCodigoProblema.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxCodigoProblemaActionPerformed(evt);
            }
        });

        jButtonConsultar.setText("Consultar");
        jButtonConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonConsultarActionPerformed(evt);
            }
        });

        jLabelNovoNomeProblema.setText("Novo Nome:");

        jLabelNovaDescricaoProblema.setText("Nova Descrição:");

        jTableNome.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(jTableNome);

        jTextAreaDescricao.setEditable(false);
        jTextAreaDescricao.setColumns(20);
        jTextAreaDescricao.setRows(5);
        jScrollPane4.setViewportView(jTextAreaDescricao);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(254, 254, 254)
                        .addComponent(jLabelTitulo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabelEscolhaEditarClassificacaoProblema)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxCodigoProblema, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonConsultar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 96, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabelNovaDescricaoProblema)
                            .addComponent(jLabelNovoNomeProblema))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextFieldNovoNomeProblema, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(156, 156, 156))
            .addGroup(layout.createSequentialGroup()
                .addGap(298, 298, 298)
                .addComponent(jButtonaAlterarClassificacaoProblema)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(jLabelTitulo)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxCodigoProblema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelEscolhaEditarClassificacaoProblema)
                    .addComponent(jButtonConsultar))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextFieldNovoNomeProblema, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNovoNomeProblema))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelNovaDescricaoProblema))
                .addGap(50, 50, 50)
                .addComponent(jButtonaAlterarClassificacaoProblema)
                .addGap(95, 95, 95))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonaAlterarClassificacaoProblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonaAlterarClassificacaoProblemaActionPerformed
        // TODO add your handling code here:
        // Botão de alterar
        try {

            ClassificacaoProblema classificacaoProblema = new ClassificacaoProblema();

            classificacaoProblema.setNome(jTextFieldNovoNomeProblema.getText());
            classificacaoProblema.setDescricao(jTextAreaNovaDescricaoProblema.getText());
            classificacaoProblema.setCodigo(Integer.parseInt(jComboBoxCodigoProblema.getSelectedItem().toString()));

            NegocioClassificacaoProblema negocio = new NegocioClassificacaoProblema();

            negocio.editarClassificacaoProblema(classificacaoProblema);

            int resposta = JOptionPane.showConfirmDialog(rootPane, "Classificação Problema Alterada! \nDeseja editar outro Problema ?", "Sucesso", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);

            if (resposta == JOptionPane.YES_OPTION) {
                ListarCodigo();
                ResetarDados();

                jTextAreaNovaDescricaoProblema.setText("");
                jTextFieldNovoNomeProblema.setText("");

                jComboBoxCodigoProblema.requestFocus();

            } else {
                dispose();
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }


    }//GEN-LAST:event_jButtonaAlterarClassificacaoProblemaActionPerformed

    private void jButtonConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonConsultarActionPerformed
        // TODO add your handling code here:
        // Botão de Consultar

        try {

            if (jComboBoxCodigoProblema.getSelectedIndex() == -1) {
                JOptionPane.showMessageDialog(rootPane, "Sem problema para editar");
                return;
            }

            ClassificacaoProblema classificacaoProblema = new ClassificacaoProblema();
            classificacaoProblema.setCodigo(Integer.parseInt(jComboBoxCodigoProblema.getSelectedItem().toString()));

            DadosClassificacaoProblema dadosClassificacaoProblema = new DadosClassificacaoProblema();

            respostaCodigo = dadosClassificacaoProblema.listarClassificacaoProblemas(classificacaoProblema);

            DefaultTableModel modelo = new DefaultTableModel();
            modelo.setColumnIdentifiers(new Object[]{"Nome"});

            for (ClassificacaoProblema c : respostaCodigo) {
                modelo.addRow(new Object[]{c.getNome()});
                jTextAreaDescricao.setText(c.getDescricao());

            }
            jTableNome.setModel(modelo);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e.getMessage());
        }
    }//GEN-LAST:event_jButtonConsultarActionPerformed

    private void jComboBoxCodigoProblemaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxCodigoProblemaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxCodigoProblemaActionPerformed

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
            java.util.logging.Logger.getLogger(ProblemaGUIEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProblemaGUIEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProblemaGUIEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProblemaGUIEditar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProblemaGUIEditar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonConsultar;
    private javax.swing.JButton jButtonaAlterarClassificacaoProblema;
    private javax.swing.JComboBox<String> jComboBoxCodigoProblema;
    private javax.swing.JLabel jLabelEscolhaEditarClassificacaoProblema;
    private javax.swing.JLabel jLabelNovaDescricaoProblema;
    private javax.swing.JLabel jLabelNovoNomeProblema;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTableNome;
    private javax.swing.JTextArea jTextAreaDescricao;
    private javax.swing.JTextArea jTextAreaNovaDescricaoProblema;
    private javax.swing.JTextField jTextFieldNovoNomeProblema;
    // End of variables declaration//GEN-END:variables
}
