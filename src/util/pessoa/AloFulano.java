// Escreva um código que receba o nome e o ano de nascimento de alguém e imprima na tela a seguinte mensagem: "Olá 'Fulano' você tem 'X' anos"
/**
 * Imports the Scanner class from java.util package for reading user input from the console.
 * Used to receive keyboard input in interactive console applications.
 */
import java.util.Scanner;

/**
 * A class that handles greeting messages with user's name and age calculation.
 * Takes user input for name and birth year to generate personalized messages.
 */
public class AloFulano {

    /**
    * Construtor padrão da classe AloFulano.
    */
    public AloFulano() {
        // Inicialização do objeto (se necessário)
    }
    /**
     * Prints a personalized greeting message with the person's name and age.
     * 
     * @param fulano The Pessoa object containing the person's information (name and birth year)
     */
    public static void imprimirMensagem(Pessoa fulano) {
        System.out.println("Olá " + fulano.getNome() + " você tem " + fulano.getIdade() + " anos");
    }

    /**
     * Main method to interact with the user, collect personal information,
     * create a Pessoa object, and display a personalized greeting message with the person's name and age.
     * 
     * @param args Command-line arguments (not used in this application)
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.print("Digite seu ano de nascimento: ");
        int anoNascimento = sc.nextInt();
        sc.close();
        Pessoa fulano = new Pessoa(nome, anoNascimento);
        imprimirMensagem(fulano);
    }

}

