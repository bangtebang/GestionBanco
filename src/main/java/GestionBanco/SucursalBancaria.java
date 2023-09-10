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

	public SucursalBancaria() {
		throw new UnsupportedOperationException();
	}
}