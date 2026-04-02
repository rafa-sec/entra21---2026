import java.util.Scanner;

public class ListaExercício3 {
    public static void main(String[] args) {
        //exercicio9();
        //exercicio10();
        //exercicio11();
        exercicio12();
        
    }

    public static void exercicio9() {
        //Peça ao usuário o valor de um produto e calcule um desconto de 10%.
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor de um produto: ");
        int valor = input.nextInt();

        Float valordesconto = valor * 0.1f;
        Float valordescontado = valor * 0.9f;

        System.out.println("O desconto será de: " + valordesconto);
        System.out.println("O valor já descontado será de: " + valordescontado);

    }

    public static void exercicio10() {
        //Solicite a largura e altura de um retângulo e calcule a área.
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a largura de um retângulo: ");
        Float largura = input.nextFloat();
        System.out.println("Insira a altura de um retângulo: ");
        Float altura = input.nextFloat();

        Float multiplicacao = largura * altura;
        Float divisao = multiplicacao/2;

        System.out.println("A área de seu retângulo é: " + divisao);
    }

    public static void exercicio11() {
        //Peça três notas e calcule a média do aluno
        Scanner input = new Scanner(System.in);

        System.out.println("Insira sua primeira nota: ");
        Float nota1 = input.nextFloat();
        System.out.println("Insira sua segunda nota: ");
        Float nota2 = input.nextFloat();
        System.out.println("Insira sua terceira nota: ");
        Float nota3 = input.nextFloat();

        Float soma = nota1 + nota2 + nota3;
        Float divisao = soma/3;

        System.out.println(divisao);
    }

    public static void exercicio12() {
        //Solicite o salário de um funcionário e aplique um aumento de 15%.
        Scanner input = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        Float salario = input.nextFloat();

        Float aumento = salario * 1.15f;
        System.out.println("Seu novo salário é: " + aumento);
    }
}
