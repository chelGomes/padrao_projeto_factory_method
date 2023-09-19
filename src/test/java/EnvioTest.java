import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EnvioTest {
    @Test
    void deveExecutarEnvio() {
        ILogistica logistica = LogisticaFactory.obterServico("Envio");
        assertEquals("Envio do pedido efetivado", logistica.executar());
    }

    @Test
    void deveCancelarEnvio() {
        ILogistica logistica = LogisticaFactory.obterServico("Envio");
        assertEquals("Envio do pedido cancelado", logistica.cancelar());
    }
}
