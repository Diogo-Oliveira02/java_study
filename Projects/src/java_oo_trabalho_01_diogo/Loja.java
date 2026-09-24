
public class Loja {
    private int codigoLoja;
	private String nomeLoja;
	private String cnpjLoja;
	private String razaoSocialLoja;
	private String enderecoLoja;

	public Loja(int codigo, String nome, String cnpj, String razaoSocial, String endereco) {
		this.codigoLoja = codigo;
		this.nomeLoja = nome;
		this.cnpjLoja = cnpj;
		this.razaoSocialLoja = razaoSocial;
		this.enderecoLoja = endereco;
	}

	public int getCodigoLoja() {
		return codigoLoja;
	}
	public String getNomeLoja() {
		return nomeLoja;
	}
	public String getCnpjLoja() {
		return cnpjLoja;
	}
	public String getRazaoSocialLoja() {
		return razaoSocialLoja;
	}
	public String getEnderecoLoja() {
		return enderecoLoja;
	}

}
