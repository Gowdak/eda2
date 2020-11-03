package eda2;

import java.util.Scanner;

import eda2.Cliente;
import eda2.Coche;

public class Test {

	public static void main(String[] args) {
		Scanner teclado=new Scanner (System.in);
		
		//////// Coche ////////
		Coche peugeot=new Coche();
		
		int opcion=0;
		int kilometros=0;
		String marca="";
		int precio=0;
		
		do {
			
			System.out.println("Ingrese 0 para finalizar");
			System.out.println("Ingrese 1 si desea crear auto");
			System.out.println("Ingrese 2 para ver la cantidad de autos");
			System.out.println("Ingrese 3 para ver si es usado o 0Km");
			System.out.println("Ingrese 4 para ver marca");
			System.out.println("Ingrese 5 para ver el valor del auto");
			
		
			opcion=teclado.nextInt();
			
			switch(opcion) {
			
			case 1:
				peugeot.aumentarCantidadDeAutos();
				System.out.println("Se creo el auto correctamente");
				System.out.println("Ingrese marca");
				marca=teclado.next();
				System.out.println("Ingrese cantidad de kilometros");
				kilometros=teclado.nextInt();
				System.out.println("Ingrese precio");
				precio=teclado.nextInt();
				peugeot.ingresarPrecio(precio);
			break;
			
			case 2:
				if(peugeot.getAutos()<5)
				System.out.println("La cantidad de autos es de "+peugeot.getAutos());
				else
					System.out.println("Ya no hay lugar");
			break;
			
			case 3:
				if(kilometros>0)
					System.out.println("El auto es usado");
				else
					System.out.println("El auto es 0Km");
			break;
	
			case 4:
				System.out.println("El auto es un " +marca);
			break;	
			
			case 5:
				System.out.println("El valor del auto es de "+precio);
			break;
			
			case 0:
				System.out.println("Fin");
				
				break;
				
			default:
				System.out.println("Opcion incorrecta");
			break;		
			}
		
		
		}while(opcion!=0&&precio>0&&kilometros>=0&&marca=="");
		
	//////// Cliente ////////
		
		Cliente jose=new Cliente();
		String nombre="";
		
		
		do {
			System.out.println("Ingrese 0 para finalizar");
			System.out.println("Ingrese 1 para crear cliente");
			System.out.println("Ingrese 2 para ver si cumple con los requisitos de compra");
			System.out.println("Ingrese 3 para ver la cantidad de clientes");
			System.out.println("Ingrese 4 para ver datos del cliente");
			
			opcion=teclado.nextInt();
			
			switch(opcion) {
			
			case 1:
				jose.aumentarCantidadDeClientes();
				System.out.println("Ingrese nombre");
				nombre=teclado.next();
				System.out.println("Ingrese edad");
				int edad=teclado.nextInt();
				jose.setEdad(edad);
				System.out.println("Ingrese presupuesto");
				int presupuesto=teclado.nextInt();
				jose.setDinero(presupuesto);
				
			break;
			
			case 2:
				if(jose.getDinero()>=precio)
				
				if(jose.getEdad()>=18)
					System.out.println("Usted cumple con los requisitos de compra");
				else
					System.out.println("Usted es menor");
				else
					System.out.println("Usted no tiene dinero suficiente");
				
			break;
			
			case 3:
				System.out.println("La cantidad de clientes es de "+jose.getClientes());
				
			break;
			
			case 4:
				System.out.println("El nombre del cliente es "+nombre);
				System.out.println("El presupuesto es de "+jose.getDinero());
				System.out.println("La edad del cliente es " +jose.getEdad());
			
			break;
			
			case 0:
				System.out.println("Fin");
			break;
			
			default:
				System.out.println("Opcion incorrecta");
			break;	
			}
			
		}while(opcion!=0);
		
		
		
	}

}

	


