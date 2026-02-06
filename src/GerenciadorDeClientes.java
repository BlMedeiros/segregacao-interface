public interface GerenciadorDeClientes {

        void cadastrarCliente(String nome, String email);

        String buscarClientePorEmail(String email);

        void enviarNotificacao(String email, String mensagem);

        // 3. Operações de Fidelidade/VIP
        void aplicarDescontoVIP(String email, double percentual);

}
