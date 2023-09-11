
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
    
<<<<<<< Updated upstream
    //Materia BuscarMateria(int idMateria)
    //ModificarMateria(Materia materia)
    //EliminarMateria(int idMateria)
    //List<Materia> listarMaterias()
    
=======
    public Materia getMateria(String nombre) throws Exception {
        nombre = nombre.replaceAll("[\\W \\D]", "").trim();
        String query = "select * from materia where nombre like '%" + nombre +"%';";

        consultarBase(query);
        Materia m = null;
        while(resultado.next()){
            m.setIdMateria(resultado.getInt(1));
            m.setNombre(resultado.getString(2));
            m.setAnioMateria(resultado.getInt(3));
            m.setEstado(resultado.getBoolean(4));
        }
        return m;
    }
    
    public Materia getMateria(int materia) throws Exception {
        
        String query = "select * from materia where id_materia = " + materia +";";

       resultado = consultarBase(query);
        
        String nombre = resultado.getString("nombre");
        int id = resultado.getInt("id"),
            año = resultado.getInt("año"),
            estado = resultado.getInt("estado");
        return new Materia(id, nombre, año, estado);
       // desconectarBase();
        
        
    }
>>>>>>> Stashed changes
    
    
    
    
    
}