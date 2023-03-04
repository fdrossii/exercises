

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        int[] arrayNumbs = new int[100];

        rellenarArray(arrayNumbs);

        System.out.println("La suma total es: " + sumaTotal(arrayNumbs));
        System.out.println("La media es: " + (float)(sumaTotal(arrayNumbs) / 100));
    }

    public static void rellenarArray(int[] numbs){
        for(int i = 0; i < numbs.length; i++){
            numbs[i] = i + 1;
        }
    }

    public static int sumaTotal(int[] numbs){
        int suma = 0;
        for (int num : numbs) {
            suma = suma + num;
        }

        return suma;
    }
}