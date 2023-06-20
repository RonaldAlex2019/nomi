/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Clases1;

import java.util.ResourceBundle.Control;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Menu extends javax.swing.JPanel {

    //Crenad variable defaultableM
   DefaultTableModel modelo = new DefaultTableModel();

   //creando array list
   
    private ArrayList <Menu> listaEmpleados = new ArrayList <Menu>();
   
    private JTable tMenu;
    
   public Menu() {
        initComponents();
        
          
        tMenu = new JTable(); // Inicialización de la instancia de JTable
        
        modelo = new DefaultTableModel(); // Inicialización de la instancia de DefaultTableModel
        
        listaEmpleados = new ArrayList<>(); // Inicialización de la instancia de ArrayList
        
        
        //this.setTitle("Control de usuarios");
        //this.setLocationRelativeTo(null);
        
        //Agregar titulos a la tabla
        modelo.addColumn("Nombre");
        modelo.addColumn("Cargo");
        modelo.addColumn("N° cedula");
        modelo.addColumn("N° inss");
        modelo.addColumn("Salario mensual");
        modelo.addColumn("Horas Extra");
        modelo.addColumn("Total horas Extra");
        modelo.addColumn("Comisiones");
        modelo.addColumn("Bonos");
        modelo.addColumn("Total de ingresos");
        
       ActualizarTabla();
       
    }

   
    @SuppressWarnings("unchecked")
    
    //Metodo para agreagar datos a la tabla
    private void  ActualizarTabla (){
        
   // tblMenu.setModel(modelo);  
    }
    
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_regresar = new javax.swing.JPanel();
        NombreEmpleado = new javax.swing.JLabel();
        Puesto = new javax.swing.JLabel();
        S_basico = new javax.swing.JLabel();
        NCedula = new javax.swing.JLabel();
        NInss = new javax.swing.JLabel();
        hExtra = new javax.swing.JLabel();
        Comosion = new javax.swing.JLabel();
        BONOS = new javax.swing.JLabel();
        TITULOREGISTRO = new javax.swing.JLabel();
        pensionA = new javax.swing.JLabel();
        NombreTEX = new javax.swing.JTextField();
        N_cedulaTEX = new javax.swing.JTextField();
        SalarioTEX = new javax.swing.JTextField();
        PuestoTEX = new javax.swing.JTextField();
        N_INSSTEX = new javax.swing.JTextField();
        ComisionesTEX = new javax.swing.JTextField();
        BonosTEX = new javax.swing.JTextField();
        PensionTEX = new javax.swing.JTextField();
        BarraTitulo = new javax.swing.JPanel();
        Agregar = new javax.swing.JButton();
        limpiar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        botonActulizar = new javax.swing.JButton();
        namEmpresa = new javax.swing.JLabel();
        Empresatex = new javax.swing.JTextField();
        periodo = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();

        boton_regresar.setBackground(new java.awt.Color(255, 255, 255));
        boton_regresar.setForeground(new java.awt.Color(0, 0, 102));
        boton_regresar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NombreEmpleado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NombreEmpleado.setText("Nombre y apellido:");
        boton_regresar.add(NombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 100, -1, -1));

        Puesto.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Puesto.setText("Puesto de trabajo:");
        boton_regresar.add(Puesto, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 140, -1, -1));

        S_basico.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        S_basico.setText("Salario mensual:");
        boton_regresar.add(S_basico, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 180, -1, -1));

        NCedula.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NCedula.setText("N° de cedula:");
        boton_regresar.add(NCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 220, -1, -1));

        NInss.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        NInss.setText("N°  del Inss:");
        boton_regresar.add(NInss, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        hExtra.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        hExtra.setText("Horas extra:");
        boton_regresar.add(hExtra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 310, -1, -1));

        Comosion.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Comosion.setText("Comisiones:");
        boton_regresar.add(Comosion, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 350, 122, -1));

        BONOS.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        BONOS.setText("Bonos:");
        boton_regresar.add(BONOS, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 380, -1, 30));

        TITULOREGISTRO.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        TITULOREGISTRO.setForeground(new java.awt.Color(255, 255, 255));
        TITULOREGISTRO.setText("CONTROL DE EMPLEADOS");
        boton_regresar.add(TITULOREGISTRO, new org.netbeans.lib.awtextra.AbsoluteConstraints(318, 6, -1, 30));

        pensionA.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        pensionA.setText("Pension alimentica:");
        boton_regresar.add(pensionA, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 420, -1, 30));

        NombreTEX.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        NombreTEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NombreTEXActionPerformed(evt);
            }
        });
        boton_regresar.add(NombreTEX, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 100, 300, 30));

        N_cedulaTEX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        N_cedulaTEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                N_cedulaTEXActionPerformed(evt);
            }
        });
        boton_regresar.add(N_cedulaTEX, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 220, 200, -1));

        SalarioTEX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_regresar.add(SalarioTEX, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 180, 200, -1));

        PuestoTEX.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        PuestoTEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PuestoTEXActionPerformed(evt);
            }
        });
        boton_regresar.add(PuestoTEX, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 201, -1));

        N_INSSTEX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_regresar.add(N_INSSTEX, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 260, 150, -1));

        ComisionesTEX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_regresar.add(ComisionesTEX, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 340, 150, -1));

        BonosTEX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        boton_regresar.add(BonosTEX, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 380, 150, -1));

        PensionTEX.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        PensionTEX.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PensionTEXActionPerformed(evt);
            }
        });
        boton_regresar.add(PensionTEX, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 420, 150, -1));

        BarraTitulo.setBackground(new java.awt.Color(0, 51, 102));

        javax.swing.GroupLayout BarraTituloLayout = new javax.swing.GroupLayout(BarraTitulo);
        BarraTitulo.setLayout(BarraTituloLayout);
        BarraTituloLayout.setHorizontalGroup(
            BarraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        BarraTituloLayout.setVerticalGroup(
            BarraTituloLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        boton_regresar.add(BarraTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        Agregar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        Agregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imajenes/add_insert_new_plus_button_icon_142943.png"))); // NOI18N
        Agregar.setText("Agregar ");
        Agregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AgregarMouseClicked(evt);
            }
        });
        Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarActionPerformed(evt);
            }
        });
        boton_regresar.add(Agregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 170, 50));

        limpiar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        limpiar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imajenes/erase_icon_160907.png"))); // NOI18N
        limpiar.setText("Limpiar");
        limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarActionPerformed(evt);
            }
        });
        boton_regresar.add(limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 190, 170, 50));

        jButton1.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imajenes/2849806-copy-interface-multimedia-print-printer_107972.png"))); // NOI18N
        jButton1.setText("Imprimir");
        boton_regresar.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 380, 170, 60));

        jComboBox1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "34", "35", "36", "37", "38", "39" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });
        boton_regresar.add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 300, 150, -1));

        botonActulizar.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        botonActulizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imajenes/twocirclingarrows1_120592.png"))); // NOI18N
        botonActulizar.setText("Actulizar");
        botonActulizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonActulizarActionPerformed(evt);
            }
        });
        boton_regresar.add(botonActulizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 280, 170, 60));

        namEmpresa.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        namEmpresa.setText("Nombre de la Empresa:");
        boton_regresar.add(namEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, -1, -1));

        Empresatex.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Empresatex.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmpresatexActionPerformed(evt);
            }
        });
        boton_regresar.add(Empresatex, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 50, 200, 30));

        periodo.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        periodo.setText("Periodo:");
        boton_regresar.add(periodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, -1, -1));

        jTextField1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        boton_regresar.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 50, 280, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boton_regresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(boton_regresar, javax.swing.GroupLayout.PREFERRED_SIZE, 464, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void NombreTEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NombreTEXActionPerformed
       

    }//GEN-LAST:event_NombreTEXActionPerformed

    private void PuestoTEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PuestoTEXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PuestoTEXActionPerformed

    private void AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarActionPerformed

    private void PensionTEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PensionTEXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PensionTEXActionPerformed

    private void limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_limpiarActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void botonActulizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonActulizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_botonActulizarActionPerformed

    private void AgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AgregarMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_AgregarMouseClicked

    private void N_cedulaTEXActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_N_cedulaTEXActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_N_cedulaTEXActionPerformed

    private void EmpresatexActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmpresatexActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmpresatexActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Agregar;
    private javax.swing.JLabel BONOS;
    private javax.swing.JPanel BarraTitulo;
    private javax.swing.JTextField BonosTEX;
    private javax.swing.JTextField ComisionesTEX;
    private javax.swing.JLabel Comosion;
    private javax.swing.JTextField Empresatex;
    private javax.swing.JLabel NCedula;
    private javax.swing.JLabel NInss;
    private javax.swing.JTextField N_INSSTEX;
    private javax.swing.JTextField N_cedulaTEX;
    private javax.swing.JLabel NombreEmpleado;
    private javax.swing.JTextField NombreTEX;
    private javax.swing.JTextField PensionTEX;
    private javax.swing.JLabel Puesto;
    private javax.swing.JTextField PuestoTEX;
    private javax.swing.JLabel S_basico;
    private javax.swing.JTextField SalarioTEX;
    private javax.swing.JLabel TITULOREGISTRO;
    private javax.swing.JButton botonActulizar;
    private javax.swing.JPanel boton_regresar;
    private javax.swing.JLabel hExtra;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton limpiar;
    private javax.swing.JLabel namEmpresa;
    private javax.swing.JLabel pensionA;
    private javax.swing.JLabel periodo;
    // End of variables declaration//GEN-END:variables
}
