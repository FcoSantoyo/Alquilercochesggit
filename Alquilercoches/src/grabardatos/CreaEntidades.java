package grabardatos;
import java.util.*;

import entidades.Categoria;
import entidades.Cliente;
import entidades.Cochecomb;
import entidades.Cochelec;
import entidades.Empleado;
import entidades.Fechas;
import entidades.Furgoneta;
import entidades.Moto;
import entidades.Oficina;
import entidades.Vehiculo;

public class CreaEntidades {

	
	public static Empleado CreaEmpleado()
	{
		String dni;
		String nombre;
		String ap1;
		String ap2;
		String carnet;
		Fechas fecha_alta;
		String oficina;
		
		Scanner in = new Scanner ( System.in );
		System.out.println("DNI del Empleado.");
		dni=in.next();
		System.out.println("Nombre del Empleado.");
		nombre=in.next();
		System.out.println("Apellido 1 del Empleado.");
		ap1=in.next();
		System.out.println("Apellido 2 del Empleado.");
		ap2=in.next();
		System.out.println("Tipo de carnet del Empleado.");
		carnet=in.next();
		fecha_alta=Fechas.ManejoFechas();
		System.out.println("Oficina donde trabaja el Empleado.");
		oficina=in.next();
		
		Empleado a = new Empleado(dni,nombre,ap1,ap2,carnet,fecha_alta,oficina);
		return a;
	}
	
	public static Cliente CreaCliente()
	{
		String dni;
		String nombre;
		String ap1;
		String ap2;
		String carnet;
		String tarj_cliente;
		
		Scanner in = new Scanner ( System.in );
		System.out.println("DNI.");
		dni=in.next();
		System.out.println("Nombre.");
		nombre=in.next();
		System.out.println("Apellido 1.");
		ap1=in.next();
		System.out.println("Apellido 2.");
		ap2=in.next();
		System.out.println("Tipo de carnet.");
		carnet=in.next();
		System.out.println("Tarjeta de cliente.");
		tarj_cliente=in.next();

		Cliente a = new Cliente(dni,nombre,ap1,ap2,carnet,tarj_cliente);
		return a;
		
	}
	public static Categoria creaCategoria()
	{
		String codigo;
		String descripcion;
		double porcentaje;
		Scanner in = new Scanner ( System.in );
		
		System.out.println("Código.");
		codigo=in.next();
		System.out.println("Descripción de esta categoría");
		descripcion=in.next();
		System.out.println("Porcentaje");
		porcentaje=in.nextDouble();
		
		Categoria a = new Categoria(codigo,descripcion,porcentaje);
		return a;
	}
	
	public static Alquiler creaAlquiler()
	{
		Vehiculo vehiculoalq; 
		Empleado empleadovend; 
		Cliente clientecomp; 
		GregorianCalendar fecha_inicio;
		GregorianCalendar fecha_fin;
		Oficina oficina; 
		double importe;
		
		Scanner in = new Scanner ( System.in );
		System.out.println("Vehículo alquilado");
		vehiculoalq=
	
		
	}
	
	public static Oficina creaOficina()
	{
		String descripcion;
		String localidad;
		String provincia;
		int aeropuerto_no; 
		String empleado; 
		
		Scanner in = new Scanner ( System.in );
		System.out.println("Descripción de la Oficina.");
		descripcion=in.next();
		System.out.println("Localidad donde se encuentra la Oficina.");
		localidad=in.next();
		System.out.println("Provincia donde se encuentra la Oficina.");
		provincia=in.next();
		System.out.println("¿Es una oficina cerca del aeropuerto? 1)Sí 2)No");
		aeropuerto_no=in.nextInt();
		System.out.println("¿Que empleado le atiende?");
		empleado=in.next();
		
		Oficina a = new Oficina(descripcion,localidad,provincia,aeropuerto_no,empleado);
		return a;
				
	}
	
	public static Cochecomb CreaCochecomb()
	{
		String matricula;
		String marca;
		String modelo;
		String bastidor;
		String color;
		Fechas fecha_adquisicion;
		Double kms;
		Categoria categoria;
		Cliente comprador; 
		double precioalquiler;
		Oficina oficina; //
		Double consumo;
		int potencia;
		String emisiones;
		int num_plazas;
		String tipo;
		
		Scanner in = new Scanner ( System.in );
		System.out.println("Matrícula del coche de combustible.");
		matricula=in.next();
		System.out.println("Marca del coche de commbustible.");
		marca=in.next();
		System.out.println("Modelo del coche de combustible.");
		modelo=in.next();
		System.out.println("Número de Bastidor del coche de combustible.");
		bastidor=in.next();
		System.out.println("Color del coche de combustible.");
		color=in.next();
		fecha_adquisicion=Fechas.ManejoFechas();
		System.out.println("Kms del coche de combustible.");
		kms=in.nextDouble();
		categoria=creaCategoria();
		System.out.println("Comprador del coche de combustible.");
		comprador=CreaEntidades.CreaCliente();
		precioalquiler=in.nextDouble(); //Esto calcular con un método
		oficina=CreaEntidades.creaOficina();
		System.out.println("¿Cuánto consume el coche de combustible?");
		consumo=in.nextDouble();
		System.out.println("¿Cual es la potencia del coche de combustible?");
		potencia=in.nextInt();
		System.out.println("Emisiones del coche de combustible.");
		emisiones=in.next();
		System.out.println("Número de plazas del coche de combustible.");
		num_plazas=in.nextInt();
		System.out.println("Tipo del coche de combustible.");
		tipo=in.next();
		
		Cochecomb a = new Cochecomb(matricula,marca,modelo,bastidor,color,fecha_adquisicion,kms,categoria,comprador,precioalquiler,oficina,consumo,potencia,emisiones,num_plazas,tipo);
		return a;
	}
	
