public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        llenarLista();
        mostrarLista();
    }

    static int num[] = new int[10];

    public static void llenarLista(){
        for (int i = 0; i < num.length; i++ ){
            num[i] = i;
        }
    }

    public static void mostrarLista(){
        for (int i = 0; i < num.length; i++){
            System.out.print(num[i]);
        }
    }
}