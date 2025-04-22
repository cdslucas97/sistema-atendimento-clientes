public class MenuFila {
    public static void main(String[] args) {

        Fila fila = new Fila();

        fila.adicionarCliente("CLI001", "Maria Silva", "Dúvida sobre produto");
        fila.adicionarCliente("CLI002", "João Souza", "Reclamação de serviço");
        fila.adicionarCliente("CLI003", "Ana Costa", "Solicitação de reembolso");
        fila.adicionarCliente("CLI004", "Pedro Alves", "Informações de entrega");
        fila.adicionarCliente("CLI005", "Carla Dias", "Agendamento de visita");
        fila.adicionarCliente("CLI006", "Lucas Martins", "Alteração de pedido");
        fila.adicionarCliente("CLI007", "Patrícia Rocha", "Cancelamento de contrato");
        fila.adicionarCliente("CLI008", "Rafael Lima", "Renovação de assinatura");
        fila.adicionarCliente("CLI009", "Fernanda Gomes", "Suporte para instalação");
        fila.adicionarCliente("CLI010", "Carlos Eduardo", "Pedido de orçamento");

        System.out.println("\nFila Atual:");
        fila.imprimirFila();

        System.out.println("\nAtendendo o próximo cliente...");
        fila.atenderCliente();

        System.out.println("\nFila Atualizada:");
        fila.imprimirFila();

        System.out.println("\nFila está vazia? " + (fila.estaVazia() ? "Sim" : "Não"));
    }
}
