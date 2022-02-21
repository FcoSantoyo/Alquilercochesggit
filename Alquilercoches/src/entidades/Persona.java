package entidades;

import java.util.Objects;

//Propiedades de persona
public class Persona implements Comparable{
	private String dni;
	private String nombre;
	private String ap1;
	private String ap2;
	
//Comparadores
public static final herramientasinterfaces.comparadorPersonaDNI COMPARADORDNI=new comparadordni();

//Constructores

public Persona(String dni,String nombre,String ap1,String ap2)
{
	this.setDni(dni);
	this.setNombre(nombre);
	this.setAp1(ap1);
	this.setAp2(ap2);
}

public Persona(String dni,String nombre,String ap1)
{
	this.setDni(dni);
	this.setNombre(nombre);
	this.setAp1(ap1);
}

public Persona(String dni)
{
	this.setDni(dni);
}

//Constructor de copia
public Persona(Persona o)
{
	this.setDni(o.getDni());
	this.setNombre(o.getNombre());
	this.setAp1(o.getAp1());
	this.setAp2(o.getAp2());
}

//Getters y Setters
public String getDni() {
	return dni;
}

public void setDni(String dni) {
	this.dni = dni;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getAp1() {
	return ap1;
}

public void setAp1(String ap1) {
	this.ap1 = ap1;
}

public String getAp2() {
	return ap2;
}

public void setAp2(String ap2) {
	this.ap2 = ap2;
}


//Metodos de persona
@Override
public String toString() 
{
return ("DNI: "+dni+" Nombre: "+nombre+" Apellido 1: "+ap1+" Apellido 2: "+ap2);	
}

public String Nombrecompleto()
{
	return ap1+" "+ap2+" "+nombre;
}




@Override
public int hashCode() {
	return Objects.hash(ap1, ap2, dni, nombre);
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Persona other = (Persona) obj;
	return Objects.equals(ap1, other.ap1) && Objects.equals(ap2, other.ap2) && Objects.equals(dni, other.dni)
			&& Objects.equals(nombre, other.nombre);
}
@Override
public int compareTo(Object o) 
{
	//casting (darle forma al objeto)
	Persona a = (Persona)o;
	
	return this.Nombrecompleto().compareToIgnoreCase(a.Nombrecompleto());
	
}


}