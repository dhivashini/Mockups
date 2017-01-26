package com.dhiva.Mocks;

public class NAryTree {
	class TreeNode{
	     ArrayList<TreeNode> list = new ArrayList<TreeNode>();
	     String data;
	     TreeNode(int data, int childCount){
	         this.data = data;
	         while(childCount>0){
	             TreeNode n = null;
	             list.add(n);
	             childCount--;
	         }
	     }
	 }
	 
	 // DO NOT Delete the codes, comment out or give a new names for the new methods.
	 
	 TreeNode getRootNode (Map<String, Set<String>> tree_representation) {
	 
	 // whats the run time of this algorithm ?
	 //run-time : O(mn), m is the number of keys, n is the number of values.
	 
	 for(String s : tree_representation.keySet()){ 
	         for(Set<String> current : tree_representation.values()){
	              if(!current.contains(s)){
	                  TreeNode n = new TreeNode(s,tree_representation.get(s).size()); 
	                  // ? please return the root node for the whole tree. your current root node has only one level. its just a dummy
	                  // if you are returning a root node, i should be able to traverse the whole tree with that.
	                  createCompleteTree(tree_representation,n);
	                  return n;
	              }
	         }    
	     }
	}

	void createCompleteTree(Map<String, Set<String>> tree_representation, TreeNode n){
	    if(n.list.isEmpty() || !tree_representation.containsValue(n.data))
	        return n;
	    Set<String> setObj = tree_representation.get(n.data);
	    for(String s : setObj){
	        TreeNode current = new TreeNode(s);
	        n.add(current);
	        createCompleteTree (Map<String, Set<String>> tree_representation, TreeNode n);       
	    }    
	}
	/*

	‘h600’: [],
	‘a123’: [‘foo2’],
	 ‘245’ : [‘890L’,’zqwe’],
	 ‘890L’:[],
	‘zqwe’:[],
	‘h45x’ :  [‘t901’, ‘h600’], 
	 ‘t901’ : [‘245’,’a123’,’qwer’]
	*/


	List<TreeNode> getTreeNodesByLevel (TreeNode root, int level) { 
	//Assuming i can return a linkedList.
	    List<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
	    LinkedList<TreeNode> listOfdepths = getTreeNodsByLevel(lists,root,0,level);
	    return listOfDepths;  
	}
	 
	// did you copy this ? from somewhere ?
	//i didn't copy. i learnt from cracking the coding interview.

	// your code figures out for all the levels.
	// make it more efficient to cut out by not going to levels below the required and you do not have to store the other level nodes.
	 LinkedList<TreeNode> getTreeNodesByLevel(LinkedList<TreeNode> lists, TreeNode root, int level,int limit){
	while(level <= limit){
	    if(root==null)
	        return root;
	    LinkedList<TreeNode> list = null;    
	    if(level==limit){
	        if(list==null){
	       list = new LinkedList<TreeNode>();
	       }
	       else 
	           list.add(root);
	    } 
	    int nodeChileCount = root.list.size();
	    while(size>0){
	        getTreeNodesByLevel(lists,list.get(size),level+1,limit);
	        size--;
	    }
	    }     
	}

	// this wont work!
	// 
	Boolean isSameTree (TreeNode root1, TreeNode root2) {
	    if(root1==null&&root2==null)
	        return true;
	    if(root1==null||root2==null)
	        return false;
	    if(root1.data != root2.data)
	        return false;
	    if(root1.list.size()!=root2.list.size())
	        return false; 
	    Iterator i = root1.list.iterator();
	    Iterator j = root2.list.iterator();  
	    while(i.hasNext() && j.hasNext()){
	        return(isSameTree(i.next(),j.next());
	    }
	    return true;
	} 
}
