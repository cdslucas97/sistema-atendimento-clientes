public class Pilha {
    private No topo;

    public Pilha() {
        topo = null;
    }

    public void adicionarSolicitacao(String id, String descricao, String dataHora) {
        Elemento novaSolicitacao = new Elemento(id, descricao, dataHora, false); // false = pilha
        No novoNo = new No(novaSolicitacao);
        novoNo.proximo = topo;
        topo = novoNo;
    }

    public void removerSolicitacao() {
        if (estaVazia()) {
            System.out.println(" Histórico vazio! Nada para remover.");
            return;
        }
        topo = topo.proximo;
    }

    public boolean estaVazia() {
        return topo == null;
    }

    public void imprimirHistorico() {
        if (estaVazia()) {
            System.out.println(" Histórico de solicitações vazio.");
            return;
        }

        System.out.println(" Histórico de Solicitações:");
        No atual = topo;
        while (atual != null) {
            System.out.println("ID: " + atual.elemento.id +
                    " | Descrição: " + atual.elemento.descricao +
                    " | Data/Hora: " + atual.elemento.dataHora);
            atual = atual.proximo;
        }
    }
}
