import java.util.Scanner;

public class Contador {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {

            System.out.print("Digite o primeiro parâmetro (número inicial): ");
            int parametroUm = sc.nextInt();
            System.out.print("Digite o segundo parâmetro (número final): ");
            int parametroDois = sc.nextInt();


            if (parametroUm > parametroDois) {
                throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
            }
            int quantidadeIteracoes = parametroDois - parametroUm;


            for (int i = 1; i <= quantidadeIteracoes; i++) {
                System.out.println("Imprimindo o número " + i);
            }

        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Entrada inválida. Por favor, insira números inteiros.");
        } finally {
            sc.close();  
        }
    }
}
