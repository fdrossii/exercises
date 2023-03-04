import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);

        int[] numb1;
        int[] numb2;

        System.out.println("Ingrese tamaño del primer array: ");
        int numb = sc.nextInt();
        numb1 = new int[numb];

        System.out.println("Ingrese tamaño del segundo array: ");
        numb = sc.nextInt();
        numb2 = new int[numb];

        for (int i = 0; i < numb1.length; i++){
            numb1[i] = (int)((Math.random() * 100 )+1);
            numb2[i] = numb1[i];
        }

        int[] numb3 = new int[numb1.length];
        for (int i = 0; i < numb3.length; i++){
            numb3[i] = (int)((Math.random() * 100 )+1);
        }

        System.out.println("El contenido del array 1 es: ");
        for (int i = 0; i < numb1.length; i++){
            System.out.println(numb1[i]);
        }

        System.out.println("El contenido del array 2 es: ");
        for (int i = 0; i < numb2.length; i++){
            System.out.println(numb2[i]);
        }

        System.out.println("El contenido del array 3 es: ");
        for (int i = 0; i < numb3.length; i++){
            System.out.println(numb3[i]);
        }

        System.out.println("El contenido del array 4 es: ");
        int[] array4 = llenarArray(numb1, numb2);
        for (int i = 0; i < numb1.length; i++){
            System.out.println(array4[i]);
        }

    }

    public static int[] llenarArray(int[] array1, int[] array2){
        int[] numb4 = new int[array1.length];
        for (int i = 0; i < numb4.length; i ++){
            numb4[i] = array1[i] * array2[i];
        }

        return numb4;
    }
}