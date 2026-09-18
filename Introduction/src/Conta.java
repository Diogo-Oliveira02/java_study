package src;
public class Conta {
    public double saldo;
    public int agencia;
    public int numero;

    public Cliente titular;

    public static int total = 0;

    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public int getAgencia() {
        return agencia;
    }
    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public int getNumero() {
        return numero;
    }
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Cliente getTitular() {
        return titular;
    }
    public void setTitular(Cliente titular) {
		this.titular = titular;
	}

    // Metodos adiciona direto no atributo saldo
    public void deposita(double valor) {
        this.saldo = this.saldo + valor;
    }

    // Metodos fazas alteração direto no atributo saldo
    public boolean sacar(double valor) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        } else {
            return false;
        }
    }

    //
    public boolean transfere(double valor, Conta destino) {
        if (this.saldo >= valor) {
            this.saldo -= valor;
            destino.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
}
