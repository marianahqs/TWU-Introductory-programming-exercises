package aula03;

public class Carro {

    private String cor;
    private String modelo;
    private Integer velocidadeMax;
    private Integer portas;

    public Carro(String cor, String modelo, Integer velocidadeMax, Integer portas) {
        this.cor = cor;
        this.modelo = modelo;
        this.velocidadeMax = velocidadeMax;
        this.portas = portas;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Integer getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(Integer velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public Integer getPortas() {
        return portas;
    }

    public void setPortas(Integer portas) {
        this.portas = portas;
    }
}
