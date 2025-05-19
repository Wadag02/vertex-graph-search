package DMS.asigment3;

public class Main {
    public static void main(String[] args) {
        WeightedGraph<String> graph = new WeightedGraph<>();

        Vertex<String> astana = new Vertex<>("Astana");
        Vertex<String> karaganda = new Vertex<>("Karaganda");
        Vertex<String> balkash = new Vertex<>("Balkash");
        Vertex<String> almaty = new Vertex<>("Almaty");
        Vertex<String> pavlodar = new Vertex<>("Pavlodar");
        Vertex<String> semey = new Vertex<>("Semey");
        Vertex<String> taldykorgan = new Vertex<>("Taldykorgan");
        Vertex<String> kokshetau = new Vertex<>("Kokshetau");
        Vertex<String> taraz = new Vertex<>("Taraz");

        graph.addEdge(astana, karaganda, 5);
        graph.addEdge(karaganda, balkash, 4);
        graph.addEdge(balkash, almaty, 8);
        graph.addEdge(balkash, taraz, 7);
        graph.addEdge(almaty, taraz, 3);
        graph.addEdge(almaty, taldykorgan, 2);
        graph.addEdge(taldykorgan, semey, 6);
        graph.addEdge(astana, pavlodar, 4);
        graph.addEdge(pavlodar, semey, 5);
        graph.addEdge(astana, kokshetau, 1);

        DijkstraSearch<String> dijkstra = new DijkstraSearch<>(graph, astana);
        System.out.println("Path from Astana to Taraz:");
        for (Vertex<String> v : dijkstra.pathTo(taraz)) {
            System.out.print(v + " -> ");
        }
    }
}
