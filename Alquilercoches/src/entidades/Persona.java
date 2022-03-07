package entidades;
import java.io.Serializable;
import java.util.Objects;
import metodos.Validadores;

//Propiedades de persona 
public abstract class Persona implements Comparable<Persona>,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected  String dni;
	protected  String nombre;
	protected String ap1;
	protected  String ap2;
	protected  String carnet;
	
//Constructores

public Persona() {
	
}

public Persona(String dni,String nombre,String ap1,String ap2,String carnet)
{
	this.setDni(dni);
	this.setNombre(nombre);
	this.setAp1(ap1);
	this.setAp2(ap2);
	this.setCarnet(carnet);
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
	this.setCarnet(o.getCarnet());
}

//Getters y Setters
public String getDni() {
	return dni;
}

public void setDni(String dni) {
	if (Validadores.validaDNI(dni))
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


public String getCarnet() {
	return carnet;
}

public void setCarnet(String carnet) {
	this.carnet = carnet;
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
public int compareTo(Persona o) {
    Persona persona = (Persona)o;       

    if(this.ap1.compareToIgnoreCase(persona.ap1) == 0) {           
        if(this.nombre.compareToIgnoreCase(persona.nombre) == 0) {
            return this.dni.compareTo(persona.dni);
        } else {
            return this.nombre.compareToIgnoreCase(persona.nombre);
        }
    } else {
        return this.ap1.compareToIgnoreCase(persona.ap1);
    }       

}
}        



