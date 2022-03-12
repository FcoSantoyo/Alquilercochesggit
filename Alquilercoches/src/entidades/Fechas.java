package entidades;

import java.util.Scanner;

public class Fechas {
	private String fecha;
	private String dia,mes,anio;
	int datodia,datomes,datoanio;
	int posicion;
	
	//Constuctores
	public Fechas(String fecha,String dia,String mes,String anio,int datodia,int datomes, int datoanio,int posicion)
	{
		this.setFecha(fecha);
		this.setDia(dia);
		this.setMes(mes);
		this.setAnio(anio);
		this.setDatodia(datodia);
		this.setDatomes(datomes);
		this.setDatoanio(datoanio);
		this.setPosicion(posicion);
	}
	
	public Fechas(Fechas o)
	{
		this.setFecha(o.getFecha());
		this.setDia(o.getDia());
		this.setMes(o.getMes());
		this.setAnio(o.getAnio());
		this.setDatodia(o.getDatodia());
		this.setDatomes(o.getDatomes());
		this.setDatoanio(o.getDatoanio());
		this.setPosicion(o.getPosicion());
	}

	public static Fechas ManejoFechas() {
		
		 String fecha;
		 String dia,mes,anio;
		 int datodia,datomes,datoanio;
		int posicion;
		Scanner in = new Scanner ( System.in );
		
		System.out.println("Introduzca fecha en formato /dd/mm/aaaa");
		//Dia
		fecha=in.next();
		posicion=fecha.indexOf("/");
		dia=fecha.substring(0,posicion);
		fecha=fecha.substring(posicion+1);
		//Mes
		posicion=fecha.indexOf("/");
		mes=fecha.substring(0,posicion);
		fecha=fecha.substring(posicion+1);
		anio=fecha;
		
		//Conversion a int para poder calcular con ellos
		datodia=Integer.parseInt(dia);	
		datomes=Integer.parseInt(mes);
		datoanio=Integer.parseInt(anio);
		
		if(1>datodia || datodia<31 || 1>datomes || datomes>12 || 1900>datoanio || datoanio>2099)
		{
			System.out.println("FECHA INCORRECTA");
		}
		else
		{
			System.out.println("");
		}
		
		Fechas a= new Fechas(fecha,dia,mes, anio, datodia,datomes,datoanio,posicion);
		return a;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Getters y setters
	public String getFecha() {
		return fecha;
	}
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
	public String getDia() {
		return dia;
	}
	public void setDia(String dia) {
		this.dia = dia;
	}
	public String getMes() {
		return mes;
	}
	public void setMes(String mes) {
		this.mes = mes;
	}
	public String getAnio() {
		return anio;
	}
	public void setAnio(String anio) {
		this.anio = anio;
	}
	public int getPosicion() {
		return posicion;
	}
	public void setPosicion(int posicion) {
		this.posicion = posicion;
	}

	public int getDatodia() {
		return datodia;
	}

	public void setDatodia(int datodia) {
		this.datodia = datodia;
	}

	public int getDatomes() {
		return datomes;
	}

	public void setDatomes(int datomes) {
		this.datomes = datomes;
	}

	public int getDatoanio() {
		return datoanio;
	}

	public void setDatoanio(int datoanio) {
		this.datoanio = datoanio;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
