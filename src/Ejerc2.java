//Dado: vec1 = [2,6,4,5,8,9,6,4]    vec2 = [10,2,5,10,4,7,5,6]
//Intercabiar algunos elementos para obtener:
//vec1 = [2,2,4,10,8,7,6,6]    vec2 = [10,6,5,5,4,9,5,4]

public class Ejerc2 {
    public static void main(String[] args) {
        int i=0;
        int[] vec1 = {2,6,4,5,8,9,6,4};
        int[] vec2 = {10,2,5,10,4,7,5,6};
        System.out.print("Vector 1 original: ");
        for (i=0; i<vec1.length; i++){
            System.out.print(vec1[i]+"\t");
        }
        System.out.print("\nVector 1 modificado: ");
        for (i=0; i<vec1.length; i++) {
            vec1[1] = 2;
            vec1[3] = 10;
            vec1[5] = 7;
            vec1[7] = 6;
            System.out.print(vec1[i]+"\t");
        }
        System.out.print("\n\nVector 2 original: ");
        for (i=0; i<vec2.length; i++){
            System.out.print(vec2[i]+"\t");
        }
        System.out.print("\nVector 2 modificado: ");
        for (i=0; i<vec2.length; i++) {
            vec2[1] = 6;
            vec2[3] = 5;
            vec2[5] = 9;
            vec2[7] = 4;
            System.out.print(vec2[i]+"\t");
        }
    }
}
