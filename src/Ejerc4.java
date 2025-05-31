//Crear un programa que genere una matriz de 3x3 con números aleatorios entre 1 y 9.
//Mostar la matriz y la suma de cada fila.
//  matriz:      [2, 4, 1]           Suma fila 1: 7
//               [5, 3, 2]           Suma fila 2: 10
//               [6, 7, 1]           Suma fila 3: 14

import java.util.Arrays;
import java.util.Random;

public class Ejerc4 {
    public static void main(String[] args){
        int[][] matriz = {
                {2, 4, 1},
                {5, 3, 2},
                {6, 7, 1},
        };

        System.out.println("Matriz: ");
        for (int i=0; i<3; i++) {
            System.out.println(Arrays.toString(matriz[i]));
            }

        for (int i=0; i<3; i++){
            int suma = 0;
            for(int j=0; j<3; j++){
                suma = matriz[i][j] + suma;
            }
            System.out.println("La suma de la fila " + (i+1) + ": " + suma);
        }
    }
}

