
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[4][4];
        int opc;

        System.out.println("Rellenar matriz: s/n");
        String op = sc.nextLine();

        System.out.println("Matriz");
        if(op.equals("s") || op.equals("S")){
            for(int i = 0; i < matriz.length; i++){
                for(int j = 0; j < matriz[0].length; j++){
                    matriz[i][j] = (int)((Math.random()*10)+1);
                    System.out.print(matriz[i][j] + " ");
                }
                System.out.println(" ");
            }
        }else {
            System.out.print("Programa terminado");
            System.exit(0);
        }

        System.out.println("Seleccionar opcion:");
        System.out.println("1) Suma una fila");
        System.out.println("2) Suma una columna");
        System.out.println("3) Suma diagonal principal");
        System.out.println("4) Suma diagonal inversa");
        System.out.println("5) Media de todos los valores");
        System.out.println("Ingrese opcion: ");
        opc = sc.nextInt();

        if(opc == 1){
            System.out.println("Seleccione fila del 1 al 4: ");
            int fila = sc.nextInt();
            if(fila > 0 && fila < 5){
                System.out.println("La suma es: " + sumarFila(fila-1, matriz));
            }else{
                System.out.println("Seleccion incorrecta, programa terminado");
                System.exit(0);
            }
        } else if (opc == 2) {
            System.out.println("Seleccione columna 1 al 4: ");
            int columna = sc.nextInt();
            if(columna > 0 && columna < 5){
                System.out.println("La suma es: " + sumarColumna(columna-1, matriz));
            }else {
                System.out.println("Seleccion incorrecta, programa terminado");
                System.exit(0);
            }
        } else if (opc == 3) {
            System.out.println("Suma diagonal principal: ");
            System.out.println(sumaDiagonal(matriz));
        } else if (opc == 4) {
            System.out.println("Suma diagonal inversa");
            System.out.println(sumaDiagonalInver(matriz));
        } else if (opc == 5) {
            System.out.println("Media de todos los valores: ");
            System.out.println(media(matriz));
        } else{
            System.out.println("Seleccion incorrecta, programa terminado");
            System.exit(0);
        }
    }

    public static int sumarFila(int fila, int[][] matriz){
        int suma = 0;
        for(int j = 0; j < 4; j++){
            suma = suma + matriz[fila][j];
        }
        return suma;
    }

    public static int sumarColumna(int columna, int[][] matriz){
        int suma = 0;
        for(int i = 0; i < 4; i++){
            suma = suma + matriz[i][columna];
        }
        return suma;
    }

    public static int sumaDiagonal(int[][] matriz){
        int suma = 0;
        for(int i = 0; i < 4; i++){
            suma = suma + matriz[i][i];
        }
        return suma;
    }

    public static int sumaDiagonalInver(int[][] matriz){
        int suma = 0;
        int columna = 0;
        for(int i = 3; i >=0; i--){
            suma = suma + matriz[i][0];
            columna++;
        }
        return suma;
    }

    public static float media(int[][] matriz){
        float suma = 0;
        for(int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                suma = suma + matriz[i][j];
            }
        }
        suma = (suma / 16);
        return suma;
    }

}