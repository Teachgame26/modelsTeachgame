package teachgame.models;

public class RegistroIngreso {
     // Propiedades - Atributos
    private String usuario;
    private String nombres;
    private String apellidos;
    private String rol;
    

    // Constructores - Sobrecarga, porque son varios

    public RegistroIngreso(){} // forma #1 vacio

    public RegistroIngreso(String usuario, String nombres, String apellidos, String rol){ // forma #2 con parametros
        this.usuario = usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.rol = rol;
        }
    // Setters
    public void setUsuario(String usuario){
        this.usuario = usuario;
    }

    public void setNombres(String nombres){
        this.nombres = nombres;
    }
    
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }

     public void setRol(String rol){
        this.rol = rol;
    }


    // Getters
    public String getUsuario(){
        return this.usuario;
    }

    public String getNombres(){
        return this.nombres;
    }

    public String getApellidos(){
        return this.apellidos;
    }

     public String getRol(){
        return this.rol;
    }
    

}
