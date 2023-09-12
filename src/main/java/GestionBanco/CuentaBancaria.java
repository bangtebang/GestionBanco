package GestionBanco;

public abstract class CuentaBancaria {
	private int numeroCuenta;
	private String fechaApertura;
	private int saldo;
	private SucursalBancaria sucursalBancaria;

	public int getNumeroCuenta() {
		return this.numeroCuenta;
	}

	public void setNumeroCuenta(int numeroCuenta) {
		this.numeroCuenta = numeroCuenta;
	}

	public String getFechaApertura() {
		return this.fechaApertura;
	}

	public void setFechaApertura(String fechaApertura) {
		this.fechaApertura = fechaApertura;
	}

	public int getSaldo() {
		return this.saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}
	public CuentaBancaria(int numeroCuenta, String fechaApertura, int saldo,SucursalBancaria sucursalBancaria) {
		this.numeroCuenta = numeroCuenta;
		this.fechaApertura = fechaApertura;
		this.saldo = saldo;
		this.sucursalBancaria = sucursalBancaria;
	}
	public SucursalBancaria getSucursalBancaria() {
		return sucursalBancaria;
	}
	}