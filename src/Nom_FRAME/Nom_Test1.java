/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Nom_FRAME;

import ConeccionAleatoria.RandomConnection;
import DaoImp.Usuario_DaoImp;
import Main_Nomina.Prueba;
import POJO.Usuario;
import java.awt.event.KeyEvent;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

/**
 *
 * @author JEREMY PEREZ
 */
public class Nom_Test1 extends javax.swing.JFrame {

    /**
     * Creates new form Nom_Test1
     */
    
    
    
    public Nom_Test1() {
        initComponents();
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

        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Us = new javax.swing.JTextField();
        Pass = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        jLabel1.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel1.setText("Usuario");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        jPanel2.add(jLabel1, gridBagConstraints);

        jLabel2.setFont(new java.awt.Font("Comic Sans MS", 1, 12)); // NOI18N
        jLabel2.setText("Contraseña");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.insets = new java.awt.Insets(17, 0, 17, 0);
        jPanel2.add(jLabel2, gridBagConstraints);

        Us.setFont(new java.awt.Font("Comic Sans MS", 0, 11)); // NOI18N
        Us.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                UsKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(7, 6, 7, 6);
        jPanel2.add(Us, gridBagConstraints);

        Pass.setFont(new java.awt.Font("Comic Sans MS", 1, 11)); // NOI18N
        Pass.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                PassKeyTyped(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.insets = new java.awt.Insets(17, 7, 17, 7);
        jPanel2.add(Pass, gridBagConstraints);

        jButton1.setText("Aceptar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 7;
        gridBagConstraints.insets = new java.awt.Insets(7, 0, 7, 0);
        jPanel2.add(jButton1, gridBagConstraints);

        jLabel3.setText("PANEL DE USUARIOS");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 2;
        gridBagConstraints.insets = new java.awt.Insets(10, 0, 10, 0);
        jPanel2.add(jLabel3, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
        
    private void UsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_UsKeyTyped
        
//        Pattern pat=Pattern.compile("[0123456789]");
//        Matcher mat=pat.matcher(Us.getText());
//        
//        if (mat.find()) {
//            JOptionPane.showMessageDialog(this,"Caracteres indebidos","Error",JOptionPane.ERROR_MESSAGE);
//        }
 
             char car = evt.getKeyChar();
            if((car<'a' || car>'z') && (car<'A' || car>'Z')
                    &&(car!=(char)KeyEvent.VK_BACK_SPACE)){
                evt.consume();
               JOptionPane.showMessageDialog(this, "No se admiten este tipo de caracteres","Error",JOptionPane.ERROR_MESSAGE);
            }//else{
             //   JOptionPane.showMessageDialog(this,"Solo se admiten letras","Error",JOptionPane.ERROR_MESSAGE);
           // }
            
                
    }//GEN-LAST:event_UsKeyTyped

    private void PassKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_PassKeyTyped
        
    }//GEN-LAST:event_PassKeyTyped

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
         try{
            new RandomConnection("Usuarios.dat").Conectar();
        }catch(IOException e){
            JOptionPane.showMessageDialog(this,"Error al conectar con los datos","Error interno",JOptionPane.ERROR_MESSAGE);
        }
        Usuario_DaoImp ldi= new Usuario_DaoImp();
        List<Usuario> lp;
        try{
            lp=ldi.EncontrarTodos();
        
                    for(Usuario p:lp){
            
            String Np=p.getNombre();
            String Cp=p.getPass();
            System.out.println(p.getNombre());
            System.out.println(p.getPass());
            System.out.println(Us.getText());
            System.out.println(Pass.getText());
            
                   if( Pass.getText().equals(p.getPass()) ){
                
                System.out.println("si");
            }
            else{
                System.out.println("no");}

        }
        
        }
        catch(IOException e){}


        
             
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Nom_Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Nom_Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Nom_Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Nom_Test1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Nom_Test1().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Pass;
    private javax.swing.JTextField Us;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
