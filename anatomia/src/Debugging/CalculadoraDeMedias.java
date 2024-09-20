package Debugging;

import java.util.Scanner;

public class CalculadoraDeMedias {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] alunos = { "Camila", "Lucas", "Vitorio", "Leticia" };

        int media = calculaMediaDaTurma(alunos, scan);

        System.out.printf("Média da turma %d", media);
    }

    public static int calculaMediaDaTurma(String[] alunos, Scanner scanner) {
        int soma = 0;
        for (String aluno : alunos) {
            System.out.printf("Nota do alunos %S: ", aluno);
            int nota = scanner.nextInt();
            soma += nota;
        }
        return soma / alunos.length;
    }
}
