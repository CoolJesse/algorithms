//package algorithms.treesandgraphs;

import java.util.Queue;
import java.util.LinkedList;

class graphBreadthFirstSearch{
	public static<T> void search(Node<T> root){
		if(root == null)
			return;

		Queue<Node<T>> queue = new LinkedList<>();
		root.visited = true;
		queue.add(root);

		while(!queue.isEmpty()){
			Node<T> r = queue.poll();
			visit(r);
			for(Node<T> n : r.adjacent){
				if(n.visited == false){
					n.visited = true;
					queue.add(n);
				}
			}
		}
	}

	public static<T> void visit(Node<T> node){
		System.out.println(node.data);
	}
}
