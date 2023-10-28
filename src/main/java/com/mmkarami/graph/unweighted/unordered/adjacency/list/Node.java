package com.mmkarami.graph.unweighted.unordered.adjacency.list;

import java.util.List;

public class Node<E> {

	private E value;

	private List<Node<E>> neighbors;

	public Node(E value) {
		this.value = value;
	}

	public Node(E value, List<Node<E>> neighbors) {
		this.value = value;
		this.neighbors = neighbors;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}
	
	public List<Node<E>> getNeighbors() {
		return neighbors;
	}
}