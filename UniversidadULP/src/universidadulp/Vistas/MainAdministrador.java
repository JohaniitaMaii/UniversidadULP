/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package universidadulp.Vistas;

/**
 *
 * @author Usuario
 */
public class MainAdministrador extends javax.swing.JFrame {

    /** Creates new form MainAdministrador */
   
    public MainAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
    }
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpEscritorio = new javax.swing.JDesktopPane();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        MIagregarAlumno = new javax.swing.JMenuItem();
        MIeliminarAlumno = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        listasAlumno = new javax.swing.JMenuItem();
        jMAlumnopMateria = new javax.swing.JMenuItem();
        jMMateriapAlumno = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jdpEscritorio.setBackground(new java.awt.Color(102, 102, 255));

        jLabel1.setBackground(new java.awt.Color(153, 153, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 255));
        jLabel1.setText("Consola de Administrador");

        jdpEscritorio.setLayer(jLabel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpEscritorioLayout = new javax.swing.GroupLayout(jdpEscritorio);
        jdpEscritorio.setLayout(jdpEscritorioLayout);
        jdpEscritorioLayout.setHorizontalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpEscritorioLayout.createSequentialGroup()
                .addContainerGap(94, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(69, 69, 69))
        );
        jdpEscritorioLayout.setVerticalGroup(
            jdpEscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpEscritorioLayout.createSequentialGroup()
                .addGap(160, 160, 160)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(197, Short.MAX_VALUE))
        );

        jMenu1.setText("Alumnos");
        jMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu1ActionPerformed(evt);
            }
        });

        MIagregarAlumno.setText("Agregar");
        MIagregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIagregarAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(MIagregarAlumno);

        MIeliminarAlumno.setText("Eliminar");
        MIeliminarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIeliminarAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(MIeliminarAlumno);

        jMenuItem3.setText("Visualizar");
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materias");

        jMenuItem1.setText("Agregar");
        jMenu2.add(jMenuItem1);

        jMenuItem4.setText("Eliminar");
        jMenu2.add(jMenuItem4);

        jMenuItem5.setText("Visualizar");
        jMenu2.add(jMenuItem5);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Administración");

        jMenuItem6.setText("Modificar Calificación");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Consultas");

        listasAlumno.setText("Listas");
        listasAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listasAlumnoActionPerformed(evt);
            }
        });
        jMenu4.add(listasAlumno);

        jMAlumnopMateria.setText("Listar Alumnos por Materias");
        jMAlumnopMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMAlumnopMateriaActionPerformed(evt);
            }
        });
        jMenu4.add(jMAlumnopMateria);

        jMMateriapAlumno.setText("Listar Materias por Alumnos");
        jMMateriapAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMMateriapAlumnoActionPerformed(evt);
            }
        });
        jMenu4.add(jMMateriapAlumno);

        jMenuBar1.add(jMenu4);

        jMenu5.setText("Vista Alumno");

        jMenuItem2.setText("Alumno");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu5.add(jMenuItem2);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpEscritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MIagregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIagregarAlumnoActionPerformed
        // Abrimos la ventana interna AgregarAlumno
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        AgregarAlumno Ag = new AgregarAlumno();
        Ag.setVisible(true);
        jdpEscritorio.add(Ag);
        jdpEscritorio.moveToFront(Ag);
        
    }//GEN-LAST:event_MIagregarAlumnoActionPerformed

    private void jMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenu1ActionPerformed

    private void jMAlumnopMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMAlumnopMateriaActionPerformed
        // TODO add your handling code here:
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        ListarAlumnospMaterias LAlpM = new ListarAlumnospMaterias();
        LAlpM.setVisible(true);
        jdpEscritorio.add(LAlpM);
        jdpEscritorio.moveToFront(LAlpM);
    }//GEN-LAST:event_jMAlumnopMateriaActionPerformed

    private void jMMateriapAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMMateriapAlumnoActionPerformed
        // TODO add your handling code here:
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        ListarMateriaspAlumnos LMapA = new ListarMateriaspAlumnos();
        LMapA.setVisible(true);
        jdpEscritorio.add(LMapA);
        jdpEscritorio.moveToFront(LMapA);
    }//GEN-LAST:event_jMMateriapAlumnoActionPerformed

    private void MIeliminarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIeliminarAlumnoActionPerformed
        // Abrimos la ventana interna AgregarAlumno
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        EliminarAlumno Ea = new EliminarAlumno();
        Ea.setVisible(true);
        jdpEscritorio.add(Ea);
        jdpEscritorio.moveToFront(Ea);
    }//GEN-LAST:event_MIeliminarAlumnoActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        // Abrimos ventana para Modificar Notas
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        ModificarCalificacion Mc = new ModificarCalificacion();
        Mc.setVisible(true);
        jdpEscritorio.add(Mc);
        jdpEscritorio.moveToFront(Mc);
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        VistaAlumno vista = new VistaAlumno();
       vista.setVisible(true);
       jdpEscritorio.add(vista);
       jdpEscritorio.moveToFront(vista);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void listasAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listasAlumnoActionPerformed
        jdpEscritorio.removeAll();
        jdpEscritorio.repaint();
        Listas listas = new Listas();
        listas.setVisible(true);
        jdpEscritorio.add(listas);
       jdpEscritorio.moveToFront(listas);
        
    }//GEN-LAST:event_listasAlumnoActionPerformed

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
            java.util.logging.Logger.getLogger(MainAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MIagregarAlumno;
    private javax.swing.JMenuItem MIeliminarAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem jMAlumnopMateria;
    private javax.swing.JMenuItem jMMateriapAlumno;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JDesktopPane jdpEscritorio;
    private javax.swing.JMenuItem listasAlumno;
    // End of variables declaration//GEN-END:variables

}
