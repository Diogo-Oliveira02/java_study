public class Anestesista extends Medico {

    private String tipoAnestesia;

    public  Anestesista(int matricula, String nome, String email, String senha, String crm, String tipoAnestesia) {
        super(matricula, nome, email, senha, crm);
        this.tipoAnestesia = tipoAnestesia;
    }
    public String getTipoAnestesia() {
        return tipoAnestesia;
    }
    public void setTipoAnestesia(String tipoAnestesia) {
        this.tipoAnestesia = tipoAnestesia;
    }
}
