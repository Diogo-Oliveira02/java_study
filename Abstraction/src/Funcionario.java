/**
 * 
 * public:
 * Permite que a classe seja acessada por classes de outros pacotes.
 * 
 * abstract:
 * A classe não pode ser instanciada diretamente.
 *
**/
public abstract class Funcionario {

    protected String nome;
    protected double salario;

    public Funcionario(String nome, double salario) {
        this.nome = nome;
        this.salario = salario;
    }

    /**
     * Método concreto:
     * As classes filhas podem utilizar esse método
     * sem precisar implementá-lo novamente.
    **/
    public void exibirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Salário: R$ " + salario);
    }

    /**
     * Método abstrato:
     * Cada tipo de funcionário deve definir
     * como será o cálculo do bônus.
     * 
     * É obrigado a implementar esse método nas clases filhas.
    **/
    public abstract double calcularBonus();
}
