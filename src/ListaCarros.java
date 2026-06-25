import java.util.ArrayList;
import java.util.List;

public class ListaCarros<T extends Carro> {
    private List<T> lista = new ArrayList<>();

    public void adicionar(T carro) {
        lista.add(carro);
    }

    public void exibirCarros() {
        for (T carro : lista) {
            System.out.println("- " + carro);
        }
    }

    public List<T> getLista() {
        return lista;
    }
}
