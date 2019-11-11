package tree;
class Node{
	char val;// 数据域
	Node left;// 左孩子的引用，常常代表左孩子为根的整棵左子树
	Node right; // 右孩子的引用，常常代表右孩子为根的整棵右子树
	public Node (char val) {
		this.val = val;
	}
}
public class BinaryTree {
		private static Node root=null;
	//构建一颗二叉树
		public static Node build() {
			Node A = new Node('A');
			Node B = new Node('B');
			Node C = new Node('C');
			Node D = new Node('D');
			Node E = new Node('E');
			Node F = new Node('F');
			Node G = new Node('G');
			A.left = B;
			A.right = C;
			B.left = D;
			B.right = E;
			E.left = G;
			C.right = F;
			return A;
		
	}
		public static void prevorder(Node root) {
				//root = build();
	       		if(root == null) {
	       			return;
	       		}
	       //1.先序遍历
	       //访问跟节点 用打印来表示
	       		System.out.println(root.val);
	       		prevorder(root.left);
	       		prevorder(root.right); 
		}
		public static void inorder(Node root) {
			//2.中序遍历
			if(root == null) {
       			return;
       		}
			prevorder(root.left);
			System.out.println(root.val);
			prevorder(root.right); 
		}
		public static void postorder(Node root) {
			//3.后序遍历
			if(root == null) {
				return ;
			}
			prevorder(root.left);
       		prevorder(root.right); 
       		System.out.println(root.val);
		}
		//4.求节点的个数
		public static int size(Node root) {
			if(root == null) {
				return 0;
			}
			//节点的个数为1+左子树的节点+右子树的节点
			return 1+size(root.left)+size(root.right);
		}
		//5.求叶子节点的个数
		public static int leafsize = 0;
		public static int getleafsize(Node root ){
			if(root == null) {
				return 0;
			}
		//先判断是否为叶子节点  用递归的方法
			if(root.left ==null&&root.right == null) {
				return 1;
			}
			return getleafsize(root.left)+getleafsize(root.right);
		}
		//6.求第k层的节点个数
		public static int getlevelsize(Node root ,int k) {
			if(root == null|| k<0) {
				return 0;
			}
			if(k == 1) {
				return 1;
			}
			return getlevelsize(root.left,k-1)+getlevelsize(root.right,k-1);
		}
		//找节点
//		public static   char Nodefind (Node root, int val) {
//			 if(root == null) {
//				  return 0;
//			  }
//			  if(root.val ==  val ) {
//				  return  root.val;
//			  }
//			  Node ret =  find(root.left , val);
//		}
		public static void main(String[] args) {		  
			root = build();
			prevorder(root);
		    inorder(root);
			postorder(root);
			System.out.println(size(root));
			System.out.println(getleafsize(root));
			System.out.println(getlevelsize(root, 3));
		}
}
		
 
