package entidades;

import java.util.GregorianCalendar;

public class Empleado extends Persona {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Fechas fecha_alta; //fecha de alta en la empresa
	private String oficina; //La oficina donde trabaja
	
//Las propiedades de la clase de la que hereda
	
public Empleado(String dni,String nombre,String ap1,String ap2,String carnet) {
	super(dni,nombre,ap1,ap2,carnet);
	this.setFecha_alta(fecha_alta);
	this.setOficina(oficina);
}
//Constructores
public Empleado() {
	
}
public Empleado(String dni, String nombre, String ap1, String ap2, String carnet, Fechas fecha_alta,String oficina2) {
	// TODO Auto-generated constructor stub
}

//Constructor de copia
public Empleado(Empleado o) {

	this.setDni(o.getDni());
	this.setNombre(o.getNombre());
	this.setAp1(o.getAp1());
	this.setAp2(o.getAp2());
	this.setCarnet(o.getCarnet());
	this.setFecha_alta(o.getFecha_alta());
	this.setOficina(o.getOficina());
}
		
	
//Getters y Setters

public Fechas getFecha_alta() {
	return fecha_alta;
}

public void setFecha_alta(Fechas fecha_alta) {
	this.fecha_alta = fecha_alta;
}

public String getOficina() {
	return oficina;
}

public void setOficina(String oficina) {
	this.oficina = oficina;
}
@Override
public int compareTo(Persona o) {
	// TODO Auto-generated method stub
	return 0;
}

@Override
public String toString() 
{
return ("DNI: "+dni+" Nombre: "+nombre+" Apellido 1: "+ap1+" Apellido 2: "+ap2+" carnet de conducir: "+carnet+" Fecha de alta en la empresa: "+fecha_alta+" Oficina en la que trabaja: "+oficina);	
}
}


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

