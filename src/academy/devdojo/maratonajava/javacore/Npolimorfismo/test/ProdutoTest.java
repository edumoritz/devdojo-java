package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Televisao;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repositorio;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.LinkedList;
import java.util.List;

public class ProdutoTest {
    public static void main(String[] args) {
//        Aula01();
//        Aula02();
//        Aula03();
        Aula04();
    }

    private static void Aula01() {
        Computador computador = new Computador("NUC10i7", 11000);
        Tomate tomate = new Tomate("Tomate Siciliano", 10);
        Televisao tv = new Televisao("Samsung 50\" ", 5000);

        CalculadoraImposto.calcularImposto(computador);
        System.out.println("-------------------------");
        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-------------------------");
        CalculadoraImposto.calcularImposto(tv);
    }

    private static void Aula02() {
        Produto produto = new Computador("Ryzen 9", 3000);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto());
        System.out.println("------------");

        Produto produto2 = new Tomate("Americano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }

    private static void Aula03() {
        Produto produto = new Computador("Ryzen 9", 3000);

        Tomate tomate = new Tomate("Americano", 20);
        tomate.setDataValidade("11/12/2021");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("-----------------");
        CalculadoraImposto.calcularImposto(produto);

    }

    private static void Aula04() {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);

    }
}
