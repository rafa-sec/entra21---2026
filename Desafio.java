import java.util.Scanner;

public class Desafio {
        static Scanner input = new Scanner(System.in);
        public static void main(String[] args) {
            //exercicio16();
            //exercicio17();
            //exercicio18();
            exercicio19();
            //exercicio20();
        }


        public static void exercicio16() {

            int nota1 = input.nextInt();
            int nota2 = input.nextInt();
            int nota3 = input.nextInt();


            int soma = nota1+nota2+nota3;
            int result = soma/3;

            if (result >= 7){
                System.out.println("Aprovado");
            } else if (result >= 4 && result <= 6 ){
                System.out.println("Recuperação");
            } else {
                System.out.println("Reprovado");
            }


        }

        public static void exercicio17() {
            System.out.println("Bem-vindo ao banco online!");
            
            System.out.println("Qual o seu salário?");
            int salario = input.nextInt();
            
            System.out.println("Qual o valor do empréstimo?");
            int emprestimo = input.nextInt();
            
            System.out.println("Em quantas parcelas você vai querer pagar?");
            int parcela = input.nextInt();


            int pormes = emprestimo/parcela;

            if (salario >= pormes){
                System.out.println("Você está apto a fazer o empréstimo!");
            }else{
                System.out.println("Você não está apto a fazer o empréstimo!");
            }


            
        }

        public static void exercicio18() {
            int numeroPresetado = 14;


            
            System.out.println("Digite um número");
            int numero = input.nextInt();


            while (numero < numeroPresetado) {
                System.out.println("É um número maior");
                System.out.println("Tente outra vez");
                numero = input.nextInt();
            }

            while (numero > numeroPresetado){
                System.out.println("É um número menor");
                System.out.println("Tente outra vez");
                numero = input.nextInt();
            }

            if (numero == numeroPresetado){
                System.out.println("Acertou!");
            }
        }

        public static void exercicio19() {
            System.out.println("Diga o seu peso: ");
            double peso = input.nextByte();
            
            System.out.println("Digite sua altura");
            double altura = input.nextByte();
            
            double alturaFinal = altura*altura;

            double imc = peso/alturaFinal;

            System.out.println("Seu IMC é: " + imc);


        }

}
