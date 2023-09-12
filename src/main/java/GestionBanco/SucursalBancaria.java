package GestionBanco;

import java.util.ArrayList;
import GestionBanco.CuentaBancaria;

public class SucursalBancaria {
	private int codigoSucursal;
	private int codigoPostal;
	private ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();

	public int getCodigoSucursal() {
		return this.codigoSucursal;
	}

	public void setCodigoSucursal(int codigoSucursal) {
		this.codigoSucursal = codigoSucursal;
	}

	public int getCodigoPostal() {
		return this.codigoPostal;
	}

	public void setCodigoPostal(int codigoPostal) {
		this.codigoPostal = codigoPostal;
	}

	public SucursalBancaria(int codigoSucursal, int codigoPostal) {
		this.codigoSucursal = codigoSucursal;
		this.codigoPostal = codigoPostal;
	}

	public ArrayList<CuentaBancaria> getCuentas() {
		return cuentasBancarias;
	}

	public void agregarCuenta(CuentaBancaria cuenta) {
		cuentasBancarias.add(cuenta);
	}

	public ArrayList<Ahorro> getAhorro() {
		ArrayList<Ahorro> ahorro = new ArrayList<Ahorro>();
		for (CuentaBancaria cuenta : cuentasBancarias) {
			if (cuenta instanceof Ahorro) {
				ahorro.add((Ahorro) cuenta);
			}
		}
		return ahorro;
	}
	public ArrayList<Corriente> getCorriente() {
		ArrayList<Corriente> corriente = new ArrayList<Corriente>();
		for (CuentaBancaria cuenta : cuentasBancarias) {
			if (cuenta instanceof Corriente) {
				corriente.add((Corriente) cuenta);
			}
		}
		return corriente;
	}
}