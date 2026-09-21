public class Carro extends Veiculo {

    private int quantidadePortas;

    public Carro(String marca, String modelo, String cor, int quantidadePortas) {
        super(marca, modelo, cor); // Chama o construtor da classe pai
        this.quantidadePortas = quantidadePortas;
    }

    public void abrirPortas() {
        System.out.println("As " + quantidadePortas + " portas foram abertas.");
    }
    
    @Override // Sobrescrevendo o método ligarFarol da clase veiculos
    public void ligarFarol() {
        System.out.println("[Sistema do Carro] Faróis de LED Azuis acesos com força total!");
    }
}
