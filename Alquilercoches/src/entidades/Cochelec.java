package entidades;

import java.util.Date;
import java.util.GregorianCalendar;

public class Cochelec extends Electrico{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num_plazas;
	private String tipo;

	//Constructor con Propiedades heredadas
	public Cochelec(String matricula,String marca,String modelo,String bastidor,String color,String fecha_adquisicion,Double kms,Categoria categoria,Cliente comprador,int precioalquiler,Oficina oficina,Double autonomia,int tiemporecarga) {
		super(matricula,marca,modelo,bastidor,color,fecha_adquisicion,kms,categoria,comprador,precioalquiler,oficina); 
		this.setNum_plazas(num_plazas);
		this.setTipo(tipo);
	}




	//Constructor vacío
	public Cochelec() {

	}
	/**
	 * Constructor para crear un coche eléctrico
	 * @param matricula
	 * @param marca
	 * @param modelo
	 * @param bastidor
	 * @param color
	 * @param fecha_adquisicion
	 * @param kms
	 * @param categoria
	 * @param comprador
	 * @param precioalquiler
	 * @param oficina
	 * @param autonomia
	 * @param tiemporecarga
	 * @param num_plazas2
	 * @param tipo2
	 */
	public Cochelec(String matricula, String marca, String modelo, String bastidor, String color,
			Date fecha_adquisicion, Double kms, Categoria categoria, Cliente comprador,
			double precioalquiler, Oficina oficina, Double autonomia, int tiemporecarga, int num_plazas2,
			String tipo2) {
		
	}
	//constructor de copia
	public Cochelec(Cochelec o)
	{
		this.setMatricula(getMatricula());
		this.setMarca(o.getMarca());
		this.setModelo(o.getModelo());
		this.setBastidor(o.getBastidor());
		this.setColor(o.getColor());
		this.setFecha_adquisicion(o.getFecha_adquisicion());
		this.setKms(o.getKms());
		this.setCategoria(o.getCategoria());
		this.setComprador(o.getComprador());
		this.setPrecioalquiler(o.getPrecioalquiler());
		this.setOficina(o.getOficina());
		this.setAutonomia(o.getAutonomia());
		this.setTiemporecarga(o.getTiemporecarga());
		this.setNum_plazas(o.getNum_plazas());
		this.setTipo(o.getTipo());
	}		

	//Getters y Setters
	public int getNum_plazas() {
		return num_plazas;
	}

	public void setNum_plazas(int num_plazas) {
		this.num_plazas = num_plazas;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	
	@Override
	public String toString() 
	{
	return ("Matrícula: "+matricula+" Marca "+marca+" Modelo: "+modelo+" Bastidor: "+bastidor+" Color: "+color+" Fecha de adquisición: "+fecha_adquisicion+" Kilómetros recorridos: "+kms+" Categoria: "+categoria+" Comprador: "+comprador+" Precio de alquiler: "+precioalquiler+" Oficina donde se encuentra el vehiculo: "+oficina+" Autonomia: "+autonomia+"Tiempo de recarga: "+tiemporecarga+" Número de plazas: "+num_plazas+" Tipo: "+tipo);	
	}



	/**
	 * Método para calcular el precio de alquiler de un vehículo
	 */
	@Override
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
