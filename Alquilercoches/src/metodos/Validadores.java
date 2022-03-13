package metodos;

public class Validadores {

	//Validar matrícula
	/**
	 * Metodo que valida una matrícula
	 * @param matricula
	 * @return
	 */
	public static boolean comprobarMatricula (String matricula){

	    if (matricula.toUpperCase().matches("^[0-9]{4}[A-Z]{3}$")) {
	        System.out.println("Matrícula válida");
	        return true;

	    }else{

	        System.out.println("Matrícula inválida");
	        return false;
	    }      
	}
	/**
	 * Método que valida un DNI
	 * @param dni
	 * @return
	 */
	public static boolean validaDNI(String dni) {
		// El método es privado porque lo voy a usar internamente en esta clase, no se necesita fuera de ella

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




	