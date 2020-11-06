package eda2;

public class Facturacion {
	private int dinero;
	private int money;
	
	public Facturacion(){
		
	}
	
	public void setDinero(int dinero) {
		this.dinero=dinero;
	}
	
	public int getDinero() {
		return this.dinero;
	}
	
	public void setMoney(int dinero) {
		this.money=dinero;
	}
	
	public int getMoney() {
		return this.money;
	}
	public void dcto() {
		if(getDinero()>1000) {
			dinero=dinero*20/100;
		System.out.println("El dcto es de "+getDinero()+"$");
		}else
			System.out.println("No hay descuento");
	}
	
	public void pago() {
		if(getMoney()>=getDinero()) {
			System.out.println("Pago exitoso");
			setDinero(0);
			
		}else
			System.out.println("Vuelva a intentar");
	}

}
