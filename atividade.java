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
