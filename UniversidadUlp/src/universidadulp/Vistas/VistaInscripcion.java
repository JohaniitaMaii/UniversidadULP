package universidadulp.Vistas;

import java.awt.BorderLayout;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import universidadulp.acceso.InscripcionDAO;
import universidadulp.entidades.*;

/**
 *
 * @author johan
 */
public class VistaInscripcion extends javax.swing.JInternalFrame {
   private DefaultTableModel modelo = new DefaultTableModel();
    InscripcionDAO insdao = new InscripcionDAO();
Confirmacion confirmacion;
    /**
     * Creates new form VistaInscripcion
     */
    public VistaInscripcion() {
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

        panelNuevaInscripcion = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtNota = new javax.swing.JTextField();
        txtIdAlumno = new javax.swing.JTextField();
        txtIdMateria = new javax.swing.JTextField();
        btnNuevaInscripcion = new javax.swing.JButton();
        btnModificarIns = new javax.swing.JButton();
        btnEliminarIns = new javax.swing.JButton();
        panelInscripcionAlumno = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        idAlumnoInscrp = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        jLabel1.setText("Nota");

        jLabel2.setText("Id Alumno");

        jLabel3.setText("Id Materia");

        txtNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNotaActionPerformed(evt);
            }
        });

        btnNuevaInscripcion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/nuevo.png"))); // NOI18N
        btnNuevaInscripcion.setText("Nueva Inscripción");
        btnNuevaInscripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevaInscripcionActionPerformed(evt);
            }
        });

        btnModificarIns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/modificar.png"))); // NOI18N
        btnModificarIns.setText("Modificar Nota");
        btnModificarIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarInsActionPerformed(evt);
            }
        });

        btnEliminarIns.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/eliminar.png"))); // NOI18N
        btnEliminarIns.setText("Eliminar Inscripción");
        btnEliminarIns.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarInsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelNuevaInscripcionLayout = new javax.swing.GroupLayout(panelNuevaInscripcion);
        panelNuevaInscripcion.setLayout(panelNuevaInscripcionLayout);
        panelNuevaInscripcionLayout.setHorizontalGroup(
            panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevaInscripcionLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNuevaInscripcionLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnNuevaInscripcion))
                .addGap(34, 34, 34)
                .addGroup(panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNuevaInscripcionLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnModificarIns, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNuevaInscripcionLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelNuevaInscripcionLayout.createSequentialGroup()
                        .addComponent(btnEliminarIns)
                        .addGap(52, 52, 52))))
        );
        panelNuevaInscripcionLayout.setVerticalGroup(
            panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelNuevaInscripcionLayout.createSequentialGroup()
                .addGroup(panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelNuevaInscripcionLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(txtIdAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtIdMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(105, 105, 105))
                    .addGroup(panelNuevaInscripcionLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(panelNuevaInscripcionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnNuevaInscripcion)
                            .addComponent(btnModificarIns)
                            .addComponent(btnEliminarIns))))
                .addGap(46, 46, 46))
        );

        jLabel6.setText("Id Alumno");

        idAlumnoInscrp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idAlumnoInscrpActionPerformed(evt);
            }
        });

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/inscripcion3.png"))); // NOI18N
        jButton5.setText("Inscripciones por Alumno");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/limpio.png"))); // NOI18N
        jButton1.setText("Limpiar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id Inscripcion", "Nota", "Id Alumno", "Id Materia"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout panelInscripcionAlumnoLayout = new javax.swing.GroupLayout(panelInscripcionAlumno);
        panelInscripcionAlumno.setLayout(panelInscripcionAlumnoLayout);
        panelInscripcionAlumnoLayout.setHorizontalGroup(
            panelInscripcionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInscripcionAlumnoLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel6)
                .addGap(30, 30, 30)
                .addComponent(idAlumnoInscrp, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(71, 71, 71)
                .addComponent(jButton1)
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelInscripcionAlumnoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        panelInscripcionAlumnoLayout.setVerticalGroup(
            panelInscripcionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelInscripcionAlumnoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(panelInscripcionAlumnoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(idAlumnoInscrp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelNuevaInscripcion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelInscripcionAlumno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(panelNuevaInscripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelInscripcionAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // BOTON INSCRIPCIONES POR ALUMNO
        if (idAlumnoInscrp.getText().isEmpty() || idAlumnoInscrp.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe indicar el ID del Alumno");
        } else {
            if (esNumerico(idAlumnoInscrp.getText(), "1", "2")) {
                try {
                    int idA = Integer.parseInt(idAlumnoInscrp.getText());
                    List<Inscripcion> lista = insdao.obtenerInscripcionesPorAlumno(idA);
                    modelo = new DefaultTableModel();
                    modelo.addColumn("Id Inscripcion");
                    modelo.addColumn("Nota");
                    modelo.addColumn("Id Alumno");
                    modelo.addColumn("Id Materia");
                    jTable1.setModel(modelo);
                    for (Inscripcion i : lista) {
                        modelo.addRow(new Object[]{i.getIdInscripto(), i.getNota(), i.getAlumno().getIdAlumno(), i.getMateria().getIdMateria()});
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(this, "Error al Obtener las inscripciones");
                }
            } else {
                JOptionPane.showMessageDialog(this, "Ingrese un Número válido");
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnNuevaInscripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevaInscripcionActionPerformed
        //BOTON NUEVA INSCRIPCION

//        Alumno alu = new Alumno();
//        Materia mate = new Materia();
//        if (validar()) {
//            if (esNumerico(idAlumno(), idMateria(), nota())) {//IdAlumno() es igual a txtIdAlumno.getText()
//                try {
//                    alu.setIdAlumno(Integer.parseInt(idAlumno()));
//                    mate.setIdMateria(Integer.parseInt(idMateria()));
//                    Inscripcion ins = new Inscripcion(0, alu, mate);
//                    ins.setNota(Integer.parseInt(nota()));
//                    insdao.guardarInscripcion(ins);
//                    JOptionPane.showMessageDialog(this, "Se ha guardado la Inscripción");
//                    borrarDatosInscricion();
//                } catch (Exception ex) {
//                    JOptionPane.showMessageDialog(null, "Error al guardar una Inscripción");
//                    borrarDatosInscricion();
//                }
//            } else {
//                JOptionPane.showMessageDialog(null, "Ingresa datos válidos en los espacios");
//                borrarDatosInscricion();
//            }
//        }
    }//GEN-LAST:event_btnNuevaInscripcionActionPerformed

    private void btnModificarInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarInsActionPerformed
        //BOTON MODIFICAR NOTA
        Alumno alu = new Alumno();
        Materia mate = new Materia();

        if (validar()) {
            if (esNumerico(idAlumno(), idMateria(), nota())) {

                alu.setIdAlumno(Integer.parseInt(idAlumno()));
                mate.setIdMateria(Integer.parseInt(idMateria()));
                Inscripcion ins = new Inscripcion(0, alu, mate);
                ins.setNota(Integer.parseInt(nota()));
                try {
                    insdao.modificarInscripcion(alu.getIdAlumno(), mate.getIdMateria(), ins.getNota());
                    JOptionPane.showMessageDialog(null, "Se ha modificado la Nota");
                    borrarDatosInscricion();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al modificar la Inscripción");
                    borrarDatosInscricion();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Ingresa datos válidos en los espacios");
                borrarDatosInscricion();
            }
        }

    }//GEN-LAST:event_btnModificarInsActionPerformed

    private void btnEliminarInsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarInsActionPerformed
        // BOTON ELIMINAR INSCRIPCION
        
        if (validar2()) {
            if (esNumerico(idAlumno(), idMateria(), nota())) {
                int idA = Integer.parseInt(idAlumno());
                int idM = Integer.parseInt(idMateria());
                try {
                    insdao.borrarInscrpcionMateriaAlumno(idA, idM);
                     JOptionPane.showMessageDialog(null, "Se ha eliminado la Inscripción");
                    borrarDatosInscricion();
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error al eliminar la Inscripción");
                    borrarDatosInscricion();
                }
            }else {
                JOptionPane.showMessageDialog(null, "Ingresa datos válidos en los espacios");
                borrarDatosInscricion();
            }
        }
    }//GEN-LAST:event_btnEliminarInsActionPerformed

    private void txtNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNotaActionPerformed
        // TODO add your handling code here: 
    }//GEN-LAST:event_txtNotaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // BOTON LIMPIAR
        borrarDatosInscricion();
        modelo.setRowCount(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void idAlumnoInscrpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idAlumnoInscrpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idAlumnoInscrpActionPerformed

    public boolean validar() {
        boolean vali = false;
        if (txtNota.getText().equals("") || txtNota.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe indicar la Nota");
        } else if (txtIdAlumno.getText().equals("") || txtIdAlumno.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe indicar el Id Alumno");
        } else if (txtIdMateria.getText().equals("") || txtIdMateria.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe indicar el Id Materia");
        } else {
            vali = true;
        }
        return vali;
    }
    public boolean validar2() {
        boolean vali = false;
        txtNota.setText("0");
        if (txtIdAlumno.getText().equals("") || txtIdAlumno.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe indicar el Id Alumno");
        } else if (txtIdMateria.getText().equals("") || txtIdMateria.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe indicar el Id Materia");
        } else {
            vali = true;
        }
        return vali;
    }

    public void borrarDatosInscricion() {
        txtNota.setText("");
        txtIdAlumno.setText("");
        txtIdMateria.setText("");
        idAlumnoInscrp.setText("");
    }

    public boolean esNumerico(String a, String b, String c) {//verificar si es un entero
        boolean resultado;
        try {
            Integer.parseInt(a);
            Integer.parseInt(b);
            Integer.parseInt(c);
            resultado = true;
        } catch (NumberFormatException ex) {
            resultado = false;
        }
        return resultado;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminarIns;
    private javax.swing.JButton btnModificarIns;
    private javax.swing.JButton btnNuevaInscripcion;
    private javax.swing.JTextField idAlumnoInscrp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JPanel panelInscripcionAlumno;
    private javax.swing.JPanel panelNuevaInscripcion;
    private javax.swing.JTextField txtIdAlumno;
    private javax.swing.JTextField txtIdMateria;
    private javax.swing.JTextField txtNota;
    // End of variables declaration//GEN-END:variables

    public String idAlumno() {
        String id = txtIdAlumno.getText();
        return id;
    }

    public String nota() {
        String nota = txtNota.getText();
        return nota;
    }

    public String idMateria() {
        String mate = txtIdMateria.getText();
        return mate;
    }

}
