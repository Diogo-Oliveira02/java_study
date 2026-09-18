package src;
public class Cliente {
    public String nome;
    public String cpf;
    public String profissao;

    // Getter - Recupera nome do objeto
    public String getNome() {
        return nome;
    }
    // Setters - Altera o estado do objeto
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getProfissao() {
        return profissao;
    }
    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }
}