package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos;

import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos.acciones.VolverAInicio;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public class VolverInicioStrategy implements EstrategiaObstaculo {

    private VolverAInicio comando;

    public VolverInicioStrategy(VolverAInicio comando) {
        this.comando = comando;
    }

    public void manejarObstaculo(Robot robot) {
            comando.accion(robot);
    }
}