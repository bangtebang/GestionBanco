package GestionBanco;

public class Ahorro extends CuentaBancaria {
	private int lineaSobregiro;

	public int getLineaSobregiro() {
		return this.lineaSobregiro;
	}

	public void setLineaSobregiro(int lineaSobregiro) {
		this.lineaSobregiro = lineaSobregiro;
	}

	public Ahorro() {
		throw new UnsupportedOperationException();
	}
}