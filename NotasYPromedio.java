import java.util.Scanner;

/**
 * @author Liliana Musi
 * @date 03/10/2023
 * @version 0.1
 */

 /*En una tabla de 4 filas y 4 columnas se guardan las notas
  de 4 alumnos de secundaris. Cada fila corresponde a las notas
  y al promedio de cada alumno. Se necesita un programa que permita
  a un profesor cargar, en las 3 posiciones (columnas) de cada fila,
  las notas del alumno y el promedio correspondiente recorriendo la 
  matriz */

public class NotasYPromedio {

    public static void main(String[] args) {
     
    Double matriz [][] = new Double[4][4];
    Scanner teclado = new Scanner (System.in);
    Double suma = 0.0;

    //for para cargar
    for (int fila=0; fila<4; fila++) {
        for (int columna=0; columna<3; columna++){
            System.out.println("Ingrese el alumno nº " + fila);
            matriz[fila][columna] = teclado.nextDouble();
            suma = suma + matriz[fila][columna];
        }
        matriz[fila][3] = suma/3;
        suma = 0.0;
    }

    //for para recorrer
    for (int fila=0; fila<4; fila++) {
        System.out.println("Las notas del alumno nº " + fila + " son: ");
        for (int columna=0; columna<3; columna++){
            System.out.println("Nota nº " + columna + " " + matriz[fila][columna]);

            System.out.println("El promedio del las notas es: " + matriz [fila] [3]);

        }
    }



    }

    
}