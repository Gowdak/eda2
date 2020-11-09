package eda2;



public class Cliente {

	private int codigoCliente;
	private String nombre;
	private String apellido;
	private int edad;
	private float dinero;
	private static int cantidadClientes;
	private boolean esVip;

	
	public Cliente() {
		
	}
	

	public Cliente(int codigoCliente, String nombre, String apellido, int edad, int dinero, boolean esVip) {
		super();
		this.codigoCliente = codigoCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.dinero = dinero;
		this.esVip = esVip;
	}



	public int getCodigoCliente() {
		return codigoCliente;
	}

	public void setCodigoCliente(int codigoCliente) {
		this.codigoCliente = codigoCliente;
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

//	public void setApellido(String apellido) {
//		this.apellido = apellido;
//	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getDinero() {
		return dinero;
	}

	public void setDinero(float dinero) {
		this.dinero = dinero;
	}

	public static int getCantidadClientes() {
		return cantidadClientes;
	}

	public static void setCantidadClientes(int cantidadClientes) {
		Cliente.cantidadClientes = cantidadClientes;
	}

	public boolean isEsVip() {
		return esVip;
	}

	public void setEsVip(boolean esVip) {
		this.esVip = esVip;
	}

	@Override
	public String toString() {
		return "Cliente [codigoCliente=" + codigoCliente + ", nombre=" + nombre + ", apellido=" + apellido + ", edad="
				+ edad + ", dinero=" + dinero + ", esVip=" + esVip + "]";
	}


	public void setApellido(String apellido2) {
		this.apellido=apellido2;		
	}


}
