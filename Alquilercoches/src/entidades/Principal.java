package entidades;

import java.io.*;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Serializacion ; creamos el  objeto empresa y lo serializamos...
		TreeMap<String,Empleado> Empleado = new TreeMap<String,Empleado>();
		TreeMap<String,Cliente> Cliente = new TreeMap<String,Cliente>();
		TreeMap<String,Vehiculo> Vehiculo = new TreeMap<String,Vehiculo>();
		TreeMap<String,Oficina> Oficina = new TreeMap<String,Oficina>();
		TreeMap<Alquiler,Vehiculo> Alquiler = new TreeMap<Alquiler,Vehiculo>();
		TreeMap <String,Categoria> Categoria = new TreeMap<String,Categoria>();
		Empresa Empresa = new Empresa(Empleado,Cliente,Vehiculo,Oficina,Categoria,Alquiler);
		try(ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("C:\\Users\\avexw\\Desktop\\DAW\\Programación\\Entorno de trabajo\\Empresa.txt"))){
            //Escribimos en un fichero
            oos.writeObject(Empresa);
            
        }catch(IOException e){
        	System.out.println(e.getMessage());
        }
		
		
	     try(ObjectInputStream ois=new ObjectInputStream(new FileInputStream("C:\\\\Users\\\\avexw\\\\Desktop\\\\DAW\\\\Programación\\\\Entorno de trabajo\\\\Empresa.txt"))){
	            //Cuando no haya mas objetos saltara la excepcion EOFException
	            while(true){
	                Empresa aux=(Empresa)ois.readObject();
	                System.out.println(aux.getEmpleado());
	                System.out.println(aux.getCliente());
	                System.out.println(aux.getVehiculo());
	                System.out.println(aux.getOficina());
	                System.out.println(aux.getCategoria());
	                System.out.println("");
	            }
	        }catch(ClassNotFoundException e){
	        }catch(EOFException e){
	        }catch(IOException e){
	        }
	    }
		
	}
	
	

