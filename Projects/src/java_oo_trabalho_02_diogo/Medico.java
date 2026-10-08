public class Medico extends Funcionario {
    private String crm;

    public Medico(int matricula, String nome, String email, String senha, String crm) {
        super(matricula, nome, email, senha);
        this.crm = crm;
    }
    public String getCrm() {
        return crm;
    }
    public void setCrm(String crm) {
        this.crm = crm;
    }
}