package eda2;

public class Vehiculo {
	private int codigoVehiculo;
	private String marca;
	private String modelo;
	private String color;
	private int a�o;
	private int kms;
	private boolean esImportado;
	private float precio;
	private int cantidadDeCoches;

	/*
	 * Siendo tipo de vehiculo
	 * 
	 * 1- Coche 2- Camioneta 3- Moto
	 */
	private int tipoVehiculo;
	
	public Vehiculo() {
		
	}

	

	


	public Vehiculo(int codigoVehiculo, String marca, String modelo, String color, int a�o, int kms,
			boolean esImportado, float precio, int cantidadDeCoches, int tipoVehiculo) {
		super();
		this.codigoVehiculo = codigoVehiculo;
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
		this.a�o = a�o;
		this.kms = kms;
		this.esImportado = esImportado;
		this.precio = precio;
		this.cantidadDeCoches = cantidadDeCoches;
		this.tipoVehiculo = tipoVehiculo;
	}
	
	






	public int getCodigoVehiculo() {
		return codigoVehiculo;
	}






	public void setCodigoVehiculo(int codigoVehiculo) {
		this.codigoVehiculo = codigoVehiculo;
	}






	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getA�o() {
		return a�o;
	}

	public void setA�o(int a�o) {
		this.a�o = a�o;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	public int getCantidadDeCoches() {
		return cantidadDeCoches;
	}

	public void setCantidadDeCoches(int cantidadDeCoches) {
		this.cantidadDeCoches = cantidadDeCoches;
	}

	public int getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(int tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
	
	

	public int getKms() {
		return kms;
	}

	public void setKms(int kms) {
		this.kms = kms;
	}

	public boolean isEsImportado() {
		return esImportado;
	}

	public void setEsImportado(boolean esImportado) {
		this.esImportado = esImportado;
	}






	@Override
	public String toString() {
		return "Vehiculo [codigoVehiculo=" + codigoVehiculo + ", marca=" + marca + ", modelo=" + modelo + ", color="
				+ color + ", a�o=" + a�o + ", kms=" + kms + ", esImportado=" + esImportado + ", precio=" + precio
				+ ", cantidadDeCoches=" + cantidadDeCoches + ", tipoVehiculo=" + tipoVehiculo + "]";
	}

}
