# -atividade-debug-java-desenvolvedores-senai
Teste de um código criado na linguagem Java com alguns bugs
O código deverá fazer soma de dois  números e entregar o resultado da soma dos dois, após isso ele deve entregar a média entre esses dois números.

import java.util.Scanner;

public class atividade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma =0;

        for (int i = 1; i < 2; i++) {
        System.out.println("Digite um numero:");
        int num = sc.nextInt();
        soma = num;
        }
        System.out.println("Soma total:" + soma);
        System.out.println("Media:" + soma/1);
        
    }
}
