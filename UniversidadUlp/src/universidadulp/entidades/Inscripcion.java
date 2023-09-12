package universidadulp.entidades;

public class Inscripcion {

    private int idInscripto;
    private int nota;
    private int alumno;
    private int materia;

    public Inscripcion() {
    }

    public Inscripcion(int nota, int alumno, int materia) {
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public Inscripcion(int idInscripto, int nota, int alumno, int materia) {
        this.idInscripto = idInscripto;
        this.nota = nota;
        this.alumno = alumno;
        this.materia = materia;
    }

    public int getIdInscripto() {
        return idInscripto;
    }

    public void setIdInscripto(int idInscripto) {
        this.idInscripto = idInscripto;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    public int getAlumno() {
        return alumno;
    }

    public void setAlumno(int alumno) {
        this.alumno = alumno;
    }

    public int getMateria() {
        return materia;
    }

    public void setMateria(int materia) {
        this.materia = materia;
    }

    @Override
    public String toString() {
        return "Id Inscripto = " + idInscripto + ", Nota = " + nota + ", Alumno = " + alumno + ", Materia = " + materia;
    }

}
