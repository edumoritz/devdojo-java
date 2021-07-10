package academy.devdojo.maratonajava.instroducao;

public class EstruturasCondicionais02 {
    public static void main(String[] args) {
     Aula01();
     Aula02();
    }

    private static void Aula01() {
        // Imprima o dia da semana, considerando 1 como domingo
        byte dia = 10;
        // char, int, byte, short, enum, String
        switch (dia) {
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Ter");
                break;
            case 4:
                System.out.println("Qua");
                break;
            case 5:
                System.out.println("Qui");
                break;
            case 6:
                System.out.println("Sex");
                break;
            case 7:
                System.out.println("Sab");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }

        String sexo = "F";
        switch (sexo){
            case "M":
                System.out.println("Homem");
                break;
            case "F": {
                System.out.println("Mulher");
                break;
            }
            default:
                System.out.println("Inválido");
                break;
        }
    }

    private static void Aula02() {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo
        byte dia = 6;
        switch (dia) {
            case 1:
            case 7:
                System.out.println("FDS");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            default:
                System.out.println("Opção inválida");
                break;
        }
    }
}
