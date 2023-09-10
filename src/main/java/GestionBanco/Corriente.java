package GestionBanco;

public class Corriente extends CuentaBancaria {
	private double porcentajeReajusteAnual;

	public double getPorcentajeReajusteAnual() {
		return this.porcentajeReajusteAnual;
	}

	public void setPorcentajeReajusteAnual(double porcentajeReajusteAnual) {
		this.porcentajeReajusteAnual = porcentajeReajusteAnual;
	}

	public Corriente() {
		throw new UnsupportedOperationException();
	}
}