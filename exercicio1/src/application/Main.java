package application;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int multiplicando, inicioMultiplicador, finalMultiplicador;

        System.out.println("Digite o multiplicando desejado");
        multiplicando = sc.nextInt();

        System.out.println("Digite o multiplicador inicial");
        inicioMultiplicador = sc.nextInt();

        System.out.println("Digite o multiplicador final");
        finalMultiplicador = sc.nextInt();

        if (multiplicando < 0 || multiplicando > 3000)
            System.out.println("O multiplicando deve estar entre 0 e 3000");
        if (inicioMultiplicador < 0 || inicioMultiplicador > 3000)
            System.out.println("O primeiro multiplicador da sequencia deve estar entre 0 e 3000");
        if (finalMultiplicador < 0 || finalMultiplicador > 3000)
            System.out.println("O ultimo multiplicador da sequencia deve estar entre 0 e 3000");
        if (finalMultiplicador - inicioMultiplicador <= 10 ){
             if((finalMultiplicador - inicioMultiplicador) >= 1){
                for (int i = inicioMultiplicador; i <= finalMultiplicador; i++){
                    int  produto = multiplicando * i;
                    System.out.println(multiplicando + " * " + i + " = " + produto);
                }
             }
             else{
                 System.out.println("O inicio do intervalo deve ser menor que seu fim");
             }
        }else{
            System.out.println("O intervalo não pode ter uma diferenca maior que 10");
        }
        sc.close();
    }
}
