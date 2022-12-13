package POO.coleccciónDeZapato.tienda;

import java.util.ArrayList;
import java.util.List;

import POO.coleccciónDeZapato.Personal.Empleado;
import POO.coleccciónDeZapato.zapatos.Zapatos;

public class TiendaZapatos {
    private List<Zapatos> zapatos;
    private Empleado [] empleados;

    public TiendaZapatos(){
        this.zapatos = new ArrayList<>();
        this.empleados = new Empleado[6];
    }

    public TiendaZapatos(List<Zapatos> zapatos, Empleado[] empleado){
        this.zapatos = zapatos;
        this.empleados = empleado;
    }

    public List<Zapatos> getZapatos() {
        return zapatos;
    }

    public void setZapatos(List<Zapatos> zapatos) {
        this.zapatos = zapatos;
    }

    public Empleado[] getEmpleados() {
        return empleados;
    }

    public void setEmpleados(Empleado[] empleados) {
        this.empleados = empleados;
    }
    
}
