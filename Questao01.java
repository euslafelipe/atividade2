package atividades.atividade2;

import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
    
        
    System.out.println("Digite um numero:");
        int num = ler.nextInt();
        if (num < 0 ) {
            System.out.println(num +" numero menor que zero ");
            
        }
        if (num > 0) {
            System.out.println(num+" numero maior que zero ");
            
        }
        if (num == 0) {
            System.out.println(num+" numero igual a zero ");
        }
ler.close();
        

    }
}
    
    

