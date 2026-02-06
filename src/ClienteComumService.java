public class ClienteComumService implements ICadastroCliente {
    @Override
    public void cadastrarCliente(String nome, String email) {
        System.out.println("Cadastrando cliente comum: " + nome);
    }

    @Override
    public String buscarClientePorEmail(String email) {
        return "Dados de " + email;
    }
}