package patterns;

public class AlteracaoDowngrade implements IAlteracaoPlano {

    public String executar() {
        return "Downgrade de plano efetivado";
    }

    public String cancelar() {
        return "Downgrade de plano cancelado";
    }
}