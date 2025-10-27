package model;

import jakarta.persistence.*;
import org.hibernate.annotations.UuidGenerator;

import java.time.LocalDate;

@Entity
@Table(name = "Factura")
@NamedQueries({
        @NamedQuery(name="Factura.All",
                query = "select e from Factura e")
})
public class Factura
{
    public String getNumeroFactura()
    {
        return numeroFactura;
    }

    public void setNumeroFactura(String numeroFactura)
    {
        this.numeroFactura = numeroFactura;
    }

    public String getNombreCliente()
    {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente)
    {
        this.nombreCliente = nombreCliente;
    }

    public Double getTotal()
    {
        return total;
    }

    public void setTotal(Double total)
    {
        this.total = total;
    }

    public LocalDate getFecha()
    {
        return fecha;
    }

    public void setFecha(LocalDate fecha)
    {
        this.fecha = fecha;
    }

    @Id
    @UuidGenerator
    private String numeroFactura;
    private String nombreCliente;
    private Double total;
    private LocalDate fecha;

    @Override
    public String toString()
    {
        return "Factura{" +
                "numeroFactura='" + numeroFactura + '\'' +
                ", nombreCliente='" + nombreCliente + '\'' +
                ", total=" + total +
                ", fecha=" + fecha +
                '}';
    }
}
