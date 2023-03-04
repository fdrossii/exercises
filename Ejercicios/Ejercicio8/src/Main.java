import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese tamaño de array: ");
        int numb = scanner.nextInt();
        int[] numbs = new int[numb];
        int contador = 0;
        int bandera = 0;

        for(int i = 0; i < numbs.length; i++){
            numbs[i] = (int)((Math.random()*300)+1);
        }

        System.out.println("Digito final de los numero: ");
        int digito = scanner.nextInt();

        for(int j : numbs){
            if(j % 10 == digito){
                contador++;
            }
        }

        int[] numbs2 = new int[contador];

        contador = 0;

        while(bandera < numbs2.length){

            if(numbs[contador] % 10 == digito){
                numbs2[bandera] = numbs[contador];
                bandera++;
            }

            contador++;
        }

        System.out.println("array");
        for(int j : numbs){
            System.out.println(j);
        }

        System.out.println("digito");
        for (int i = 0; i < numbs2.length; i ++){
            System.out.println(numbs2[i]);
        }
    }
}