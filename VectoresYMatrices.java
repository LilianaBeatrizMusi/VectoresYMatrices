import java.util.Scanner;

/**
 * @author Liliana Musi
 * @date 03/10/2023
 * @version 0.1
 */

 /*
  * Realizar un programa que permita cargar 15 números en un vector.
  Una vez cargados, se necesita que el programa cuente e informe por pantalla
  cuantas veces se cargó el número 3.
  */
public class VectoresYMatrices {

    public static void main(String[] args) {
        
        int vector [] = new int[15];
        Scanner teclado = new Scanner(System.in);

        //carga del vector
        for (int i = 0; i<15; i++) {        
            System.out.println("Ingrese un número para el vector");
            vector[i] = teclado.nextInt();
        }

        //recorrery contar los números 3
        int cont = 0;
        for (int i = 0; i<15; i++) {

            if (vector[i] == 3) {
                cont = cont + 1;  
            }

    }
System.out.println("La cantidad de numeros 3 que hay en el vector es: " + cont);
teclado.close();
}

}