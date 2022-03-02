import java.io.IOException;
import java.util.Scanner;

public class Dio {

    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);


        double A = Double.parseDouble(leitor.next());
        double B = Double.parseDouble(leitor.next());

        //Escreva aqui a sua lógica
        double desconto = (((B - A) / A) * 100);
        System.out.println(String.format("%.2f", desconto)+"%");

    }

}