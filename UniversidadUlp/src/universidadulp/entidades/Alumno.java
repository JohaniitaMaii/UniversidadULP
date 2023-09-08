package universidadulp.entidades;

import java.util.Date;

public class Alumno {

    private int idAlumno;
    private int dni;
    private String apellido;
    private String nombre;
    private Date fechaNacimiento;
    private boolean estado;

    public Alumno() {
    }

    public Alumno(int dni, String apellido, String nombre, Date fechaNacimiento) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;

    }

    public Alumno(int idAlumno, int dni, String apellido, String nombre, Date fechaNacimiento, boolean estado) {
        this.idAlumno = idAlumno;
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.estado = estado;
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "IdAlumno = " + idAlumno + ", Dni=" + dni + ", Apellido=" + apellido + ", Nombre=" + nombre + ", Fecha de Nacimiento=" + fechaNacimiento + ", Estado=" + estado;
    }

}
