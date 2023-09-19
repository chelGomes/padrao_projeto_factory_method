import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

public class LogisticaFactoryTest {
    @Test
    void deveRetornarExcecaoDeLogisticaInexistente() {
        try {
            ILogistica logistica = LogisticaFactory.obterServico("Logistica");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Logistica inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoDeLogisticaInvalida() {
        try {
            ILogistica logistica = LogisticaFactory.obterServico("Logistica");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Logistica inválida", e.getMessage());
        }
    }
}

