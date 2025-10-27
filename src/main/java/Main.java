import model.Factura;
import service.IDAO;
import service.ImpIDAO;

public class Main
{
    public static final IDAO dao = new ImpIDAO();

    public static void insertarFactura() {

        Factura f = new Factura();
        f.setNombreCliente("Juan Perez");
        f.setTotal(1500.0);
        f.setFecha(java.time.LocalDate.now());
        dao.insert(f);
    }

    public static void listarFacturas() {
        System.out.println("Registros Almacenados:");
        java.util.List<Factura> facturas = dao.getAll("Factura.All", Factura.class);
        facturas.forEach(factura -> System.out.println(factura.getNombreCliente() + " - " + factura.getTotal()));
    }

    public static void main(String[] args)
    {
        dao.delete(dao.findById("fb9deae0-ab24-42ba-9b95-8fd2878b5fca", Factura.class));
        listarFacturas();
    }
}
