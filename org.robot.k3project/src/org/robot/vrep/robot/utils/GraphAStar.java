package org.robot.vrep.robot.utils;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

/**
 * The graph represents an undirected graph. 
 * 
 * @author SERVICE-NOW\ameya.patil
 *
 * @param <T>
 */
public final class GraphAStar<T> implements Iterable<T> {
    /*
     * A map from the nodeId to outgoing edge.
     * An outgoing edge is represented as a tuple of NodeData and the edge length
     */
    private final Map<T, Map<NodeData<T>, Double>> graph;
    /*
     * A map between nodeId and nodedata.
     */
    private final Map<T, NodeData<T>> nodeIdNodeData;

    public GraphAStar() {
        graph = new HashMap<T, Map<NodeData<T>, Double>>();
        nodeIdNodeData = new HashMap<T, NodeData<T>>();
    } 

    /**
     * Adds a new node to the graph.
     * Internally it creates the nodeData and populates the heuristic map concerning input node into node data.
     * 
     * @param nodeId the node to be added
     */
    public void addNode(T nodeId) {
        if (nodeId == null) throw new NullPointerException("The node cannot be null");

        graph.put(nodeId, new HashMap<NodeData<T>, Double>());
        nodeIdNodeData.put(nodeId, new NodeData<T>(nodeId));
    }

    /**
     * Adds an edge from source node to destination node.
     * There can only be a single edge from source to node.
     * Adding additional edge would overwrite the value
     * 
     * @param nodeIdFirst   the first node to be in the edge
     * @param nodeIdSecond  the second node to be second node in the edge
     * @param length        the length of the edge.
     */
    public void addEdge(T nodeIdFirst, T nodeIdSecond, double length) {
        if (nodeIdFirst == null || nodeIdSecond == null) throw new NullPointerException("The first nor second node can be null.");

        if (!graph.containsKey(nodeIdFirst) || !graph.containsKey(nodeIdSecond)) {
            throw new NoSuchElementException("Source and Destination both should be part of the part of graph");
        }

        graph.get(nodeIdFirst).put(nodeIdNodeData.get(nodeIdSecond), length);
        graph.get(nodeIdSecond).put(nodeIdNodeData.get(nodeIdFirst), length);
    }

    /**
     * Returns immutable view of the edges
     * 
     * @param nodeId    the nodeId whose outgoing edge needs to be returned
     * @return          An immutable view of edges leaving that node
     */
    public Map<NodeData<T>, Double> edgesFrom (T nodeId) {
        if (nodeId == null) throw new NullPointerException("The input node should not be null.");
        if (!graph.containsKey(nodeId)) throw new NoSuchElementException("The node should not be null.");

        return Collections.synchronizedMap(graph.get(nodeId));
    }

    /**
     * The nodedata corresponding to the current nodeId.
     * 
     * @param nodeId    the nodeId to be returned
     * @return          the nodeData from the 
     */ 
    public NodeData<T> getNodeData (T nodeId) {
        if (nodeId == null) { throw new NullPointerException("The nodeid should not be empty"); }
        if (!nodeIdNodeData.containsKey(nodeId))  { throw new NoSuchElementException("The nodeId does not exist"); }
        return nodeIdNodeData.get(nodeId);
    }

    /**
     * Returns an iterator that can traverse the nodes of the graph
     * 
     * @return an Iterator.
     */
    @Override public Iterator<T> iterator() {
        return graph.keySet().iterator();
    }
}
