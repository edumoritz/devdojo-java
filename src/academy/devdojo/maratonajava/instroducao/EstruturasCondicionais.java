package academy.devdojo.maratonajava.instroducao;

public class EstruturasCondicionais {
    public static void main(String[] args) {

        Aula01();
        Aula02();
        Aula03();
        Aula04();


    }

    private static void Aula01() {
        int idade = 15;
        boolean isAutorizadoComprarBebiba = idade >= 18;
        // !

        if (isAutorizadoComprarBebiba) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        if(!isAutorizadoComprarBebiba){
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }
        boolean c = false;
        if(c == true){
            System.out.println("Dentro de algo que nunca deve ser feito");
        }

        System.out.println("Fora do if");
    }

    private static void Aula02() {
        // idade < 15 categoria infantil
        // idade >= 15 && idade < 18 categoria juvenil
        // idade >=18 categoria adulto
        int age = 10000;
        String categoria;

        if (age < 15) {
            categoria = "Categoria Infantil";
        } else if (age >= 15 && age < 18) {
            categoria = "Categoria Juvenil";
        } else {
            categoria = "Categoria Adulto";
        }
        System.out.println(categoria);
    }

    private static void Aula03() {
        // Doar se salario > 5000
        double salario = 6000;
        //(condicao) ? verdadeiro : falso

        String resultado = salario > 5000 ? "Eu vou doar 500 pro DevDojo" : "Ainda não tenho condições, mas vou ter!";

        System.out.println(resultado);
    }

    private static void Aula04() {
        double salarioAnual = 70000;
        double primeiraFaixa = 9.70 / 100;
        double segundaFaixa = 37.35 / 100;
        double terceiraFaixa = 49.50 / 100;
        double valorImposto;
        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * primeiraFaixa;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * segundaFaixa;
        } else {
            valorImposto = salarioAnual * terceiraFaixa;
        }
        System.out.println(valorImposto);
    }
}
