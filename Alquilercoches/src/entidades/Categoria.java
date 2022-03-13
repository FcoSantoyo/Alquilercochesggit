package entidades;
import java.io.Serializable;

public class Categoria implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String codigo;
	private String descripcion;
	private int porcentaje;
	
	//Constructores
	
	public Categoria() {
		
	}
	/**
	 * Constructor para crear un objeto Categoría
	 * @param codigo
	 * @param descripcion
	 * @param porcentaje
	 */
	public Categoria(String codigo,String descripcion,int porcentaje) {
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
	public int getPorcentaje() {
		return porcentaje;
	}
	public void setPorcentaje(int porcentaje) {
		this.porcentaje = porcentaje;
	}









	
	
	
	
	
	
	
	
	
	
	
	
}