package entidades;

import java.util.GregorianCalendar;

public class Devolucion {
	private double kms_recorridos;
	private GregorianCalendar devolucionreal;
	private Empleado empleadodev;
	
	//Constructores
	public Devolucion()
	{
		
	}
	
	public Devolucion(double kms_recorridos,GregorianCalendar devolucionreal,Empleado empleadodev)
	{
		this.setKms_recorridos(kms_recorridos);
		this.setDevolucionreal(devolucionreal);
		this.setEmpleadodev(empleadodev);
	}
	
	//Constructor de copia
	
	public Devolucion(Devolucion o)
	{
		this.setKms_recorridos(o.getKms_recorridos());
		this.setDevolucionreal(o.getDevolucionreal());
		this.setEmpleadodev(o.getEmpleadodev());
	}
	
	//Getters y setters
	public double getKms_recorridos() {
		return kms_recorridos;
	}
	public void setKms_recorridos(double kms_recorridos) {
		this.kms_recorridos = kms_recorridos;
	}
	public GregorianCalendar getDevolucionreal() {
		return devolucionreal;
	}
	public void setDevolucionreal(GregorianCalendar devolucionreal) {
		this.devolucionreal = devolucionreal;
	}
	public Empleado getEmpleadodev() {
		return empleadodev;
	}
	public void setEmpleadodev(Empleado empleadodev) {
		this.empleadodev = empleadodev;
	}











	
	
	
	


}
















