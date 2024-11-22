//importa la libreria de la clase Scaner
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Entrada y salida por consola
                        // Instanciar esta clase escaner = new scanner()
                                    //in viene de inputStream (Entrada de datos)
        //OBJETO de nombre entrada
        Scanner Entrada = new Scanner(System.in);
            float numero1;
            Integer numero;


        System.out.println("Digita un numero");
                        //con este se guarda pero entero
        numero = Entrada.nextInt();

        System.out.println("Digita un numero decimal");
        numero1 = Entrada.nextFloat();

        System.out.println("El primer numero es: " + numero);
        System.out.println("El segundo numero es: " + numero1);


        String cadena;
        //para una cadena
        System.out.println("digita una cadena: ");
        cadena = Entrada.nextLine();
        System.out.println(cadena);

        char letra;
        System.out.println("digita una letra");
                                //te va a leer el primer caracter que encuentre
        letra = Entrada.next().charAt(0);
        System.out.println("la letra es:" + letra);
        //si le pasas hola solo leera la h


    }
}