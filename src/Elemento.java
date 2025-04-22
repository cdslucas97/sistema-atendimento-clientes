public class Elemento {
    public String id;

    // Para fila
    public String nome;
    public String motivo;

    // Para pilha
    public String descricao;
    public String dataHora;

    // Construtor genérico
    public Elemento(String id, String campo2, String campo3, boolean isFila) {
        this.id = id;
        if (isFila) {
            this.nome = campo2;
            this.motivo = campo3;
        } else {
            this.descricao = campo2;
            this.dataHora = campo3;
        }
    }
}
