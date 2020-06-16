//package algorithms.treesandgraphs;

import java.util.Queue;
import java.util.LinkedList;

class treeBreadthFirstSearch{
	public static<T> void inOrderSearch(TreeNode<T> root){

		if(root == null)
			return;

		Queue<TreeNode<T>> queue = new LinkedList<>();
		queue.add(root);

		while(!queue.isEmpty()){
			TreeNode<T> r = queue.poll();
			visit(r);

			if(r.leftChild != null)
				queue.add(r.leftChild);

			if(r.rightChild != null)
				queue.add(r.rightChild);
		}
	}

	public static<T> void visit(TreeNode<T> node){
		System.out.println(node.data);
	}
}
