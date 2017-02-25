package com.dhiva.Mocks;
/*
TestCases:

1. root = null;

2. root = 1, target =1;     1

3. root = 1, target =2;     1
                             \
                              2
     
4. root = 3, target =5;      3
                            / \
                           5   7
                           
5. root = 4, target = 2;          4
                                 /  \ 
                                3    6
                               / \  / \                 
                              7   8 1  2
                              
  */


public class TreeNode{
    float data;
    TreeNode left;
    TreeNode right;
    
    public TreeNode(float data){
        this.data = data;
        this.left = null;
        this.right = null;
    }
} 

public TreeNode findTheClosestNode(TreeNode root, TreeNode target){
    public float diff = root.data - target.data;     
    TreeNode closestNode = findTheClosestNodeUtil(TreeNode root, TreeNode target, float diff);
    return closestNode;
}

private TreeNode findTheClosestNodeUtil(TreeNode root, TreeNode target, float diff){
    if(root == null)
        return null;
        
    if(target.data == root.data)
        return null;
        
    if(Math.abs(target.data - root.data) < diff){
        diff = Math.abs(target.data - root.data);
        return root;
    }
        
     TreeNode left = findTheClosestNodeUtil(root.left, target, diff);
     TreeNode right = findTheClosestNodeUtil(root.right, target, diff); 
      
     if (left == null && right == null)
            return null;
            
     return (left != null) ? left : right;  
}