import java.util.Objects;
import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        boolean continuar = true;
        String resposta;
        int primeironum = 0;
        int segundonum = 0;
        int operacao = 0;
        int resultado = 0;

        while (continuar) {
            System.out.println("Digite o primeiro número: ");
            primeironum = Integer.parseInt(leitor.nextLine());

            System.out.println("Digite o segundo número: ");
            segundonum = Integer.parseInt(leitor.nextLine());

            System.out.println("Qual operação deseja fazer? ");
            System.out.println("(Soma = 1; Subtração = 2; Multiplicação = 3; Divisão = 4;) ");
            operacao = Integer.parseInt(leitor.nextLine());

            switch(operacao) {
                case 1:
                    resultado = primeironum + segundonum;
                    break;
                case 2:
                    resultado = primeironum - segundonum;
                    break;
                case 3:
                    resultado = primeironum * segundonum;
                    break;
                case 4:
                    resultado = primeironum / segundonum;
                    break;
            }

            System.out.println("Resultado: " + resultado);

            System.out.println("Deseja continuar? ");
            System.out.println("(Sim = Y; Não = N;) ");
            resposta = leitor.nextLine();

            if (!Objects.equals(resposta, "Y")) {
                continuar = false;
            }
        }


    }
}