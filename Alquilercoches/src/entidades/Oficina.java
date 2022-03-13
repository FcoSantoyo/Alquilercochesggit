package entidades;
import java.io.Serializable;

public class Oficina implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String descripcion;
	private String localidad;
	private String provincia;
	private boolean areopuerto_no; //lo pongo int para poner un 1 si es de aeropuesto y un 2 si no lo es
	private String empleado; //esto creo que si podria ser arraylist
	
	//Constructores
	public Oficina() {
		
	}
	/**
	 * Constructor que crea un objeto Oficina
	 * @param descripcion
	 * @param localidad
	 * @param provincia
	 * @param aeropuerto_no
	 * @param empleado
	 */
	public Oficina(String descripcion,String localidad,String provincia,boolean aeropuerto_no,String empleado) {
		this.setDescripcion(descripcion);
		this.setLocalidad(localidad);
		this.setProvincia(provincia);
		this.setAreopuerto_no(aeropuerto_no);
		this.setEmpleado(empleado);
	}
	
	//Constructor de copia
	public Oficina(Oficina o)
	{
		this.setDescripcion(o.getDescripcion());
		this.setLocalidad(o.getLocalidad());
		this.setProvincia(o.getProvincia());
		this.setAreopuerto_no(o.getAreopuerto_no());
		this.setEmpleado(o.getEmpleado());
	}
	
	
	public Oficina(String localidad2, String provincia2, int aeropuerto_no, String empleado2) {
		// TODO Auto-generated constructor stub
	}

	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getLocalidad() {
		return localidad;
	}
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public boolean getAreopuerto_no() {
		return areopuerto_no;
	}
	public void setAreopuerto_no(boolean areopuerto_no) {
		this.areopuerto_no = areopuerto_no;
	}
	public String getEmpleado() {
		return empleado;
	}
	public void setEmpleado(String empleado) {
		this.empleado = empleado;
	}	
	
		//Metodos
		public String toString() 
		{
		return ("Descripcion: "+descripcion+" Localidad: "+localidad+" Provincia: "+provincia+" Esta oficina está en aeropuerto o no: "+areopuerto_no+" Empleado: "+empleado);	
		}
		





		 

}
