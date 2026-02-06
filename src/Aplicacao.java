public class Aplicacao {
    public static void main(String[] args) {
        ICadastroCliente serviceComum = new ClienteComumService();
        serviceComum.cadastrarCliente("João Silva", "joao@email.com");

        System.out.println("---");

        ClienteVipService serviceVIP = new ClienteVipService();
        processarIngressoVIP(serviceVIP, "vip@email.com");
    }

    public static void processarIngressoVIP(ClienteVipService vipService, String email) {
        vipService.aplicarDescontoVIP(email, 15.0);
        vipService.enviarNotificacao(email, "Seu desconto foi aplicado com sucesso!");
    }
}