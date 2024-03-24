package trabalho3_conversordecimalbinario;

import java.awt.Color;
import java.awt.GraphicsEnvironment;
import java.awt.Point;

public class Classe_Janela extends javax.swing.JFrame {

    //Construtor da Classe_Janela
    public Classe_Janela() {
        initComponents();
        
        //mudar a cor do formulário
        getContentPane().setBackground(new Color(255, 165, 0));
        
        //Centralizar o formulário no ecrã
        //Point - representa o local no espaço de coordenadas x e y
        Point centro  = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        int largura = 395;
        int altura = 300;
        //coloca o formulário no centro do ecrã
        setBounds(centro.x - largura/2, centro.y - altura/2, 395, 300);
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
        txtBinario = new javax.swing.JTextField();
        txtDecimal = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Conversor");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("Decimal");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Binário");

        txtBinario.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtBinario.setText("0");
        txtBinario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtBinarioKeyReleased(evt);
            }
        });

        txtDecimal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        txtDecimal.setText("0");
        txtDecimal.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtDecimalKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBinario)
                    .addComponent(txtDecimal, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDecimal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtBinario, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(80, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtDecimalKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDecimalKeyReleased
    
        //2) converter o valor da caixa do valor decimal, que é uma String, para um valor 
        //    inteiro, considerando a base de 10, ou seja, decimal: 
       int valorDecimal = Integer.parseInt(txtDecimal.getText(), 10); 
        
        
        //3) Converter o valor para uma String na base binária usando o método
        //   toBinaryString da classe Integer:
        String binario = Integer.toBinaryString(valorDecimal); 
        
        //4) Inserir esta String na caixa do valor binário. 
        txtBinario.setText(binario);

        txtDecimal.setBackground(new Color(191, 219, 56));
        txtBinario.setBackground(new Color(216, 217, 218));

    }//GEN-LAST:event_txtDecimalKeyReleased

    private void txtBinarioKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBinarioKeyReleased
        
        //pega o valor da caixa de texto txtBinario
        String binario = txtBinario.getText();

        //converte o valor binário que é do tipo string em valor inteiro decimal
        int valorDecimal = Integer.parseInt(binario, 2);
        
        //Converte o valor decimal inteiro para uma string
        //Insere essa String na caixa do valor decimal.
        txtDecimal.setText(String.valueOf(valorDecimal));

        txtDecimal.setBackground(new Color(216, 217, 218));
        txtBinario.setBackground(new Color(191, 219, 56));
    }//GEN-LAST:event_txtBinarioKeyReleased

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtBinario;
    private javax.swing.JTextField txtDecimal;
    // End of variables declaration//GEN-END:variables
}
