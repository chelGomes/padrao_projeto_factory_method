public class LogisticaFactory {
    public static ILogistica obterServico(String servico) {
        Class<?> classe = null;
        Object objeto = null;
        try {
            classe = Class.forName("nomedoseupacote." + servico);
            objeto = classe.newInstance();
        } catch (Exception ex) {
            throw new IllegalArgumentException("Serviço logístico inexistente");
        }
        if (!(objeto instanceof ILogistica)) {
            throw new IllegalArgumentException("Serviço logístico inválido");
        }
        return (ILogistica) objeto;
    }
}
