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
		String color="";
		int cantidadAutos=0;
		double presion=0;
		
		do {
			
			System.out.println("Ingrese 0 para ir a la seccion mantenimiento");
			System.out.println("Ingrese 1 si desea ingresar auto");
			System.out.println("Ingrese 2 para ver la cantidad de autos ingresados durante el dia");
			System.out.println("Ingrese 3 para la informacion del auto");
			System.out.println("Ingrese 4 para ir a la seccion cliente");
		
			
		
			opcion=teclado.nextInt();
			
			switch(opcion) {
			
			case 1:
				System.out.println("Ingrese la cantidad de autos");
				cantidadAutos=teclado.nextInt();
				
				for(int i=0; i<cantidadAutos; i++) {
				peugeot.aumentarCantidadDeAutos();
				System.out.println("Se creo el auto correctamente");
				System.out.println("Ingrese marca");
				marca=teclado.next();
				System.out.println("Ingrese cantidad de kilometros");
				kilometros=teclado.nextInt();
				System.out.println("Ingrese presion actual del neumatico");
				presion=teclado.nextDouble();
				peugeot.setPresion(presion);
				System.out.println("Ingrese precio");
				precio=teclado.nextInt();
				peugeot.ingresarPrecio(precio);
				}
			break;
			
			case 2:
				if(peugeot.getAutos()<6)
				System.out.println("La cantidad de autos ingresados es de "+peugeot.getAutos());
				else
					System.out.println("Ya no hay lugar");
			break;
			
			case 3:
				if(kilometros>0)
					System.out.println("El auto tiene "+kilometros + "Km");
				else
					System.out.println("El auto es 0Km");
				
				System.out.println("El auto es un " +marca);
				
				System.out.println("El valor del auto es de "+precio+ "$");
				
				System.out.println("Los neumaticos tiene " +presion+ " psi");
			break;
			
			case 4:
				
				///Cliente///
				
				Cliente jose=new Cliente();
				String nombre="";
				String apellido="";		
				
				do {
					System.out.println("Ingrese 0 para ingresar en el menu mantenimiento");
					System.out.println("Ingrese 1 para crear cliente");
					System.out.println("Ingrese 2 para ver si cumple con los requisitos de compra");
					System.out.println("Ingrese 3 para ver la cantidad de clientes ingresados durante el dia");
					System.out.println("Ingrese 4 para ver datos del cliente");
					
					opcion=teclado.nextInt();
					
					switch(opcion) {
					
					case 1:
						jose.aumentarCantidadDeClientes();
						System.out.println("Ingrese su nombre y apellido");
						nombre=teclado.next();
						apellido=teclado.next();
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
						System.out.println("El nombre del cliente es "+nombre+" "+apellido);
						System.out.println("El presupuesto es de "+jose.getDinero());
						System.out.println("La edad del cliente es " +jose.getEdad());
					
					break;
					
					case 0:
						System.out.println("Accediendo a seccion mantenimiento");
					break;
					
					default:
						System.out.println("Opcion incorrecta");
					break;	
					}
					
				}while(opcion!=0);
				
			break;	
			
			case 0:
				System.out.println("Accediendo a seccion mantenimiento");
				
			break;
				
			default:
				System.out.println("Opcion incorrecta");
			break;		
			}
		
		
		}while(opcion!=0);
		

		
		////////Mantenimiento ////////
		
		Mantenimiento mecanico=new Mantenimiento();
		int factura=0;
		
		do {
			System.out.println("Ingrese 0 para finalizar");
			System.out.println("Ingrese 1 para cambiar de color el auto");
			System.out.println("Ingrese 2 para verificar si necesita cambio de aceite");
			System.out.println("Ingrese 3 para revisar presion de los neumaticos");
			System.out.println("Ingrese 4 para inflar neumaticos");
			System.out.println("Ingrese 5 para ver el precio por mantenimiento");
			System.out.println("Ingrese 6 para ir a facturacion");
			
			opcion=teclado.nextInt();
			
			switch(opcion) {
			
			case 1:
				System.out.println("Ingrese el color que desee aplicar");
				mecanico.setColor(teclado.next());
				System.out.println("Color "+mecanico.getColor()+ " ingresado");
				factura+=1000;
			break;	
			
			case 2:
				
				mecanico.setKilometros(kilometros);
				if(mecanico.cambioAceite()==true) {
					factura+=2000;
					System.out.println("Requiere cambio de aceite");
				}else
					System.out.println("No requiere cambio de aceite");
				
			break;
			
			case 3:

				 	if(mecanico.getPresion()<=23.5) {
				 		System.out.println("Presion del neumatico baja");
				 		factura+=1000;
				 		
				 	
				 	}else
				 		System.out.println("No se necesita inflar");
			break;
			
			case 4:
					
					mecanico.inflar();
					factura+=500;
						
			break;	
			
			
			case 5:
				
				System.out.println("Debe abonar "+factura+ "$");
						
			break;	
			
			case 6:
				
				///Facturacion///
				
				Facturacion afip= new Facturacion();
				
				do {
					System.out.println("Ingrese 0 para ir a finalizar");
					System.out.println("Ingrese 1 para ver si tiene descuento");
					System.out.println("Ingrese 2 para abonar");
				
					opcion=teclado.nextInt();
					
					switch(opcion) {
					
					case 1:
						
						afip.setDinero(factura);
						afip.dcto();
						
					break;
					
					case 2:
						int money=afip.getDinero();
						factura-=money;
						System.out.println("El total es de " +factura +"$");
						System.out.println("Ingrese con cuanto va a abonar");
						int pago=teclado.nextInt();
						afip.setDinero(factura);
						afip.setMoney(pago);
						afip.pago();
						factura-=pago;
						
					break;
					
					case 0:
						System.out.println("Fin");
					break;
					
					default:
						System.out.println("Opcion incorrecta");
					break;
					}
					
					
				}while(opcion!=0);
				
				
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

	


