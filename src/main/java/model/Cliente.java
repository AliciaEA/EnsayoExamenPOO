package model;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "Cliente")
@NamedQueries({
        @NamedQuery(name="Cliente.All",
                query = "select c from Cliente c")
})
public class Cliente
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nombreCliente;

//    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "cliente")
//
//    public List<Factura> facturas = new java.util.ArrayList<>();

    public Integer getId()
    {
        return id;
    }

    public void setId(Integer id)
    {
        this.id = id;
    }

    public String getNombreCliente()
    {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente)
    {
        this.nombreCliente = nombreCliente;
    }

//    public void addFactura(Factura factura)
//    {
//        this.facturas.add(factura);
//        factura.cliente = this;
//    }
//    public void removeFactura(Factura factura)
//    {
//        this.facturas.remove(factura);
//        factura.cliente = null;
//    }

//    public List<Factura> getFacturas()
//    {
//        return facturas;
//    }

    @Override
    public String toString()
    {
        return "Cliente{" +
                "id=" + id +
                ", nombreCliente='" + nombreCliente + '\'' +
                '}';
    }


}
