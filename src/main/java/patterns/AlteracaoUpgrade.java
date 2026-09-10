package patterns;

public class AlteracaoUpgrade implements IAlteracaoPlano {

    public String executar() {
        return "Upgrade de plano efetivado";
    }

    public String cancelar() {
        return "Upgrade de plano cancelado";
    }
}