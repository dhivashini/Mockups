package com.dhiva.Mocks;
Given a binary tree and a node, connect the path from the root to that node in the form of a doubly linked list.


3
/   \
1     5
\   / \
2 4   6

Node input: 5
Output: 3<->5


3
/   \
1     5
\
2

Node input: 2
Output: 3<->1<->2

/*
1. root= null;  output=null;

2. 1  target = 2  output=null;

3. 1 target =1  output =1;

4.      3   target = 1;   output: 3<->1
 /
 1
 
5.    3        target =2,  output: 3<->1<->2
  /   \
 1     5
 \
  2  

*/
class ListNode {
int data;
ListNode prev;
ListNode next;

ListNode(int data, ListNode prev, ListNode next) {
 this.data = data;
 this.prev = prev;
 this.next = next;
}
}

class TreeNode {
int data;
TreeNode left;
TreeNode right;

TreeNode(int data, TreeNode left, TreeNode right) {
 this.data = data;
 this.left = left;
 this.right = right;
}
}

/*
    3        target =2,  output: 3<->1<->2
  /   \
 1     5
 \
  2  
*/

ListNode constructListFromTree(TreeNode root, TreeNode goal) {   //root =3 target = 2
 //check base case: root = null
 if(root == null)
     return root;
     
  ListNode node;
  
 // if root matches the target node
 if(root.data == goal.data){  //2==2
     node = new ListNode(root.data,null,null);
     return node;
 }
 
 
 //recurse through the left sub tree
 ListNode left =  constructListFromTree( root.left, goal) ;  //root =1
 
 //recurse through the right sub tree
 ListNode right =  constructListFromTree( root.right, goal); //2
 
 //check which ListNode is not null
 if(left != null){
     node = new ListNode(root.data,null,null);  //node = 3 left = 1
     node.next = left;
     left.prev = node;
     return node;
 }
 
 //check if right call had not returned null
 if(right != null){
     node = new ListNode(root.data,null,null);
     node.next = right;
     right.prev = node;
     return node;
 }
 
 return null;
 
}