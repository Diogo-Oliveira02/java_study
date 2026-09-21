public class Veiculo {

    protected String marca;
    protected String modelo;
    protected String cor;

    public Veiculo(String marca, String modelo, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.cor = cor;
    }

    public void ligar() {
        System.out.println("O veículo está ligado.");
    }

    public void ligarFarol() {
        System.out.println("Farol comum aceso.");
    }
}
