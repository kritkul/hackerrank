package day22;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Solution {
	public static int getHeight(Node root) {
		// Write your code here
		if(root == null){
			return -1;
		}
		int left = getHeight(root.left);
		int right = getHeight(root.right);
		return (left > right ? left : right)+1;
	}

	public static Node insert(Node root, int data) {
		if (root == null) {
			return new Node(data);
		} else {
			Node cur;
			if (data <= root.data) {
				cur = insert(root.left, data);
				root.left = cur;
			} else {
				cur = insert(root.right, data);
				root.right = cur;
			}
			return root;
		}
	}
	
	public static void levelOrder(Node root){
		Queue<Node> queue = new LinkedList<Node>();
	    queue.add(root);
	    
	    while(!queue.isEmpty()){
	        Node cur = queue.remove();
	        System.out.print(cur.data + " ");
	        if (cur.left!=null) queue.add(cur.left);
	        if (cur.right!=null) queue.add(cur.right);
	    }

	}
	
	public static void inOrder(Node root){
		if(root != null){
			inOrder(root.left);
			System.out.print(root.data + " ");
			inOrder(root.right);
		}
	}
	
	public static void reverseInOrder(Node root){
		if(root != null){
			reverseInOrder(root.right);
			System.out.print(root.data + " ");
			reverseInOrder(root.left);
		}
	}
	
	
	public static void preOrder(Node root){
		if(root != null){
			System.out.print(root.data + " ");
			preOrder(root.left);
			preOrder(root.right);
		}
	}
	
	public static void postOrder(Node root){
		if(root != null){
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data + " ");
		}
	}


	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		Node root = null;
		
		while (T-- > 0) {
			int data = sc.nextInt();
			root = insert(root, data);
		}
		
		int height = getHeight(root);
		System.out.println("Tree height: " + height);
		
		System.out.print("InOrder: "); 
		inOrder(root);
		System.out.println();
		
		System.out.print("ReverseOrder: "); 
		reverseInOrder(root);
		System.out.println();
		
		System.out.print("PostOrder: "); 
		postOrder(root);
		System.out.println();
		
		System.out.print("PreOrder: "); 
		preOrder(root);
		System.out.println();
		
		System.out.print("Lever-Order: "); 
		levelOrder(root);

	}

}
