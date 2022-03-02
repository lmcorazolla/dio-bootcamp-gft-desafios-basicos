import java.util.Scanner;

public class Classe{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        double area;
        double pi = 3.14159;
        double raio;

        //declare suas variaveis do tipo double

        //continue a solucao

        raio = Double.parseDouble(scan.next());

        area = pi * (Math.pow(raio,2));

        System.out.printf("A=" +String.format("%.4f",area));
        System.out.println();
    }
}