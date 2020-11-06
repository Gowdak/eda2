package eda2;

public class Coche {
	private String marca;
	private int precio;
	private static int cantidadDeCoches;
	private double presion;
	
	public Coche () {
		
	}
	
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
	public int getPrecio() {
		return this.precio;
	}
	
	
	public String getMarca() {
		return this.marca;
	}
	
	
	public static int getAutos() {
		return cantidadDeCoches;
	}

	public void aumentarCantidadDeAutos() {
		cantidadDeCoches++;		
	}
	public void ingresarPrecio(int precio) {
		this.precio=precio;
		
	}
	
	public void setPresion(double presion) {
		this.presion=presion;
	}
	
	public double getPresion() {
		return this.presion;
	}
	
}



