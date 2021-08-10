package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.domain.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest {
    public static void main(String[] args) {
        test02();
    }

    private static void test01() {
        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("012345-209");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("1111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Oda Nobunaga");
        funcionario.setCpf("22222");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000);
        System.out.println("----------------");
        funcionario.imprime();
    }

    private static void test02() {
        // 0 - Bloco de inicialização estático da super classe é executado quando a JVM carregar classe pai
        // 1 - Bloco de inicialização estático da subclasse é executado quando a JVM carregar classe filha
        // 2 - Alocado espaco em memória pro objeto da superclasse
        // 3 - Cada atributo de superclasse é criado e inicializado com valores default ou o quer for passado
        // 4 - Bloco de inicialização da superclasse é executado na ordem em que aparece
        // 5 - Construtor é executado da superclasse
        // 6 - Alocado espaco em memória pro objeto da subclasse
        // 7 - Cada atributo de subclasse é criado e inicializado com valores default ou o quer for passado
        // 8 - Bloco de inicialização da subclasse é executado na ordem em que aparece
        // 9 - Construtor é executado da subclasse
        Funcionario funcionario = new Funcionario("Jiraya");
    }
}
