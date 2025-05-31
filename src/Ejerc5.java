//Ingresar una matriz 4x4. Mostrar sólo los elementos que están en la diagonal principal.
// Matriz:      [1,2,3,4]
//              [5,6,7,8]                   Diagonal principal: 1 6 11 16
//              [9,10,11,12]
//              [13,14,15,16]

import java.util.Scanner;

public class Ejerc5 {
    public static void main (String[] args){
            int[][] matriz = {
                    {1, 2, 3, 4},
                    {5, 6, 7, 8},
                    {9, 10, 11, 12},
                    {13, 14, 15, 16}
            };

            int suma = 0;

            for(int i=0; i<4; i++){
                suma = matriz[i][i] + suma;
            }
            System.out.println("La suma de la diagonal principal es: "+ suma);
        }
}
