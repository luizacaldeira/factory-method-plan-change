package patterns;

public class AlteracaoDosOpcionais implements IAlteracaoPlano {

    public String executar() {
        return "Modificação de opcionais efetivada";
    }

    public String cancelar() {
        return "Modificação de opcionais cancelada";
    }
}