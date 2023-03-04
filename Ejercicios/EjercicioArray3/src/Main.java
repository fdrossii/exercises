import javax.swing.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        crearArray();
    }

    public static void crearArray(){
        String tamanio = JOptionPane.showInputDialog("Ingrese tamaño :");
        int num[] = new int[Integer.parseInt(tamanio)];

        llenarArray(num);

        for (int j : num) {
            System.out.println(j);
        }

        mostrarMayor(num);

        
    }

    public static void llenarArray(int array[]){
        int i = 0;

        while(i < array.length){
            int numeroAleatorio = numeroAleatorio();
            if(esPrimo(numeroAleatorio)){
                array[i] = numeroAleatorio;
                i++;
            }
        }

    }

    public static void mostrarMayor(int num[]){
        int mayor = num[0];

        for (int i = 1; i < num.length; i++){
            if(mayor < num[i]){
                mayor = num[i];
            }
        }

        System.out.println("El mayor es: " + mayor);
    }

    public static int numeroAleatorio(){
        Random random = new Random();
        int i;
        return i = random.nextInt(100) + 1;
    }

    public static boolean esPrimo(int num){
        if(num < 2 ){
            return false;
        }else{
          for (int x = 2; x * x <= num; x++){
              if (num % x == 0){
                  return false;
              }
          }
        }
        return true;
    }
}