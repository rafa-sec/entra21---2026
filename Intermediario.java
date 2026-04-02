import java.util.Scanner;

public class Intermediario {
    public static void main(String[] args) {
        //exercicio6();
        //exercicio7();
        //exercicio8();
        exercicio9();
        //exercicio10();
    }


    public static void exercicio6() {
        //Verifique qual de 3 números é o maior
        Scanner input = new Scanner(System.in);
        
        System.out.println("Digite três números:");
        int n1 = input.nextInt();
        int n2 = input.nextInt();
        int n3 = input.nextInt();
    
        if (n1 >= n2 && n1 >= n3) {
            System.out.println(n1 + " é o maior.");
        } else if (n2 >= n1 && n2 >= n3) {
            System.out.println(n2 + " é o maior.");
        } else {
            // If it's not n1 or n2, it must be n3
            System.out.println(n3 + " é o maior.");
        }
    }


    public static void exercicio7(){
        //Leia uma nota de 0 a 10 e classifique: a. 0–4: Insuficiente b. 5–6: Regular c. 7–8: Bom d. 9–10: Excelente
        Scanner input = new Scanner(System.in);

        
        System.out.println("Digite um número: ");
        int nota = input.nextInt();


        if (nota >= 4 && nota <= 0) {
            System.out.println("Insuficiente");
          }
        else if (nota >= 5 && nota <= 6){
            System.out.println("Regular");
        }else if (nota >= 7 && nota <= 8){
            System.out.println("Bom");
        }else if (nota >= 9 && nota >= 10) {
            System.out.println("Excelente");
        }

    }


    public static void exercicio8(){
        //Leia três lados e verifique se formam um triângulo (regra: soma de dois lados > terceiro).
        Scanner input = new Scanner(System.in);

        
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        int numero2 = input.nextInt();
        int numero3 = input.nextInt();

        if (numero + numero2 > numero3 || numero + numero3 > numero2 || numero2 + numero3 > numero) {
            System.out.println("É um triângulo");
          }
          else {
            System.out.println("Não é um triângulo");
          }

    }


    public static void exercicio9(){
        //Com base nos lados, diga se é:
        Scanner input = new Scanner(System.in);

                
        System.out.println("Digite um número: ");
        int numero = input.nextInt();
        int numero2 = input.nextInt();
        int numero3 = input.nextInt();

        if (numero + numero2 > numero3 || numero + numero3 > numero2 || numero2 + numero3 > numero) {
            System.out.println("É um triângulo");
          }
          else {
            System.out.println("Não é um triângulo");
          }

        if (numero == numero2 && numero == numero3 && numero2 == numero3){
            System.out.println("É um triângulo equilátero");
        } else if (numero == numero2 || numero == numero3 || numero2 == numero3){
            System.out.println("É um triângulo isósceles");
        } else if (numero != numero2 && numero != numero3 && numero3 != numero2){
            System.out.println("É um triângulo escaleno");
        }

    }


    public static void exercicio10(){
        //Peça usuário e senha. Se forem iguais a valores pré-definidos, mostre "Acesso permitido", senão "Negado".
        Scanner input = new Scanner(System.in);

        
        System.out.println("Digite o nome: ");
        String username = input.nextLine();
        System.out.println("Digite a senha: ");
        String pass = input.nextLine();

        String usernamecheck = "rafael";
        String passcheck = "1234rafael";


        if (username == usernamecheck && pass == passcheck) {
            System.out.println("Logado!");
          }
          else {
            System.out.println("Não está logado! Alguma de suas credenciais esta errada!");
          }

    }
}
