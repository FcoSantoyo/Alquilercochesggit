package entidades;

import java.util.Date;
import java.util.GregorianCalendar;

public class Cochecomb extends Combustible{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int num_plazas;
	private String tipo;

	//Propiedades heredadas
	public Cochecomb(String matricula,String marca,String modelo,String bastidor,String color,String fecha_adquisicion,Double kms,Categoria categoria,Cliente comprador,int precioalquiler,Oficina oficina,double consumo,int potencia,String emisiones) {
		super(matricula,marca,modelo,bastidor,color,fecha_adquisicion,kms,categoria,comprador,precioalquiler,oficina);
		this.setNum_plazas(num_plazas);
		this.setTipo(tipo);
	}
	
	//Constructor vacio
	public Cochecomb() {

	}
	/**
	 * Constructor para crear un coche de combustible
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
	 * @param consumo
	 * @param potencia
	 * @param emisiones
	 * @param num_plazas2
	 * @param tipo2
	 */
	public Cochecomb(String matricula, String marca, String modelo, String bastidor, String color,
			Date fecha_adquisicion, Double kms, Categoria categoria, Cliente comprador,
			double precioalquiler, Oficina oficina, Double consumo, int potencia, String emisiones, int num_plazas2,
			String tipo2) {
		
	}

	//Constructor de copia
	public Cochecomb(Cochecomb o)
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
		this.setConsumo(getConsumo());
		this.setPotencia(getPotencia());
		this.setEmisiones(getEmisiones());
		this.setNum_plazas(o.getNum_plazas());
		this.setTipo(tipo);
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

	/**
	 * Metodo que devuelve una cadena de texto.
	 */
	@Override
	public String toString() 
	{
	return ("Matrícula: "+matricula+" Marca "+marca+" Modelo: "+modelo+" Bastidor: "+bastidor+" Color: "+color+" Fecha de adquisición: "+fecha_adquisicion+" Kilómetros recorridos: "+kms+" Categoria: "+categoria+" Comprador: "+comprador+" Precio de alquiler: "+precioalquiler+" Oficina donde se encuentra el vehiculo: "+oficina+ "Consumo: "+consumo+" Potencia: "+potencia+" Emisiones: "+emisiones+" Número de plazas: "+num_plazas+" Tipo: "+tipo);	
	}

	@Override
	/**
	 * Método para calcular el precio de alquiler de un vehículo
	 */
	public int PrecioAlquiler() {
		int precioalquiler= this.precioalquiler;
		int porcentaje= 0;
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
