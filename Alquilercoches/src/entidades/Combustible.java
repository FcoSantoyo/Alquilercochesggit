package entidades;

import java.util.GregorianCalendar;

public abstract class Combustible extends Vehiculo {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected double consumo;
	protected int potencia;
	protected String emisiones;

	//Propiedades heredadas
	public Combustible(String matricula,String marca,String modelo,String bastidor,String color,GregorianCalendar fecha_adquisicion,Double kms,Categoria categoria,Cliente comprador,Double precioalquiler,Oficina oficina) {
		super(matricula,marca,modelo,bastidor,color,fecha_adquisicion,kms,categoria,comprador,precioalquiler,oficina);
		this.setConsumo(consumo);
		this.setPotencia(potencia);
		this.setEmisiones(emisiones);
	}
	
	public Combustible() {
		
	}
	//Constructor de copia
	public Combustible(Combustible o)
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
	}
	
	
	//Getters y Setters
	public double getConsumo() {
		return consumo;
	}

	public void setConsumo(double consumo) {
		this.consumo = consumo;
	}

	public int getPotencia() {
		return potencia;
	}

	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}

	public String getEmisiones() {
		return emisiones;
	}

	public void setEmisiones(String emisiones) {
		this.emisiones = emisiones;
	}
	
	
	
	
	
	
	
	

	

	
	
	
	
}

