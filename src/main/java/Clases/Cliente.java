package Clases;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToOne;

@Entity
public class Cliente extends Persona{
    private String celular;
    @OneToOne(cascade = CascadeType.ALL)
    private Direccion direccion;

    public Cliente(String cedula, String nombres, String apellidos, String mail, String celular, Direccion direccion) {
        super(cedula, nombres, apellidos, mail);
        this.celular = celular;
        this.direccion = direccion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "celular='" + celular + '\'' +
                ", direccion=" + direccion +
                '}';
    }
}
