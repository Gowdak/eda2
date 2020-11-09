package eda2;

import java.util.Scanner;



public class Mantenimiento {
	
	
	Scanner teclado=new Scanner (System.in);
	private int kms;
	private String color;
	private boolean cambioAceite;
	private double presion;
	
		public Mantenimiento() {
			
		}
		
		
		public String getColor() {
			return this.color;
		}
		
		public int getKms() {
			return kms;
		}

		public void setKms(int kms) {
			this.kms = kms;
		}
		
		public void cambioAceite() {
			
				if(getKms()>=5000) {
				System.out.println("Cambiando aceite usado por Quartz 10w40");
				setKms(0);
				
			}else
				System.out.println("No requiere de cambio de aceite");
				
						
		}

		public void setColor(String color) {
			this.color=color;
			
		}
		
		
		public void setPresion(double presion) {
			this.presion=presion;
		}
		
		public double getPresion() {
			return this.presion;
		}
		 
		public void inflar() {
			if(getPresion()<=24&&getPresion()>=0) {
				System.out.println("Ingrese presion que desea tener");
				presion=teclado.nextDouble();
				setPresion(presion);
				System.out.println("Su presion actual es de " +presion+ "psi");
				if(getPresion()<=24&&getPresion()>=0)
					System.out.println("La presion sigue siendo baja, ingrese un valor por encima de 24 psi");
				presion=teclado.nextDouble();
				setPresion(presion);
				System.out.println("Su presion actual es de " +presion+ "psi");
				if(getPresion()>35)
					System.out.println("Presion muy alta, ingrese un valor por debajo de 35 psi");
				presion=teclado.nextDouble();
				setPresion(presion);
				System.out.println("Su presion actual es de " +presion+ "psi");
			
			}else
				System.out.println("no se necesita inflar");
		}

}
