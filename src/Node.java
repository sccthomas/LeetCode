import java.util.HashMap;
import java.util.Map;



public class Node implements Comparable<Node> {
    String Name;
    Integer distanceFromStart;
    Node previousNode;
    Map<Node,Integer> Connections = new HashMap<>();

    public Node(String name) {
        this.Name = name;
        this.distanceFromStart = Integer.MAX_VALUE;
    }
    public void addConnection(Node node,int distance){
        this.Connections.put(node,distance);
    }
    public int getDistanceFromStart() {
        return distanceFromStart;
    }
    public void setDistanceFromStart(int distanceFromStart) {
        this.distanceFromStart = distanceFromStart;
    }
    public Node getPreviousNode() {
        return previousNode;
    }
    public Map<Node, Integer> getConnections() {
        return Connections;
    }
    public void setPreviousNode(Node previousNode) {
        this.previousNode = previousNode;
    }
    @Override
    public int compareTo(Node node) {
        return Integer.compare(this.distanceFromStart, node.getDistanceFromStart());
    }
}
