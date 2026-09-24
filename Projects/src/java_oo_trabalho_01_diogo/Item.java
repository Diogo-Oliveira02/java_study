
public class Item {
    private int codigoProduto;
    private String nomeProduto;
    private int qunatidadeProduto;
    private double valorProduto;

    public static int totalItens = 0;
    public static double valorGeral = 0;

    public Item(int codigo, String nome, int qunatidade, double valor) {
        this.codigoProduto = codigo;
        this.nomeProduto = nome;
        this.qunatidadeProduto = qunatidade;
        this.valorProduto = valor;

        totalItens += qunatidade;
        valorGeral += this.totalValor();
    }
    public int getCodigoProduto() {
        return codigoProduto;
    }
    public String getNomeProduto() {
        return nomeProduto;
    }
    public int getQunatidadeProduto() {
        return qunatidadeProduto;
    }
    public double getValorProduto() {
        return valorProduto;
    }
    public double totalValor() {
        return this.qunatidadeProduto * this.valorProduto;
    }
}
