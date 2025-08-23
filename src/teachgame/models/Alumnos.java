package teachgame.models;

public class Alumnos {
     // Propiedades - Atributos
    private String usuario;
    private String nombres;
    private String apellidos;
    private String contraseña;
    private String correo;

    // Constructores - Sobrecarga, porque son varios

    public Alumnos(){} // forma #1 vacio

    public Alumnos(String usuario, String nombres, String apellidos, String contraseña, String correo){ // forma #2 con parametros
        this.usuario = usuario;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.correo = correo;
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

    
}
    

