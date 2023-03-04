import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Filas: ");
        int filas = sc.nextInt();
        System.out.println("Columnas");
        int columnas = sc.nextInt();

        int[][] matriz1 = new int[filas][columnas];
        int[][] matriz2 = new int[filas][columnas];

        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[0].length; j++){
                System.out.println("Ingrese valor para la fila " + i + ", columna " + j);
                int valor = sc.nextInt();
                matriz1[i][j] = valor;
            }
        }
        System.out.println("Matriz 1");
        for (int i = 0; i < matriz1.length; i++){
            for (int j = 0; j < matriz1[0].length; j++){
                System.out.print(matriz1[i][j] + " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < matriz2.length; i++){
            for (int j = 0; j < matriz2[0].length; j++){
                System.out.println("Ingrese valor para la fila " + i + ", columna " + j);
                int valor = sc.nextInt();
                matriz2[i][j] = valor;
            }
        }
        System.out.println("Matriz 2");
        for (int i = 0; i < matriz2.length; i++){
            for (int j = 0; j < matriz2[0].length; j++){
                System.out.print(matriz2[i][j] + " ");
            }
            System.out.println(" ");
        }

        System.out.println("Suma de matriz 1 y matriz 2");

        int[][] matrizSuma = new int[filas][columnas];

        for (int i = 0; i < matrizSuma.length; i++){
            for (int j = 0; j < matrizSuma[0].length; j++){
                matrizSuma[i][j] = matriz1[i][j] + matriz2[i][j];
            }
        }

        for (int i = 0; i < matrizSuma.length; i++){
            for (int j = 0; j < matrizSuma[0].length; j++){
                System.out.print(matrizSuma[i][j] + " ");
            }
            System.out.println(" ");
        }

    }
}