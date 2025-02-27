import java.util.Scanner;

public class Media {
    public static void main(String[] args) {
        double somaAlturas=0.0, media;
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite a altura do 1º Aluno: ");
        somaAlturas = somaAlturas + leitor.nextDouble();
        System.out.println("Digite a altura do 2º Aluno: ");
        somaAlturas = somaAlturas + leitor.nextDouble();
        System.out.println("Digite a altura do 3º Aluno: ");
        somaAlturas = somaAlturas + leitor.nextDouble();
        System.out.println("Digite a altura do 4º Aluno: ");
        somaAlturas = somaAlturas + leitor.nextDouble();
        System.out.println("Digite a altura do 5º Aluno: ");
        somaAlturas = somaAlturas + leitor.nextDouble();
        System.out.println("Digite a altura do 6º Aluno: ");
        somaAlturas = somaAlturas + leitor.nextDouble();
        media = somaAlturas/6;
        System.out.println("Media ded altura dos alunos é de " + media);
        leitor.close();
    }
}
