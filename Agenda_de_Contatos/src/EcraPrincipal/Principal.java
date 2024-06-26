/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EcraPrincipal;

import Classes.ConectarAoBancoDeDados;
import EcrasJFrame.Pesquisa;
import javax.swing.JOptionPane;

/**
 *
 * @author Diana Freixo
 * Programa NetBeans IDE 8.0.2
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        initComponents();
         //iniciar o Formulário em full Screen
          setExtendedState(MAXIMIZED_BOTH); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        btnTestarConexaoBD = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArquivo = new javax.swing.JMenu();
        subMenuContatos = new javax.swing.JMenuItem();
        menuAjuda = new javax.swing.JMenu();
        subMenuSair = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Agenda de Contatos");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        btnTestarConexaoBD.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnTestarConexaoBD.setText("Testar Conexão com Banco de Dados");
        btnTestarConexaoBD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTestarConexaoBDActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 13;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(210, 10, 194, 19);
        getContentPane().add(btnTestarConexaoBD, gridBagConstraints);

        menuArquivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/arquivo.png"))); // NOI18N
        menuArquivo.setText("Arquivo");
        menuArquivo.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N

        subMenuContatos.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        subMenuContatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/contatos_1.png"))); // NOI18N
        subMenuContatos.setText("Contatos");
        subMenuContatos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuContatosActionPerformed(evt);
            }
        });
        menuArquivo.add(subMenuContatos);

        jMenuBar1.add(menuArquivo);

        menuAjuda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ajuda_1.png"))); // NOI18N
        menuAjuda.setText("Ajuda");
        menuAjuda.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N

        subMenuSair.setFont(new java.awt.Font("Segoe UI", 0, 20)); // NOI18N
        subMenuSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair.png"))); // NOI18N
        subMenuSair.setText("Sair");
        subMenuSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subMenuSairActionPerformed(evt);
            }
        });
        menuAjuda.add(subMenuSair);

        jMenuBar1.add(menuAjuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void subMenuContatosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuContatosActionPerformed
        
        //Intancia a Classe Pesquisa para ter acesso ao seu ecrã. 
        Pesquisa ecraPesquisa = new Pesquisa();
        //Deixa o ecrã pesquisa visível
        ecraPesquisa.setVisible(true);
        
    }//GEN-LAST:event_subMenuContatosActionPerformed
     
    
    private void menuAjudaActionPerformed(java.awt.event.ActionEvent evt) {                                            
       
    }  
    
    
    private void subMenuSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subMenuSairActionPerformed
       System.exit(0);
    }//GEN-LAST:event_subMenuSairActionPerformed

    private void btnTestarConexaoBDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTestarConexaoBDActionPerformed
        
        new ConectarAoBancoDeDados().getConnection();
        JOptionPane.showMessageDialog(null, "Conexão ao Banco de Dados efetuada com sucesso.");
    }//GEN-LAST:event_btnTestarConexaoBDActionPerformed



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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnTestarConexaoBD;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu menuAjuda;
    private javax.swing.JMenu menuArquivo;
    private javax.swing.JMenuItem subMenuContatos;
    private javax.swing.JMenuItem subMenuSair;
    // End of variables declaration//GEN-END:variables
}
