import javax.swing.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);

        char[] letras = new char[26];

        llenarArray(letras);

        StringBuilder cadena = new StringBuilder();
        int indice;

        do{
            System.out.println("Ingrese indice entre 0 y 25");
            indice = sc.nextInt();

            if(indice < 0 || indice > 25){
                System.out.println("Numero incorrecto, ingrese otro");
            }else if(indice != -1){
                cadena.append(letras[indice]);
            }
        }while(indice != -1);

        System.out.println(cadena);
    }

    public static void llenarArray(char[] array){
        char letra = 'a';
        for (int i = 0; i < array.length; i++){
            array[i] = letra;
            letra++;
        }
    }
}