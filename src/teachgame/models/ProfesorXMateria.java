package teachgame.models;

public class ProfesorXMateria {

    // Propiedades - Atributos
    private String usuario;
    private String idMateria;
    private String idJuegos;

    // Constructores - Sobrecarga, porque son varios

    public ProfesorXMateria(){} // forma #1 vacio

    public ProfesorXMateria(String usuario, String idMateria, String idJuegos){ // forma #2 con parametros
        this.usuario = usuario;
        this.idMateria = idMateria;
        this.idJuegos = idJuegos;
    }

    // Setters
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public void setIdMateria(String idMateria){
        this.idMateria = idMateria;
    }
    
    public void setIdJuegos(String idJuegos){
        this.idJuegos = idJuegos;
    }

    // Getters
    public String getUsuario(){
        return this.usuario;
    }

    public String getIdMateria(){
        return this.idMateria;
    }

    public String getIdJuegos(){
        return this.idJuegos;
    }
}
