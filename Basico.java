import java.util.Scanner;

public class Basico{

    public static void main(String[] args) {
        //exercicio1();
        exercicio2();
        //exercicio3();
        //exercicio4();
    }
    

    public static void exercicio1(){
        //Leia um número inteiro e informe se ele é par ou ímpar.
        Scanner input = new Scanner(System.in);

        
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        int resultado = numero/2;


        if (numero % 2 == 0) {
            System.out.println("O número é par");
          }
          else {
            System.out.println("O número é ímpar");
          }

    }

    public static void exercicio2(){
        //Leia dois números e mostre qual é o maior.
        Scanner input = new Scanner(System.in);
        int numero1 = input.nextInt();
        int numero2 = input.nextInt();

        if (numero1 > numero2){
            System.out.println("Número 1 é maior que o número 2");
        }else{
            System.out.println("Número 2 é maior que o número 1");
        }

    }

    public static void exercicio3(){
        //Leia um número e diga se ele é positivo, negativo ou zero.
        Scanner input = new Scanner(System.in);

        
        System.out.println("Digite um número: ");
        int numero = input.nextInt();

        if (numero > 0) {
            System.out.println("O número é positivo");
          }
          else if(numero < 0) {
            System.out.println("O número é negativo");
          }
          else if(numero == 0){
            System.out.println("O número é zero");
          }

    }

    public static void exercicio4(){
        //Leia a nota de um aluno (0 a 10). Se for maior ou igual a 6, mostre "Aprovado", senão "Reprovado".
        Scanner input = new Scanner(System.in);

        
        System.out.println("Digite sua nota: ");
        int numero = input.nextInt();


        if (numero >= 6) {
            System.out.println("aprovado");
          }
          else {
            System.out.println("reprovado");
          }

    }

    public static void exercicio5(){
        //Leia a idade de uma pessoa e informe se ela pode votar (idade ≥ 16)
        Scanner input = new Scanner(System.in);

        
        System.out.println("Digite sua idade: ");
        int numero = input.nextInt();


        if (numero >= 16) {
            System.out.println("pode votar");
          }
          else {
            System.out.println("não pode votar");
          }

    }
}


