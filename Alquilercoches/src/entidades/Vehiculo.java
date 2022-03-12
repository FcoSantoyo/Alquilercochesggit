package entidades;
import java.io.Serializable;
import java.util.GregorianCalendar;

public abstract class Vehiculo implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected String bastidor;
	protected String color;
	protected Fechas fecha_adquisicion;
	protected Double kms;
	protected Categoria categoria;
	protected Cliente comprador; //el cliente
	protected double precioalquiler;
	protected Oficina oficina;
	

//Constructores
	
public Vehiculo() {
}

public Vehiculo(String matricula,String marca,String modelo,String bastidor,String color,Fechas fecha_adquisicion,Double kms,Categoria categoria,Cliente comprador,Double precioalquiler,Oficina oficina)
{
	this.setMatricula(matricula);
	this.setMarca(marca);
	this.setModelo(modelo);
	this.setBastidor(bastidor);
	this.setColor(color);
	this.setFecha_adquisicion(fecha_adquisicion);
	this.setKms(kms);
	this.setComprador(comprador);
	this.setPrecioalquiler(precioalquiler);
	this.setOficina(oficina);
}
public Vehiculo(String matricula,String marca,String modelo,String bastidor,String color,GregorianCalendar fecha_adquisicion,Double kms,Categoria categoria,Cliente comprador,Double precioalquiler)
{
	this.setMatricula(matricula);
	this.setMarca(marca);
	this.setModelo(modelo);
	this.setBastidor(bastidor);
	this.setColor(color);
	this.setFecha_adquisicion(fecha_adquisicion);
	this.setKms(kms);
	this.setComprador(comprador);
	this.setPrecioalquiler(precioalquiler);
}


//Constructores de copia
public Vehiculo(Vehiculo o)
{
	this.setMatricula(o.getMatricula());
	this.setMarca(o.getMarca());
	this.setModelo(o.getModelo());
	this.setBastidor(o.getBastidor());
	this.setColor(o.getColor());
	this.setFecha_adquisicion(o.getFecha_adquisicion());
	this.setKms(o.getKms());
	this.setComprador(o.getComprador());
	this.setPrecioalquiler(o.getPrecioalquiler());
	this.setOficina(o.getOficina());
}

//getters y setters


public String getMarca() {
	return marca;
}


public void setMarca(String marca) {
	this.marca = marca;
}


public String getModelo() {
	return modelo;
}


public void setModelo(String modelo) {
	this.modelo = modelo;
}


public String getBastidor() {
	return bastidor;
}


public void setBastidor(String bastidor) {
	this.bastidor = bastidor;
}


public String getColor() {
	return color;
}


public void setColor(String color) {
	this.color = color;
}


public String getMatricula() {
	return matricula;
}


public void setMatricula(String matricula) {
	if (metodos.Validadores.comprobarMatricula(matricula))
	this.matricula = matricula;
}


public Double getKms() {
	return kms;
}


public void setKms(Double kms) {
	this.kms = kms;
}

public Cliente getComprador() {
	return comprador;
}

public void setComprador(Cliente comprador) {
	this.comprador = comprador;
}

public double getPrecioalquiler() {
	return precioalquiler;
}

public void setPrecioalquiler(double precioalquiler) {
	this.precioalquiler = precioalquiler;
}

public Fechas getFecha_adquisicion() {
	return fecha_adquisicion;
}

public void setFecha_adquisicion(Fechas fecha_adquisicion) {
	this.fecha_adquisicion = fecha_adquisicion;
}

public Categoria getCategoria() {
	return categoria;
}

public void setCategoria(Categoria categoria) {
	this.categoria = categoria;
}

public Oficina getOficina() {
	return oficina;
}

public void setOficina(Oficina oficina) {
	this.oficina = oficina;
}

//Métodos

@Override
public String toString() 
{
return ("Matrícula: "+matricula+" Marca "+marca+" Modelo: "+modelo+" Bastidor: "+bastidor+" Color: "+color+" Fecha de adquisición: "+fecha_adquisicion+" Kilómetros recorridos: "+kms+" Categoria: "+categoria+" Comprador: "+comprador+" Precio de alquiler: "+precioalquiler+" Oficina donde se encuentra el vehiculo: "+oficina);	
}


//Método polimórfico
public  abstract void PrecioAlquiler();

//(fecha inicio(dias hasta)fecha fin* preciovehiculoxdia)+15%'en electricos, algunos vehiculos sera más(incremento de la categoria' y si es oficina de aeropuesto un 10% más

}





//


