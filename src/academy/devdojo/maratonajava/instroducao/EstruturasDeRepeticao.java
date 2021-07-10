package academy.devdojo.maratonajava.instroducao;

public class EstruturasDeRepeticao {
    public static void main(String[] args) {
        Aula01();
        Aula02();

        // Parar estrutura de repetição (Break)
        Aula03();

        // Exercicio
        Aula04();

        // Continue
        Aula05();
    }

    private static void Aula01() {
        // while, do while, for
        int count = 0;
        while (count < 10) {
            System.out.println(++count);
        }

        count = 0;
        do {
            System.out.println("dentro do do-while " + ++count);
        } while (count < 10);

        for (int i=0; i < 10; i++) {
            System.out.println("For "+i);
        }
    }

    private static void Aula02() {
        // Imprima todos os números pares de 0 até 1000000
        for (int i = 1; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    private static void Aula03() {
        int valorMax = 50;
        for (int i = 0; i <= valorMax; i++) {
            if (i > 25) {
                break;
            }

            System.out.println(i);
        }
    }

    private static void Aula04() {
        // Dado o valor de um carro, descubra em quantas ele pode ser parcelado
        // Condição valorParcela >= 1000
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }

    private static void Aula05() {
        double valorTotal = 30000;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
        }
    }
}
