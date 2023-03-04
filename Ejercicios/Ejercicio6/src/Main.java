import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");

        Scanner sc = new Scanner(System.in);

        String frase;

        char[] chars;

        System.out.println("Ingrese frase");
        frase = sc.nextLine();


        chars = new char[frase.length()];

        for(int i = 0; i < chars.length; i++){
            chars[i] = frase.charAt(i);
        }

        for (char aChar : chars) {
            System.out.print(aChar);
        }
    }
}