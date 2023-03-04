import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        crearArray();

    }

    public static void crearArray(){
        String text = JOptionPane.showInputDialog("Ingrese tamañano del array: ");
        int num[] = new int[Integer.parseInt(text)];

        rellenarArray(num, 1, 10);
        mostrarArray(num);

    }

    public static void rellenarArray(int array[], int a, int b) {
        for(int i = 0; i < array.length; i++){
            array[i] = ((int)Math.floor(Math.random()*(a-b)+b));
        }
    }

    public static void mostrarArray(int array[]){
        for (int i = 0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
}