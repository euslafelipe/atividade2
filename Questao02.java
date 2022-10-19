package atividade2;

import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.print("Digite o primeiro numero: ");
            int n1 = ler.nextInt();
            System.out.println("Digite o segundo numero: ");
            int n2 = ler.nextInt();
            System.out.print("Digite o terceiro numero: ");
            int n3 = ler.nextInt();

            int menor = 0;
            int maior = 0;

        if (n1< n2) {
            if(n1 < n3)
                menor = n1;
            else
            menor = n3;
            
        }
        else{
            if(n2 < n3)
                menor = n2;
            else
                menor = n3;
        
        

        if (n1 > n2) {
            if(n1 > n3)
                maior = n1;
            else maior = n3;
            
        }
        else{
            if(n2 > n3)
                maior = n2;
            else
            maior = n3;
        }

        System.out.println("Maior valor = "+ maior);
		System.out.println("Menor valor = "+ menor);
        ler.close();

        }
        
    }
}
