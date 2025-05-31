//Dado: vec1 = [2,6,4,5,8,9,6,4]    vec2 = [10,2,5,10,4,7,5,6]
//Intercabiar algunos elementos para obtener:
//vec1 = [2,2,4,10,8,7,6,6]    vec2 = [10,6,5,5,4,9,5,4]

import java.util.Arrays;

public class Ejerc2 {
    public static void main(String[] args) {
        int[] vec1 = {2,6,4,5,8,9,6,4};
        int[] vec2 = {10,2,5,10,4,7,5,6};
        for (int i = 1; i < vec1.length; i += 2) {
            int aux = vec1[i];
            vec1[i] = vec2[i];
            vec2[i] = aux;
        }
        System.out.println(Arrays.toString(vec1));
        System.out.println(Arrays.toString(vec2));
    }
}
