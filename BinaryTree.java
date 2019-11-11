package tree;
class Node{
	char val;// ������
	Node left;// ���ӵ����ã�������������Ϊ��������������
	Node right; // �Һ��ӵ����ã����������Һ���Ϊ��������������
	public Node (char val) {
		this.val = val;
	}
}
public class BinaryTree {
		private static Node root=null;
	//����һ�Ŷ�����
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
	       //1.�������
	       //���ʸ��ڵ� �ô�ӡ����ʾ
	       		System.out.println(root.val);
	       		prevorder(root.left);
	       		prevorder(root.right); 
		}
		public static void inorder(Node root) {
			//2.�������
			if(root == null) {
       			return;
       		}
			prevorder(root.left);
			System.out.println(root.val);
			prevorder(root.right); 
		}
		public static void postorder(Node root) {
			//3.�������
			if(root == null) {
				return ;
			}
			prevorder(root.left);
       		prevorder(root.right); 
       		System.out.println(root.val);
		}
		//4.��ڵ�ĸ���
		public static int size(Node root) {
			if(root == null) {
				return 0;
			}
			//�ڵ�ĸ���Ϊ1+�������Ľڵ�+�������Ľڵ�
			return 1+size(root.left)+size(root.right);
		}
		//5.��Ҷ�ӽڵ�ĸ���
		public static int leafsize = 0;
		public static int getleafsize(Node root ){
			if(root == null) {
				return 0;
			}
		//���ж��Ƿ�ΪҶ�ӽڵ�  �õݹ�ķ���
			if(root.left ==null&&root.right == null) {
				return 1;
			}
			return getleafsize(root.left)+getleafsize(root.right);
		}
		//6.���k��Ľڵ����
		public static int getlevelsize(Node root ,int k) {
			if(root == null|| k<0) {
				return 0;
			}
			if(k == 1) {
				return 1;
			}
			return getlevelsize(root.left,k-1)+getlevelsize(root.right,k-1);
		}
		//�ҽڵ�
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
		
 
