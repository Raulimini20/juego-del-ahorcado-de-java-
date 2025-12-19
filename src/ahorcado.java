import java.util.Scanner;

public class ahorcado {
    public static void main(String[] args) throws Exception {
        // Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // declaracion de variables
        String palabraSecreta = "inteligencia";
        int intentosMaximos = 10;
        int intentos = 0;
        boolean palabraAdivinada = false;

        // arreglo para almacenar las letras adivinadas
        char[] letrasAdivinadas = new char[palabraSecreta.length()];
        // estructura de control (bucle)
        for (int i = 0; i < letrasAdivinadas.length; i++) {
            letrasAdivinadas[i] = '_';
           
        }

        /*
         * que es String.valueOF?
         * convierte diferentes tipos de datos a una cadena de texto (String).
         * En este caso, se utiliza para convertir el arreglo de caracteres
         * letrasAdivinadas
         * en una cadena de texto para fac ilitar su visualización al usuario.
         */

        // estructura de control (bucle)
        while (!palabraAdivinada && intentos < intentosMaximos) {
            System.err.println("Palabra a adivinar: " + String.valueOf(letrasAdivinadas) + "(" + palabraSecreta.length()
                    + " letrasIngresada)");
            System.err.println("\nIngrese una letra: ");

            char letraIngresada = Character.toLowerCase(scanner.next().charAt(0));

            boolean letraCorrecta = false;

            for (int i = 0; i < palabraSecreta.length(); i++) {
                // if (estructra de control condicional)
                if (palabraSecreta.charAt(i) == letraIngresada) {
                    letrasAdivinadas[i] = letraIngresada;
                    letraCorrecta = true;
                }
            }
            if (!letraCorrecta) {
                intentos++;
                System.err.println("Letra incorrecta. Intentos restantes: " + (intentosMaximos - intentos)
                        + "intentos.");
            }
            if (String.valueOf(letrasAdivinadas).equals(palabraSecreta)) {
                palabraAdivinada = true;
                System.err.println("¡Felicidades! Has adivinado la palabra: " + palabraSecreta);

            }
        }

        if (!palabraAdivinada) {
            System.err.println("Has agotado tus intentos. La palabra era: " + palabraSecreta);
        }
        scanner.close();
        System.out.println("Juego terminado.");
    }
}
