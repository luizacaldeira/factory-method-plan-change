package patterns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlteracaoPlanoFactoryTest {

    @Test
    void deveRetornarExcecaoParaTipoInexistente() {
        try {
            IAlteracaoPlano alteracao = AlteracaoPlanoFactory.obterAlteracao("Renegociacao");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de alteração inexistente", e.getMessage());
        }
    }

    @Test
    void deveRetornarExcecaoParaTipoInvalido() {
        try {
            IAlteracaoPlano alteracao = AlteracaoPlanoFactory.obterAlteracao("Cancelamento");
            fail();
        } catch (IllegalArgumentException e) {
            assertEquals("Tipo de alteração inválido", e.getMessage());
        }
    }
}