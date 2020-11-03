package unlam.concesionaria;

public class Coche {
	private String marca;
	private int precio;
	private static int cantidadDeCoches;
	
	public Coche () {
		
	}
	
	public String setMarca() {
		return this.marca;
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
	
	

}
