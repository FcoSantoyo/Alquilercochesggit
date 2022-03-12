
package entidades;

import java.util.GregorianCalendar;

public class Moto extends Electrico{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int cilindrada;
	private String carnet;




	//Constructor con Propiedades heredadas
	public Moto(String matricula,String marca,String modelo,String bastidor,String color,Fechas fecha_adquisicion,Double kms,Categoria categoria,Cliente comprador,Double precioalquiler,Oficina oficina,Double autonomia,int tiemporecarga) {
		super(matricula,marca,modelo,bastidor,color,fecha_adquisicion,kms,categoria,comprador,precioalquiler,oficina); 
		this.setCilindrada(cilindrada);
		this.setCarnet(carnet);
	}

	//Constructor vacío
	public Moto() {

	}
	public Moto(String matricula, String marca, String modelo, String bastidor, String color,
			Fechas fecha_adquisicion, Double kms, Categoria categoria, Cliente comprador,
			double precioalquiler, Oficina oficina, double autonomia, int tiemporecarga, int cilindrada2,
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
	public void PrecioAlquiler() {
		// TODO Auto-generated method stub
		
	}	
		
		
		
		
		

		
}
