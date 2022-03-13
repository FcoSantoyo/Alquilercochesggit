package entidades;

public class Cliente extends Persona {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String tarj_cliente;
	
//Las propiedades de la clase de la que hereda
	
public Cliente (String dni,String nombre,String ap1,String ap2,String carnet) {
		super(dni,nombre,ap1,ap2,carnet);
		this.setTarj_cliente(tarj_cliente);

}

//Constructores
public Cliente() {
	
}
/**
 * Constructor para crear un objeto cliente
 * @param dni
 * @param nombre
 * @param ap1
 * @param ap2
 * @param carnet
 * @param tarj_cliente
 */
public Cliente(String dni, String nombre, String ap1, String ap2, String carnet, String tarj_cliente) {
	// TODO Auto-generated constructor stub
}
//Constructor de copia
public Cliente(Cliente o) {

	this.setDni(o.getDni());
	this.setNombre(o.getNombre());
	this.setAp1(o.getAp1());
	this.setAp2(o.getAp2());
	this.setCarnet(o.getCarnet());
	this.setTarj_cliente(o.getTarj_cliente());
}


//Getters y setters

public String getTarj_cliente() {
	return tarj_cliente;
}

public void setTarj_cliente(String tarj_cliente) {
	this.tarj_cliente = tarj_cliente;
}

@Override
public int compareTo(Persona o) {
	// TODO Auto-generated method stub
	return 0;
}
public String toString() 
{
return ("DNI: "+dni+" Nombre: "+nombre+" Apellido 1: "+ap1+" Apellido 2: "+ap2+" carnet de conducir: "+carnet+" Tarjeta de cliente: "+tarj_cliente);
}

}
