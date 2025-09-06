package registroIngreso.useCase;

import teachgame.registroIngreso.Alumnos;

public class registroIngresoUseCase {
    
    RegistroIngreso registroIngreso;

    public registroIngresoControllerUseCase(){
        this.registroIngreso = new RegistroIngreso();
    }
}
