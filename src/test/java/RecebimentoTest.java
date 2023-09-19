import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RecebimentoTest {
    @Test
    void deveExecutarRecebimento() {
        ILogistica logistica = LogisticaFactory.obterServico("Recebimento");
        assertEquals("Recebimento efetivada", logistica.executar());
    }

    @Test
    void deveCancelarRecebimento() {
        ILogistica logistica = LogisticaFactory.obterServico("Recebimento");
        assertEquals("Recebimento cancelado", logistica.cancelar());
    }
}
