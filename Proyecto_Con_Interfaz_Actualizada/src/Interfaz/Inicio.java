/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 * 
 * 
 * 
 * 
 * DIEGO A VER SI TE DESCARGA...
 * 
 * 
 * @author zarel
 */
public class Inicio extends javax.swing.JFrame {

    /**
     * Creates new form Inicio
     */
    public Inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.jPanelMenuEstudiante2.setVisible(false);
      
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1MenuPrincipal = new javax.swing.JPanel();
        jPanelMenuEstudiante2 = new javax.swing.JPanel();
        jPanelBotonLogin2 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jPanelBotonLogin3 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jPanelExamen = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabelBotonExamen = new javax.swing.JLabel();
        jPanelBotonEstudiante1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel34 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JLabel();
        botonSalir = new javax.swing.JLabel();
        jPanelBotonLogin = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jPanelBotonEstudiante = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jPanelPrincipalBienvenida = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        Escritorio = new javax.swing.JDesktopPane();
        jLabelFondoPrincipal = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1MenuPrincipal.setBackground(new java.awt.Color(0, 102, 0));
        jPanel1MenuPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelMenuEstudiante2.setBackground(new java.awt.Color(0, 102, 0));
        jPanelMenuEstudiante2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelBotonLogin2.setBackground(new java.awt.Color(0, 153, 51));
        jPanelBotonLogin2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBotonLogin2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBotonLogin2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBotonLogin2MouseExited(evt);
            }
        });
        jPanelBotonLogin2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_browse_folder_30px_1.png"))); // NOI18N
        jPanelBotonLogin2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel32.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Consultar Proyecto");
        jPanelBotonLogin2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 180, 30));

        jPanelBotonLogin3.setBackground(new java.awt.Color(0, 153, 0));
        jPanelBotonLogin3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBotonLogin3MouseClicked(evt);
            }
        });
        jPanelBotonLogin3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_user_40px.png"))); // NOI18N
        jPanelBotonLogin3.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jLabel37.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("Login");
        jPanelBotonLogin3.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(82, 10, 100, 30));

        jPanelBotonLogin2.add(jPanelBotonLogin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 220, 40));

        jPanelMenuEstudiante2.add(jPanelBotonLogin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 220, 40));

        jPanelExamen.setBackground(new java.awt.Color(0, 153, 51));
        jPanelExamen.setForeground(new java.awt.Color(0, 153, 0));
        jPanelExamen.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelExamenMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelExamenMouseExited(evt);
            }
        });
        jPanelExamen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_grades_30px.png"))); // NOI18N
        jPanelExamen.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 30, 40));

        jLabelBotonExamen.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabelBotonExamen.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBotonExamen.setText("Examen");
        jPanelExamen.add(jLabelBotonExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 110, 40));

        jPanelMenuEstudiante2.add(jPanelExamen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 320, 220, 40));

        jPanelBotonEstudiante1.setBackground(new java.awt.Color(0, 153, 51));
        jPanelBotonEstudiante1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBotonEstudiante1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBotonEstudiante1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBotonEstudiante1MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBotonEstudiante1MousePressed(evt);
            }
        });
        jPanelBotonEstudiante1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_graduation_cap_40px_1.png"))); // NOI18N
        jPanelBotonEstudiante1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, 30));

        jLabel9.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estudiante");
        jPanelBotonEstudiante1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 100, 30));

        jPanelMenuEstudiante2.add(jPanelBotonEstudiante1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 40));

        jPanel5.setBackground(new java.awt.Color(0, 102, 0));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("__________________________");
        jPanel5.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, 180, 20));

        jLabel33.setFont(new java.awt.Font("Lucida Sans", 2, 36)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("Inicio");
        jPanel5.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 100, 40));

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_home_40px_3.png"))); // NOI18N
        jPanel5.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, 40));

        jPanelMenuEstudiante2.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 110));

        botonRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_back_arrow_30px_1.png"))); // NOI18N
        botonRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonRegresarMouseClicked(evt);
            }
        });
        jPanelMenuEstudiante2.add(botonRegresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 430, -1, -1));

        botonSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_multiply_30px.png"))); // NOI18N
        botonSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                botonSalirMouseClicked(evt);
            }
        });
        jPanelMenuEstudiante2.add(botonSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 0, -1, -1));

        jPanel1MenuPrincipal.add(jPanelMenuEstudiante2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 220, 710));

        jPanelBotonLogin.setBackground(new java.awt.Color(0, 153, 51));
        jPanelBotonLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBotonLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBotonLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBotonLoginMouseExited(evt);
            }
        });
        jPanelBotonLogin.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_user_40px.png"))); // NOI18N
        jPanelBotonLogin.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jLabel8.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Login");
        jPanelBotonLogin.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 102, 30));

        jPanel1MenuPrincipal.add(jPanelBotonLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 280, 220, 40));

        jPanelBotonEstudiante.setBackground(new java.awt.Color(0, 153, 51));
        jPanelBotonEstudiante.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanelBotonEstudianteMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanelBotonEstudianteMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanelBotonEstudianteMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jPanelBotonEstudianteMousePressed(evt);
            }
        });
        jPanelBotonEstudiante.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_graduation_cap_40px_1.png"))); // NOI18N
        jPanelBotonEstudiante.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jLabel7.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Estudiante");
        jPanelBotonEstudiante.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 10, 102, 30));

        jPanel1MenuPrincipal.add(jPanelBotonEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 220, 40));

        jPanel6.setBackground(new java.awt.Color(0, 102, 0));
        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("__________________________");
        jPanel6.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 180, 20));

        jLabel40.setFont(new java.awt.Font("Lucida Sans", 2, 36)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("Inicio");
        jPanel6.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 100, 40));

        jLabel41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/icons8_home_40px_3.png"))); // NOI18N
        jPanel6.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 40, 40, 40));

        jPanel1MenuPrincipal.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 180, 120));

        getContentPane().add(jPanel1MenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 710));

        jPanelPrincipalBienvenida.setBackground(new java.awt.Color(255, 255, 255));
        jPanelPrincipalBienvenida.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bienvenido");
        jPanelPrincipalBienvenida.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 20, 290, 80));

        jLabelFondoPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesUpc/ahhh.JPG"))); // NOI18N

        Escritorio.setLayer(jLabelFondoPrincipal, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(EscritorioLayout.createSequentialGroup()
                .addComponent(jLabelFondoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 1275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, EscritorioLayout.createSequentialGroup()
                .addComponent(jLabelFondoPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanelPrincipalBienvenida.add(Escritorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 1020, 710));

        getContentPane().add(jPanelPrincipalBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1240, 710));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jPanelBotonEstudianteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotonEstudianteMouseClicked

        this.jPanelMenuEstudiante2.setVisible(true);
    }//GEN-LAST:event_jPanelBotonEstudianteMouseClicked

    private void jPanelBotonLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotonLoginMouseClicked
         new Login().show();
         dispose();
    }//GEN-LAST:event_jPanelBotonLoginMouseClicked

    private void jPanelBotonLogin2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotonLogin2MouseClicked
      consultarProyecto consultarProyecto = new consultarProyecto();
      Escritorio.add(consultarProyecto);
      consultarProyecto.show();     
    }//GEN-LAST:event_jPanelBotonLogin2MouseClicked

    private void jPanelBotonLogin3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotonLogin3MouseClicked
     
    }//GEN-LAST:event_jPanelBotonLogin3MouseClicked

    private void jPanelBotonEstudiante1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotonEstudiante1MouseClicked

        
      RegistrarProyecto ad = new RegistrarProyecto();
      Escritorio.add(ad);
      ad.show();
       
       
    }//GEN-LAST:event_jPanelBotonEstudiante1MouseClicked

    private void jPanelBotonEstudianteMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotonEstudianteMouseEntered
         setColor(jPanelBotonEstudiante);
    }//GEN-LAST:event_jPanelBotonEstudianteMouseEntered

    private void jPanelBotonEstudianteMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotonEstudianteMouseExited
        resetColor(jPanelBotonEstudiante);
    }//GEN-LAST:event_jPanelBotonEstudianteMouseExited

    private void jPanelBotonEstudianteMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotonEstudianteMousePressed
       
    }//GEN-LAST:event_jPanelBotonEstudianteMousePressed

    private void jPanelBotonEstudiante1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotonEstudiante1MouseExited
        resetColor(jPanelBotonEstudiante1);
    }//GEN-LAST:event_jPanelBotonEstudiante1MouseExited

    private void jPanelBotonEstudiante1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotonEstudiante1MousePressed
        
    }//GEN-LAST:event_jPanelBotonEstudiante1MousePressed

    private void jPanelBotonEstudiante1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotonEstudiante1MouseEntered
        setColor(jPanelBotonEstudiante1);
    }//GEN-LAST:event_jPanelBotonEstudiante1MouseEntered

    private void jPanelBotonLogin2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotonLogin2MouseEntered
         setColor(jPanelBotonLogin2);
    }//GEN-LAST:event_jPanelBotonLogin2MouseEntered

    private void jPanelBotonLogin2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotonLogin2MouseExited
         resetColor(jPanelBotonLogin2);
    }//GEN-LAST:event_jPanelBotonLogin2MouseExited

    private void jPanelExamenMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExamenMouseEntered
        setColor(jPanelExamen);
    }//GEN-LAST:event_jPanelExamenMouseEntered

    private void jPanelExamenMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelExamenMouseExited
        resetColor(jPanelExamen);
    }//GEN-LAST:event_jPanelExamenMouseExited

    private void jPanelBotonLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotonLoginMouseEntered
        setColor(jPanelBotonLogin);
    }//GEN-LAST:event_jPanelBotonLoginMouseEntered

    private void jPanelBotonLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanelBotonLoginMouseExited
        resetColor(jPanelBotonLogin);
    }//GEN-LAST:event_jPanelBotonLoginMouseExited

    private void botonRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonRegresarMouseClicked
        new Admin2().show();
    }//GEN-LAST:event_botonRegresarMouseClicked

    private void botonSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botonSalirMouseClicked
        System.exit(0);
    }//GEN-LAST:event_botonSalirMouseClicked

    public void regresar(){
        new Inicio().show();
        dispose();
    }
    
     public void setColor(JPanel panel ){
       panel.setBackground(new java.awt.Color(0,102,0)); 
   }
   
    public void resetColor(JPanel panel ){
       panel.setBackground(new java.awt.Color(0,153,51)); 
   }
    
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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JLabel botonRegresar;
    private javax.swing.JLabel botonSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelBotonExamen;
    private javax.swing.JLabel jLabelFondoPrincipal;
    private javax.swing.JPanel jPanel1MenuPrincipal;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanelBotonEstudiante;
    private javax.swing.JPanel jPanelBotonEstudiante1;
    private javax.swing.JPanel jPanelBotonLogin;
    private javax.swing.JPanel jPanelBotonLogin2;
    private javax.swing.JPanel jPanelBotonLogin3;
    private javax.swing.JPanel jPanelExamen;
    private javax.swing.JPanel jPanelMenuEstudiante2;
    private javax.swing.JPanel jPanelPrincipalBienvenida;
    // End of variables declaration//GEN-END:variables
}
