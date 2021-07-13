package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {

//        Aula01();
//        Aula02();
//        Aula03();
//        Aula04();
        Aula05();

    }

    private static void Aula01() {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.subtraiDoisNumeros();
    }

    private static void Aula02() {
        Calculadora calculadora = new Calculadora();

        calculadora.multiplicaDoisNumeros(10, 20.5F);
    }

    private static void Aula03() {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.divideDoisNumeros(20,0);
        System.out.println(result);
        System.out.println(calculadora.divideDoisNumeros02(20,0));
        System.out.println("-----------");
        calculadora.imprimeDivisaoDeDoisNumeros(86,0);
    }

    private static void Aula04() {
        Calculadora calculadora = new Calculadora();
        int a = 1;
        int b = 2;
        calculadora.alteraDoisNumeros(a, b);
        System.out.println("Dentro CalculadoraTest04");
        System.out.println("Num1 "+a);
        System.out.println("Num2 "+b);
    }

    private static void Aula05() {
        Calculadora calculadora = new Calculadora();
        int[] numeros = {1,2,3,4,5};
        calculadora.somaArray(numeros);
        calculadora.somaVarArgs(1,2,3,4,5,6,7);
    }
}
