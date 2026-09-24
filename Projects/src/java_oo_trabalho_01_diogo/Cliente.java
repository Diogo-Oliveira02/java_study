
import java.time.LocalDate;

public class Cliente {
    private int codigoCliente;
	private String nomeCliente;
	private LocalDate dataCadastroCliente;
	private String cpfCnpjCliente;
	
	public Cliente (int codigoCliente, String nomeCliente, String cpfCnpjCliente) {
		this.codigoCliente = codigoCliente;
		this.nomeCliente = nomeCliente;
		this.dataCadastroCliente = LocalDate.now();
		this.cpfCnpjCliente = cpfCnpjCliente;
	}

	public int getCodigoCliente() {
		return codigoCliente;
	}
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	
	public LocalDate getDataCadastroCliente() {
		return dataCadastroCliente;
	}
	
	public String getCpfCnpjCliente() {
		return cpfCnpjCliente;
	}
}
