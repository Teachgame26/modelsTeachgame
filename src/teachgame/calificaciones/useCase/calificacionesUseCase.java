package calificaciones.useCase;

import teachgame.calificaciones.Calificaciones;

public class calificacionesUseCase {
    
    Calificaciones calificaciones;

    public calificacionesControllerUseCase(){
        this.calificaciones = new Calificaciones();
    }
}
