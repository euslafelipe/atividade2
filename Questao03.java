package atividades.atividade2;

import java.util.Scanner;

public class Questao03 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua Idade: ");
        int idade = ler.nextInt();
        if (idade >=16) {
            System.out.println("voce tem idade para votar");
            
        }else{
            System.out.println("voce nao tem idade para votar");
        }

        ler.close();
}

}