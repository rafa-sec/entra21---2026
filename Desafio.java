import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        //programa();
        programa2();
    }

    public static void programa() {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu username: ");
        String username = input.nextLine();

        System.out.println("Digite um número: ");
        int numero1 = input.nextInt();

        System.out.println("Digite outro número: ");
        int numero2 = input.nextInt();
        
        System.out.println("Digite só mais um número: ");
        int numero3 = input.nextInt();

        int soma = numero1 + numero2 + numero3;
        int divisao = soma/3;

        System.out.println("Ok, " + username + " a média dos seus números é " + divisao);

    }

    public static void programa2() {
        Scanner input = new Scanner(System.in);

        String[] produtos = {"Pizza", "Hamburguer", "Refri", "Água"};
        int[] preco = {50, 20, 8, 4};


        System.out.println("Digite o nome de um produto: ");
        String nomeproduto = input.nextLine();



        System.out.println("Digite a quantidade do produto: ");
        int qtd = input.nextInt();

        switch (nomeproduto) {
            case "Pizza":
                int precofinal = preco[0];
                int total = precofinal*qtd;
                System.out.println("ok " + qtd + " " + nomeproduto + " vai ficar " + total + "R$");
                break;
                
            case "Hamburguer":
                precofinal = preco[1];
                total = precofinal*qtd;
                System.out.println("ok " + qtd + " " + nomeproduto + " vai ficar " + total + "R$");
                break;

            case "Refri":
                precofinal = preco[2];
                total = precofinal*qtd;
                System.out.println("ok " + qtd + " " + nomeproduto + " vai ficar " + total + "R$");
                break;

            case "Água":
                precofinal = preco[3];
                total = precofinal*qtd;
                System.out.println("ok " + qtd + " " + nomeproduto + " vai ficar " + total + "R$");
                break;
                
            default:
                throw new AssertionError();
        }





    }
}
