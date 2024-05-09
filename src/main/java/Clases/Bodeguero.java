package Clases;

import javax.persistence.Entity;

@Entity
public class Bodeguero extends Empleado{
    private String local;


    public Bodeguero(String cedula, String nombres, String apellidos, String mail, String ciudad, String local) {
        super(cedula, nombres, apellidos, mail, ciudad);
        this.local = local;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    @Override
    public String toString() {
        return "Bodeguero{" +
                "local='" + local + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", cedula='" + cedula + '\'' +
                ", nombres='" + nombres + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
