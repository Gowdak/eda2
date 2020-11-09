package eda2;

import java.util.Scanner;


public class Test {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		Vehiculo[] vehiculos = null;
		Cliente[] clientes = null;
		Vendedor[] vendedores = null;
		int opcion;
		int opcionPrincipal;
		
		do {
			System.out.println("----------------------Inicializacion de BD Concensionaria ------------------");
			System.out.println("1- Ingresar los Vehiculo a la concesionaria");
			System.out.println("2- Ingresar los Clientes a la concesionaria");
			System.out.println("3- Ingresar los Vendedores a la concesionaria");
			System.out.println("4- Ingresar para verificar mantenimiento");
			System.out.println("0- Salir");
			opcion=teclado.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Ingrese la cantidad de autos que quiere ingresar \n");
				int cantidadAutos=teclado.nextInt();
				int cantidadIngresados=0;
				vehiculos = new Vehiculo[cantidadAutos];
				while(cantidadAutos!=cantidadIngresados) {
					Vehiculo vehiculo= new Vehiculo();
					System.out.println("Ingrese el tipo de vehiculo: 1- Auto , 2- Camioneta, 3 - Moto \n");
					int tipoVehiculo = teclado.nextInt();
					System.out.println("Ingrese la marca del vehiculo \n");
					String marca = teclado.next();
					System.out.println("Ingrese el modelo del vehiculo \n");
					String modelo = teclado.next();
					System.out.println("Ingrese los kms del vehiculo \n");
					int kms = teclado.nextInt();
					System.out.println("Es importado el vehiculo ? Opciones Si/No \n");
					boolean esImportado = (teclado.next().equals("Si")) ? true : false;
					System.out.println("Ingrese el color del vehiculo \n");
					String color = teclado.next();
					System.out.println("Ingrese la cantidad de años del vehiculo \n");
					int año = teclado.nextInt();
					System.out.println("Ingrese el precio del vehiculo \n");
					float precio = teclado.nextFloat();
					
					vehiculo.setCodigoVehiculo(cantidadIngresados);
					vehiculo.setTipoVehiculo(tipoVehiculo);
					vehiculo.setMarca(marca);
					vehiculo.setModelo(modelo);
					vehiculo.setKms(kms);
					vehiculo.setEsImportado(esImportado);
					vehiculo.setColor(color);
					vehiculo.setCantidadDeCoches(año);
					vehiculo.setPrecio(precio);
					
					vehiculos[cantidadIngresados]= vehiculo;
					cantidadIngresados++;
					
				}
				break;
				
			case 2:
				System.out.println("Ingrese la cantidad de clientes que quiere ingresar a la concecionaria \n");
				int cantidadClientes = teclado.nextInt();
				int cantidadIngresadosClientes = 0;
				clientes = new Cliente[cantidadClientes];

				while (cantidadClientes != cantidadIngresadosClientes) {
					System.out.println("Ingrese el nombre del cliente \n");
					String nombre = teclado.next();
					System.out.println("Ingrese el apellido del cliente \n");
					String apellido = teclado.next();
					System.out.println("Ingrese la edad del cliente \n");
					int edad = teclado.nextInt();
					System.out.println("Es un cliente recurrente (VIP) ? Opciones =  Si/No  \n");
					String opcionVip = teclado.next();
					boolean vip = opcionVip.equals("Si") ? true : false;
					System.out.println("Ingrese el saldo que cuenta el cliente \n ");
					float saldo = teclado.nextFloat();

					/* Seteamos al cliente y sus propiedades */
					Cliente cliente = new Cliente();
					cliente.setCodigoCliente(cantidadIngresadosClientes);
					cliente.setNombre(nombre);
					cliente.setApellido(apellido);
					cliente.setEdad(edad);
					cliente.setEsVip(vip);
					cliente.setDinero(saldo);
					/* Asignamos al cliente */
					clientes[cantidadIngresadosClientes] = cliente;

					/* Alteramos el contador de clientes */
					cantidadIngresadosClientes++;
				}
				break;
				
			case 3:
				System.out.println("Ingrese la cantidad de vendedores que quiere ingresar a la concecionaria \n");
				int cantidadVendedores = teclado.nextInt();
				int cantidadIngresadosVendedores = 0;
				vendedores = new Vendedor[cantidadVendedores];

				while (cantidadVendedores != cantidadIngresadosVendedores) {
					System.out.println("Ingrese el nombre del vendedor \n");
					String nombre = teclado.next();
					System.out.println("Ingrese el apellido del vendedor \n");
					String apellido = teclado.next();

					/* Seteamos al cliente y sus propiedades */
					Vendedor vendedor = new Vendedor();
					vendedor.setCodigoVendedor(cantidadIngresadosVendedores);
					vendedor.setNombre(nombre);
					vendedor.setApellido(apellido);

					/* Asignamos al cliente */
					vendedores[cantidadIngresadosVendedores] = vendedor;

					/* Alteramos el contador de clientes */
					cantidadIngresadosVendedores++;
				}
				break;
			
			case 4:
				Mantenimiento mantenimiento = new Mantenimiento();
				for(Vehiculo vehiculo:vehiculos) 
				if(vehiculo.getKms()>=5000) { 
					mantenimiento.setKms(vehiculo.getKms());
					System.out.println("Requiere cambio de aceite");
					mantenimiento.cambioAceite();
				
				}else 
					System.out.println("No requiere cambio de aceite");
					
				
				System.out.println("Ingrese presion de neumatico");
				double presion=teclado.nextDouble();
				mantenimiento.setPresion(presion);
				if(mantenimiento.getPresion()<=23.5) {
			 		System.out.println("Presion del neumatico baja");
			 		
			 		mantenimiento.inflar();
			 		
			 	}else
			 		System.out.println("No se necesita inflar");
				
				break;
			case 0:	
				System.out.println("Fin");
				break;
			default:
				System.out.println("Opcion incorrecta");
				break;
			}
			
		}while (opcion!=0);
		
		do {
			System.out.println("----------------------Menu Principal de BD Concensionaria ------------------");
			System.out.println("1- Listar los Vehiculo a la concesionaria");
			System.out.println("2- Listar los Clientes a la concesionaria");
			System.out.println("3- Listar los Vendedores a la concesionaria");
			System.out.println("4- Ejecutar Adquisicion de vehiculo");
			System.out.println("0- Fin");
			opcionPrincipal = teclado.nextInt();
			
			switch(opcionPrincipal) {
			case 1:
				if(vehiculos !=null) {
					if(vehiculos.length>0) {
						System.out.println("Cantidad de vehiculos" +vehiculos.length);
						for(Vehiculo vehiculo:vehiculos) {
							System.out.println(vehiculo.toString());
						}
					}else {
						System.out.println("No hay vehiculos");
					}
				}
				break;
			case 2:
				if (clientes != null) {
					if (clientes.length > 0) {
						System.out.println("Cantidad de clientes " + clientes.length);
						for (Cliente cliente : clientes) {
							System.out.println(cliente.toString());
						}
					} else {
						System.out.println("No hay clientes disponibles cargados en el sistema");
					}
				} else {
					System.out.println("No hay clientes disponibles cargados en el sistema");
				}
				break;	
			case 3:
				if (vendedores != null) {
					if (vendedores.length > 0) {
						System.out.println("Cantidad de vendedores " + clientes.length);
						for (Vendedor vendedor : vendedores) {
							System.out.println(vendedor.toString());
						}
					} else {
						System.out.println("No hay vendedores disponibles");
					}
				}
				break;
			case 4:
				int codVendedor;
				int codCliente;
				int codVehiculo;

				boolean esVendedorVerificado = false;
				boolean esClienteVerificado = false;
				boolean esVehiculoVerificado = false;

				System.out.println("----------Iniciamos transaccion---------");
				do {
					System.out.println("Ingrese su codigo de vendedor (Para anular operacion ingrese 9999) : \n ");
					codVendedor = teclado.nextInt();
					if (codVendedor <= vendedores.length) {
						esVendedorVerificado = true;
					}

				} while (esVendedorVerificado == false && codVendedor != 9999);

				do {
					System.out.println("Ingrese su codigo del cliente (Para anular operacion ingrese 9999) : \n ");
					codCliente = teclado.nextInt();
					if (codCliente <= clientes.length) {
						esClienteVerificado = true;
					}

				} while (esClienteVerificado == false && codCliente != 9999);

				do {
					System.out.println("Ingrese su codigo del vehiculo (Para anular operacion ingrese 9999) : \n ");
					codVehiculo = teclado.nextInt();
					if (codVehiculo <= vehiculos.length) {
						esVehiculoVerificado = true;
					}

				} while (esVehiculoVerificado == false && codVehiculo != 9999);
				
				if (esClienteVerificado && esVehiculoVerificado && esVendedorVerificado) {

					System.out.println("Desea financiar el vehiculo: Si / No");
					boolean opcionFinancia = teclado.next().equals("Si") ? true : false;
					Venta ven1;
					if (opcionFinancia) {
						System.out.println("En cuantas cuotas? 12 , 24 , 36 , 48, 60");
						int cuotas = teclado.nextInt();
						ven1 = new Venta(clientes[codCliente], vendedores[codVendedor], vehiculos[codVehiculo], true,
								cuotas);
					} else {
						ven1 = new Venta(clientes[codCliente], vendedores[codVendedor], vehiculos[codVehiculo], false,
								0);
					}

					if (ven1.vender()) {
						System.out.println("\nSe ha realizado correctamente la transaccion");
						System.out.println("Vendedor  " + vendedores[codVendedor].getNombre() + " "
								+ vendedores[codVendedor].getApellido() + " ha vendido \n");
						System.out.println("Vehiculo : " + vehiculos[codVehiculo].getMarca() + " \n"
								+ vehiculos[codVehiculo].getModelo() + " \nEl nuevo propietario es : ");
						System.out.println("Cliente : " + clientes[codCliente].getNombre() + " "
								+ clientes[codCliente].getApellido() + " \n");
						System.out.println("Recuerde que la transaccion no incluye costos de transferencia de: "
								+ ven1.valorTransferencia());
						System.out.println("Recuerde que sus patentes son de un monto de: " + ven1.calcularPatente());

					} else {
						System.out.println("Verificar errores anteriores");
					}

				} else {
					System.out.println(
							"Las verificaciones de cliente o vendedor o vehiculo han fallado. Vuelva a intentarlo");
				}

				break;
			case 0:
				System.out.println("Fin de proceso principal");
			default:
				break;
	
			}
			
		}while (opcionPrincipal!=0);
		teclado.close();

	}

}
