
import java.util.Scanner;


public class aula {

    public static void main(String[] args) {

        //aulaArrays();
        //exercicio1();
        exercicio2();
        
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

}
