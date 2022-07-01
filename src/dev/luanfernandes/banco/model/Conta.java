package dev.luanfernandes.banco.model;

public class Conta {
    private  String agencia;
    private  Integer numero;
    private  String nome;
    private  Double saldo;

    public Conta(String agencia, Integer numero, String nome, Double saldo) {
        this.agencia = agencia;
        this.numero = numero;
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return String.format("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque",
                getNome(),
                getAgencia(),
                getNumero(),
                getSaldo());
    }
}
