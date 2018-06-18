public class Circulo implements Forma {
    Integer raio;

    public Circulo(Integer raio) {
        this.raio = raio;
    }

    public Integer getRaio() {
        return raio;
    }

    @Override
    public void desenharForma() {
        System.out.println("circulo");
    }
}
