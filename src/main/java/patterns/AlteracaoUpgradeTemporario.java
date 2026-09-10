package patterns;

public class AlteracaoUpgradeTemporario implements IAlteracaoPlano {

    public String executar() {
        return "Upgrade temporário de plano efetivado";
    }

    public String cancelar() {
        return "Upgrade temporário de plano cancelado";
    }
}