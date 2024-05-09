package Clases;

import javax.persistence.*;

@Entity
public class Paquete {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idpaq;
    private String codigo;
    private String descripcion;
    private int peso;
    private int alto;
    @OneToOne(cascade = CascadeType.ALL)
    private Estado estado;

    public Paquete(int idpaq, String codigo, String descripcion, int peso, int alto, Estado estado) {
        this.idpaq = idpaq;
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.peso = peso;
        this.alto = alto;
        this.estado = estado;
    }

    public int getIdpaq() {
        return idpaq;
    }

    public void setIdpaq(int idpaq) {
        this.idpaq = idpaq;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Paquete{" +
                "idpaq=" + idpaq +
                ", codigo='" + codigo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", peso=" + peso +
                ", alto=" + alto +
                ", estado=" + estado +
                '}';
    }
}
