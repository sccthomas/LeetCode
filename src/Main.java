import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //int[] array = new int[] {1,5,8};
        //NextPermutation.nextPermutation(array);
        //System.out.println(Permutation1.permute(array));


        Node nodeA = new Node("A");
        Node nodeB = new Node("B");
        Node nodeC = new Node("C");
        Node nodeD = new Node("D");
        Node nodeE = new Node("E");
        Node nodeF = new Node("F");

        nodeA.addConnection(nodeB, 2);
        nodeA.addConnection(nodeC, 4);

        nodeB.addConnection(nodeC, 3);
        nodeB.addConnection(nodeD, 1);
        nodeB.addConnection(nodeE, 5);

        nodeC.addConnection(nodeD, 2);

        nodeD.addConnection(nodeE, 1);
        nodeD.addConnection(nodeF, 4);

        nodeE.addConnection(nodeF, 2);

        ArrayList<Node> nodes = new ArrayList<>();
        nodes.add(nodeA);
        nodes.add(nodeB);
        nodes.add(nodeC);
        nodes.add(nodeD);
        nodes.add(nodeE);
        nodes.add(nodeF);
        Dijkstras.ShortestPath(nodes,nodeA,nodeE);

        for (Node node:nodes) {
            System.out.println("Node :"+node.Name);
            if(node.previousNode == null){
                System.out.println("no Prev");
            }else{
                System.out.println("Prev: "+node.previousNode.Name);
            }
            System.out.println("Distance from start :"+node.distanceFromStart);
            System.out.println("\n");
        }

    }

}