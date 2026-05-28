import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ControleAcademicoServiceTest {

    @Test
    public void testCalcularMediaChamada2() {
        ControleAcademicoService service = new ControleAcademicoService();
        // Regra de Negócio: A média entre 7.0 e 9.0 deve ser rigidamente 8.0
        // Como o código legado está com defeito, vai resultar em 11.5 e falhar.
        assertEquals(8.0, service.calcularMedia(7.0, 9.0), 0.001);
    }

    // Método para forçar a execução sem depender de extensões travadas
    public static void main(String[] args) {
        System.out.println("=========================================");
        System.out.println("   EXECUTANDO TESTE JUNIT (CHAMADA 2)    ");
        System.out.println("=========================================");
        
        try {
            ControleAcademicoServiceTest suite = new ControleAcademicoServiceTest();
            suite.testCalcularMediaChamada2();
            System.out.println("\n[ SUCESSO ] testCalcularMediaChamada2 passou!");
        } catch (AssertionError e) {
            System.err.println("\n[ X - FALHA ] testCalcularMediaChamada2 FALHOU!");
            System.err.println(e.getMessage());
        }
        System.out.println("=========================================");
    }
}