package com.mmkarami.graph.unweighted.unordered.adjacency.matrix;

import java.util.List;

public class Graph<E> {

	private List<Node<E>> nodes;

	int[][] matrix;

	public Graph(List<Node<E>> nodes) {
		this.nodes = nodes;
		this.matrix = new int[nodes.size()][nodes.size()];
	}

	public void addEdge(int i, int j) {
		this.matrix[i][j] = 1;
		this.matrix[j][i] = 1;
	}
	
	public List<Node<E>> getNodes() {
		return nodes;
	}
	
	public int getNumNodes() {
		return nodes.size()	;
	}
}