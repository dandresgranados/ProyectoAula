/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Datos.ArchivoTextoLineas;
import Datos.ArchivoTextoDocentes;
import Datos.Archivo_TextoSub_Linea;
import Modelo.*;
import Modelo.LineaDeInvestigacion;
import Modelo.SubLineaInvestigacion;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author zarel
 */
public class CrearUsuarioDocente extends javax.swing.JInternalFrame {
    
    
    private ArrayList<Docente> listadocentes = new ArrayList<Docente>();
    private  ArchivoTextoDocentes archivoTextoDocente = new ArchivoTextoDocentes();
    private Docente docente;
    
    private ArrayList<SubLineaInvestigacion> listaSubLineas = new ArrayList<SubLineaInvestigacion>();
    private ArrayList<LineaDeInvestigacion> listaLineas = new ArrayList<LineaDeInvestigacion>();
    private Archivo_TextoSub_Linea archivoSub_linea = new Archivo_TextoSub_Linea();
    private ArchivoTextoLineas archivoTexto = new ArchivoTextoLineas();
    private String codigo="", linea="";
    
    /**
     * Creates new form CrearUsuarioDocente
     */
    public CrearUsuarioDocente() {
        initComponents();
     
          
        try {

        listaLineas = archivoTexto.leerArchivo();
        listaLineas();
        listaSubLineas = archivoSub_linea.leerArchivo();

        cargos();
        mostrarTabla();
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
        jPanel5 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        TxtApellidoDocente = new javax.swing.JTextField();
        TxtContraseñaDocente = new javax.swing.JTextField();
        TxtCedulaDocente = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        BotonGuardarDocente = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaDocentes = new javax.swing.JTable();
        ComboCargo = new javax.swing.JComboBox<>();
        ComboLineaInvestigacion = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        TxtNombreDocente = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();

        jPanel5.setBackground(new java.awt.Color(0, 102, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_back_arrow_30px_1.png"))); // NOI18N
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, -1, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_search_20px_1.png"))); // NOI18N
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 30, -1));

        jSeparator1.setBackground(new java.awt.Color(0, 0, 0));
        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 480, 10));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_replace_20px.png"))); // NOI18N
        jLabel4.setText("buscar");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 10, 80, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 480, 20));

        TxtApellidoDocente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TxtApellidoDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 120, 140, 30));

        TxtContraseñaDocente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TxtContraseñaDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 180, 140, 30));

        TxtCedulaDocente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TxtCedulaDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 180, 140, 30));

        jLabel16.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel16.setText("Linea de investigacion:");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 180, 30));

        BotonGuardarDocente.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        BotonGuardarDocente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_save_20px.png"))); // NOI18N
        BotonGuardarDocente.setText("Guardar");
        BotonGuardarDocente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 0)));
        BotonGuardarDocente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BotonGuardarDocenteMouseClicked(evt);
            }
        });
        jPanel1.add(BotonGuardarDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 430, 100, 30));

        jLabel17.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel17.setText("Cargo:");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 60, 30));

        jLabel12.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel12.setText("Contraseña:");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 100, 30));

        jLabel8.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel8.setText("Apellido:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 80, 30));

        jLabel13.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel13.setText("Cedula:");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 80, 30));

        jScrollPane1.setViewportView(TablaDocentes);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 630, 190));

        ComboCargo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        ComboCargo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ComboCargo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCargoActionPerformed(evt);
            }
        });
        jPanel1.add(ComboCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 60, 140, 30));

        ComboLineaInvestigacion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONE" }));
        ComboLineaInvestigacion.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        ComboLineaInvestigacion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ComboLineaInvestigacionMouseClicked(evt);
            }
        });
        ComboLineaInvestigacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboLineaInvestigacionActionPerformed(evt);
            }
        });
        jPanel1.add(ComboLineaInvestigacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 120, 140, 30));

        jLabel14.setFont(new java.awt.Font("Verdana", 1, 14)); // NOI18N
        jLabel14.setText("Nombre:");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 80, 30));

        TxtNombreDocente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(TxtNombreDocente, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 60, 140, 30));

        jPanel5.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 660, 470));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_multiply_30px.png"))); // NOI18N
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 0, 30, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Verdana", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Registrar docente");
        jPanel5.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 10, 500, 60));

        Escritorio.setLayer(jPanel5, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, 571, Short.MAX_VALUE)
        );

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ComboCargoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCargoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboCargoActionPerformed

    private void BotonGuardarDocenteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BotonGuardarDocenteMouseClicked
        
          
         try{
           
        LlenarTablaLinea();
        archivoTextoDocente.Guardar(docente);
        mostrarTabla();
           
       }catch( Exception exception ){
           
           JOptionPane.showMessageDialog(this, archivoSub_linea, "ERROR", JOptionPane.ERROR_MESSAGE); 
           
       }
        
        
    }//GEN-LAST:event_BotonGuardarDocenteMouseClicked


    private void ComboLineaInvestigacionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ComboLineaInvestigacionMouseClicked
      
    }//GEN-LAST:event_ComboLineaInvestigacionMouseClicked

    private void ComboLineaInvestigacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboLineaInvestigacionActionPerformed
       linea = ComboLineaInvestigacion.getSelectedItem().toString();
       codigo = buscarCodigo(linea);

    }//GEN-LAST:event_ComboLineaInvestigacionActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       System.exit(0);
    }//GEN-LAST:event_jLabel7MouseClicked



    public Docente registrarDocente(){
        
       String cargo,  nombre, apellido,  cedula,  contraseña,subLinea;
       cargo = ComboCargo.getSelectedItem().toString();
       nombre = TxtNombreDocente.getText();
       apellido = TxtApellidoDocente.getText();
       cedula = TxtCedulaDocente.getText();
       contraseña = TxtContraseñaDocente.getText();
     
      
      docente = new Docente();
       
      docente.setCargo(cargo);
      docente.setNombre(nombre);
      docente.setApellido(apellido);
      docente.setCedula(cedula);
      docente.setContraseña(contraseña);

      docente.setUsuario(cedula);
      docente.setLinea(linea); 
                            
       return docente;
        
    }
    
    public String buscarCodigo(String Linea){
        for(LineaDeInvestigacion a: listaLineas){
            
            if(Linea.equals(a.getNombre())){
                return a.getCodigo();
            }
        }
        return null;
    }
    
    public void listaLineas(){
        
        for(LineaDeInvestigacion a: listaLineas){
            ComboLineaInvestigacion.addItem(a.getNombre());
        }
    }
  
    public void listaSubLineas(String codigo){
        
        for(SubLineaInvestigacion a: listaSubLineas ){
            if(a.getlCodigo().equals(codigo)){
            // ComboSubLinea.addItem(a.getNombre());  
            }  
        }
    }
    
    public void cargos(){
        ComboCargo.addItem("Miembro");
        ComboCargo.addItem("Evaluador");
    }
    
     public void LlenarTablaLinea(){
         
        try{
            Docente e = this.registrarDocente();
            if(this.listadocentes.add(e)){
                JOptionPane.showMessageDialog(this, "Docente registrado con exito", "Confirmacion", JOptionPane.INFORMATION_MESSAGE);
                this.LimpiarDatosDocente(); 
                
            }
            else{
               JOptionPane.showMessageDialog(this, "Error al registrar al Docente", "Error", JOptionPane.ERROR_MESSAGE); 
            }
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e, "Excepcion", JOptionPane.ERROR_MESSAGE); 
        }
        
    }
    
     public void LimpiarDatosDocente(){
         
        this.TxtNombreDocente.setText("");
        this.TxtCedulaDocente.setText("");
        this.TxtContraseñaDocente.setText("");
        this.TxtApellidoDocente.setText("");
        
     }
     
    public void mostrarTabla(){
         String titulos[]={"cargo", "Cedula","nombre", "Apellido","Usuario","Contraseña" , "Linea"};
        
        DefaultTableModel ModeloTabla = new DefaultTableModel();
        ModeloTabla.setColumnIdentifiers(titulos);
        
        for(Docente a: listadocentes){
          Object datos[]={a.getCargo(), a.getCedula(),a.getNombre(), a.getApellido(),a.getUsuario(), a.getContraseña(), a.getLinea()};
           ModeloTabla.addRow(datos);
           }
        
         TablaDocentes.setModel(ModeloTabla);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BotonGuardarDocente;
    private javax.swing.JComboBox<String> ComboCargo;
    private javax.swing.JComboBox<String> ComboLineaInvestigacion;
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JTable TablaDocentes;
    private javax.swing.JTextField TxtApellidoDocente;
    private javax.swing.JTextField TxtCedulaDocente;
    private javax.swing.JTextField TxtContraseñaDocente;
    private javax.swing.JTextField TxtNombreDocente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}
