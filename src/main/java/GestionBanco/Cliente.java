package GestionBanco;

import java.util.ArrayList;
import GestionBanco.CuentaBancaria;

public class Cliente {
	private String nombre;
	private String run;
	private ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRun() {
		return this.run;
	}

	public void setRun(String run) {
		this.run = run;
	}
	public ArrayList<CuentaBancaria> getCuentas() {
		return cuentasBancarias;
	}
	public void agregarCuenta(CuentaBancaria cuenta) {
		cuentasBancarias.add(cuenta);
	}
	public Cliente(String nombre, String run) {
		this.nombre = nombre;
		this.run = run;
	}
}