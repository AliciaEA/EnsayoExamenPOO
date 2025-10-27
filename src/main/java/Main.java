import model.Cliente;
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
        java.util.List<Cliente> clientes = dao.getAll("Cliente.All", Cliente.class);
        if (clientes != null) {
            clientes.forEach(cliente -> System.out.println(cliente.getNombreCliente()));
        } else {
            System.out.println("No clients found.");
        }
    }

    public static void listarClientes() {
        System.out.println("Registros Almacenados:");
        java.util.List<Cliente> clientes = dao.getAll("Cliente.All", Cliente.class);
        clientes.forEach(cliente -> System.out.println(cliente.getNombreCliente()));
    }

    public static void main(String[] args)
    {
        Cliente c = new Cliente();
        c.setNombreCliente("CashCash");
        dao.insert(c);


        Factura f = new Factura();
        f.setTotal(19800.0);
        f.setFecha(java.time.LocalDate.now());
        f.setCliente(c);
        dao.insert(f);







        listarFacturas();


    }
}
