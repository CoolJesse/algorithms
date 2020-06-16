//package algorithms.treesandgraphs;

class graphDepthFirstSearch{

	public static<T> void search(Node<T> root){

		if(root == null)
			return;

		root.visited = true;
		visit(root);

		for(Node<T> n : root.adjacent){
			if(n.visited == false){
				n.visited = true;
				search(n);
			}
		}
		return;
	}
	public static<T> void visit(Node<T> node){
		System.out.println(node.data);
	}
}
