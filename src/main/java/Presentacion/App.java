package Presentacion;

import Clases.Empleado;
import Clases.Proyecto;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("EmpresaWa");

        EntityManager em = emf.createEntityManager();

        Proyecto proyecto = new Proyecto();
        Empleado empleado = new Empleado();
        Departamento departamento = new Departamento();
        List<Proyecto> listaProyecto = new ArrayList<>();
        List<Empleado> listaEmpleados = new ArrayList<>();

        proyecto.setIdProyecto(0);
        proyecto.setNombre("Campaña de marketing");
        proyecto.setDescipcion("Crear y ejecutar una estrategia de marketing en línea");
        listaProyecto.add(proyecto);

        empleado.setIdEmpleado(0);
        empleado.setNombre("Nata");
        empleado.setApellido("L");
        empleado.setCedula("1150435256");
        empleado.setProyectos(listaProyecto);
        empleado.setDepartamento(departamento);
        listaEmpleados.add(empleado);

        departamento.setIdDepartamento(0);
        departamento.setNombre("Marketing y ventas");
        departamento.setEmpleados(listaEmpleados);

        em.getTransaction().begin();

        em.persist(departamento);
        em.persist(empleado);
        em.persist(proyecto);

        em.getTransaction().commit();

        TypedQuery<Empleado> query = em.createQuery("SELECT e FROM Empleado e WHERE e.departamento.nombre = :nombre", Empleado.class);
        query.setParameter("nombre", "Marketing y ventas");
        List<Empleado> empleados = query.getResultList();
        for (Empleado empleadoAux : empleados) {
            System.out.println(empleadoAux);
        }

        em.close();
        emf.close();
    }
}
