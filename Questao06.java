package atividade2;

import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        System.out.print("Digite o seu peso: ");
        int peso = ler.nextInt();
        System.out.print("Digite sua altura: ");
        Double altura = ler.nextDouble();
        Double aa = altura * altura;
        Double d = (double) peso;
        Double imc = d / aa;
        ler.close();

        if (imc < 20) {
            System.out.println("abaixo do normal");
            
        }
        if (imc >= 20 && imc < 25 ) {
            System.out.println("normal");
            
        }
        if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
            
        }
        if (imc >= 30 && imc < 35) {
            System.out.println("Obesidade leve");
            
        }
        if (imc >= 35 && imc < 40) {
            System.out.println("Obesidade moderada");

        }
        if (imc >= 40) {
                System.out.println("Obesidade mórbida");
            
        }
        
        
    }
}
