package src;
public class TestConta {
        public static void main(String[] args) {
                Conta primeiraConta = new Conta();
                Conta segundaConta = new Conta();

                segundaConta.setAgencia(1);
                segundaConta.setSaldo(1000.00);
                segundaConta.setNumero(1000);
                System.out.println("Saldo inicial da segunda conta: " + segundaConta.getSaldo());

                primeiraConta.setAgencia(12);
		primeiraConta.setNumero(10);
		primeiraConta.setSaldo(10000.00);
		System.out.println("Saldo inicial e: R$" + primeiraConta.getSaldo());
		primeiraConta.deposita(10000);
		System.out.println("Saldo apos deposito e: R$" + primeiraConta.getSaldo());

                primeiraConta.transfere(1000.00, segundaConta);
                System.out.println("Saldo inicial segunda apos trasferencia: " + segundaConta.getSaldo());
	}
}