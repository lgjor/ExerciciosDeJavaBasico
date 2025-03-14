package util.pessoa;
/**
 * Imports the Year class from java.time package to retrieve the current year.
 */
import java.time.Year;

/**
 * Gets the current year from the system calendar
 */
public class AnoAtual {
    /**
     * Construtor padrão da classe MinhaClasse.
     */
    public AnoAtual() {
        // Inicialização do objeto (se necessário)
}
    /**
     * Retrieves the current year from the system calendar.
     *
     * @param args Command-line arguments (not used in this method)
     * @return The current year as an integer
     */
    public static int main(String[] args) {
        int ano = Year.now().getValue();
        return ano;
    }
}