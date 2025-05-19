package DMS.asigment3;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Collections;
import java.util.Comparator;

public class DijkstraSearch<V> implements Search<V> {
    private final Map<Vertex<V>, Double> distTo = new HashMap<>();
    private final Map<Vertex<V>, Vertex<V>> edgeTo = new HashMap<>();
    private final Vertex<V> start;

    public DijkstraSearch(WeightedGraph<V> graph, Vertex<V> start) {
        this.start = start;
        for (Vertex<V> v : graph.getVertices()) {
            distTo.put(v, Double.POSITIVE_INFINITY);
        }
        distTo.put(start, 0.0);

        PriorityQueue<Vertex<V>> pq = new PriorityQueue<>(Comparator.comparingDouble(distTo::get));
        pq.add(start);

        while (!pq.isEmpty()) {
            Vertex<V> current = pq.poll();
            for (Map.Entry<Vertex<V>, Double> entry : current.getAdjacentVertices().entrySet()) {
                Vertex<V> neighbor = entry.getKey();
                double weight = entry.getValue();
                double newDist = distTo.get(current) + weight;
                if (newDist < distTo.get(neighbor)) {
                    distTo.put(neighbor, newDist);
                    edgeTo.put(neighbor, current);
                    pq.add(neighbor);
                }
            }
        }
    }

    public boolean hasPathTo(Vertex<V> destination) {
        return distTo.containsKey(destination);
    }

    public List<Vertex<V>> pathTo(Vertex<V> destination) {
        if (!hasPathTo(destination)) return null;

        List<Vertex<V>> path = new ArrayList<>();
        for (Vertex<V> x = destination; x != start; x = edgeTo.get(x)) {
            path.add(x);
        }
        path.add(start);
        Collections.reverse(path);
        return path;
    }
}
