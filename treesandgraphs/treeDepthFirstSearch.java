//

class treeDepthFirstSearch{

	public static<T> void inOrderSearch(TreeNode<T> node){
		if(node == null)
			return;

		inOrderSearch(node.leftChild);
		visit(node);
		inOrderSearch(node.rightChild);

		return;
	}

	public static<T> void visit(TreeNode<T> node){
		System.out.println(node.data);
	}
}
