package eda2;

public class Vendedor {
	
	private int codigoVendedor;
	private String nombre;
	private String apellido;
	
	
	public Vendedor() {
		
	}
	
	public Vendedor(int codigoVendedor, String nombre, String apellido) {
		super();
		this.codigoVendedor = codigoVendedor;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	
	public int getCodigoVendedor() {
		return codigoVendedor;
	}
	public void setCodigoVendedor(int codigoVendedor) {
		this.codigoVendedor = codigoVendedor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	@Override
	public String toString() {
		return "Vendedor [codigoVendedor=" + codigoVendedor + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}
	

}
