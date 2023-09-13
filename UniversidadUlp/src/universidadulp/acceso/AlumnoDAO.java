package universidadulp.acceso;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import universidadulp.entidades.Alumno;

/**
 *
 * @author johan
 */
public final class AlumnoDAO extends Conexion {

    public void guardarAlumno(Alumno a) throws Exception {//1 OCUPADO
        try {
            if (a == null) {
                throw new Exception("Debe indicar un alumno");
            }
            String sql = "INSERT INTO alumno(dni,apellido, nombre,fechaNacimiento, estado) VALUES (" + a.getDni() + ", '"
                    + a.getApellido() + "', '" + a.getNombre() + "','" + a.getFechaNacimiento() + "',"+a.isEstado()+")"; 
            modificarBase(sql);
        } catch (Exception e) {
            System.out.println("Error al crear el Alumno");
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Alumno buscarAlumnoPorId(int id) throws Exception {//2
        try {
            String sql = "SELECT * FROM alumno WHERE idAlumno = " + id;
            consultarBase(sql);
            Alumno alumno = null;
            while (resultado.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(resultado.getInt(1));
                alumno.setDni(resultado.getInt(2));
                alumno.setNombre(resultado.getString(3));
                alumno.setApellido(resultado.getString(4));
                alumno.setFechaNacimiento(resultado.getDate(5));
                alumno.setEstado(resultado.getBoolean(6));
            }
            desconectarBase();
            return alumno;
        } catch (Exception e) {
            System.out.println("Error al buscar el Alumno");
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public Alumno buscarAlumnoPorDni(int dni) throws Exception {//3
        try {
            String sql = "SELECT * FROM alumno WHERE dni = " + dni + ";";
            consultarBase(sql);
            Alumno alumno = null;
            while (resultado.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(resultado.getInt(1));
                alumno.setDni(resultado.getInt(2));
                alumno.setNombre(resultado.getString(3));
                alumno.setApellido(resultado.getString(4));
                alumno.setFechaNacimiento(resultado.getDate(5));
                alumno.setEstado(resultado.getBoolean(6));
            }
            desconectarBase();
            return alumno;
        } catch (Exception e) {
            System.out.println("Error al buscar el Alumno");
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public List<Alumno> listarAlumno() throws Exception {//4
        try {
            String sql = "SELECT * FROM alumno;";
            Alumno alumno = null;
            List<Alumno> alumnos = new ArrayList<>();
            consultarBase(sql);
            while (resultado.next()) {
                alumno = new Alumno();
                alumno.setIdAlumno(resultado.getInt(1));
                alumno.setDni(resultado.getInt(2));
                alumno.setNombre(resultado.getString(3));
                alumno.setApellido(resultado.getString(4));
                alumno.setFechaNacimiento(resultado.getDate(5));
                alumno.setEstado(resultado.getBoolean(6));
                alumnos.add(alumno);
            }
            return alumnos;
        } catch (Exception e) {

        } finally {
            desconectarBase();
        }
        return null;
    }

    public void modificarAlumno(Alumno a) throws Exception {//5
        try {
            if (a == null) {
                throw new Exception("Debe indicar el alumno");
            }
            String sql = "UPDATE alumno SET dni = "+a.getDni()
                    +", apellido = '"+a.getApellido()+"', nombre = '"+ a.getNombre()
                    +"', estado= " + a.isEstado() + " WHERE idAlumno= " + a.getIdAlumno();
            modificarBase(sql);
        } catch (Exception e) {
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void eliminarAlumno(int id) throws Exception {//6
        try {
            String sql = " DELETE FROM alumno WHERE idAlumno = " + id;
            modificarBase(sql);
        } catch (Exception e) {
            System.out.println("Error al eliminar Alumno");
            throw e;
        } finally {
            desconectarBase();
        }
    }

}
