package util.pessoa;
/**
 * A class representing a person with a name and year of birth.
 */
public class Pessoa {
    private String nome;
    private int anoNascimento;
    private int idade;

    /**
     * Constructs a new Pessoa with the specified name and year of birth.
     *
     * @param nome the name of the person
     * @param anoNascimento the year of birth of the person
     */
    public Pessoa(String nome, int anoNascimento, int idade) {
        this.nome = nome;
        this.idade = idade;
        this.anoNascimento = getAnoNascimento(idade);
    }

    /**
    * Getter -> Returns the name of the person.
    *
    * @return the name of the person
    */
    public String getNome() {
        return nome;
    }

    /**
    * Getter -> Returns the year of birth of the person.
    *
    * @return the year of birth of the person
    */
    public int getAnoNascimento(int idade) {
        int anoNascimento = AnoAtual.main(null) - idade;
        return anoNascimento;
    }

    /**
    * Calculates and returns the current age of the person based on their birth and actual year.
    *
    * @return the current age of the person
    */
    public int getIdade() {
        int anoAtual = AnoAtual.main(null);
        idade = anoAtual - anoNascimento;
        return idade;
    }
}
