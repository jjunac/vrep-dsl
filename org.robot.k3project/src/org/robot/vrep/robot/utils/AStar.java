package org.robot.vrep.robot.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

/**
 * This is actually not the A* algorithm since the Heuristic has been remove.
 * Dijkstra's algo would have been more appropriate but this implementation was
 * pretty nicely coded.
 * 
 * @author ??
 *
 * @param <T>
 */
public class AStar<T> {

    private final GraphAStar<T> graph;


    public AStar (GraphAStar<T> graphAStar) {
        this.graph = graphAStar;
    }

    // extend comparator.
    public class NodeComparator implements Comparator<NodeData<T>> {
        public int compare(NodeData<T> nodeFirst, NodeData<T> nodeSecond) {
            if (nodeFirst.getF() > nodeSecond.getF()) return 1;
            if (nodeSecond.getF() > nodeFirst.getF()) return -1;
            return 0;
        }
    } 

    /**
     * Implements the A-star algorithm and returns the path from source to destination
     * 
     * @param source        the source nodeid
     * @param destination   the destination nodeid
     * @return              the path from source to destination
     */
    public List<T> astar(T source, T destination) {
        /**
         * http://stackoverflow.com/questions/20344041/why-does-priority-queue-has-default-initial-capacity-of-11
         */
        final Queue<NodeData<T>> openQueue = new PriorityQueue<NodeData<T>>(11, new NodeComparator()); 

        NodeData<T> sourceNodeData = graph.getNodeData(source);
        sourceNodeData.setG(0);
        sourceNodeData.calcF(destination);
        openQueue.add(sourceNodeData);

        final Map<T, T> path = new HashMap<T, T>();
        final Set<NodeData<T>> closedList = new HashSet<NodeData<T>>();

        while (!openQueue.isEmpty()) {
            final NodeData<T> nodeData = openQueue.poll();

            if (nodeData.getNodeId().equals(destination)) { 
                return path(path, destination);
            }

            closedList.add(nodeData);

            for (Entry<NodeData<T>, Double> neighborEntry : graph.edgesFrom(nodeData.getNodeId()).entrySet()) {
                NodeData<T> neighbor = neighborEntry.getKey();

                if (closedList.contains(neighbor)) continue;

                double distanceBetweenTwoNodes = neighborEntry.getValue();
                double tentativeG = distanceBetweenTwoNodes + nodeData.getG();

                if (tentativeG < neighbor.getG()) {
                    neighbor.setG(tentativeG);
                    neighbor.calcF(destination);

                    path.put(neighbor.getNodeId(), nodeData.getNodeId());
                    if (!openQueue.contains(neighbor)) {
                        openQueue.add(neighbor);
                    }
                }
            }
        }

        return null;
    }


    private List<T> path(Map<T, T> path, T destination) {
        assert path != null;
        assert destination != null;

        final List<T> pathList = new ArrayList<T>();
        pathList.add(destination);
        while (path.containsKey(destination)) {
            destination = path.get(destination);
            pathList.add(destination);
        }
        Collections.reverse(pathList);
        return pathList;
    }

    
    public static void main(String[] args) {
    	
    	
    	ArrayList<Position2D> tempPos = new ArrayList<Position2D>(10000);
        GraphAStar<Position2D> graph = new GraphAStar<Position2D>();
        for(int i=0; i < 100; i++) {
        	for(int j = 0; j < 100; j++) {
        		Position2D p = new Position2D(i, j);
        		graph.addNode(p);
        		tempPos.add(p);
        	}
        }
        
        for(int i=0; i < 100; i++) {
        	for(int j = 0; j < 100; j++) {
        		if (i > 1)  graph.addEdge(tempPos.get((i*100)+j), tempPos.get(((i-1)*100)+j), 1);
        		if (j < 99) graph.addEdge(tempPos.get((i*100)+j), tempPos.get((i*100)+j+1), 1);
        		if (j > 0)  graph.addEdge(tempPos.get((i*100)+j), tempPos.get((i*100)+j-1), 1);
        		if (i < 99) graph.addEdge(tempPos.get((i*100)+j), tempPos.get(((i+1)*100)+j), 1);
        	}
        }

        AStar<Position2D> aStar = new AStar<Position2D>(graph);

        for (Position2D path : aStar.astar(tempPos.get(1*100+1), tempPos.get(10*100+3))) {
            System.out.println(path.x+" , "+path.y);
        }
    }
    
}
