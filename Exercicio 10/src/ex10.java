import java.util.Scanner;
import java.time.LocalDate;

public class ex10 {
    public static void main(String[] args) {

    System.out.println("Qual seu ano de nascimento? ");

    Scanner scanner = new Scanner(System.in);
    int anoDeNascimento = scanner.nextInt();

    LocalDate hoje = LocalDate.now();
    int anoAtual = hoje.getYear();
    int idadeCalculada = anoAtual - anoDeNascimento;
    System.out.println("A idade calculada é: " + idadeCalculada);
    
    }
}




