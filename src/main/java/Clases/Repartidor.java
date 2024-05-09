package Clases;

import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Repartidor extends Empleado {
    private int zona;
    @OneToOne
    private Empleado empleado;

    public Repartidor(String cedula, String nombres, String apellidos, String mail, String ciudad, int zona, Empleado empleado) {
        super(cedula, nombres, apellidos, mail, ciudad);
        this.zona = zona;
        this.empleado = empleado;
    }

    public int getZona() {
        return zona;
    }

    public void setZona(int zona) {
        this.zona = zona;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Repartidor{" +
                "zona=" + zona +
                ", empleado=" + empleado +
                '}';
    }

    //Void para cambiar estados de paquete
    void HacerActual(Cliente cliente){

    }
}
