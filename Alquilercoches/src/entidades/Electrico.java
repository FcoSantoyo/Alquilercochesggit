package entidades;

import java.util.GregorianCalendar;

public abstract class Electrico extends Vehiculo{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected double autonomia;
	protected int tiemporecarga;

//Constructor con Propiedades heredadas
	public Electrico(String matricula,String marca,String modelo,String bastidor,String color,GregorianCalendar fecha_adquisicion,Double kms,Categoria categoria,Cliente comprador,Double precioalquiler,Oficina oficina) {
		super(matricula,marca,modelo,bastidor,color,fecha_adquisicion,kms,categoria,comprador,precioalquiler,oficina); 
	this.setAutonomia(autonomia);
	this.setTiemporecarga(tiemporecarga);
	}
	
 public Electrico() {
	 
 }
//constructor de copia
	public Electrico(Electrico o)
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
	}

	
	
	
	

//Getters y Setters
	
	public double getAutonomia() {
		return autonomia;
	}


	public void setAutonomia(double autonomia) {
		this.autonomia = autonomia;
	}


	public int getTiemporecarga() {
		return tiemporecarga;
	}


	public void setTiemporecarga(int tiemporecarga) {
		this.tiemporecarga = tiemporecarga;
	}
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
}