import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Aula {

    public static void main(String[] args) {

        //aulaArrays();
        //exercicio1();
        ///////exercicio2();
        //exercicio3();
        //exercicio4();
        //exercicio5();
        exercicio6();
        
    }

    public static void aulaArrays() {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};

        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }

        System.out.println(" ");

        for(int i = 0; i < cars.length; i++){
            System.out.println(i + " -> " + cars[i]);
        }

        System.out.println(" ");

        int x = 0;
        while(x < cars.length) {
            System.out.println(x + " -> " + cars[x]);
            x++;
        }
    }

    public static void exercicio1() {
       //Crie um array de 5 posições e solicite que o usuário informe os números. Em seguida percorra o array e mostre o dobro do número que ocupa a posição.
        Scanner scanner = new Scanner(System.in);
        int[] array = {0,0,0,0,0};

        for(int i = 0; i < array.length; i++){
            System.out.println("Defina o valor " + i + " para a array: ");
            int valor = scanner.nextInt();
            array[i] = valor;
        }
        System.out.println(" ");

        for(int i = 0; i < array.length; i++){
            System.out.println("valor #"+i + " -> " + array[i]);
        }

        System.out.println(" ");

        System.out.println("O dobro dos valores da array: ");
        for(int i = 0; i < array.length; i++){
            
            System.out.println("valor #"+i + " -> " + array[i]*2);
        }
    }

    public static void exercicio2() {
        //Crie um array de 10 números. Solicite ao usuário que informe dados. Verifique quais números digitados são pares e quais são ímpares.
        Scanner scanner = new Scanner(System.in);
        int[] array = {0,0,0,0,0,0,0,0,0,0};
        for(int i = 0; i < array.length; i++){
            System.out.println("Defina o valor " + i + " para a array: ");
            int valor = scanner.nextInt();
            array[i] = valor;
        }

        for(int i = 0; i < array.length; i++){
            if(array[i] % 2 == 0){
                System.out.println("valor #"+i + " -> " + array[i] + " é par!");
            } else {
                System.out.println("valor #"+i + " -> " + array[i] + " é ímpar!");
            }

        }


    }


    public static void exercicio3(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 10 valores com dígitos de 1 a 10.");
        int[] array = {0,0,0,0,0,0,0,0,0,0};

        for(int i = 0; i < array.length; i++){
            int valor_atual = i+1;
            System.out.println("Defina o valor " + "#" +valor_atual + " para a array: ");
            int valor = scanner.nextInt();
            array[i] = valor;
        }

        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }

    public static void exercicio4(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 15 valores");
        ArrayList<Integer> list = new ArrayList<>();

        int i;
        for(i = 0; i < 15; i++){
            System.out.println("Defina o valor " + "#" + i + " para a array: ");
            int valor = scanner.nextInt();
            list.add(valor);
        }

        //Definir o valor máximo
        int max = Collections.max(list);
        int position = list.indexOf(max);


        System.out.println("O maior valor é: "+max + " que esta na posição " + position);


    }

    public static void exercicio5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 8 valores");

        //Definir uma ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        //Pegar os 15 valores
        for(int i = 0; i < 8; i++){
            int valor_atual = i+1;
            System.out.println("Defina o valor " + "#" +valor_atual + " para a array: ");
            int valor = scanner.nextInt();
            list.add(valor);
        }

        //Definir o valor máximo
        int max = Collections.max(list);
        //Deixar em ordem decrescente
        Collections.sort(list, Collections.reverseOrder());


        System.out.println("Do maior para o menor valor:");
        for (int valor : list) {
            System.out.println("Valor: " + valor);
        }


    }

    public static void exercicio6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite 6 valores");

        //Definir uma ArrayList
        ArrayList<Integer> list = new ArrayList<>();

        //Pegar os 15 valores
        for(int i = 0; i < 6; i++){
            int valor_atual = i+1;
            System.out.println("Defina o valor " + "#" +valor_atual + " para a array: ");
            int valor = scanner.nextInt();
            list.add(valor);
        }

        double sum = 0;
        for(int valor: list){
            sum += valor;
        }
        
        double mean = sum / list.size();
        System.out.println("A média é:" + mean);


    }
}
