
public class ClienteVipService implements ICadastroCliente, INotificador, IGestorFidelidade {

        @Override
        public void cadastrarCliente(String nome, String email) {
            System.out.println("Cadastrando cliente VIP: " + nome);
        }

        @Override
        public String buscarClientePorEmail(String email) {
            return "Dados VIP de " + email;
        }

        @Override
        public void enviarNotificacao(String email, String mensagem) {
            System.out.println("Enviando SMS/Email VIP para " + email + ": " + mensagem);
        }

        @Override
        public void aplicarDescontoVIP(String email, double percentual) {
            System.out.println("Desconto de " + percentual + "% aplicado para " + email);
        }
}

