package revisionDeCodigo7;

// El código de este programa permite al usuario consultar las capitales de países centroamericanos. 
// Además. el usuario puede agregar nuevas capitales si no están en la base de datos.

import java.util.HashMap;
import java.util.Scanner;

//Se quita acento al nombre de la clase
public class Codigo7 {

	// Se crea el método principal main
	public static void main(String[] args) {
		// Se crea Scanner
		Scanner scanner = new Scanner(System.in);
		// Se importa y usa HashMap para almacenar países y capitales (ambos Strings)
		// Por ende, se cambia Byte y Double por String, y ca por capitales
		HashMap<String, String> capitales = new HashMap<>(); 

		// Inicializar el HashMap con los datos proporcionados
		capitales.put("Canadá", "Ottawa");
		capitales.put("Estados Unidos", "Washington DC");
		// Se corrige la capital de México, antes decía México DF
		capitales.put("México", "Ciudad de México");
	    capitales.put("Belice", "Belmopán");
	    capitales.put("Costa rica", "San José");
	    capitales.put("El Salvador", "San Salvador");
	    capitales.put("Guatemala", "Ciudad de Guatemala");
	    capitales.put("Honduras", "Tegucigalpa");
	    capitales.put("Nicaragua", "Managua");
	    capitales.put("Panamá", "Panamá");
		
	    // Se cambia el String, c por país
	    String pais;
	    do {
	    	//Se cambia el System. in... por System.in...
            System.out.print("Escribe el nombre de un país y te diré su capital (escribe 'salir' para terminar): ");
            pais = scanner.nextLine().toLowerCase(); // Convertir a minúsculas para una comparación insensible a mayúsculas
// Se corrige equal
            if (!pais.equals("salir")) {
            	// Se cambia ca.containsValue(c) 
            	// containsKey es para buscar por clave y get para obtener el valor asociado.
                if (capitales.containsKey(pais)) {
                	// Se completa el método para imprimir el mensaje
                    System.out.println("La capital de " + pais + " es " + capitales.get(pais));
                } else {
                    System.out.print("No conozco la respuesta. ¿Cuál es la capital de" + pais + "?: ");
                   // Se cambia ca por capital
                    String capital = scanner.nextLine();
                    // Se cambia ca.put(c, ca);
                    capitales.put(pais, capital);
                    System.out.println("Gracias por enseñarme nuevas capitales  :D");
                }
            }
            // Se corrige la redacción de esta condicional y se cambia c por país
        } while (!pais.equals("salir"));
    }

}

