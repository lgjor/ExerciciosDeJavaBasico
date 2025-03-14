package util.pessoa;

import java.util.Scanner;
import util.ValidaValorInt;

public class DiferencaDeIdade {

    public DiferencaDeIdade() {
        // Inicialização do objeto (se necessário)
        
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Pessoa pessoa1 = getPessoa(scanner, "da primeira pessoa: ");
        Pessoa pessoa2 = getPessoa(scanner, "da Segunda pessoa: ");
        scanner.close();
        calculaDiferencaDeIdade(pessoa1, pessoa2);
    }

    public static Pessoa getPessoa (Scanner scanner, String message){
        System.out.print("Digite o nome "+message);
        String nome = scanner.next();
        int idade = ValidaValorInt.validaValorInt(scanner, "Digite a idade "+message);
        Pessoa pessoaX = new Pessoa(nome, 0, idade);
        return pessoaX;
    }
    public static void calculaDiferencaDeIdade(Pessoa pessoa1, Pessoa pessoa2) {
        int idade1 = pessoa1.getIdade();
        int idade2 = pessoa2.getIdade();
        if (idade1>idade2){
            int diferencaIdade = pessoa1.getIdade() - pessoa2.getIdade();
            System.out.println("A diferença de idade entre " + pessoa1.getNome() + " e " + pessoa2.getNome() + " é de " + Math.abs(diferencaIdade) + " anos.");
            return;
        } else if (idade1==idade2){
            System.out.println("As pessoas possuem a mesma idade");
            return;
        }
        int diferencaIdade = pessoa2.getIdade() - pessoa1.getIdade();
        System.out.println("A diferença de idade entre " + pessoa1.getNome() + " e " + pessoa2.getNome() + " é de " + Math.abs(diferencaIdade) + " anos.");
        
    }
}

