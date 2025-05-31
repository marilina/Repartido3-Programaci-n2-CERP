//Dado el siguiente arreglo:
//int array[]={10,4,5,7,3,5,7,9,4,2,5,7,-56}
//Determinar cuántos números son pares e impares, y mostrar los resultados por pantalla.

import java.util.Scanner;

public class Ejerc1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array=new int[13];
        int contpares = 0;
        int contimpares = 0;
        System.out.print("---CARGUE LOS VALORES DEL ARREGLO---\n");

        for(int j=0; j<array.length ; j++) {
            System.out.print("ingrese el valor "+(j+1)+": ");
            array[j] = scanner.nextInt();
        }
        for(int i=0; i<array.length ; i++) {
            if ((array[i]%2)==0) {
                contpares ++;
            }
            if ((array[i]%2)==1) {
                contimpares ++;
            }
        }
        System.out.println("\nLa cantidad de números pares del arreglo es = "+ contpares);
        System.out.println("La cantidad de números impares del arreglo es = "+ contimpares);
    }
}