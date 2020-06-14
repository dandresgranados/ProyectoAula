/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.ArchivoTextoProyectos;
import Modelo.Estudiante;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zarel
 */
public class ListaProyectos extends javax.swing.JInternalFrame {
        
    private ArrayList<Estudiante> listaEstudiante;
    private ArchivoTextoProyectos  archivo;
    private int radicado;
    private String tipoProyecto;
   
    /**
     * Creates new form ListaProyectos
     */
    public ListaProyectos() {
        initComponents();
        try {
            listaEstudiante = new ArrayList();
            archivo = new ArchivoTextoProyectos();
            listaEstudiante = archivo.leerArchivo();
            llenarTabla();
            
         } catch (Exception ex) {
         Logger.getLogger(RegistrarLineas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        LabelBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaListaProyecto = new javax.swing.JTable();
        BotonBuscar = new javax.swing.JLabel();
        botonVerDatos = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Escritorio.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(0, 102, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_20px_1.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 480, 10));

        LabelBuscar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelBuscar.setForeground(new java.awt.Color(255, 255, 255));
        LabelBuscar.setBorder(null);
        jPanel2.add(LabelBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 480, 20));

        TablaListaProyecto.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaListaProyectoMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaListaProyecto);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 640, 380));

        BotonBuscar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        BotonBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_replace_20px.png"))); // NOI18N
        BotonBuscar.setText("buscar");
        jPanel2.add(BotonBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 80, -1));

        botonVerDatos.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        botonVerDatos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_eye_20px_1.png"))); // NOI18N
        botonVerDatos.setText("Ver datos");
        botonVerDatos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 51)));
        botonVerDatos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonVerDatosMouseClicked(evt);
            }
        });
        jPanel2.add(botonVerDatos, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 440, 110, 40));

        jPanel5.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 660, 490));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Lista Proyectos ");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, 460, 60));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
                .addContainerGap())
        );

        Escritorio.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 600));

        getContentPane().add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 680, 600));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TablaListaProyectoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaListaProyectoMouseClicked
        obtenerRadicado();
        
    }//GEN-LAST:event_TablaListaProyectoMouseClicked

    private void botonVerDatosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonVerDatosMouseClicked
        verInterfaz();
    }//GEN-LAST:event_botonVerDatosMouseClicked

    public void verInterfaz(){
        if(tipoProyecto.equals("Tesis")){
            new VerDatosTesis(radicado).show();
            dispose();
            
        }else{
            new VerDatosPractica().show();
            dispose();
        }
    }
    
    public void BotonRegresar(){
       new DocenteEvaluador().show();
       dispose();
    }
    
    public void llenarTabla(){
        String titulos[]={"Radicado","Cedula", "Nombre Proyecto","Linea", "Tipo Proyecto"};
        DefaultTableModel ModeloTabla = new DefaultTableModel();
        ModeloTabla.setColumnIdentifiers(titulos); 
        
        for(Estudiante a: listaEstudiante){
            if(a.getPropuesta().getEstado().equals("Pendiente")){
                Object datos[]={a.getPropuesta().getRadicado(),a.getCedula(),a.getPropuesta().getNombreP(),a.getPropuesta().getLineaInvesti(),a.getPropuesta().getTipoProyecto()};
                ModeloTabla.addRow(datos);
            }
        }
        TablaListaProyecto.setModel(ModeloTabla);
        
    }
    
    public void obtenerRadicado(){
        radicado = Integer.parseInt(TablaListaProyecto.getValueAt(TablaListaProyecto.getSelectedRow(), 0).toString());
        tipoProyecto = TablaListaProyecto.getValueAt(TablaListaProyecto.getSelectedRow(), 4).toString();
       
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonBuscar;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JTextField LabelBuscar;
    private javax.swing.JTable TablaListaProyecto;
    private javax.swing.JLabel botonVerDatos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
