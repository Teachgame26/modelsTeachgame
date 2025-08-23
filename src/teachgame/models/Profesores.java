package teachgame.models;

public class Profesores {
      // Propiedades - Atributos
    private String usuario;
    private String nombres;
    private String apellidos;
    private String contraseña;
    private String correo;
    private String cedula;

    // Constructores - Sobrecarga, porque son varios

    public Profesores(){} // forma #1 vacio

    public Profesores(String usuario, String nombres, String apellidos, String contraseña, String correo, String cedula){ // forma #2 con parametros
        this.usuario = usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.correo = correo;
        this.cedula = cedula;
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

     public void setContraseña(String contraseña){
        this.contraseña = contraseña;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }
    
    public void setCedula(String cedula){
        this.cedula = cedula;
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

     public String getContraseña(){
        return this.contraseña;
    }

    public String getCorreo(){
        return this.correo;
    }

    public String getCedula(){
        return this.cedula;
    }

    
}
