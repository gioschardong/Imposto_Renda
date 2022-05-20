//Programa para calcular quanto de imposto de renda deve ser gasto. Escrito por Giovanni Schardong

import java.util.Scanner;

public class ImpostoRenda {
    public static void main(String[] args) {

        // Variaveis
        double salario;
        double resultado = 0;
        double faixa1 = 0;
        double faixa2 = 0;
        double faixa3 = 0;
        double faixa4 = 0;
        double faixa5 = 0;
        int faixa = 0;

        // Entrada
        Scanner in = new Scanner(System.in);

        System.out.print("Informe seu salario mensal: ");
        salario = in.nextDouble();

        // Analizar a situação do usuário
        if (salario < 1903.98) {
            faixa = 1;
            System.out.println("Com o Salario de: R$" + salario + " você não precisa pagar imposto de renda");
        }
        if ((salario >= 1903.99) && (salario <= 2826.65)) {
            faixa = 2;
            faixa1 = 0;
            faixa2 = ((salario - 1903.98) * 0.075);
            resultado = faixa2 + faixa1;
        }
        if ((salario >= 2826.66) && (salario <= 3751.05)) {
            faixa = 3;
            faixa2 = 69.20;
            faixa3 = ((salario - 2826.66) * 0.15);
            resultado = faixa3 + faixa1 + faixa2;
        }
        if ((salario >= 3751.06) && (salario <= 4664.68)) {
            faixa = 4;
            faixa2 = 69.20;
            faixa3 = 138.66;
            faixa4 = ((salario - 3751.06) * 0.225);
            resultado = faixa4 + faixa1 + faixa2 + faixa3;
        }
        if ((salario > 4664.68)) {
            faixa = 5;
            faixa2 = 69.20;
            faixa3 = 138.66;
            faixa4 = 205.56;
            faixa5 = ((salario - 4664.68) * 0.275);
            resultado = faixa5 + faixa1 + faixa2 + faixa3 + faixa4;
        }

        // Apresentar resultado
        System.out.println("Você se enquadra na FAIXA " + faixa);
        if (faixa != 1) {
            System.out.printf("Com o Salario de R$ %.2f você tem que pagar R$ %.2f \n", salario, resultado);
            if (faixa >= 1) {
                System.out.printf("Faixa 1: R$ %.2f \n", faixa1);
            }
            if (faixa >= 2) {
                System.out.printf("Faixa 2: R$ %.2f \n", faixa2);
            }
            if (faixa >= 3) {
                System.out.printf("Faixa 3: R$ %.2f \n", faixa3);
            }
            if (faixa >= 4) {
                System.out.printf("Faixa 4: R$ %.2f \n", faixa4);
            }
            if (faixa >= 5) {
                System.out.printf("Faixa 5: R$ %.2f \n", faixa5);
            }
        }
    }
}
