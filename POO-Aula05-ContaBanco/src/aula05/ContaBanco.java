package aula05;

import java.util.Random;


public class ContaBanco {

    private String tipo;
    private Float saldo;
    private Long numero;
    private String cliente;
    private Boolean statusAtiva;
    private Float valorMovimentacao;

    public ContaBanco(String Cliente) {

        this.setCliente(Cliente);
        this.setSaldo(0f);

    }

    public void status(){
        System.out.println("\n***** STATUS DA CONTA ******");
        System.out.println("\nConta Ativa: " + this.statusAtiva);
        System.out.println("Tipo da conta: " + this.tipo);
        System.out.println("Saldo:" + this.saldo);
        System.out.println("Cliente: " + this.cliente);
        System.out.println("Número da conta: " + this.numero);
    }

    public void deposito(Float valorMovimentacao){

        if (this.statusAtiva == true && valorMovimentacao > 0){

            this.setValorMovimentacao(valorMovimentacao);

            System.out.println("\n\n****** DEPÓSITO REALIZADO COM SUCESSO ******");
            System.out.println("Saldo anterior: "+ this.saldo);
            System.out.println("Valor do depósito: " + this.valorMovimentacao);

            this.setSaldo(saldo + this.valorMovimentacao);

            System.out.println("Saldo atual: " + this.saldo);


        } else if (this.statusAtiva == false){
            System.out.println("\nConta não está ativa! Apenas contas ativas podem receber depósitos!");

        } else if (!(valorMovimentacao > 0)){
            System.out.println("\nDepósito não realizado! Valor solicitado não é maior que 0.");

        }

    }

    public void saque(Float valorMovimentacao){

        if (this.statusAtiva == true && valorMovimentacao > 0){

            this.setValorMovimentacao(valorMovimentacao);

            System.out.println("\n\n****** SAQUE REALIZADO COM SUCESSO ******");
            System.out.println("Saldo anterior: "+ this.saldo);
            System.out.println("Valor do saque: " + this.valorMovimentacao);

            this.setSaldo(saldo - this.valorMovimentacao);

            System.out.println("Saldo atual: " + this.saldo);

        } else if (this.statusAtiva == false){
            System.out.println("\nConta não está ativa! Apenas contas ativas podem realizar saques!");

        } else if (!(valorMovimentacao > 0)){
            System.out.println("\nSaque não realizado! Valor solicitado não é maior que 0.");
        }

    }

    public void abreConta(String tipo){

        Random numAleatorio = new Random();

        this.setNumero(numAleatorio.nextLong());

        this.setStatusAtiva(true);

        this.setTipo(tipo);


    }

    public void fechaConta(){
        this.setStatusAtiva(false);

    }


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Float getSaldo() {
        return saldo;
    }

    public void setSaldo(Float saldo) {
        this.saldo = saldo;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public Boolean getStatusAtiva() {
        return statusAtiva;
    }

    public void setStatusAtiva(Boolean statusAtiva) {
        this.statusAtiva = statusAtiva;
    }

    public Float getValorMovimentacao() {
        return valorMovimentacao;
    }

    public void setValorMovimentacao(Float valorMovimentacao) {
        this.valorMovimentacao = valorMovimentacao;
    }


}
