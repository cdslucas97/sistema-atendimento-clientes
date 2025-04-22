public class MenuPilha {
    public static void main(String[] args) {

        Pilha pilha = new Pilha();

        pilha.adicionarSolicitacao("REQ001", "Instalação de software", "2024-08-20 10:30");
        pilha.adicionarSolicitacao("REQ002", "Manutenção preventiva", "2024-08-20 11:00");
        pilha.adicionarSolicitacao("REQ003", "Atualização de sistema", "2024-08-20 11:30");
        pilha.adicionarSolicitacao("REQ004", "Suporte técnico", "2024-08-20 12:00");
        pilha.adicionarSolicitacao("REQ005", "Troca de equipamento", "2024-08-20 12:30");
        pilha.adicionarSolicitacao("REQ006", "Consulta de garantia", "2024-08-20 13:00");
        pilha.adicionarSolicitacao("REQ007", "Reparo de impressora", "2024-08-20 13:30");
        pilha.adicionarSolicitacao("REQ008", "Configuração de rede", "2024-08-20 14:00");
        pilha.adicionarSolicitacao("REQ009", "Restauração de dados", "2024-08-20 14:30");
        pilha.adicionarSolicitacao("REQ010", "Consulta técnica", "2024-08-20 15:00");

        System.out.println("\nHistórico Atual:");
        pilha.imprimirHistorico();

        System.out.println("\nRemovendo a última solicitação...");
        pilha.removerSolicitacao();

        System.out.println("\nHistórico Atualizado:");
        pilha.imprimirHistorico();

        System.out.println("\nPilha está vazia? " + (pilha.estaVazia() ? "Sim" : "Não"));
    }
}
