package entidades;

import java.util.GregorianCalendar;

public class Furgoneta extends Combustible{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Double carga;
	private String carnet;
	
	//Propiedades heredadas
			public Furgoneta(String matricula,String marca,String modelo,String bastidor,String color,GregorianCalendar fecha_adquisicion,Double kms,Categoria categoria,Cliente comprador,Double precioalquiler,Oficina oficina,double consumo,int potencia,String emisiones) {
				super(matricula,marca,modelo,bastidor,color,fecha_adquisicion,kms,categoria,comprador,precioalquiler,oficina);
				this.setCarga(carga);
				this.setCarnet(carnet);
			}



public Furgoneta() {
	
}
public Furgoneta(String matricula, String marca, String modelo, String bastidor, String color,
		GregorianCalendar fecha_adquisicion, Double kms, Categoria categoria, String comprador, double precioalquiler,
		Oficina oficina, double consumo, int potencia, String emisiones, Double carga2, String carnet2) {

}
//Constructor de copia
public Furgoneta(Furgoneta o)
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
	this.setCarga(o.getCarga());
	this.setCarnet(o.getCarnet());
}
	
public Furgoneta(String matricula, String marca, String modelo, String bastidor, String color,
		GregorianCalendar fecha_adquisicion, Double kms, Categoria categoria, Cliente comprador, double precioalquiler,
		Oficina oficina, double consumo, int potencia, String emisiones, Double carga, String carnet) {
	// TODO Auto-generated constructor stub
}



//Getters y setters
public Double getCarga() {
	return carga;
}

public void setCarga(Double carga) {
	this.carga = carga;
}

public String getCarnet() {
	return carnet;
}

public void setCarnet(String carnet) {
	this.carnet = carnet;
}


@Override
public String toString() 
{
return ("Matrícula: "+matricula+" Marca "+marca+" Modelo: "+modelo+" Bastidor: "+bastidor+" Color: "+color+" Fecha de adquisición: "+fecha_adquisicion+" Kilómetros recorridos: "+kms+" Categoria: "+categoria+" Comprador: "+comprador+" Precio de alquiler: "+precioalquiler+" Oficina donde se encuentra el vehiculo: "+oficina+" Consumo: "+consumo+" Potencia: "+potencia+" Emisiones: "+emisiones+" Carga permitida: "+carga+" Carnet: "+carnet);	
}
}
