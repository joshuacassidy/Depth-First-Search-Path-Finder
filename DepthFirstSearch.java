import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class DepthFirstSearch {

    public void findPath(Vertex rootVertex, Vertex target) {
        Stack<Vertex> stack = new Stack<>();
        stack.push(rootVertex);
        while (!stack.isEmpty()) {
            Vertex actualVertex = stack.pop();
            if (!actualVertex.isVisited()) {
                actualVertex.setVisited(true);
                for( Vertex v: actualVertex.getNeighbourList()) {
                    stack.push(v);
                    v.predecessor = actualVertex;
                }
            }
        }

        Vertex current = target;
        ArrayList<Vertex> path = new ArrayList<>();
        while (current != rootVertex) {
            path.add(current);
            current = current.predecessor;
        }
        path.add(rootVertex);
        Collections.reverse(path);
        System.out.println(path);
    }

}
