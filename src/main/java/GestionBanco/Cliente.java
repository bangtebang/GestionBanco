package GestionBanco;

import java.util.ArrayList;
import GestionBanco.CuentaBancaria;

public class Cliente {
	private String nombre;
	private int run;
	private ArrayList<CuentaBancaria> cuentasBancarias = new ArrayList<CuentaBancaria>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRun() {
		return this.run;
	}

	public void setRun(int run) {
		this.run = run;
	}

	public Cliente(String nombre, int run) {
		this.nombre = nombre;
		this.run = run;
	}
}