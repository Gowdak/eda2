package eda2;


public class Venta {
	
	private Cliente cliente;
	private Vendedor vendedor;
	private Vehiculo vehiculo;
	private boolean deseaFinanciar = false;
	private int mesesFinanciacion = 0 ;

	
	public Venta(Cliente cliente, Vendedor vendedor, Vehiculo vehiculo, boolean deseaFinanciar, int mesesFinanciacion) {
		super();
		this.cliente = cliente;
		this.vendedor = vendedor;
		this.vehiculo = vehiculo;
		this.deseaFinanciar = deseaFinanciar;
		this.mesesFinanciacion = mesesFinanciacion;
	}
	
	
	public boolean vender() {
		if(esMayorEdad()) {
			if(this.deseaFinanciar) {
				if(this.financiacionPrendaria()) {
					return true;
				}else {
					System.out.println("Usted no posee el dinero suficiente para financiar esta operacion. Operacion Anulada \n ");
					return false;
				}
			}else {
				if(this.poseeDineroSuficiente()) {
					return true;
				}else {
					System.out.println("No posee el dinero suficiente para esta operacion. Operacion Anulada \n");
					return false;
				}
			}
		}else {
			System.out.println("No es mayor de edad, Operacion Anulada \n");
			return false;
		}	
	}
	
	
	public boolean esMayorEdad() {
		return cliente.getEdad() >= 18 ? true : false;
	}
	
	public boolean poseeDineroSuficiente() {
		return cliente.getDinero() >= vehiculo.getPrecio() ? true : false;
	}
	
	public double valorTransferencia() {
		return  vehiculo.isEsImportado() ?  vehiculo.getPrecio() * 0.02 : vehiculo.getPrecio() * 0.015; 
	}
	
	//Para acceder al prestamo prendario se requiere el 25 % del valor del auto
	public boolean saldoInicialPrendario() {
		return this.cliente.getDinero() >=this.vehiculo.getPrecio() * 0.25 ? true : false; 
	}
	
	public boolean financiacionPrendaria() {
		if(saldoInicialPrendario()) {
			Financiacion finPren = new Financiacion(this.vehiculo.getPrecio() * 0.70, this.mesesFinanciacion);	
			System.out.println("----------------------------Financiacion Prendaria ----------------------------------");
			System.out.println("Monto con recargo : " + finPren.getMontoTotalMasRecargo() + " \n ");
			System.out.println("Monto de cuotas : " + finPren.getMontoCuotas() + " \n ") ;
			System.out.println("Cantidad de años: " + finPren.getAños() + " \n");
			System.out.println("---------------------------- Fin Financiacion Prendaria ---------------------------------- \n");
			return true;
		}else {
			return false;
		}
	}
	
	/*
	 * 
	 * – Si la valuación fiscal es menor o igual a 580.000 pesos, la alícuota es del 3,20%.
		– Si la valuación fiscal es mayor a 580.000 pesos y hasta 800.000 pesos, la alícuota es de 4,00%.
		
		– Si la valuación fiscal es mayor a 800.000 pesos y hasta 1.190.000 pesos, la alícuota es de 4,50%.
		
		– Si la valuación fiscal es mayor a 1.190.000 pesos, la alícuota es de 5,00%.
	 * 
	 */
	
	
	public double calcularPatente() {
		double montoPatentes = 0 ;
		
		
		if(vehiculo.getPrecio() <= 580000) {
			montoPatentes = vehiculo.getPrecio() * 0.032;
		}else {
			if(vehiculo.getPrecio() > 580000 && vehiculo.getPrecio() <= 800000) {
				montoPatentes = vehiculo.getPrecio() * 0.04;
			}else {
				if(vehiculo.getPrecio() > 800000 && vehiculo.getPrecio() <= 1190000 ) {
					montoPatentes = vehiculo.getPrecio() * 0.045;
				}else {
					if(vehiculo.getPrecio() >= 1180000) {
						montoPatentes = vehiculo.getPrecio() * 0.05;
					}
				}
			}
		}
		//Recordemos que el pago es bimestral por lo cual este seria el monto de las patentes
		return montoPatentes / 6;
	
		
	}
	
	
	
	
	
	
	
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Vehiculo getVehiculo() {
		return vehiculo;
	}
	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

}
