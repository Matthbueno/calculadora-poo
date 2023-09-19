package poo;

import java.util.HashMap;
import java.util.Scanner;

class TestaNumero {
    public static void main(String[] args) {
        Numero n = new Numero();

        Scanner scan = new Scanner(System.in);

        while (true) {
            double x;
            double y;
            int operacao;

            System.out.println("""
                    digite a operação que deseja:\s
                     1 para soma
                     2 para subtração
                     3 para multiplicação
                     4 para divisão
                     ou 0 para terminar o programa"""
            );

            operacao = scan.nextInt();
            if (operacao == 0) {
                return;

            }

            System.out.println("informe o valor do primeiro numero: ");
            x = scan.nextDouble();
            System.out.println("informe o valor do segundo numero: ");
            y = scan.nextDouble();

            switch (operacao) {
                case 1:
                    imprimeCalculadora(operacao, n.soma(x, y), x, y);
                    break;
                case 2:
                    imprimeCalculadora(operacao, n.subtracao(x, y), x, y);
                    break;
                case 3:
                    imprimeCalculadora(operacao, n.multiplicacao(x, y), x, y);
                    break;
                case 4:
                    imprimeCalculadora(operacao, n.divisao(x, y), x, y);
                    break;


            }

        }

    }
    static void imprimeCalculadora(int operacao, double resultado, double x, double y) {
        HashMap <Integer, String> mapOperacao = new HashMap<>();
        mapOperacao.put(1, " somado");
        mapOperacao.put(2, " subtraido");
        mapOperacao.put(3, " multiplicado");
        mapOperacao.put(4, " dividido");

        System.out.println("\n O resultado de " + x + mapOperacao.get(operacao) + " por " + y + " é igual a: " + resultado + "\n");
    }
}
