package ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos;

import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos.acciones.Llamar;
import ar.utnba.ddsi.depoautomatizado.models.entities.recorridos.obstaculos.acciones.VolverAInicio;
import ar.utnba.ddsi.depoautomatizado.models.entities.robots.Robot;

public class LlamarMantenimientoStrategy implements EstrategiaObstaculo {

    private int numeroMantenimiento;

    private Llamar comando;

    public LlamarMantenimientoStrategy(Llamar comando) {
        this.comando = comando;
    }

    @Override
    public void manejarObstaculo(Robot robot) {
        comando.llamar(robot, numeroMantenimiento);
    }
} 