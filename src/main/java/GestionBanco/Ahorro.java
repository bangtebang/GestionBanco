package GestionBanco;

public class Ahorro extends CuentaBancaria {
	private int lineaSobregiro;

	public int getLineaSobregiro() {
		return this.lineaSobregiro;
	}

	public void setLineaSobregiro(int lineaSobregiro) {
		this.lineaSobregiro = lineaSobregiro;
	}

	public Ahorro(int numeroCuenta, String fechaApertura, int saldo, int lineaSobregiro, SucursalBancaria sucursalBancaria) {
		super(numeroCuenta, fechaApertura, saldo, sucursalBancaria);
		this.lineaSobregiro = lineaSobregiro;
	}
}