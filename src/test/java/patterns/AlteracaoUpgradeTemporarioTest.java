package patterns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlteracaoUpgradeTemporarioTest {

    @Test
    void deveExecutarUpgradeTemporario() {
        IAlteracaoPlano alteracao = AlteracaoPlanoFactory.obterAlteracao("UpgradeTemporario");
        assertEquals("Upgrade temporário de plano efetivado", alteracao.executar());
    }

    @Test
    void deveCancelarUpgradeTemporario() {
        IAlteracaoPlano alteracao = AlteracaoPlanoFactory.obterAlteracao("UpgradeTemporario");
        assertEquals("Upgrade temporário de plano cancelado", alteracao.cancelar());
    }
}