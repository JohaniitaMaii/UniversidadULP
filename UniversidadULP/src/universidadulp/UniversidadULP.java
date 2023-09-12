package universidadulp;

import java.sql.Date;
import universidadulp.acceso.AlumnoDAO;
import universidadulp.acceso.Conexion;
import universidadulp.acceso.InscripcionDAO;
import universidadulp.acceso.MateriaDAO;
import universidadulp.entidades.Alumno;
import universidadulp.entidades.Inscripcion;
import universidadulp.entidades.Materia;

/**
 *
 * @author johan
 */
public class UniversidadULP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
     
        
        Alumno alumno = new Alumno(15,29013528,"Roblez","Paula",Date.valueOf("2002-10-23"),true);
        AlumnoDAO aludao = new AlumnoDAO();
       // aludao.guardarAlumno(alumno);
        
//        System.out.println(aludao.buscarAlumnoPorId(2));
        MateriaDAO matedao = new MateriaDAO();
        Materia materia = new Materia(4,"Programcion 1",1,true);
      //  matedao.guardarMateria(materia);
//     System.out.println( matedao.buscarMateria(4));
        
        Inscripcion ins = new Inscripcion(7, 2, 12);
        InscripcionDAO insdao = new InscripcionDAO();
        
       // insdao.guardarInscripcion(ins);
//        System.out.println(insdao.listarInscripcion());
        
        
         System.out.println(insdao.obtenerAlumnosPorMateria(1));
//         System.out.println(insdao.obtenerMateriaCursada(3));
        
//         System.out.println(insdao.listarInscripcion());
        
    }

    }
// new Alumno(36968521, "Lopez","Mariana" , Date.valueOf("2010-05-28")), new Materia("Algebra", 3, true)