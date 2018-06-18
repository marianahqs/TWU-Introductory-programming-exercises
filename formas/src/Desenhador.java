import java.util.List;

public class Desenhador {
    public static void main(String[] args) {
        Quadrado quadrado = new Quadrado(List.of(2, 2, 2, 2));

        quadrado.getArestas();

        Circulo circulo = new Circulo(4);

        circulo.getRaio();

        List<Forma> formas = List.of(quadrado, circulo);

        Forma primeiraForma = formas.get(0);
        Forma segundaForma = formas.get(1);

        formas.forEach(forma -> { forma.desenharForma(); });
    }
}
