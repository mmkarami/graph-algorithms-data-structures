package com.mmkarami.graph.unweighted.unordered.adjacency.list;

import java.util.List;

public class Graph<E> {

	private List<Node<E>> nodes;

	public Graph(List<Node<E>> nodes) {
		this.nodes = nodes;
	}

	public void addEdge(int i, int j) {
		Node<E> firstNode = this.nodes.get(i);
		Node<E> secondNode = this.nodes.get(j);
		firstNode.getNeighbors().add(secondNode);
		secondNode.getNeighbors().add(firstNode);
	}
	
	public List<Node<E>> getNodes() {
		return nodes;
	}
	
	public int getNumNodes() {
		return nodes.size();
	}
}