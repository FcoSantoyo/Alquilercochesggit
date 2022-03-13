package entidades;
import java.io.Serializable;
import java.util.GregorianCalendar;
import java.util.Scanner;
import java.util.TreeMap;

import grabardatos.CreaEntidades;

public class Empresa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TreeMap<String,Empleado> Empleado = new TreeMap<String,Empleado>();
	private TreeMap<String,Cliente> Cliente = new TreeMap<String,Cliente>();
	private TreeMap<String,Vehiculo> Vehiculo = new TreeMap<String,Vehiculo>();
	private TreeMap<String,Oficina> Oficina = new TreeMap<String,Oficina>();
	private TreeMap<Alquiler,Vehiculo> Alquiler = new TreeMap<Alquiler,Vehiculo>();
	private TreeMap <String,Categoria> Categoria = new TreeMap<String,Categoria>();
	
	//Constructores
	public Empresa() {
		
	}
	/**
	 * Constructor para Crear un objeto de Empresa
	 * @param Empleado
	 * @param Cliente
	 * @param Vehiculo
	 * @param Oficina
	 * @param Categoria
	 * @param Alquiler
	 */
	public Empresa(TreeMap<String,Empleado> Empleado,TreeMap<String,Cliente> Cliente,TreeMap<String,Vehiculo> Vehiculo,TreeMap<String,Oficina> Oficina,TreeMap<String,Categoria> Categoria,TreeMap<Alquiler,Vehiculo> Alquiler)
	{
		this.setEmpleado(Empleado);
		this.setCliente(Cliente);
		this.setVehiculo(Vehiculo);
		this.setOficina(Oficina);
		this.setAlquiler(Alquiler);
		this.setCategoria(Categoria);
	}
	
	//Constructor de copia
	public Empresa(Empresa o)
	{
		this.setEmpleado(o.getEmpleado());
		this.setCliente(o.getCliente());
		this.setVehiculo(o.getVehiculo());
		this.setOficina(o.getOficina());
		this.setAlquiler(o.getAlquiler());
		this.setCategoria(o.getCategoria());
	}
	
	
	//Getters y setters
	
	public TreeMap<String,Empleado> getEmpleado() {
		return Empleado;
	}
	public void setEmpleado(TreeMap<String,Empleado> empleado) {
		Empleado = empleado;
	}
	public TreeMap<String,Cliente> getCliente() {
		return Cliente;
	}
	public void setCliente(TreeMap<String,Cliente> cliente) {
		Cliente = cliente;
	}
	public TreeMap<String,Vehiculo> getVehiculo() {
		return Vehiculo;
	}
	public void setVehiculo(TreeMap<String,Vehiculo> vehiculo) {
		Vehiculo = vehiculo;
	}
	public TreeMap<String,Oficina> getOficina() {
		return Oficina;
	}
	public void setOficina(TreeMap<String,Oficina> oficina) {
		Oficina = oficina;
	}
	
	public TreeMap<Alquiler, Vehiculo> getAlquiler() {
		return Alquiler;
	}

	public void setAlquiler(TreeMap<Alquiler, Vehiculo> alquiler) {
		Alquiler = alquiler;
	}

	public TreeMap<String,Categoria> getCategoria() {
		return Categoria;
	}
	public void setCategoria(TreeMap<String,Categoria> categoria) {
		Categoria = categoria;
	}

	public void getVehiculo(TreeMap<Vehiculo,String> vehiculo) {
		// TODO Auto-generated method stub
		
	}

	
	//Metodos
	
	//Añadir 
	
	//Vehiculos
	/**
	 * Crea un Coche de combustible y lo añade a la Empresa.
	 * @param Empresa
	 */
	public  void añadeCochecomb(Empresa Empresa) {
		Cochecomb a;
		a=CreaEntidades.CreaCochecomb();
		Empresa.getVehiculo().put(a.getMatricula(),a);
	}
	/**
	 * Crea un Coche eléctrico y lo añade a la Empresa.
	 * @param Empresa
	 */
	public void añadeCochelec(Empresa Empresa) {
		Cochelec a;
		a=CreaEntidades.CreaCochelec();
		Empresa.getVehiculo().put(a.getMatricula(),a);
	}
	/**
	 * Crea una Furgoneta y la añade a la Empresa.
	 * @param Empresa
	 */
	public void añadeFurgoneta(Empresa Empresa) {
		Furgoneta a;
		a=CreaEntidades.CreaFurgoneta();
		Empresa.getVehiculo().put(a.getMatricula(),a);
	}
	/**
	 * Crea una Moto eléctrico y lo añade a la Empresa.
	 * @param Empresa
	 */
	public void añadeMoto(Empresa Empresa) {
		Moto a;
		a=CreaEntidades.CreaMoto();
		Empresa.getVehiculo().put(a.getMatricula(),a);
	}
	
	//Personas
	/**
	 * Crea un Cliente y lo añade a la Empresa.
	 * @param Empresa
	 */
	public void añadeCliente(Empresa Empresa) {
		Cliente a;
		a=CreaEntidades.CreaCliente();
		Empresa.getCliente().put(a.getDni(),a);
	}
	/**
	 * Crea un Empleado y lo añade a la Empresa.
	 * @param Empresa
	 */
	public void añadeEmpleado(Empresa Empresa) {
		Empleado a;
		a=CreaEntidades.CreaEmpleado();
		Empresa.getEmpleado().put(a.getDni(),a);
	}
	
	//Otras entidades
	/**
	 * Crea uan Categoría y la añade a la Empresa.
	 * @param Empresa
	 */
	public void añadeCategoria(Empresa Empresa) {
		Categoria a;
		a=CreaEntidades.creaCategoria();
		Empresa.getCategoria().put(a.getCodigo(),a);
	}
	/**
	 * Crea una Oficina y la añade a la Empresa.
	 * @param Empresa
	 */
	public void añadeOficina(Empresa Empresa) {
		Oficina a;
		a=CreaEntidades.creaOficina();
		Empresa.getOficina().put(a.getProvincia(),a);
	}
	/**
	 * Crea un Alquiler y lo añade a la Empresa.
	 * @param Empresa
	 */
	public void añadeAlquiler(Empresa Empresa) {
		Alquiler a;
		a=CreaEntidades.creaAlquiler();
		Empresa.getAlquiler().put(a,a.getVehiculoalq());
	}
	
	//Modificar
	/**
	 * Modifica un objeto moto
	 * @param moto
	 */
	public void modificarMoto(Moto moto) {
		Scanner in = new Scanner ( System.in );
		System.out.println("Introduzca una nueva Marca");
		moto.setMarca(in.next());
		System.out.println("Introduzca un nuevo Modelo");
		moto.setModelo(in.next());
		System.out.println("Introduzca nuevo número de Bastidor");
		moto.setBastidor(in.next());
		System.out.println("Introduzca nuevo color");
		moto.setColor(in.next());
		System.out.println("Nueva Fecha de adquisición");
		moto.setFecha_adquisicion(in.next());
		System.out.println("Nuevo dato sobre los kilómetros");
		moto.setKms(in.nextDouble());
		System.out.println("Nuevo Comprador");
		moto.setComprador(CreaEntidades.CreaCliente());
		System.out.println("Nuevo precio de Alquiler");
		moto.setPrecioalquiler(in.nextInt());
		System.out.println("Nueva oficina donde se encuentra");
		moto.setOficina(CreaEntidades.creaOficina());
		System.out.println("Nueva autonomía");
		moto.setAutonomia(in.nextDouble());
		System.out.println("Nuevo tiempo de recarga");
		moto.setTiemporecarga(in.nextInt());
		System.out.println("Nueva cilindrada");
		moto.setCilindrada(in.nextInt());
		System.out.println("Nuevo tipo de carnet necesario");
		moto.setCarnet(in.next());
	}
	/**
	 * Modifica un objeto coche eléctrico
	 * @param cochelec
	 */
	public void modificarCochelec(Cochelec cochelec) {
		Scanner in = new Scanner ( System.in );
		
		System.out.println("Introduzca una nueva Marca");
		cochelec.setMarca(in.next());
		System.out.println("Introduzca un nuevo Modelo");
		cochelec.setModelo(in.next());
		System.out.println("Introduzca nuevo número de Bastidor");
		cochelec.setBastidor(in.next());
		System.out.println("Introduzca nuevo color");
		cochelec.setColor(in.next());
		System.out.println("Nueva Fecha de adquisición");
		cochelec.setFecha_adquisicion(in.next());
		System.out.println("Nuevo dato sobre los kilómetros");
		cochelec.setKms(in.nextDouble());
		System.out.println("Nuevo Comprador");
		cochelec.setComprador(CreaEntidades.CreaCliente());
		System.out.println("Nuevo precio de Alquiler");
		cochelec.setPrecioalquiler(in.nextInt());
		System.out.println("Nueva oficina donde se encuentra");
		cochelec.setOficina(CreaEntidades.creaOficina());
		System.out.println("Nueva autonomía");
		cochelec.setAutonomia(in.nextDouble());
		System.out.println("Nuevo tiempo de recarga");
		cochelec.setTiemporecarga(in.nextInt());
		System.out.println("Nuevo número de plazas");
		cochelec.setNum_plazas(in.nextInt());
		System.out.println("Nuevo tipo de vehiculo");
		cochelec.setTipo(in.next());
	}
	/**
	 * Modifica un objeto coche de combustible
	 * @param cochecomb
	 */
	public void modificarCochecomb(Cochecomb cochecomb) {
		Scanner in = new Scanner ( System.in );
		
		System.out.println("Introduzca una nueva Marca");
		cochecomb.setMarca(in.next());
		System.out.println("Introduzca un nuevo Modelo");
		cochecomb.setModelo(in.next());
		System.out.println("Introduzca nuevo número de Bastidor");
		cochecomb.setBastidor(in.next());
		System.out.println("Introduzca nuevo color");
		cochecomb.setColor(in.next());
		System.out.println("Nueva Fecha de adquisición");
		cochecomb.setFecha_adquisicion(in.next());
		System.out.println("Nuevo dato sobre los kilómetros");
		cochecomb.setKms(in.nextDouble());
		System.out.println("Nuevo Comprador");
		cochecomb.setComprador(CreaEntidades.CreaCliente());
		System.out.println("Nuevo precio de Alquiler");
		cochecomb.setPrecioalquiler(in.nextInt());
		System.out.println("Nueva oficina donde se encuentra");
		cochecomb.setOficina(CreaEntidades.creaOficina());
		System.out.println("Nuevo consumo");
		cochecomb.setConsumo(in.nextDouble());
		System.out.println("Nueva potencia");
		cochecomb.setPotencia(in.nextInt());
		System.out.println("Nuevas emisiones");
		cochecomb.setEmisiones(in.next());
		System.out.println("Nuevo número de plazas");
		cochecomb.setNum_plazas(in.nextInt());
		System.out.println("Nuevo tipo de vehiculo");
		cochecomb.setTipo(in.next());
	}
	/**
	 * Modifica un objeto Furgoneta
	 * @param furgoneta
	 */
	public void modificarFurgoneta(Furgoneta furgoneta) {
		Scanner in = new Scanner ( System.in );
		
		System.out.println("Introduzca una nueva Marca");
		furgoneta.setMarca(in.next());
		System.out.println("Introduzca un nuevo Modelo");
		furgoneta.setModelo(in.next());
		System.out.println("Introduzca nuevo número de Bastidor");
		furgoneta.setBastidor(in.next());
		System.out.println("Introduzca nuevo color");
		furgoneta.setColor(in.next());
		System.out.println("Nueva Fecha de adquisición");
		furgoneta.setFecha_adquisicion(in.next());
		System.out.println("Nuevo dato sobre los kilómetros");
		furgoneta.setKms(in.nextDouble());
		System.out.println("Nuevo Comprador");
		furgoneta.setComprador(CreaEntidades.CreaCliente());
		System.out.println("Nuevo precio de Alquiler");
		furgoneta.setPrecioalquiler(in.nextInt());
		System.out.println("Nueva oficina donde se encuentra");
		furgoneta.setOficina(CreaEntidades.creaOficina());
		System.out.println("Nuevo consumo");
		furgoneta.setConsumo(in.nextDouble());
		System.out.println("Nueva potencia");
		furgoneta.setPotencia(in.nextInt());
		System.out.println("Nuevas emisiones");
		furgoneta.setEmisiones(in.next());
		System.out.println("Nueva carga");
		furgoneta.setCarga(in.nextDouble());
		System.out.println("Nuevo carnet necesario");
		furgoneta.setCarnet(in.next());
	}
	/**
	 * Modifica un objeto Empleado
	 * @param empleado
	 */
	public void modificarEmpleado(Empleado empleado) {
		Scanner in = new Scanner ( System.in );
		System.out.println("Nuevo nombre");
		empleado.setNombre(in.next());
		System.out.println("Nuevo primer apellido");
		empleado.setAp1(in.next());
		System.out.println("Nuevo segundo apellido");
		empleado.setAp2(in.next());
		System.out.println("Nuevo carnet");
		empleado.setCarnet(in.next());
		System.out.println("Nueva fecha de alta");
		empleado.setFecha_alta(in.next());
		System.out.println("Nueva oficina en la que trabaja");
		empleado.setOficina(in.next());
	}
	/**
	 * Modifica un objeto cliente
	 * @param cliente
	 */
	public void modificarCliente(Cliente cliente) {
		Scanner in = new Scanner ( System.in );
		System.out.println("Nuevo nombre");
		cliente.setNombre(in.next());
		System.out.println("Nuevo primer apellido");
		cliente.setAp1(in.next());
		System.out.println("Nuevo segundo apellido");
		cliente.setAp2(in.next());
		System.out.println("Nuevo carnet");
		cliente.setCarnet(in.next());
		System.out.println("Nueva tarjeta de cliente");
		cliente.setTarj_cliente(in.next());
	}
	/**
	 * Modifica un objeto Oficina
	 * @param oficina
	 */
	
	public void modificarOficina(Oficina oficina) {
		Scanner in = new Scanner ( System.in );
		
		System.out.println("Nueva descripción");
		oficina.setDescripcion(in.next());
		System.out.println("Nueva Localidad");
		oficina.setLocalidad(in.next());
		System.out.println("Nueva Provincia");
		oficina.setProvincia(in.next());
		System.out.println("Aeropuerto o no");
		oficina.setAreopuerto_no(in.nextBoolean());
		System.out.println("Nuevo empleado");
		oficina.setEmpleado(in.next());
		
	}
	/**
	 * Modifica un objeto Alquiler
	 * @param alquiler
	 */
	public void modificarAlquiler(Alquiler alquiler) {
		Scanner in = new Scanner ( System.in );
		
		System.out.println("Modifica el vehículo");
		alquiler.setVehiculoalq(CreaEntidades.CreaCochecomb());
		System.out.println("Modificar el empleado que vendió el vehículo");
		alquiler.setEmpleadovend(CreaEntidades.CreaEmpleado());
		System.out.println("Modificar el cliente que compró el vehículo");
		alquiler.setClientecomp(CreaEntidades.CreaCliente());
		System.out.println("Modificar fecha inicio");
		alquiler.setFecha_inicio(in.next());
		System.out.println("Modificar fecha fin");
		alquiler.setFecha_fin(in.next());
		System.out.println("Modificar la oficina");
		alquiler.setOficina(CreaEntidades.creaOficina());
	}
	/**
	 * Modifica un objeto Categoría
	 * @param categoria
	 */
	public void modificaCategoria(Categoria categoria) {
		Scanner in = new Scanner ( System.in );
		
		System.out.println("Nuevo código");
		categoria.setCodigo(in.next());
		System.out.println("Nueva descripción");
		categoria.setDescripcion(in.next());
		System.out.println("Nuevo porcentaje");
		categoria.setPorcentaje(in.nextInt());

	}


	
	
	
	
	
	
	

	
	
	
	
	
}

