public class Fila {
    private No inicio;
    private No fim;

    public Fila() {
        inicio = null;
        fim = null;
    }

    public void adicionarCliente(String id, String nome, String motivo) {
        Elemento novoCliente = new Elemento(id, nome, motivo, true); // true = fila
        No novoNo = new No(novoCliente);

        if (inicio == null) {
            inicio = novoNo;
            fim = novoNo;
        } else {
            fim.proximo = novoNo;
            fim = novoNo;
        }
    }

    public void atenderCliente() {
        if (estaVazia()) {
            System.out.println(" Fila vazia! Nenhum cliente para atender.");
            return;
        }

        System.out.println("Atendendo cliente: " + inicio.elemento.nome);
        inicio = inicio.proximo;

        if (inicio == null) {
            fim = null;
        }
    }

    public boolean estaVazia() {
        return inicio == null;
    }

    public void imprimirFila() {
        if (estaVazia()) {
            System.out.println(" Fila de atendimento vazia.");
            return;
        }

        System.out.println(">>> Fila de Atendimento:");
        No atual = inicio;
        while (atual != null) {
            System.out.println("ID: " + atual.elemento.id +
                    " | Nome: " + atual.elemento.nome +
                    " | Motivo: " + atual.elemento.motivo);
            atual = atual.proximo;
        }
    }
}
