import java.util.Scanner;

public class Avancado {
    public static void main(String[] args) {
        //exercicio11();
        //exercicio12();
        //exercicio13();
        exercicio14();
        //exercicio15();
    }


    public static void exercicio11() {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Digite um ano: ");
        int ano = input.nextInt();
        if (ano % 4 == 0 ){
            System.out.println("É um ano bissexto! ");
        }else{
            System.out.println("Não é um ano bissexto ");
        }
    }

    public static void exercicio12() {
    Scanner input = new Scanner(System.in);

    System.out.println("Digite um número: ");
    int numero = input.nextInt();

    System.out.println("Digite outro número: ");
    int numero2 = input.nextInt();


    input.nextLine(); 

    System.out.println("Digite um símbolo (+, -, *, /): ");

    String operacao = input.nextLine();

    // Use .equals() instead of ==
    if (operacao.equals("+")) {
        System.out.println("Resultado: " + (numero + numero2));
    } else if (operacao.equals("-")) {
        System.out.println("Resultado: " + (numero - numero2));
    } else if (operacao.equals("*")) {
        System.out.println("Resultado: " + (numero * numero2));
    } else if (operacao.equals("/")) {
        if (numero2 != 0) {
            System.out.println("Resultado: " + (numero / numero2));
        } else {
            System.out.println("Erro: Divisão por zero!");
        }
    } else {
        System.out.println("Operação inválida!");
    }
}

    public static void exercicio13() {
        //Leia o salário e calcule imposto com base em faixas (você define as regras).
        Scanner input = new Scanner(System.in);

        int ipva = 100;
        int iptu = 13254;
        int ir = 2305;

        int impostos = ipva+iptu+ir;

        
        System.out.println("Digite seu salário: ");
        int salario = input.nextInt();
        int salariofinal = salario - impostos;
        
        System.out.println("Seu salário final é: " + salariofinal);
        System.out.println("Os impostos foram:");
        System.out.println("IPVA: " + ipva);
        System.out.println("IPTU: " + iptu);
        System.out.println("Imposto de renda: " + ir);
    }


    public static void exercicio14() {
        //Baseado no valor da compra:
        Scanner input = new Scanner(System.in);

        
        System.out.println("Digite o valor da compra: ");
        int valorcompra = input.nextInt();
        if (valorcompra <= 100 ){
            System.out.println("Sem desconto! ");
        }else if (valorcompra <= 500){
            double valorfinal = valorcompra*0.9;
            System.out.println(valorfinal);
        }else if (valorcompra > 500){
            double valorfinal = valorcompra*0.8;
            System.out.println(valorfinal);
        }
    }

    public static void exercicio15() {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Digite sua idade: ");
        int idade = input.nextInt();
        if (idade <= 12){
            System.out.println("Você é uma criança ");
        }else if (idade >= 13 || idade <= 17){
            System.out.println("Você é um adolescente");
        }else if (idade >= 18 || idade <= 59){
            System.out.println("Você é um adulto");
        }else if (idade >= 60){
            System.out.println("Você é um idoso");
        }
    }
}
