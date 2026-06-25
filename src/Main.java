import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== Lista Mista ===");
        ListaCarros<Carro> listaMista = new ListaCarros<>();
        listaMista.adicionar(new Honda("Civic", 2020, "Prata"));
        listaMista.adicionar(new Chevrolet("Tracker", 2023, "Preto"));
        listaMista.adicionar(new Ford("Ranger", 2021, "Branco"));
        listaMista.exibirCarros();

        System.out.println("\n=== Lista Honda ===");
        ListaCarros<Honda> listaHondas = new ListaCarros<>();
        listaHondas.adicionar(new Honda("City", 2022, "Cinza"));
        listaHondas.adicionar(new Honda("Civic", 2021, "Vermelho"));
        listaHondas.exibirCarros();

        System.out.println("\n=== Lista Chevrolet ===");
        ListaCarros<Chevrolet> listaChevrolets = new ListaCarros<>();
        listaChevrolets.adicionar(new Chevrolet("Onix", 2022, "Preto"));
        listaChevrolets.adicionar(new Chevrolet("Tracker", 2023, "Azul"));
        listaChevrolets.adicionar(new Chevrolet("Montana", 2024, "Cinza"));
        listaChevrolets.exibirCarros();

        System.out.println("\n=== Lista Ford ===");
        List<Ford> listaFords = new ArrayList<>();
        listaFords.add(new Ford("Ranger", 2023, "Cinza"));
        listaFords.add(new Ford("Fiesta", 2019, "Vermelho"));
        listaFords.add(new Ford("Ka", 2020, "Branco"));
        imprimirQualquerCarro(listaFords);
    }

    public static void imprimirQualquerCarro(List<? extends Carro> lista) {
        for (Carro carro : lista) {
            System.out.println("- " + carro);
        }
    }
}
