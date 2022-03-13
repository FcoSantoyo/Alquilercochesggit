package metodos;

public class Validadores {

	//Validar matr�cula
	/**
	 * Metodo que valida una matr�cula
	 * @param matricula
	 * @return
	 */
	public static boolean comprobarMatricula (String matricula){

	    if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
	        System.out.println("Matr�cula v�lida");
	        return true;

	    }else{

	        System.out.println("Matr�cula inv�lida");
	        return false;
	    }      
	}
	/**
	 * M�todo que valida un DNI
	 * @param dni
	 * @return
	 */
	public static boolean validaDNI(String dni) {
		// El m�todo es privado porque lo voy a usar internamente en esta clase, no se necesita fuera de ella

		// pasar miNumero a integer
		int miDNI = Integer.parseInt(dni.substring(0,8));
		String letraDNI = dni.substring(8);
		boolean dnivalido=false;
		int resto = 0;
		String miLetra = "";
		String[] asignacionLetra = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};

		resto = miDNI % 23;

		miLetra = asignacionLetra[resto];
		if (letraDNI.equals(miLetra))
		{
			dnivalido=true;
		}
		return dnivalido;
		
	}
}




	