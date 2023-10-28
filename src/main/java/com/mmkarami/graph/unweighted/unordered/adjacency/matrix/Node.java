package com.mmkarami.graph.unweighted.unordered.adjacency.matrix;

public class Node<E> {

	private E value;

	public Node(E value) {
		this.value = value;
	}

	public E getValue() {
		return value;
	}

	public void setValue(E value) {
		this.value = value;
	}
}