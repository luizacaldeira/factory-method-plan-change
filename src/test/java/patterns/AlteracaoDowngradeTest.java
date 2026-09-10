package patterns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlteracaoDowngradeTest {

    @Test
    void deveExecutarDowngrade() {
        IAlteracaoPlano alteracao = AlteracaoPlanoFactory.obterAlteracao("Downgrade");
        assertEquals("Downgrade de plano efetivado", alteracao.executar());
    }

    @Test
    void deveCancelarDowngrade() {
        IAlteracaoPlano alteracao = AlteracaoPlanoFactory.obterAlteracao("Downgrade");
        assertEquals("Downgrade de plano cancelado", alteracao.cancelar());
    }
}