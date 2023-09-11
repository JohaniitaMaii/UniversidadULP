package universidadulp.acceso;

import java.util.ArrayList;
import java.util.List;
import universidadulp.entidades.Alumno;
import universidadulp.entidades.Inscripcion;
import universidadulp.entidades.Materia;

/**
 *
 * @author johan
 */
public class InscripcionDAO extends Conexion {

     public void guardarInscripcion(Inscripcion i) throws Exception {
        try {
            if (i == null) {
                throw new Exception("Debe indicar una Inscripcion");
            }
            String sql = "INSERT INTO inscripcion (nota,idAlumno,idMateria) VALUES  (" +
                    i.getNota() + ", " + i.getAlumno()+ "," + i.getMateria()+ ");";
            modificarBase(sql);
        } catch (Exception e) {
            System.out.println("Error al crear la Inscripcion");
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public List<Inscripcion> listarInscripcion() throws Exception {
        try {
            String sql = "SELECT * FROM inscripcion ";
            Inscripcion inscripcion = new Inscripcion();
            List<Inscripcion> inscripciones = new ArrayList<>();
            consultarBase(sql);
            while (resultado.next()) {
                inscripcion.setIdInscripto(resultado.getInt(1));
                inscripcion.setNota(resultado.getInt(2));
                inscripcion.setAlumno(resultado.getInt(3));
                inscripcion.setMateria(resultado.getInt(4));
                inscripciones.add(inscripcion);
            }
            return inscripciones;
        } catch (Exception e) {
            System.out.println("Error al Listar las Inscripciones");
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id) throws Exception {
        try {
            String sql = "SELECT * FROM inscripcion AS i JOIN alumno AS a ON i.idAlumno = a.idAlumno "
                    + "WHERE i.idAlumno = " + id + " ;";
            Inscripcion inscripcion = new Inscripcion();
            ;
            List<Inscripcion> inscripciones = new ArrayList<>();
            consultarBase(sql);
            while (resultado.next()) {
                inscripcion.setIdInscripto(resultado.getInt(1));
                inscripcion.setNota(resultado.getInt(2));
                inscripcion.setAlumno(resultado.getInt(3));
                inscripcion.setMateria(resultado.getInt(4));
                inscripciones.add(inscripcion);
            }
            return inscripciones;
        } catch (Exception e) {
            System.out.println("Error al Listar las Inscripciones");
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public List<Materia> obtenerMateriaCursada(int id) throws Exception {
        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT m.idMateria, m.nombre, m.año, m. estado FROM materia AS m JOIN inscripcion " +
                    " AS i ON m.idMateria = i.idMateria WHERE i.idMateria = "+ id + " AND m.estado = true ;";
            consultarBase(sql);
            while (resultado.next()) {
                Materia m = new Materia();
                m.setIdMateria(resultado.getInt(1));
                m.setNombre(resultado.getString(2));
                m.setAnioMateria(resultado.getInt(3));
                m.setEstado(resultado.getBoolean(4));
                materias.add(m);
            }
            return materias;
        } catch (Exception e) {
            System.out.println("Error al Obtener las Materias");
            System.out.println(e.getMessage());
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public List<Materia> obtenerMateriaNoCursada(int id) throws Exception {
        List<Materia> materias = new ArrayList<>();
        try {
            String sql = "SELECT m.isMateria, m.nombre, m.año, m. estado FROM materia AS m JOIN inscripcion " +
                    " AS i ON m.idMateria = i.idMateria WHERE i.idMateria = " + id + " AND m.estado = false ;";
            consultarBase(sql);
            while (resultado.next()) {
                Materia m = new Materia();
                m.setIdMateria(resultado.getInt(1));
                m.setNombre(resultado.getString(2));
                m.setAnioMateria(resultado.getInt(3));
                m.setEstado(resultado.getBoolean(4));
                materias.add(m);
            }
            return materias;
        } catch (Exception e) {
            System.out.println("Error al Obtener las Materias");
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void borrarInscrpcionMateriaAlumno(int idA, int idM) throws Exception {
        try {
            String sql = " DELETE FROM inscripcion WHERE idMateria = " + idM
                    + " AND idAlumno = " + idA + " ;";
            modificarBase(sql);
        } catch (Exception e) {
            System.out.println("Error al eliminar Inscripcion");
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public void modificarInscrpcion(int idA, int idM, double nota) throws Exception {
        try {
            String sql = "UPDATE inscripcion SET nota = " + nota + " WHERE idAlumno = " + idA
                    + " AND idMateria = " + idM;
            modificarBase(sql);
        } catch (Exception e) {
            System.out.println("Error al realizar la Actualizacion");
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public List<Alumno> obtenerAlumnosPorMateria(int idM) throws Exception {
        try {
            List<Alumno> alumnos = new ArrayList<>();
            Alumno a = new Alumno();
            String sql = "SELECT a.* FROM inscripcion AS i JOIN alumno AS a ON i.idAlumno = a.idAlumno WHERE idMateria ="
                    + idM + ";";
            consultarBase(sql);
            while (resultado.next()) {
                a.setIdAlumno(resultado.getInt(1));
                a.setDni(resultado.getInt(2));
                a.setApellido(resultado.getString(3));
                a.setNombre(resultado.getString(4));
                a.setFechaNacimiento(resultado.getDate(5));
                a.setEstado(resultado.getBoolean(6));
                alumnos.add(a);
            } 
            return alumnos;
        } catch (Exception e) {
            System.out.println("Error al obtener los Alumnos");
            throw e;
        } finally {
            desconectarBase();
        }
    }

}
