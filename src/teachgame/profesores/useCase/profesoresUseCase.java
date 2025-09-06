package profesores.useCase;

import teachgame.profesores.Profesores;

public class profesoresUseCase {
    
    Profesores profesores;

    public profesoresControllerUseCase(){
        this.profesores = new Profesores();
    }
}
