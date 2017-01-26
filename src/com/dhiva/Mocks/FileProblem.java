package com.dhiva.Mocks;

public class FileProblem {
	public boolean findWords(List<String> words, Set<String> input){
	    Iterator i = input.iterator();
	    while(i.hasNext()){
	        if(!words.contains(i.next())
	            return false;
	        
	    }
	    while(i.hasNext()){
	        boolean multiple = findWords(words,i.next());
	    }
	    
	    if(multiple){
	        int[] indexArray = returnIndex(words);
	    }
	}

	public boolean findWords(List<String> words, String input){
	    Iterator i = words.iterator();
	    boolean isPresent = false;
	    while(i.hasNext()){
	        if(input.equals(i.next()){
	            if(isPresent)
	                return true;
	            isPresent = true;
	        }     
	    }
	    return false;
	}

	public int[] returnIndex(List<String> words){
	    
	}
}
