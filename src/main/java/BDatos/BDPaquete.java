package BDatos;

import Clases.Paquete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class BDPaquete {
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoPA1");

    public Paquete buscarPaquete(int idpaq) {
        EntityManager em = emf.createEntityManager();
        Paquete objPaquete = em.find(Paquete.class, idpaq);
        em.close();
        return objPaquete;
    }

    public void actualizarEstadoPaquete(Paquete objPaquete) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        objPaquete = em.merge(objPaquete);
        em.getTransaction().commit();
        em.close();
    }
}