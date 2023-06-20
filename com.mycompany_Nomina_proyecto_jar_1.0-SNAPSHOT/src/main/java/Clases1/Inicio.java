/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Clases1;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static java.time.Clock.system;
import javax.swing.JOptionPane;


public class Inicio extends javax.swing.JPanel {
 
 int inte;   
    public Inicio() {
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TEXPASSORD = new javax.swing.JLabel();
        InUsuario = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        InContraseña = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        BotonINICIAR = new javax.swing.JButton();
        botonSalir = new javax.swing.JButton();
        fondo2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setToolTipText("");
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TEXPASSORD.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TEXPASSORD.setText("CONTRASEÑA");
        jPanel1.add(TEXPASSORD, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, -1));

        InUsuario.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        InUsuario.setForeground(new java.awt.Color(0, 0, 51));
        InUsuario.setCaretColor(new java.awt.Color(0, 51, 102));
        InUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(InUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, 300, 40));

        jPanel2.setBackground(new java.awt.Color(0, 51, 102));
        jPanel2.setForeground(new java.awt.Color(0, 0, 153));
        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imajenes/cslogin_94432 (1).png"))); // NOI18N
        jLabel1.setText("LOGIN REGISTER");
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 50));

        InContraseña.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        InContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InContraseñaActionPerformed(evt);
            }
        });
        jPanel1.add(InContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 300, 40));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("USUARIO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, -1));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("INGRESO AL SISTEMA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        BotonINICIAR.setBackground(new java.awt.Color(0, 0, 51));
        BotonINICIAR.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BotonINICIAR.setForeground(new java.awt.Color(255, 255, 255));
        BotonINICIAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imajenes/KeyChainAccess_22693.png"))); // NOI18N
        BotonINICIAR.setText("Iniciar");
        BotonINICIAR.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonINICIARMouseClicked(evt);
            }
        });
        BotonINICIAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonINICIARActionPerformed(evt);
            }
        });
        jPanel1.add(BotonINICIAR, new org.netbeans.lib.awtextra.AbsoluteConstraints(109, 329, 120, 40));

        botonSalir.setBackground(new java.awt.Color(0, 0, 51));
        botonSalir.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        botonSalir.setForeground(new java.awt.Color(255, 255, 255));
        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imajenes/Windows_Close_Program_22531.png"))); // NOI18N
        botonSalir.setText("Cerrar");
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
        });
        botonSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonSalirActionPerformed(evt);
            }
        });
        jPanel1.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, 120, 40));

        fondo2.setBackground(new java.awt.Color(255, 255, 255));
        fondo2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        fondo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imajenes/Diapositiva1.jpg"))); // NOI18N
        fondo2.setText("fondoizq");
        jPanel1.add(fondo2, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 0, 450, 450));

        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 450));
    }// </editor-fold>//GEN-END:initComponents

    private void InUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InUsuarioActionPerformed
       
    }//GEN-LAST:event_InUsuarioActionPerformed

    private void InContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InContraseñaActionPerformed
       
    }//GEN-LAST:event_InContraseñaActionPerformed

    private void botonSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonSalirActionPerformed
        
    }//GEN-LAST:event_botonSalirActionPerformed

    private void BotonINICIARMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonINICIARMouseClicked
    //Para dar evento al boton iniciar 
    
    //declaramos variables 
    String user = "STDUNI";
    String acceso = "2023";
    
    //Captamos informacion el campo de texto de del login
    String pass = new String(TEXPASSORD.getText());
    
    //validando los datos ingresados 
    if(InUsuario.getText().equals("STDUNI") && pass.equals("2023")){
        
        //dispose(); cerrar ventana actusl
       
        JOptionPane.showMessageDialog(null,"Bienvenido al sistema");
        
        //Mostrando interfaz de menu
        Menu frm = new Menu ();
        frm.setVisible(true);
        
    }else if(inte == 3){//SI exede los 3 intentos 
        
         JOptionPane.showMessageDialog(null,"Haz fallado al iniciar session");
         System.exit(0);//cerrando la ventana 
    }else{
      JOptionPane.showMessageDialog(null," Ha ingresado Usuario o contraseñna incorrecta \n quedan " +(3 - inte)+" intentos");  
      
      //limpiando los campos de texto 
      InUsuario.setText("");
     TEXPASSORD.setText("");
    
     //posisionando el cursor en los cudros de texto 
      InUsuario.requestFocus();
     
     //Aumentando la variable intentos 
     inte = inte + 1;
        }           
    }//GEN-LAST:event_BotonINICIARMouseClicked

    private void BotonINICIARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonINICIARActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BotonINICIARActionPerformed

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked

       System.exit(0);//para cerrrar la ventana de login
    }//GEN-LAST:event_botonSalirMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonINICIAR;
    private javax.swing.JPasswordField InContraseña;
    private javax.swing.JTextField InUsuario;
    private javax.swing.JLabel TEXPASSORD;
    private javax.swing.JButton botonSalir;
    private javax.swing.JLabel fondo2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

   
}
