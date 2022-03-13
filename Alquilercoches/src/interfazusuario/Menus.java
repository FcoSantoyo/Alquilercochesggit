package interfazusuario;
import java.util.*;

import entidades.Alquiler;
import entidades.Categoria;
import entidades.Cliente;
import entidades.Cochecomb;
import entidades.Cochelec;
import entidades.Empleado;
import entidades.Furgoneta;
import entidades.Moto;
import entidades.Oficina;
public class Menus {

//Muestra datos
	/**
	 * Lista los datos de un coche de combustible
	 * @param a
	 */
	public static void MuestraCochecomb(Cochecomb a) {
		System.out.println(a.getMatricula());
		System.out.println(a.getMarca());
		System.out.println(a.getModelo());
		System.out.println(a.getBastidor());
		System.out.println(a.getColor());
		System.out.println(a.getFecha_adquisicion());
		System.out.println(a.getKms());
		System.out.println(a.getComprador());
		System.out.println(a.getPrecioalquiler());
		System.out.println(a.getOficina());
		System.out.println(a.getConsumo());
		System.out.println(a.getPotencia());
		System.out.println(a.getEmisiones());
		System.out.println(a.getNum_plazas());
		System.out.println(a.getTipo());
	}
	/**
	 * Lista los datos de un coche electrico
	 * @param a
	 */
	public static void MuestraCochelec(Cochelec a) {
		System.out.println(a.getMatricula());
		System.out.println(a.getMarca());
		System.out.println(a.getModelo());
		System.out.println(a.getBastidor());
		System.out.println(a.getColor());
		System.out.println(a.getFecha_adquisicion());
		System.out.println(a.getKms());
		System.out.println(a.getComprador());
		System.out.println(a.getPrecioalquiler());
		System.out.println(a.getOficina());
		System.out.println(a.getAutonomia());
		System.out.println(a.getTiemporecarga());
		System.out.println(a.getNum_plazas());
		System.out.println(a.getTipo());
	}
	/**
	 * Lista los datos de un coche de una Furgoneta
	 * @param a
	 */
	public static void MuestraFurgoneta(Furgoneta a) {
		System.out.println(a.getMatricula());
		System.out.println(a.getMarca());
		System.out.println(a.getModelo());
		System.out.println(a.getBastidor());
		System.out.println(a.getColor());
		System.out.println(a.getFecha_adquisicion());
		System.out.println(a.getKms());
		System.out.println(a.getComprador());
		System.out.println(a.getPrecioalquiler());
		System.out.println(a.getOficina());
		System.out.println(a.getConsumo());
		System.out.println(a.getPotencia());
		System.out.println(a.getEmisiones());
		System.out.println(a.getCarga());
		System.out.println(a.getCarnet());
	}
	/**
	 * Lista los datos de un coche de una Moto
	 * @param a
	 */
	public static void MuestraMoto(Moto a) {
		System.out.println(a.getMatricula());
		System.out.println(a.getMarca());
		System.out.println(a.getModelo());
		System.out.println(a.getBastidor());
		System.out.println(a.getColor());
		System.out.println(a.getFecha_adquisicion());
		System.out.println(a.getKms());
		System.out.println(a.getComprador());
		System.out.println(a.getPrecioalquiler());
		System.out.println(a.getOficina());
		System.out.println(a.getAutonomia());
		System.out.println(a.getTiemporecarga());
		System.out.println(a.getCilindrada());
		System.out.println(a.getCarnet());
		
	}
	/**
	 * Lista los datos de un coche de un Empleado
	 * @param a
	 */
	public static void MuestraEmpleado(Empleado a) {
		System.out.println(a.getDni());
		System.out.println(a.getNombre());
		System.out.println(a.getAp1());
		System.out.println(a.getAp2());
		System.out.println(a.getCarnet());
		System.out.println(a.getFecha_alta());
		System.out.println(a.getOficina());
	}
	/**
	 * Lista los datos de un coche de un cliente
	 * @param a
	 */
	public static void MuestraCliente(Cliente a) {
		System.out.println(a.getDni());
		System.out.println(a.getNombre());
		System.out.println(a.getAp1());
		System.out.println(a.getAp2());
		System.out.println(a.getCarnet());
		System.out.println(a.getTarj_cliente());
		
	}
	/**
	 * Lista los datos de un coche de una oficina
	 * @param a
	 */
	public static void MuestraOficina(Oficina a) {
		System.out.println(a.getDescripcion());
		System.out.println(a.getLocalidad());
		System.out.println(a.getProvincia());
		System.out.println(a.getAreopuerto_no());
		System.out.println(a.getEmpleado());
	}
	/**
	 * Lista los datos de un coche de un alquiler
	 * @param a
	 */
	public static void MuestraAlquiler(Alquiler a) {
		System.out.println(a.getVehiculoalq());
		System.out.println(a.getEmpleadovend());
		System.out.println(a.getClientecomp());
		System.out.println(a.getFecha_inicio());
		System.out.println(a.getFecha_fin());
		System.out.println(a.getOficina());
		System.out.println(a.getImporte());
	}
	/**
	 * Lista los datos de un coche de una categoría
	 * @param a
	 */
	public static void MuestraCategoria(Categoria a) {
		System.out.println(a.getCodigo());
		System.out.println(a.getDescripcion());
		System.out.println(a.getPorcentaje());
	}
	
	
	
	
	
public static void Interfaz1() {
	System.out.println("SELECCIONE UNA OPCIÓN,PORFAVOR...");
	System.out.println("1.Mantenimiento de ficheros maestros.");
	System.out.println("2.Realizar un alquiler/Devolución.");
	System.out.println("3.Listar.");
	System.out.println("4.Salir.");
}
	
	
public static void Interfaz2() {
	System.out.println("SELECCIONE UNA OPCIÓN,PORFAVOR..."); //para elegir que tipo de fichero maestro queremos configurar o parar listar existentes
	System.out.println("1.Vehiculos");
	System.out.println("2.Oficina");
	System.out.println("3.Categoria");
	System.out.println("4.Empleado");
	System.out.println("5.Clientes");
}
public static void InterfazVehiculos(){
	System.out.println("SELECCIONE UNA OPCIÓN,PORFAVOR...");
	System.out.println("1.Coche eléctrico.");
	System.out.println("2.Coche de combustión.");
	System.out.println("3.Moto eléctrica.");
	System.out.println("4.Furgoneta.");
}
public static void Interfaz222() {
	System.out.println("SELECCIONE UNA OPCIÓN,PORFAVOR...");
	System.out.println("Coche de combustible.");
	System.out.println("Furgoneta.");
}
public static void Interfaz222_2() {
	System.out.println("SELECCIONE UNA OPCIÓN,PORFAVOR...");
	System.out.println("Coche eléctrico.");
	System.out.println("Moto.");
}
	
public static void InterfazOpciones() {
	System.out.println("SELECCIONE UNA OPCIÓN,PORFAVOR...");
	System.out.println("1.Crear"); //Aqui añadir los metodos de crear los objetos
	System.out.println("2.Modificar");//aqui metodos de modificar
	System.out.println("3.Borrar");//Aqui borrar
}
}
