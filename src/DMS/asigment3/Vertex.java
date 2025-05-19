package DMS.asigment3;

import java.util.Map;
import java.util.HashMap;


public class Vertex<V> {
    private V data; // имя города
    private Map<Vertex<V>, Double> adjacentVertices; // соседи и расстояние

    public Vertex(V data) {
        this.data = data;
        this.adjacentVertices = new HashMap<>();
    }

    public void addAdjacentVertex(Vertex<V> destination, double weight) {
        adjacentVertices.put(destination, weight);
    }

    public V getData() {
        return data;
    }

    public Map<Vertex<V>, Double> getAdjacentVertices() {
        return adjacentVertices;
    }

    @Override
    public String toString() {
        return data.toString();
    }
}
