package teachgame.models;

public class Materias {
    
    // Propiedades - Atributos
    private String idMateria;
    private String nombreMateria;
    private boolean estado;

    // Constructores - Sobrecarga, porque son varios

    public Materias(){} // forma #1 vacio

    public Materias(String idMateria, String nombreMateria, boolean estado){ // forma #2 con parametros
        this.idMateria = idMateria;
        this.nombreMateria = nombreMateria;
        this.estado = estado;
    }

    // Setters
    public void setIdMateria(String idMateria){
        this.idMateria = idMateria;
    }

    public void setNombreMateria(String nombreMateria){
        this.nombreMateria = nombreMateria;
    }
    
    public void setEstado(boolean estado){
        this.estado = estado;
    }

    // Getters
    public String getIdMateria(){
        return this.idMateria;
    }

    public String getNombreMateria(){
        return this.nombreMateria;
    }

    public boolean getEstado(){
        return this.estado;
    }
}
