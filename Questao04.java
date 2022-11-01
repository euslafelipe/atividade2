package atividades.atividade2;

import java.util.Scanner;

public class Questao04 {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.println("Digite sua Idade: ");
        int idade = ler.nextInt();
        if (idade >=18) {
            System.out.println("voce tem idade para dirigir");
            
        }else{
            System.out.println("voce nao tem idade para dirigir");
        }

        ler.close();
}

}