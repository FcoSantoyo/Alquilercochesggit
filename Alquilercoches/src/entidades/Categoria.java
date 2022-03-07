package entidades;
import java.io.Serializable;

public class Categoria implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigo;
	private String descripcion;
	private double porcentaje;
	
	//Constructores
	
	public Categoria() {
		
	}
	
	public Categoria(String codigo,String descripcion,double porcentaje) {
		this.setCodigo(codigo);
		this.setDescripcion(descripcion);
		this.setPorcentaje(porcentaje);
	}
	
	//Constructor de copia
	
	public Categoria(Categoria o) {
		this.setCodigo(o.getCodigo());
		this.setDescripcion(o.getDescripcion());
		this.setPorcentaje(getPorcentaje());
	}
	
		//Getters y setters
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(double porcentaje) {
		this.porcentaje = porcentaje;
	}









	
	
	
	
	
	
	
	
	
	
	
	
}