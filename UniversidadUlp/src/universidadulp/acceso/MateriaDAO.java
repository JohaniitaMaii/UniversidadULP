
package universidadulp.acceso;

import universidadulp.entidades.Materia;




/**
 *
 * @author cisco
 */
public final class MateriaDAO extends Conexion {
    
    public void guardarMateria(Materia materia) throws Exception {
        String query = 
                "insert into materia values (" +
                "null, '" +
                materia.getNombre() + "', " +
                materia.getAnioMateria() + ", " +
                materia.isEstado() + ");";
        modificarBase(query);
    }
    
    //Materia BuscarMateria(int idMateria)
    //ModificarMateria(Materia materia)
    //EliminarMateria(int idMateria)
    //List<Materia> listarMaterias()
    
    
    
    
    
    
}