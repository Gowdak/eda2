package unlam.concesionaria;

public class Cliente {
	
	private int dinero;
	private static int cantidadClientes;
	private int edad;
	
	public Cliente() {
		
	}
	
	public void setDinero(int dinero) {
		this.dinero=dinero;
	}
	
	public int getDinero() {
		return this.dinero;
	}
	
	public void aumentarCantidadDeClientes() {
		cantidadClientes++;		
	}
	
	public static int getClientes() {
		return cantidadClientes;
	}
	
	public int getEdad() {
		return this.edad;
	}

	public void setEdad(int edad) {
		this.edad=edad;
		
	}
}
