import java.util.Scanner;

public class ListaExercício4 {
    public static void main(String[] args) {
        //exercicio13();
        //exercicio14();
        //exercicio15();
        exercicio16();
    }

    public static void exercicio13() {
        //Peça o nome e a idade de uma pessoa e exiba: Olá [nome], você tem [idade] anos!
        Scanner input = new Scanner(System.in);

        String nome = input.nextLine();
        int idade = input.nextInt();

        System.out.println("Olá " + nome + ", você tem " + idade + " anos!");
    }

    public static void exercicio14() {
        //Solicite dois números e mostre: soma, subtração, divisão e multiplicação
        Scanner input = new Scanner(System.in);
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();

        int soma = numero1 + numero2;
        int subtracao = numero1 - numero2;
        int divisao = numero1/numero2;
        int multiplicacao = numero1*numero2;


        System.out.println("soma: " + soma);
        System.out.println("subtracao: " + subtracao);
        System.out.println("divisão: " + divisao);
        System.out.println("multiplicação: " + multiplicacao);


        
    }

    public static void exercicio15() {
        //Crie um programa que converta Celsius para Fahrenheit; Fórmula: F = (C * 9/5) + 32
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua temperatura atual: ");
        int C = input.nextInt();

        int multiplicacao = C * 9;
        int divisao = multiplicacao/5;
        int soma = divisao + 32;
        System.out.println("Aqui está em Fahrenheit: " + soma);

    }

    public static void exercicio16() {
        //Peça ao usuário a quantidade de horas trabalhadas e o valor por hora, e calcule o salário total.
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu total de horas trabalhadas: ");
        int horastrabalhadas = input.nextInt();

        System.out.println("Digite seu valor por hora: ");
        int valorporhora = input.nextInt();


        int total = horastrabalhadas*valorporhora;
        System.out.println("Aqui está seu salário total : " + total);
    }
}
