package academy.devdojo.maratonajava.instroducao;

public class Arrays {
    public static void main(String[] args) {
        Aula01();
        Aula02();
        Aula03();
    }

    private static void Aula01() {
        int[] idades = new int[3];
        idades[0] = 21;
        idades[1] = 15;
        idades[2] = 11;
        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }

    private static void Aula02() {
        // byte, short, int, long, float e double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String[] nomes = new String[3];
        nomes[0] = "Goku";
        nomes[1] = "Kurosaki";
        nomes[2] = "Luffy";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }

    }

    private static void Aula03() {
        int[] numeros = new int[3];
        int[] numeros2 = {1, 2, 3, 4, 5};
        int[] numeros3 = new int[]{5, 4, 3, 2, 1};

        //        for (int i = 0; i < numeros3.length; i++) {
        //            System.out.println(numeros3[i]);
        //        }
        //
        for (int num : numeros3) {
            System.out.println(num);
        }
    }
}
