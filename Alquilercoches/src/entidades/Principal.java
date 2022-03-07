package entidades;

import java.io.*;
import java.util.TreeMap;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Serializacion ; creamos el  objeto empresa y lo serializamos...
		TreeMap<Empleado,String> Empleado = new TreeMap<Empleado,String>();
		TreeMap<Cliente,String> Cliente = new TreeMap<Cliente,String>();
		TreeMap<Vehiculo,String> Vehiculo = new TreeMap<Vehiculo,String>();
		TreeMap<Oficina,String> Oficina = new TreeMap<Oficina,String>();
		TreeMap<Alquiler,Vehiculo> Alquiler = new TreeMap<Alquiler,Vehiculo>();
		TreeMap <Categoria,String> Categoria = new TreeMap<Categoria,String>();
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
	
	

