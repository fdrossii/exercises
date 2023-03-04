import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese numero de columnas");
        int columns = sc.nextInt();

        int[][] matriz = new int[5][columns];

        for (int i = 0; i < matriz.length; i++){
            for(int j = 0; j < matriz[0].length; j++){
                matriz[i][j] = (int)((Math.random() * 10) + 1);
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}