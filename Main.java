public class Main {
    public static void main(String[] args) {
        Vertex v1 = new Vertex("1");
        Vertex v2 = new Vertex("2");
        Vertex v3 = new Vertex("3");
        Vertex v4 = new Vertex("4");
        Vertex v5 = new Vertex("5");
        Vertex v6 = new Vertex("6");




        v1.addNeighbour(v2);
        v1.addNeighbour(v3);
        v2.addNeighbour(v4);
        v3.addNeighbour(v4);
        v3.addNeighbour(v4);

        DepthFirstSearch dfs = new DepthFirstSearch();
        dfs.find(v1, v4);

    }


}
