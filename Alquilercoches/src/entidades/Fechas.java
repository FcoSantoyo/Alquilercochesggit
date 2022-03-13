package entidades;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Fechas {

	/**
	 * El metodo principal que te permite introducir una fecha por teclado.
	 * @return
	 */
	public static Date ManejoFechas (String fecha) {

        System.out.println("Introduzca la fecha con formato dd/mm/yyyy");
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date fechafinal = null;
        String date = fecha;
        try{
           fechafinal = df.parse(date);
            System.out.println("Ahora hemos creado un objeto date con la fecha indicada, "+fechafinal);
        } catch (Exception e){ System.out.println("Formato inválido");}

        if (!df.format(fechafinal).equals(date)){
            System.out.println("Fecha no válida");
        } else {
            System.out.println("Fecha válida");
        }
        return fechafinal;

    }

	public static int DiferenciaEnDias(Date fechaInicial,Date fechaFinal) throws ParseException {
		Scanner in = new Scanner ( System.in );
 
		int dias=(int) ((fechaFinal.getTime()-fechaInicial.getTime())/86400000);
 
		System.out.println("Hay "+dias+" dias de diferencia");
		return dias;
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
