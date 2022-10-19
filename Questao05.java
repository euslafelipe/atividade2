package atividade2;

import java.util.Scanner;

public class Questao05 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite sua idade: ");
            int idade = ler.nextInt();
        

        if(idade >= 16 && idade < 18){
            System.out.println("Pode votar, mas não pode dirigir");
        if (idade >=18) {
            System.out.println("“Pode votar e pode dirigir");
            if (idade < 16) {
                System.out.println("Não pode nem votar e nem dirigir");

                
            }
        ler.close();
        }


        }
        
    }
}