import java.util.LinkedList;

public class Bebidas {
    private  String nome;
    private float valor;
    private int quantidade;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public LinkedList<Bebidas> getListabebidas() {
        return listabebidas;
    }



    public void setListabebidas(LinkedList<Bebidas> listabebidas) {
        this.listabebidas = listabebidas;
    }

    LinkedList<Bebidas>listabebidas;

    public Bebidas(String nome, float valor, int quantidade) {
        this.nome = nome;
        this.valor = valor;
        this.quantidade = quantidade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
}
