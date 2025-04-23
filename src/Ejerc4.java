//Crear un programa que genere una matriz de 3x3 con números aleatorios entre 1 y 9.
//Mostar la matriz y la suma de cada fila.
//  matriz:      [2, 4, 1]           Suma fila 1: 7
//               [5, 3, 2]           Suma fila 2: 10
//               [6, 7, 1]           Suma fila 3: 14


public class Ejerc4 {
    public static void main(String[] args){
        int [][] num = new int[3][3];
        System.out.println("Matriz: ");
        for (int i=0; i< num.length; i++) {
            for (int j=0; j<num[0].length; j++) {
                num[i][j]=(int) (Math.random()*10);
                System.out.print(num[i][j]+" - ");
            }
            System.out.println();

        }
        System.out.print(" - ".repeat(20));
        System.out.println("\nSuma fila 1: "+(num[0][0]+num[0][1]+num[0][2]));
        System.out.println("Suma fila 2: "+(num[1][0]+num[1][1]+num[1][2]));
        System.out.println("Suma fila 3: "+(num[2][0]+num[2][1]+num[2][2]));
    }
}
