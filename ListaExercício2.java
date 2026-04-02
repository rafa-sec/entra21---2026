import java.util.Scanner;

public class ListaExercício2 {
    public static void main(String[] args) {
        //exercicio5();
        //exercicio6();
        //exercicio7();
        exercicio8();
        
    }

    public static void exercicio5() {
        //Crie um programa que peça ao usuário seu nome e exiba uma mensagem de boas-vindas
        Scanner input = new Scanner(System.in);

        System.out.println("Olá bem-vindo ao meu programa! Digite seu nome por favor: ");
        String nome = input.nextLine();
        System.out.println("Olá " + nome);
    }

    public static void exercicio6() {
        //Solicite ao usuário sua idade e exiba quantos anos ele terá daqui a 10 anos.
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade");
        int idade = input.nextInt();
        int idadefinal = idade + 10;
        System.out.println("Essa é sua idade daqui a 10 anos: " + idadefinal);
    }

    public static void exercicio7() {
        //Peça dois números inteiros ao usuário e mostre a soma.
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero1 = input.nextInt();
        System.out.println("Digite mais um número: ");
        int numero2 = input.nextInt();

        int soma = numero1 + numero2;
        System.out.println("Aqui está a soma dos dois números: " + soma);
    }

    public static void exercicio8() {
        //Solicite um número decimal e exiba o dobro desse número
        Scanner input = new Scanner(System.in);

        System.out.println("Digite um número decimal: ");
        Float numero1 = input.nextFloat();

        System.out.println("Digite outro número decimal: ");
        Float numero2 = input.nextFloat();


        Float soma = numero1 + numero2;
        System.out.println("Aqui está a soma dos dois números que você digitou: " + soma);
    }
}
