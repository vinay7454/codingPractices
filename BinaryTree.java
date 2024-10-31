import java.util.*;

public class BinaryTree {
    NodeNew root;

    public void topView(NodeNew node){
        if(node == null){
            return;
        }
        //for bfs purpose we need to keep track of where we are, bfs means queue, and queue means LinkedList
        Queue<NodeNew> bfs = new LinkedList<>();
        //to keep track of corresponding horizontal values we need to make also use Queue and LinkedList
        Queue<Integer> distanceQueue = new LinkedList<>();
        //we need a map to store fist node at each horizontal distance
        Map<Integer, NodeNew> topViewMap = new TreeMap<>();

        bfs.add(node);
        distanceQueue.add(0);
        while(!bfs.isEmpty()) {
            NodeNew currentNode = bfs.poll();
            int horizontalDistance = distanceQueue.poll();

            if(!topViewMap.containsKey(horizontalDistance)){
                topViewMap.put(horizontalDistance, currentNode);
            }

            if(currentNode.left != null){
                bfs.add(currentNode.left);
                distanceQueue.add(horizontalDistance - 1);
            }
            if(currentNode.right != null){
                bfs.add(currentNode.right);
                distanceQueue.add(horizontalDistance + 1);
            }
        }

        for (NodeNew topNode : topViewMap.values()) {
            System.out.print(topNode.data + " ");
        }
    }
}
