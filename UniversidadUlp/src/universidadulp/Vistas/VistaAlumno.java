package universidadulp.Vistas;

import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadulp.acceso.AlumnoDAO;
import universidadulp.entidades.Alumno;

/**
 *
 * @author johan
 */
public class VistaAlumno extends javax.swing.JInternalFrame {

    AlumnoDAO alumnoDao = new AlumnoDAO();
    Alumno alumno = new Alumno();

    /**
     * Creates new form Alumno
     */
    public VistaAlumno() {
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

        panelBuscar = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        txtIntegerBuscar = new javax.swing.JTextField();
        JBBurcar = new javax.swing.JButton();
        panelDatos = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        dateFecha = new com.toedter.calendar.JDateChooser();
        jRadioButton1 = new javax.swing.JRadioButton();
        panelAcciones = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        jLabel1.setText("Buscar Alumno");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Id Alumno", "Dni Alumno" }));
        jComboBox1.setSelectedIndex(-1);

        JBBurcar.setText("Buscar");
        JBBurcar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JBBurcarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelBuscarLayout = new javax.swing.GroupLayout(panelBuscar);
        panelBuscar.setLayout(panelBuscarLayout);
        panelBuscarLayout.setHorizontalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(txtIntegerBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(JBBurcar)
                .addContainerGap(53, Short.MAX_VALUE))
        );
        panelBuscarLayout.setVerticalGroup(
            panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBuscarLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIntegerBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JBBurcar))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Dni");

        jLabel5.setText("Fecha Nacimiento");

        jLabel6.setText("Estado");

        javax.swing.GroupLayout panelDatosLayout = new javax.swing.GroupLayout(panelDatos);
        panelDatos.setLayout(panelDatosLayout);
        panelDatosLayout.setHorizontalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5))
                .addGap(46, 46, 46)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                        .addComponent(txtApellido)
                        .addComponent(txtDni))
                    .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panelDatosLayout.setVerticalGroup(
            panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelDatosLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(dateFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(panelDatosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jRadioButton1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jButton2.setText("Modificar Alumno");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Limpiar Alumno");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar Alumno");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelAccionesLayout = new javax.swing.GroupLayout(panelAcciones);
        panelAcciones.setLayout(panelAccionesLayout);
        panelAccionesLayout.setHorizontalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jButton3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(88, 88, 88)
                .addComponent(jButton4)
                .addGap(64, 64, 64))
        );
        panelAccionesLayout.setVerticalGroup(
            panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelAccionesLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(panelAccionesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton4)
                    .addComponent(jButton3))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelDatos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelAcciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelAcciones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JBBurcarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JBBurcarActionPerformed

        if (jComboBox1.getSelectedItem().equals("")) {
            JOptionPane.showMessageDialog(this, "Debe indicar una opción");
        } else if (jComboBox1.getSelectedItem().equals("Id Alumno")) {
            try {
                alumno = alumnoDao.buscarAlumnoPorId(Integer.parseInt(txtIntegerBuscar.getText()));
            } catch (Exception ex) {
                Logger.getLogger(VistaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            try {
                alumno = alumnoDao.buscarAlumnoPorDni(Integer.parseInt(txtIntegerBuscar.getText()));
            } catch (Exception ex) {
                Logger.getLogger(VistaAlumno.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if (alumno == null) {
            JOptionPane.showMessageDialog(this, "El alumno no se encuentra en la base de datos");
        } else {
            cargarDatos(alumno);
        }
//        borrarDatos();
    }//GEN-LAST:event_JBBurcarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // BOTON NUEVO ALUMNO
        Alumno alu = new Alumno();
        alu.setNombre(txtNombre.getText());
        alu.setApellido(txtApellido.getText());
        alu.setDni(Integer.parseInt(txtDni.getText()));
        Date fechaNac = dateFecha.getDate();
        long day = fechaNac.getTime();
        java.sql.Date fecha = new java.sql.Date(day);
        alu.setFechaNacimiento(fecha);
        boolean estado = jRadioButton1.isSelected();
        alu.setEstado(estado);
        try {
            if (validar()) {
//                alumno = guardarDatos();
                alumnoDao.guardarAlumno(alu);
                JOptionPane.showMessageDialog(this, "Se ha cargado el alumno");
                borrarDatos();
            }
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // MODIFICAR ALUMNO
        if (validar()) {
            try {
                guardarDatos();
                alumnoDao.modificarAlumno(alumno);
                JOptionPane.showMessageDialog(this, "Se ha modificado el Alumno");
            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }

        }
        borrarDatos();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // ELIMINAR ALUMNO

        try {
            if (alumnoDao.eliminarAlumno(alumno.getIdAlumno())) {
                JOptionPane.showMessageDialog(this, "Se ha eliminado el Alumno");
            } else {
                JOptionPane.showMessageDialog(null, "No se puede eliminar el alumno porque tiene inscripciones");
            }
            borrarDatos();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }//GEN-LAST:event_jButton4ActionPerformed

    public boolean validar() {
        boolean vali = false;
        if (txtNombre.getText().equals("") || txtNombre.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe indicar el Nombre");
        } else if (txtApellido.getText().equals("") || txtApellido.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe indicar el Apellido");
        } else if (txtDni.getText().equals("") || txtDni.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Debe indicar el Dni");
        } else if (dateFecha.getDate() == null) {
            JOptionPane.showMessageDialog(this, "Debe indicar Fecha de Nacimiento");
        } else if (!jRadioButton1.isSelected()) {
            JOptionPane.showMessageDialog(this, "Debe seleccionar estado");
        } else {
            vali = true;
        }
        return vali;
    }

    public void cargarDatos(Alumno a) {
        txtNombre.setText(a.getNombre());
        txtApellido.setText(a.getApellido());
        txtDni.setText(a.getDni() + "");
        dateFecha.setDate(a.getFechaNacimiento());
        if (a.isEstado()) {
            jRadioButton1.setSelected(true);
        }
    }

    public void borrarDatos() {
        txtNombre.setText("");
        txtApellido.setText("");
        txtDni.setText("");
        dateFecha.setDate(null);
        jRadioButton1.setSelected(false);
        txtIntegerBuscar.setText("");
        jComboBox1.setSelectedIndex(-1);
    }

    public Alumno guardarDatos() throws Exception {
        if (jComboBox1.getSelectedItem().equals("Id Alumno")) {
            alumno.setIdAlumno(Integer.parseInt(txtIntegerBuscar.getText()));
        }
        alumno.setNombre(txtNombre.getText());
        alumno.setApellido(txtApellido.getText());
        alumno.setDni(Integer.parseInt(txtDni.getText()));
        Date fechaNac = dateFecha.getDate();
        long day = fechaNac.getTime();
        java.sql.Date fecha = new java.sql.Date(day);
        alumno.setFechaNacimiento(fecha);
        boolean estado = jRadioButton1.isSelected();
        alumno.setEstado(estado);
//        System.out.println(alumno.toString());
        return alumno;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JBBurcar;
    private com.toedter.calendar.JDateChooser dateFecha;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JPanel panelAcciones;
    private javax.swing.JPanel panelBuscar;
    private javax.swing.JPanel panelDatos;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtIntegerBuscar;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
