package GestionBanco;

import java.util.ArrayList;

public class GestionBanco {
    private ArrayList<Cliente> clientes;
    private ArrayList<SucursalBancaria> sucursales;

    public GestionBanco() {
        clientes = new ArrayList<>();
        sucursales = new ArrayList<>();
    }
    public void agregarCliente(Cliente cliente) {
        clientes.add(cliente);
    }
    public void agregarSucursal(SucursalBancaria sucursal) {
        sucursales.add(sucursal);
    }
    public void agregarCuentaACliente(Cliente cliente, CuentaBancaria cuenta) {
        cliente.agregarCuenta(cuenta);
        if (cuenta instanceof Ahorro) {
            for (SucursalBancaria sucursal : sucursales) {
                if (sucursal.getCodigoSucursal() == cuenta.getSucursalBancaria().getCodigoSucursal()) {
                    sucursal.agregarCuenta(cuenta);
                    break;
                }
            }
        } else if (cuenta instanceof Corriente) {
            for (SucursalBancaria sucursal : sucursales) {
                if (sucursal.getCodigoSucursal() == cuenta.getSucursalBancaria().getCodigoSucursal()) {
                    sucursal.agregarCuenta(cuenta);
                    break;
                }
            }
        }
    }

    public ArrayList<CuentaBancaria> getCuentasDeCliente(Cliente cliente) {
        return cliente.getCuentas();
    }
    public ArrayList<Ahorro> getCuentasAhorroDeSucursal(SucursalBancaria sucursal) {
        return sucursal.getAhorro();
    }

    public ArrayList<Corriente> getCuentasCorrienteDeSucursal(SucursalBancaria sucursal) {
        return sucursal.getCorriente();
    }
}

