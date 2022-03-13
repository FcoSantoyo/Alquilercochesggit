
package entidades;

import java.util.Date;
import java.util.GregorianCalendar;

public class Moto extends Electrico{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cilindrada;
	private String carnet;




	//Constructor con Propiedades heredadas
	public Moto(String matricula,String marca,String modelo,String bastidor,String color,String fecha_adquisicion,Double kms,Categoria categoria,Cliente comprador,int precioalquiler,Oficina oficina,Double autonomia,int tiemporecarga) {
		super(matricula,marca,modelo,bastidor,color,fecha_adquisicion,kms,categoria,comprador,precioalquiler,oficina); 
		this.setCilindrada(cilindrada);
		this.setCarnet(carnet);
	}

	//Constructor vacío
	public Moto() {

	}
	public Moto(String matricula, String marca, String modelo, String bastidor, String color,
			Date fecha_adquisicion, Double kms, Categoria categoria, Cliente comprador,
			int precioalquiler, Oficina oficina, double autonomia, int tiemporecarga, int cilindrada2,
			String carnet2) {
		
	}

	//constructor de copia
	public Moto(Moto o)
	{
		this.setMatricula(getMatricula());
		this.setMarca(o.getMarca());
		this.setModelo(o.getModelo());
		this.setBastidor(o.getBastidor());
		this.setColor(o.getColor());
		this.setFecha_adquisicion(o.getFecha_adquisicion());
		this.setKms(o.getKms());
		this.setComprador(o.getComprador());
		this.setPrecioalquiler(o.getPrecioalquiler());
		this.setOficina(o.getOficina());
		this.setAutonomia(o.getAutonomia());
		this.setTiemporecarga(o.getTiemporecarga());
		this.setCilindrada(o.getCilindrada());
		this.setCarnet(o.getCarnet());
	}		

	// Getters and setters
	public int getCilindrada() {
		return cilindrada;
	}




	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}




	public String getCarnet() {
		return carnet;
	}




	public void setCarnet(String carnet) {
		this.carnet = carnet;
	}

	//Métodos

	@Override
	public String toString() 
	{
	return ("Matrícula: "+matricula+" Marca "+marca+" Modelo: "+modelo+" Bastidor: "+bastidor+" Color: "+color+" Fecha de adquisición: "+fecha_adquisicion+" Kilómetros recorridos: "+kms+" Categoria: "+categoria+" Comprador: "+comprador+" Precio de alquiler: "+precioalquiler+" Oficina donde se encuentra el vehiculo: "+oficina+" Autonomia: "+autonomia+" Tiempo de recarga: "+tiemporecarga+" Cilindrada: "+cilindrada+" Carnet requerido: "+carnet);	
	}

	@Override
	/**
	 * Método para calcular el precio de alquiler de un vehículo
	 */
	public int PrecioAlquiler() {
		int precioalquiler= this.precioalquiler;
		int porcentaje= 15;
		int recargo=0;
		int precio;
		
		precio = precioalquiler + (porcentaje*precioalquiler)/100;
		
		recargo= this.getCategoria().getPorcentaje();
		recargo= (recargo*precioalquiler)/100; //para obtener el porcentaje de recargo de la categoria
		precio += recargo;
		if (this.getOficina().getAreopuerto_no())
		{
			precio +=(precioalquiler*10)/100;
		}
		return precio;
	}
		
		
		
		
		

		
}
