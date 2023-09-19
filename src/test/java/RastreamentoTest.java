import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RastreamentoTest {
    @Test
    void deveExecutarRastreamento() {
        ILogistica logistica = LogisticaFactory.obterServico("Rastreamento");
        assertEquals("Rastreamento efetivada", logistica.executar());
    }

    @Test
    void deveCancelarRastreamento() {
        ILogistica logistica = LogisticaFactory.obterServico("Rastreamento");
        assertEquals("Rastreamento cancelada", logistica.cancelar());
    }
}
