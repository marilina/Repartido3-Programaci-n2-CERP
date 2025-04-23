//Dado el siguiente arreglo:
//int array[]={10,4,5,7,3,5,7,9,4,2,5,7,-56}
//Determinar cuántos números son pares e impares, y mostrar los resultados por pantalla.

public class Ejerc1 {
    public static void main(String[] args) {
        int array[]={10,4,5,7,3,5,7,9,4,2,5,7,-56};
        int contpares = 0;
        int contimpares = 0;
        System.out.print("Números pares del arreglo: ");
        for(int i=0; i<array.length ; i++) {
           if ((array[i]%2)==0) {
               contpares ++;
               System.out.print(array[i] + "\t");
           }
        }
        System.out.print("\nNúmeros impares del arreglo: ");
        for(int i=0; i<array.length ; i++) {
            if ((array[i]%2)==1) {
                contimpares ++;
                System.out.print(array[i] + "\t");
            }
        }
        System.out.println("\nLa cantidad de números pares del arreglo es = "+ contpares);
        System.out.println("La cantidad de números impares del arreglo es = "+ contimpares);
    }
}