	public static Cochelec CreaCochelec()
	{
		String matricula;
		String marca;
		String modelo;
		String bastidor;
		String color;
		Fechas fecha_adquisicion;
		Double kms;
		Categoria categoria;
		Cliente comprador; 
		double precioalquiler;
		Oficina oficina;
		Double autonomia;
		int tiemporecarga;
		int num_plazas;
		String tipo;
		
		
		Scanner in = new Scanner ( System.in );
		System.out.println("Matrícula del coche eléctrico.");
		matricula=in.next();
		System.out.println("Marca del coche eléctrico.");
		marca=in.next();
		System.out.println("Modelo del coche eléctrico.");
		modelo=in.next();
		System.out.println("Número de Bastidor del coche eléctrico.");
		bastidor=in.next();
		System.out.println("Color del coche eléctrico.");
		color=in.next();
		fecha_adquisicion=Fechas.ManejoFechas();
		System.out.println("Kms del coche eléctrico.");
		kms=in.nextDouble();
		categoria=creaCategoria();
		System.out.println("Comprador del coche eléctrico.");
		comprador=CreaEntidades.CreaCliente();
		precioalquiler=in.nextDouble(); //Esto calcular con un método
		oficina=CreaEntidades.creaOficina();
		System.out.println("Autonomía del coche eléctrico.");
		autonomia=in.nextDouble();
		System.out.println("Tiempo de recarga del coche eléctrico.");
		tiemporecarga=in.nextInt();
		System.out.println("Plazas que posee el coche eléctrico.");
		num_plazas=in.nextInt();
		System.out.println("Tipo de coche eléctrico");
		tipo=in.next();
		
		Cochelec a = new Cochelec(matricula,marca,modelo,bastidor,color,fecha_adquisicion,kms,categoria,comprador,precioalquiler,oficina,autonomia,tiemporecarga,num_plazas,tipo);
		return a;
		
	}
	public static Furgoneta CreaFurgoneta()
	{
		String matricula;
		String marca;
		String modelo;
		String bastidor;
		String color;
		Fechas fecha_adquisicion;
		Double kms;
		Categoria categoria;
		Cliente comprador; 
		double precioalquiler;
		Oficina oficina;
		double consumo;
		int potencia;
		String emisiones;
		Double carga;
		String carnet;
		
		Scanner in = new Scanner ( System.in );
		System.out.println("Matrícula de la Furgoneta.");
		matricula=in.next();
		System.out.println("Marca de la Furgoneta.");
		marca=in.next();
		System.out.println("Modelo de la Furgoneta.");
		modelo=in.next();
		System.out.println("Número de Bastidor de la Furgoneta.");
		bastidor=in.next();
		System.out.println("Color de la Furgoneta.");
		color=in.next();
		fecha_adquisicion=Fechas.ManejoFechas();
		System.out.println("Kms de la Furgoneta.");
		kms=in.nextDouble();
		categoria=creaCategoria();
		System.out.println("Comprador de la Furgoneta.");
		comprador=CreaEntidades.CreaCliente();
		precioalquiler=in.nextDouble(); //Esto calcular con un método
		oficina=CreaEntidades.creaOficina();
		System.out.println("¿Cuánto consume la Furgoneta?");
		consumo=in.nextDouble();
		System.out.println("¿Cual es la potencia del la Furgoneta?");
		potencia=in.nextInt();
		System.out.println("Emisiones de la Furgoneta.");
		emisiones=in.next();
		System.out.println("¿Que carga máxima aguanta?");
		carga=in.nextDouble();
		System.out.println("Carnet necesario.");
		carnet=in.next();
		
		Furgoneta a = new Furgoneta(matricula,marca,modelo,bastidor,color,fecha_adquisicion,kms,categoria,comprador,precioalquiler,oficina,consumo,potencia,emisiones,carga,carnet);
		return a;
	}
	
	public static Moto CreaMoto()
	{
		String matricula;
		String marca;
		String modelo;
		String bastidor;
		String color;
		Fechas fecha_adquisicion;
		Double kms;
		Categoria categoria;
		Cliente comprador; 
		double precioalquiler;
		Oficina oficina;
		double autonomia;
		int tiemporecarga;
		int cilindrada;
		String carnet;
		
		Scanner in = new Scanner ( System.in );
		System.out.println("Matrícula de la moto..");
		matricula=in.next();
		System.out.println("Marca de la moto.");
		marca=in.next();
		System.out.println("Modelo de la moto.");
		modelo=in.next();
		System.out.println("Número de Bastidor de la moto.");
		bastidor=in.next();
		System.out.println("Color del la moto.");
		color=in.next();
		fecha_adquisicion=Fechas.ManejoFechas();;
		System.out.println("Kms de la moto.");
		kms=in.nextDouble();
		categoria=creaCategoria();
		System.out.println("Comprador de la moto.");
		comprador=CreaEntidades.CreaCliente();
		precioalquiler=in.nextDouble(); //Esto calcular con un método
		oficina=CreaEntidades.creaOficina();
		System.out.println("Autonomía de la moto.");
		autonomia=in.nextDouble();
		System.out.println("Tiempo de recarga de la moto.");
		tiemporecarga=in.nextInt();
		System.out.println("Cilindrada de la moto.");
		cilindrada=in.nextInt();
		System.out.println("Carnet necesario.");
		carnet=in.next();
		
		Moto a= new Moto(matricula,marca,modelo,bastidor,color,fecha_adquisicion,kms,categoria,comprador,precioalquiler,oficina,autonomia,tiemporecarga,cilindrada,carnet);
		return a;
	}
}
