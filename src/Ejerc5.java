//Ingresar una matriz 4x4. Mostrar sólo los elementos que están en la diagonal principal.
// Matriz:      [1,2,3,4]
//              [5,6,7,8]                   Diagonal principal: 1 6 11 16
//              [9,10,11,12]
//              [13,14,15,16]

import java.util.Scanner;

public class Ejerc5 {
    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        int [][] num = new int[4][4];
        int cont =1;
        System.out.print("DEBE INGRESAR 16 NÚMEROS PARA CREAR LA MATRIZ:\n");
        for (int i=0; i< num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                System.out.print("Ingrese el número "+cont+" : ");
                num[i][j] = scanner.nextInt();
                cont++;
            }
        }
        System.out.print(" - ".repeat(30));
        System.out.print("\nLa matriz ingresada es: \n");
        for (int i=0; i< num.length; i++) {
            for (int j = 0; j < num[0].length; j++) {
                System.out.print(num[i][j] + " - ");
            }
            System.out.println();
        }
        System.out.print(" - ".repeat(30));
        System.out.print("\nLa diagonal principal se forma con los números: "+num[0][0]+"\t"+num[1][1]+"\t"+num[2][2]+"\t"+num[3][3]);
    }
}
