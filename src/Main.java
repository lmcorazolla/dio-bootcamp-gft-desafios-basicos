import java.util.Scanner;


public class Main {
    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);


        String linha = leitor.nextLine();
        String[] valores = linha.split("\\s");
        int a = Integer.parseInt(valores[0]);
        int b = Integer.parseInt(valores[1]);

        //digite o seu código
        int X = a + b;
        System.out.println("X = "+X);

    }
}