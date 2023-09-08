package universidadulp.acceso;

import java.util.ArrayList;
import java.util.List;
import universidadulp.entidades.Inscripcion;

/**
 *
 * @author johan
 */
public class InscripcionDAO extends Conexion {

    public void guardarInscripcion(Inscripcion i) throws Exception {//1
        try {
            if (i == null) {
                throw new Exception("Debe indicar una Inscripcion");
            }
            String sql = "INSERT INTO inscripcion VALUES (" + i.getIdInscripto() + ", "
                    + i.getNota() + ", " + i.getAlumno().getIdAlumno() + "," + i.getMateria().getIdMateria() + ");";
            modificarBase(sql);
        } catch (Exception e) {
            System.out.println("Error al crear la Inscripcion");
            throw e;
        } finally {
            desconectarBase();
        }
    }

    public List<Inscripcion> listarInscripcion() throws Exception {//2
        try {
            String sql = "SELECT * FROM inscripcion ";
            Inscripcion inscripcion = new Inscripcion();
            List<Inscripcion> inscripciones = new ArrayList<>();
            consultarBase(sql);
            while (resultado.next()) {
                inscripcion.setIdInscripto(resultado.getInt(1));
                inscripcion.setNota(resultado.getInt(2));
                inscripcion.getAlumno().setIdAlumno(resultado.getInt(3));
                inscripcion.getMateria().setIdMateria(resultado.getInt(4));
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

    //obtener inscripciones por alumno(int id)
    //list<Materia> obtenermateriasCursadas(int id)
    //list<Materia> obtenermateriasNoCursadas(int id)
    //BorrarINcripcionMateriaAlumno(int idAlumno, int idMateria)
    //ActualizarNota(int idalumno, int idMateria, double nota)
    //List<Alumno> obtenerAlumnosPorMaterias(int idMateria)
    public void eliminarInscripcion(int id) throws Exception {
        try {
            String sql = " DELETE FROM inscripcion WHERE id_inscripcion = " + id;
            modificarBase(sql);
        } catch (Exception e) {
            System.out.println("Error al eliminar Inscripcion");
            throw e;
        } finally {
            desconectarBase();
        }
    }

}
