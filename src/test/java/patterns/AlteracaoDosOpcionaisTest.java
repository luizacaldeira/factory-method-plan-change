package patterns;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlteracaoDosOpcionaisTest {

    @Test
    void deveExecutarAlteracaoDosOpcionais() {
        IAlteracaoPlano alteracao = AlteracaoPlanoFactory.obterAlteracao("DosOpcionais");
        assertEquals("Modificação de opcionais efetivada", alteracao.executar());
    }

    @Test
    void deveCancelarAlteracaoDosOpcionais() {
        IAlteracaoPlano alteracao = AlteracaoPlanoFactory.obterAlteracao("DosOpcionais");
        assertEquals("Modificação de opcionais cancelada", alteracao.cancelar());
    }
}