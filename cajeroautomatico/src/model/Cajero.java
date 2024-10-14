package model;

import java.util.LinkedList;
import java.util.List;

public class Cajero {

    List<Cliente> clientes = new LinkedList<>();

    public Cliente login(String documento, String contrasenia) {
        Cliente clienteLogueado = null; //sino se encuentra ninguno el metodo devolvera un cliente null
        for (Cliente cliente : clientes) {
            if (cliente.getNumeroDeCedula().equals(documento)) { // si cedula es igual al documento que ingresa el usuario y..
                if (contrasenia.equals(cliente.getContrasenia())) { //...y si contrasenia es igual a la contrasenia ingresada por el usuario entonces
                    clienteLogueado = cliente; // cliente
                }
                break;
            }
        }
        return clienteLogueado;
    }
    //este metodo retorna verdadero si si puede retirar un monto de la cuenta del cliente

    public boolean retirar(Cliente cliente, float retiro) {
        //si nosotros podemos retirar va a ser verdadero
        //sino sera falso
        boolean sw = false;
        if (cliente.getSaldo() >= retiro) { //si el saldo depositado en la cuenta del cliente es mayor/igual al dinero que desea retirar
            cliente.setSaldo(cliente.getSaldo() - retiro);
            sw = true;
        }
        return sw;
    }

    // muestra el saldo de un cliente
    public float consultarSaldo(Cliente cliente) {
        return cliente.getSaldo();
    }

    //esta funcion retorna el saldo actual del cliente luego de hacer un  deposito de dinero
    public float depositarDinero(Cliente cliente, float dinero) {
        cliente.setSaldo(cliente.getSaldo() + dinero);
        return cliente.getSaldo();
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }
}
