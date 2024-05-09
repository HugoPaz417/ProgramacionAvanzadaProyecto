package Clases;

import javax.persistence.*;
import java.util.List;

@Entity
public class Proyecto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idProyecto;
    private String nombre;
    private String descipcion;
    @ManyToMany(mappedBy = "proyectos")
    private List<Empleado> empleados;

    public Proyecto() {
    }

    public Proyecto(int idProyecto, String nombre, String descipcion, List<Empleado> empleados) {
        this.idProyecto = idProyecto;
        this.nombre = nombre;
        this.descipcion = descipcion;
        this.empleados = empleados;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescipcion() {
        return descipcion;
    }

    public void setDescipcion(String descipcion) {
        this.descipcion = descipcion;
    }

    public List<Empleado> getEmpleados() {
        return empleados;
    }

    public void setEmpleados(List<Empleado> empleados) {
        this.empleados = empleados;
    }
}
