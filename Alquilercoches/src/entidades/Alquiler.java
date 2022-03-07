package entidades;

import java.util.GregorianCalendar;

public class Alquiler {

	private Vehiculo vehiculoalq; //vehiculo alquilao
	private Empleado empleadovend; //empleado que hace la entrega
	private Cliente clientecomp; //Cliente que ha alquilado el coche
	private GregorianCalendar fecha_inicio;
	private GregorianCalendar fecha_fin;
	private Oficina oficina; //Oficina donde se entrega
	private double importe;
	
	
	//Constructores
	public Alquiler() {
		
	}
	
	public Alquiler(Vehiculo vehiculoalq,Empleado empleadovend,Cliente clientecomp,GregorianCalendar fecha_inicio,GregorianCalendar fecha_fin)
	{
		this.setVehiculoalq(vehiculoalq);;
		this.setEmpleadovend(empleadovend);
		this.setClientecomp(clientecomp);
		this.setFecha_inicio(fecha_inicio);
		this.setFecha_fin(fecha_fin);
		this.setOficina(oficina);
		this.setImporte(importe);
	}
	
	//Constructor de copia
	public Alquiler(Alquiler o)
	{
		this.setVehiculoalq(o.getVehiculoalq());
		this.setEmpleadovend(o.getEmpleadovend());
		this.setClientecomp(o.getClientecomp());
		this.setFecha_inicio(o.getFecha_inicio());
		this.setFecha_fin(o.fecha_fin);
		this.setOficina(o.getOficina());
		this.setImporte(o.getImporte());
	}
		
	//Getters y setters
	public Empleado getEmpleadovend() {
		return empleadovend;
	}
	public void setEmpleadovend(Empleado empleadovend) {
		this.empleadovend = empleadovend;
	}
	public Cliente getClientecomp() {
		return clientecomp;
	}
	public void setClientecomp(Cliente clientecomp) {
		this.clientecomp = clientecomp;
	}
	public Vehiculo getVehiculoalq() {
		return vehiculoalq;
	}
	public void setVehiculoalq(Vehiculo vehiculoalq) {
		this.vehiculoalq = vehiculoalq;
	}
	public GregorianCalendar getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(GregorianCalendar fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public GregorianCalendar getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(GregorianCalendar fecha_fin) {
		this.fecha_fin = fecha_fin;
	}
	public Oficina getOficina() {
		return oficina;
	}
	public void setOficina(Oficina oficina) {
		this.oficina = oficina;
	}
	public double getImporte() {
		return importe;
	}
	public void setImporte(double importe) {
		this.importe = importe;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
