package patterns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlteracaoUpgradeTest {

    @Test
    void deveExecutarUpgrade() {
        IAlteracaoPlano alteracao = AlteracaoPlanoFactory.obterAlteracao("Upgrade");
        assertEquals("Upgrade de plano efetivado", alteracao.executar());
    }

    @Test
    void deveCancelarUpgrade() {
        IAlteracaoPlano alteracao = AlteracaoPlanoFactory.obterAlteracao("Upgrade");
        assertEquals("Upgrade de plano cancelado", alteracao.cancelar());
    }
}