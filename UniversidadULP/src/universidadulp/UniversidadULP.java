package universidadulp;

import java.sql.Date;
import universidadulp.acceso.AlumnoDAO;
import universidadulp.entidades.Alumno;

/**
 *
 * @author johan
 */
public class UniversidadULP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        Alumno a = new Alumno(26785543,"Becerra","HERnan",Date.valueOf("1988-09-12"));
        
       AlumnoDAO dao = new AlumnoDAO();
//       dao.guardarAlumno(a);
       dao.eliminarAlumno(5);
    }
    
}
