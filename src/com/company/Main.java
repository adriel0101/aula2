package com.company;

public class Main {

    public static void main(String[] args) {

        int nota1 = 75;
        int nota2 = 59;
        int nota3 = 80;
        int nota4 = 70;
        int media = 0;

        media = (nota1 + nota2 + nota3 + nota4) / 4;
        if (media >= 70) {
            System.out.println("Aluno Aprovado" + " " +media);
        }

       else if (media >= 40 && media <= 69){
            System.out.println("Aluno de recuperação" + " " +media);
        }

        else{
            System.out.println("Aluno Reprovado" + " " +media);
        }


    }
}
