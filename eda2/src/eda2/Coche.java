package eda2;

public class Coche {
	private String marca; 
	private int velocidad;
	private boolean estado;
	private static int mostrarCantidadDeAutos;
	
	public Coche(String marca) {
		this.marca=marca;
		mostrarCantidadDeAutos++;
	}
	public Coche() {
		this.marca="porsche";
		mostrarCantidadDeAutos++;
	}
	
	public String decirMarca() {
		return this.marca;
	}
	
	public void encender() {
		this.estado= true;
	}
	public static int mostrarAutos(){
		return mostrarCantidadDeAutos;
	}
	
	public void apagar() {
		this.estado= false;
	}
	
	public boolean mostrarEstado() {
		return this.estado;
	}
	
	public void aumentarVelocidad() {
		this.velocidad++;
	}
	
	public void disminuirVelocidad() {
		this.velocidad--;
	}
	public void frenar() {
		this.velocidad=0;
	}
	
	public void irVelocidad(int numero) {
		this.velocidad =numero;
	}
	
	public int mostrarVelocidad() {
		return this.velocidad;
	}
	
}



