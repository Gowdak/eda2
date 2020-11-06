package eda2;

import java.util.Scanner;

public class Mantenimiento {
		
	Scanner teclado=new Scanner (System.in);
	private int kilometros;
	private String color;
	private boolean cambioAceite;
	private double presion;
	
		public Mantenimiento() {
			
		}
		
		
		public String getColor() {
			return this.color;
		}
		
		public void setKilometros(int kilometros) {
			this.kilometros=kilometros;
		}
		
		public boolean cambioAceite() {
			if(kilometros>5000)
				return true;
			else
				return false;
						
		}

		public void setColor(String color) {
			this.color=color;
			
		}
		public int getKilometros() {
			return this.kilometros;
		}
		
		public void setPresion(double presion) {
			this.presion=presion;
		}
		
		public double getPresion() {
			return this.presion;
		}
		 
		public void inflar() {
			if(getPresion()<=23.5&&getPresion()>=0) {
				System.out.println("Ingrese presion que desea tener");
				presion=teclado.nextDouble();
				setPresion(presion);
				System.out.println("Su presion actual es de " +presion);
			}else
				System.out.println("no se necesita inflar");
		}

}
