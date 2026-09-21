public class Main {
    public static void main(String[] args) {
        Carro meuCarro = new Carro("Toyota", "Corolla", "Cinza", 4);
        
        // Método herdado da classe pai
        meuCarro.ligar(); 
        
        // Método próprio da classe filha
        meuCarro.abrirPortas();

        // Método modificado com @Override na classe filha
        meuCarro.ligarFarol();
    }
}
