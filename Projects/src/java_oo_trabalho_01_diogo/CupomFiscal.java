public class CupomFiscal {
    public static void main(String[] args) {
        Loja loja = new Loja(
            1, 
            "Supermecado", 
            "66.316.707/1615-01", 
            "JC ALIMENTOS LTDA", 
            "Rua de Ouros, 07 - Paraiso"
        );
        Cliente cliente  = new Cliente(
            1, 
            "Diogo Oliveira",
            "123.456.789-01"
        );

        Item item1 = new Item(101, "Leite 1L", 2, 5.78);
        Item item2 = new Item(102, "Arroz 10kg", 1, 79.80);

        System.out.println("======================|   CUPOM FISCAL   |======================\n");

        System.out.println("CODIGO: " + loja.getCodigoLoja());
        System.out.println("NOME: " + loja.getNomeLoja());
        System.out.println("RAZÃO SOCIAL: " + loja.getRazaoSocialLoja());
        System.out.println("CNPJ: " + loja.getCnpjLoja());
        System.out.println("ENDEREÇO: " + loja.getEnderecoLoja());
        
        System.out.println();
        System.out.println("----------------------| DADOS DO CLIENTE |----------------------");

        System.out.println("CODIGO: " + cliente.getCodigoCliente());
        System.out.println("NOME: " + cliente.getNomeCliente());
        System.out.println("CPF/CNPJ: " + cliente.getCpfCnpjCliente());
        System.out.println("Data de caadastro: " + cliente.getDataCadastroCliente());

        System.out.println();
        System.out.println("======================|       ITEMS      |======================\n");
    
        System.out.println(
            "Id: " + item1.getCodigoProduto() 
            + " | " + 
            "Descrição: " + item1.getNomeProduto() 
            + " | " +
            "Qtd: " + item1.getQunatidadeProduto() 
            + " | " +
            "Valor: " + item1.getValorProduto() 
            + " | " +
            "Total: " + item1.totalValor()
        );

        System.out.println(
            "Id: " + item2.getCodigoProduto() 
            + " | " + 
            "Descrição: " + item2.getNomeProduto() 
            + " | " +
            "Qtd: " + item2.getQunatidadeProduto() 
            + " | " +
            "Valor: " + item2.getValorProduto() 
            + " | " +
            "Total: " + item2.totalValor()
        );

        System.out.println();
        System.out.println("======================|  TOTAL DA COMPRA |======================\n");

        System.out.println("VALOR TOTAL: " + Item.totalItens);
        System.out.println("QUANTIDADE TOTAL DE ITEM: " + Item.valorGeral);

        System.out.println("\n================================================================\n");
    }
}
