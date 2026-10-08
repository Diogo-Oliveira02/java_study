public class Enfermeiro extends Funcionario{
    private String coren;
    private String setor;

    public Enfermeiro(int matricula, String nome, String email, String senha, String coren, String setor) {
        super(matricula, nome, email, senha);
        this.coren = coren;
        this.setor = setor;
    }
    public String getCoren() {
        return coren;
    }
    public void setCoren(String coren) {
        this.coren = coren;
    }
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
}
