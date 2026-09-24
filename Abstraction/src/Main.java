public class Main {

    public static void main(String[] args) {

        Gerente gerente = new Gerente(
            "João",
            5000
        );

        Programador programador = new Programador(
            "Carlos",
            4000
        );

        gerente.exibirDados();
        System.out.println(
            "Bônus: R$ " + gerente.calcularBonus()
        );

        System.out.println("-------------------------------------");

        programador.exibirDados();
        System.out.println(
            "Bônus: R$ " + programador.calcularBonus()
        );
    }
}
