package GestionBanco;

public class Corriente extends CuentaBancaria {

	private double porcentajeReajusteAnual;

	public double getPorcentajeReajusteAnual() {
		return this.porcentajeReajusteAnual;
	}

	public void setPorcentajeReajusteAnual(double porcentajeReajusteAnual) {
		this.porcentajeReajusteAnual = porcentajeReajusteAnual;
	}

	public Corriente(int numeroCuenta, String fechaApertura, int saldo,SucursalBancaria sucursalBancaria, double porcentajeReajusteAnual) {
		super(numeroCuenta, fechaApertura, saldo, sucursalBancaria);
		this.porcentajeReajusteAnual = porcentajeReajusteAnual;
	}
}