package DMS.asigment3;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.HashSet;
import java.util.Queue;
import java.util.LinkedList;

public class BreadthFirstSearch<V> implements Search<V> {
    private Map<Vertex<V>, Vertex<V>> edgeTo = new HashMap<>();
    private Set<Vertex<V>> visited = new HashSet<>();
    private final Vertex<V> start;

    public BreadthFirstSearch(WeightedGraph<V> graph, Vertex<V> start) {
        this.start = start;
        bfs(graph, start);
    }

    private void bfs(WeightedGraph<V> graph, Vertex<V> start) {
        Queue<Vertex<V>> queue = new LinkedList<>();
        visited.add(start);
        queue.add(start);

        while (!queue.isEmpty()) {
            Vertex<V> current = queue.poll();
            for (Vertex<V> neighbor : current.getAdjacentVertices().keySet()) {
                if (!visited.contains(neighbor)) {
                    edgeTo.put(neighbor, current);
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }

    public boolean hasPathTo(Vertex<V> destination) {
        return visited.contains(destination);
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
