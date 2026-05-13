public class Produto {

    public int id;
    public String refproduto;
    public String produto;
    public int preco;


    public Produto(int id, String refproduto, String produto, int preco) {

        this.id = id;
        this.refproduto = refproduto;
        this.produto = produto;
        this.preco = preco;
    }

    @Override

    public String toString() {
        return refproduto;

    }
}