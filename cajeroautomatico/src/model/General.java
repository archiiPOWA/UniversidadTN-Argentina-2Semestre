package model;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class General {

    private static Cajero cajero = null;
    public static List<Cliente> clientes = null;

    static {
        crearClientes();
        crearCajero();
    }

    static void crearClientes() {
        clientes = new LinkedList<>(); //Creo el objeto de la Lista, donde vamos a ir agregando a los clientes creados con add.

        Cliente cliente = new Cliente(); //creo un objeto cliente para setearles los datos corresondientes
        cliente.setNombreCompleto("joaquin");
        cliente.setNumeroDeCedula("2020");
        cliente.setContrasenia("admin1");
        cliente.setSaldo(10000f);
        clientes.add(cliente);

        cliente = new Cliente();
        cliente.setNombreCompleto("mariana");
        cliente.setNumeroDeCedula("2030");
        cliente.setContrasenia("admin2");
        cliente.setSaldo(25000f);
        clientes.add(cliente);
    }

    private static void crearCajero() {
        cajero = new Cajero();
        getCajero().setClientes(clientes);
    }

    public static Cajero getCajero() {
        return cajero;
    }

}
