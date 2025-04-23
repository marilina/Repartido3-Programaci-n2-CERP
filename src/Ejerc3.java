//Crear un arreglo de 5 nombres de personas. Solicitar al usuario un nombre y
//verificar si se encuentra dentro del arreglo. Mostrar un mensaje correspondiente.

import java.util.Scanner;

public class Ejerc3 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nombres = {"Juan", "Antonio", "Francisca", "Andrea", "Lucrecia"};
        boolean esta = false;
        int i=0;
        System.out.print("Ingrese un nombre para verificar si pertenece al arreglo: ");
        String nom = scanner.nextLine();
        while (i<nombres.length && !esta) {
            if (nombres[i].equalsIgnoreCase(nom)) {
                esta=true;
            }
            i++;
        }
        if (esta==true) {
            System.out.println("El nombre está en la lista");
        } else {
            System.out.println("El nombre no está en la lista");
        }
        }
    }

