import java.util.List;

public class Quadrado implements Forma {
    private List<Integer> arestas;

    public Quadrado(List<Integer> arestas) {
        this.arestas = arestas;
    }

    public List<Integer> getArestas() {
        return arestas;
    }

    @Override
    public void desenharForma() {
        System.out.println("quadrado");
    }
}
