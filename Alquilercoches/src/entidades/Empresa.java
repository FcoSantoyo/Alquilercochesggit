package entidades;
import java.io.Serializable;
import java.util.TreeMap;

import grabardatos.CreaEntidades;

public class Empresa implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private TreeMap<Empleado,String> Empleado = new TreeMap<Empleado,String>();
	private TreeMap<Cliente,String> Cliente = new TreeMap<Cliente,String>();
	private TreeMap<Vehiculo,String> Vehiculo = new TreeMap<Vehiculo,String>();
	private TreeMap<Oficina,String> Oficina = new TreeMap<Oficina,String>();
	private TreeMap<Alquiler,Vehiculo> Alquiler = new TreeMap<Alquiler,Vehiculo>();
	private TreeMap <Categoria,String> Categoria = new TreeMap<Categoria,String>();
	
	//Constructores
	public Empresa() {
		
	}
	
	public Empresa(TreeMap<Empleado,String> Empleado,TreeMap<Cliente,String> Cliente,TreeMap<Vehiculo,String> Vehiculo,TreeMap<Oficina,String> Oficina,TreeMap<Categoria,String> Categoria,TreeMap<Alquiler,Vehiculo> Alquiler)
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
	
	public TreeMap<Empleado, String> getEmpleado() {
		return Empleado;
	}
	public void setEmpleado(TreeMap<Empleado, String> empleado) {
		Empleado = empleado;
	}
	public TreeMap<Cliente, String> getCliente() {
		return Cliente;
	}
	public void setCliente(TreeMap<Cliente, String> cliente) {
		Cliente = cliente;
	}
	public TreeMap<Vehiculo, String> getVehiculo() {
		return Vehiculo;
	}
	public void setVehiculo(TreeMap<Vehiculo, String> vehiculo) {
		Vehiculo = vehiculo;
	}
	public TreeMap<Oficina, String> getOficina() {
		return Oficina;
	}
	public void setOficina(TreeMap<Oficina, String> oficina) {
		Oficina = oficina;
	}
	
	public TreeMap<Alquiler, Vehiculo> getAlquiler() {
		return Alquiler;
	}

	public void setAlquiler(TreeMap<Alquiler, Vehiculo> alquiler) {
		Alquiler = alquiler;
	}

	public TreeMap<Categoria, String> getCategoria() {
		return Categoria;
	}
	public void setCategoria(TreeMap<Categoria, String> categoria) {
		Categoria = categoria;
	}

	public void getVehiculo(TreeMap<Vehiculo,String> vehiculo) {
		// TODO Auto-generated method stub
		
	}

	
	//Metodos
	
	//Añadir 
	public  void añadeCochecomb(Empresa Empresa) {
		Cochecomb a;
		a=CreaEntidades.CreaCochecomb();
		Empresa.getVehiculo().put(a,a.getMatricula());
	}
	
	public static void añadeCochelec(Empresa Empresa) {
		Cochelec a;
		a=CreaEntidades.CreaCochelec();
		Empresa.getVehiculo().put(a,a.getMatricula());
	}
	
	public static void añadeFurgoneta(Empresa Empresa) {
		Furgoneta a;
		a=CreaEntidades.CreaFurgoneta();
		Empresa.getVehiculo().put(a,a.getMatricula());
	}
	
	public static void añadeMoto(Empresa Empresa) {
		Moto a;
		a=CreaEntidades.CreaMoto();
		Empresa.getVehiculo().put(a,a.getMatricula());
	}
	
	//Modificar
	
	
	
	
	

	
	
	
	
	
	
	

	
	
	
	
	
}

