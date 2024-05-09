package Logica;

import Clases.Estado;
import Clases.Paquete;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.Random;
import BDatos.BDPaquete;

public class LPaquete {
    static BDPaquete objBDPaquete = new BDPaquete();
    private static EntityManagerFactory emf = Persistence.createEntityManagerFactory("miUnidadDePersistencia");
    private static Random random = new Random();

    public static String crearCodigo (Estado estado){
        return String.format("%02d%d%02d%d%02d%d",
                estado.getFecha().getDay(), random.nextInt(10),
                estado.getFecha().getMonth(), random.nextInt(10),
                estado.getFecha().getYear(), random.nextInt(10));
    }

    public Paquete buscarPaquete(Paquete objPaquete) {
        return objBDPaquete.buscarPaquete(objPaquete.getIdpaq());
    }

    public void actualizarEstadoPaquete(Paquete objPaquete) {
        objBDPaquete.actualizarEstadoPaquete(objPaquete);
    }
}