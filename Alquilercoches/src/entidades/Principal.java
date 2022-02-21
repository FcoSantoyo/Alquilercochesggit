package entidades;

import java.util.ArrayList;
import java.util.Collections;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<Persona> pito= new ArrayList();
		
		Persona p1=new Persona("83045623B","Yelmo","Estupido","Queso");
		Persona p=new Persona("77370255A","Ana","Ramirez","Guevi");
		pito.add(p);
		pito.add(p1);
		
		Collections.sort(pito);
		
		for(Persona j:pito) {
			System.out.println(j);
		}
		
		
		
		
		
		
	}
	
	
}
