package patterns;

public class AlteracaoPlanoFactory {

    public static IAlteracaoPlano obterAlteracao(String tipo) {
        Class classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("patterns.Alteracao" + tipo);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Tipo de alteração inexistente");
        }
        if (!(objeto instanceof IAlteracaoPlano)) {
            throw new IllegalArgumentException("Tipo de alteração inválido");
        }
        return (IAlteracaoPlano) objeto;
    }
}