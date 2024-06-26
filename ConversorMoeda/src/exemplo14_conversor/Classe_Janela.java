/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo14_conversor;

import java.awt.Color;

/**
 *
 * @author ASUS
 */
public class Classe_Janela extends javax.swing.JFrame {

    /**
     * Creates new form Classe_Janela
     */
    public Classe_Janela() {
        initComponents();
        
        //mudar a cor do formulário
        getContentPane().setBackground(Color.cyan);

    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtEuro = new javax.swing.JTextField();
        txtDolar = new javax.swing.JTextField();
        txtKwanza = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Conversor de Moedas");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("€");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("$");

        txtEuro.setText("0");
        txtEuro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtEuroKeyReleased(evt);
            }
        });

        txtDolar.setText("0");
        txtDolar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDolarKeyReleased(evt);
            }
        });

        txtKwanza.setText("0");
        txtKwanza.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtKwanzaKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel4.setText("Kwanza");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(100, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtDolar)
                            .addComponent(txtEuro)
                            .addComponent(txtKwanza, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))))
                .addGap(100, 100, 100))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtEuro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtKwanza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(51, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtEuroKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtEuroKeyReleased
        String sEuro = txtEuro.getText();
                     //Converte o txt em decimal float
        float fEuro = Float.parseFloat(sEuro);
        
        float fDolar = fEuro * 1.2f;
                    //Converte o decimal float em txt
        String sDolar = String.valueOf(fDolar);  
        txtDolar.setText(sDolar);
        
        float fKwanza = fEuro * 873.80f;
        String sKwanza = String.valueOf(fKwanza);  
        txtKwanza.setText(sKwanza);
        
        txtEuro.setBackground(Color.GREEN);
        txtDolar.setBackground(Color.LIGHT_GRAY);
        txtKwanza.setBackground(Color.LIGHT_GRAY);
        
       
    }//GEN-LAST:event_txtEuroKeyReleased

    private void txtDolarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDolarKeyReleased
        String sDolar = txtDolar.getText();
                     //Converte o txt em decimal float
        float fDolar = Float.parseFloat(sDolar);
        
        float fEuro = fDolar / 1.2f;
                    //Converte o decimal float em txt
        String sEuro = String.valueOf(fEuro);
        txtEuro.setText(sEuro);
        
        float fKwanza = fDolar * 827.48f;
        String sKwanza = String.valueOf(fKwanza);  
        txtKwanza.setText(sKwanza);
        
        
        txtEuro.setBackground(Color.LIGHT_GRAY);
        txtDolar.setBackground(Color.GREEN);
        txtKwanza.setBackground(Color.LIGHT_GRAY);
    }//GEN-LAST:event_txtDolarKeyReleased

    private void txtKwanzaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtKwanzaKeyReleased
        String sKwanza = txtKwanza.getText();
                     //Converte o txt em decimal float
        float fKwanza = Float.parseFloat(sKwanza);
        
        float fEuro = fKwanza / 873.80f;
                    //Converte o decimal float em txt
        String sEuro = String.valueOf(fEuro);
        txtEuro.setText(sEuro);
        
        float fDolar = fKwanza / 827.48f;
        String sDolar = String.valueOf(fDolar);  
        txtDolar.setText(sDolar);
        
        txtEuro.setBackground(Color.LIGHT_GRAY);
        txtDolar.setBackground(Color.LIGHT_GRAY);
        txtKwanza.setBackground(Color.GREEN);
    }//GEN-LAST:event_txtKwanzaKeyReleased

   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDolar;
    private javax.swing.JTextField txtEuro;
    private javax.swing.JTextField txtKwanza;
    // End of variables declaration//GEN-END:variables
}
