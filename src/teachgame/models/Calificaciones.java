package teachgame.models;

public class Calificaciones {
    // Propiedades - Atributos
    private String idMateria;
    private String idCalificacion;
    private String usuario;

    // Constructores - Sobrecarga, porque son varios

    public Calificaciones(){} // forma #1 vacio

    public Calificaciones(String idMateria, String idCalificacion, String usuario){ // forma #2 con parametros
        this.idMateria = idMateria;
        this.idCalificacion = idCalificacion;
        this.usuario = usuario;
    }

    // Setters
    public void setIdMateria(String idMateria){
        this.idMateria = idMateria;
    }

    public void setIdCalificacion(String idCalificacion){
        this.idCalificacion = idCalificacion;
    }
    
    public void setEstado(String usuario){
        this.usuario = usuario;
    }

    // Getters
    public String getIdMateria(){
        return this.idMateria;
    }

    public String getIdCalificacion(){
        return this.idCalificacion;
    }

    public String getUsuario(){
        return this.usuario;
    }
}