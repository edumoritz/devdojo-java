package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringTest {
    public static void main(String[] args) {
        Test01();
        Test02();
    }

    private static void Test01() {
        String nome = "William"; //String constant pool
        String nome2 = "William";
        nome = nome.concat(" Suane");
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("William"); // 1 variavel de referência, 2 objeto do tipo string, 3 uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }

    private static void Test02() {
        String nome = "Luffy";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("f","l"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(3,numeros.length()));
        System.out.println(nome.trim());
    }



}
