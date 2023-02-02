import java.util.*;

public class Dijkstras {
    public static void ShortestPath(ArrayList<Node> nodes, Node src, Node dst){
        src.setDistanceFromStart(0);
        Set<Node> settledNodes = new HashSet<>();
        Queue<Node> unsettledNodes = new PriorityQueue<>(Collections.singleton(src));
        while(!unsettledNodes.isEmpty()){
            Node currentNode = unsettledNodes.poll();
            Map<Node,Integer> connections = currentNode.getConnections();
            for (Node node:connections.keySet()) {
                int connectionDistance = connections.get(node);
                if(!settledNodes.contains(currentNode)){
                    if((currentNode.getDistanceFromStart() + connectionDistance) < node.getDistanceFromStart()){
                        node.setDistanceFromStart(currentNode.getDistanceFromStart() + connectionDistance);
                        node.setPreviousNode(currentNode);
                        unsettledNodes.add(node);
                    }
                }
            }
            settledNodes.add(currentNode);
        }
    }
}
