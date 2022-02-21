package entidades;

public class Vehiculo {
	private int id;
	private String marca;
	private String modelo;
	private String bastidor;
	private String color;
	private String matricula;
	private Double kms;


//Constructores
public Vehiculo(int id,String marca,String modelo,String bastidor,String color,String matricula,Double kms)
{
	this.setId(id);
	this.setMarca(marca);
	this.setModelo(modelo);
	this.setBastidor(bastidor);
	this.setColor(color);
	this.setMatricula(matricula);
	this.setKms(kms);
}

//Constructor de copia
public Vehiculo(Vehiculo o)
{
	this.setId(o.getId());
	this.setMarca(o.getMarca());
	this.setModelo(o.getModelo());
	this.setBastidor(o.getBastidor());
	this.setColor(o.getColor());
	
}

//getters y setters
public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


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
	this.matricula = matricula;
}


public Double getKms() {
	return kms;
}


public void setKms(Double kms) {
	this.kms = kms;
}











}