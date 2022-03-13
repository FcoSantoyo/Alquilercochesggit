package entidades;

import java.text.ParseException;
import java.util.Date;
import java.util.GregorianCalendar;

public class Alquiler {

	private Vehiculo vehiculoalq; //vehiculo alquilao
	private Empleado empleadovend; //empleado que hace la entrega
	private Cliente clientecomp; //Cliente que ha alquilado el coche
	private String fecha_inicio;
	private String fecha_fin;
	private Oficina oficina; //Oficina donde se entrega
	private double importe;
	
	
	//Constructores
	public Alquiler(Vehiculo vehiculoalq, Empleado empleadovend, Cliente clientecomp, Date fecha_inicio, Date fecha_fin, Oficina oficina, double importe) {
		
	}
	/**
	 * Constructor para crear un objeto Alquiler.
	 * @param vehiculoalq
	 * @param empleadovend
	 * @param clientecomp
	 * @param fecha_inicio
	 * @param fecha_fin
	 */
	public Alquiler(Vehiculo vehiculoalq,Empleado empleadovend,Cliente clientecomp,String fecha_inicio,String fecha_fin)
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
	public String getFecha_inicio() {
		return fecha_inicio;
	}
	public void setFecha_inicio(String fecha_inicio) {
		this.fecha_inicio = fecha_inicio;
	}
	public String getFecha_fin() {
		return fecha_fin;
	}
	public void setFecha_fin(String fecha_fin) {
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
	
	
	public static int Calculaimporte(Vehiculo vehiculo,Alquiler alq) throws Exception {
		int diferencia= Fechas.DiferenciaEnDias(Fechas.ManejoFechas(alq.getFecha_fin()),Fechas.ManejoFechas(alq.getFecha_inicio()));
		int pfinal=(vehiculo.getPrecioalquiler())*(diferencia);
		return pfinal;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
