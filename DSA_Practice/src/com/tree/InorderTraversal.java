package com.tree;

import java.util.Stack;

class Node
{
    int data;
    Node left, right;
  
    public Node(int item)
    {
        data = item;
        left = right = null;
    }
}

class BinaryTree
{
    Node root;
    void inorder()
    {
        if (root == null)
            return;
  
  
        Stack<Node> s = new Stack<Node>();
        Node curr = root;
  
        // traverse the tree
        while (curr != null || s.size() > 0)
        {
  
            /* Reach the left most Node of the
            curr Node */
            while (curr !=  null)
            {
                /* place pointer to a tree node on
                   the stack before traversing
                  the node's left subtree */
                s.push(curr);
                curr = curr.left;
            }
  
            /* Current must be NULL at this point */
            curr = s.pop();
        
  
            System.out.println(curr.data + " s->"+s.size());
  
            /* we have visited the node and its
               left subtree.  Now, it's right
               subtree's turn */
            curr = curr.right;
        }
    }
}

public class InorderTraversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 BinaryTree tree = new BinaryTree();
	        tree.root = new Node(1);
	        tree.root.left = new Node(2);
	        tree.root.right = new Node(3);
	        tree.root.left.left = new Node(4);
	        tree.root.left.right = new Node(5);
	        tree.inorder();
	}

}
