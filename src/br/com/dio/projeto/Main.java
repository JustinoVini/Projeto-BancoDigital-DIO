package br.com.dio.projeto;

public class Main {
    Cliente vinicius = new Cliente();
    vinicius

    public static void main(String[] args) {
        Conta cc = new ContaCorrente();
        cc.depositar(100);

        Conta poupanca = new ContaPoupanca();
        cc.trasnferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
