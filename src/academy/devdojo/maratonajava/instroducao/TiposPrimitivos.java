package academy.devdojo.maratonajava.instroducao;

public class TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, chat, byte, short, long, boolean

        int numeroInteiro = (int) 10000000000L;

        long numeroGrande = 10000;
        double salarioDouble = 2000;
        float salarioFloat = (float) 2500.D;
        byte idadeByte = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 87; // Valor numerico representa tabela ASCII
        char unicode = '\u0041';

        String nome = "Goku";
//        var nome2 = "Vegeta"; VersaoJava > 8

        System.out.println(numeroInteiro);

        System.out.println("Oi meu nome é " + nome);
    }
}
