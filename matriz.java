import java.util.Scanner;

public class CadastroDeAlunos3 {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String[][] alunosDoFIC = new String[4][5];
        String[] cadastro = {"Digite o nome do Aluno",
                             "Digite a idade do Aluno",
                             "Digite o Curso do Aluno",
                             "Digite o período do Curso",
                             "Digite a duração do Curso"};

        // Loop para carregar o vetor
        for (int x = 0; x < 4; x++) {
            System.out.println("Digite os dados do Aluno " + (x + 1) + ":");
            for (int i = 0; i < 5; i++) {
                System.out.println(cadastro[i]);
                alunosDoFIC[x][i] = ler.nextLine();
            }
        }

        // Loop para imprimir todos os dados dos Alunos
        for (int x = 0; x < 4; x++) {
            System.out.println("\nDados do Aluno " + (x + 1) + ":");
            for (int i = 0; i < 5; i++) {
                System.out.println(cadastro[i] + ": " + alunosDoFIC[x][i]);
            }
        }

        // Buscar por idade maior ou igual
        System.out.println("\nBusque por idade maior ou igual:");
        int buscaPorIdade = ler.nextInt();
        int total = 0;

        // Loop para encontrar alunos com idade maior ou igual a buscaPorIdade
        for (int x = 0; x < 4; x++) {
            int idadeAluno = Integer.parseInt(alunosDoFIC[x][1]); // Converta a idade para inteiro
            if (idadeAluno >= buscaPorIdade) {
                total++;
            }
        }

        System.out.println("Número de alunos com idade maior ou igual a " + buscaPorIdade + ": " + total);
    }
}
