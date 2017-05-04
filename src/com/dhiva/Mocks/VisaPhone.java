package com.dhiva.Mocks;

4 5 6 7 8 9 1 2 3

/* linear search*/
public int findElement(int[] input,int element){
    if(input.length ==0)
        return -1;
    for(int i=0;i<input.length;i++){
        if(input[i] == element)
            return i;
    }
    return -1;
}
//O(n)

//Binary search

public int findElementBinarySearch(int[] input, int element){
    return findElementUtil(input,0,input.length-1,element);
}

private int findElementUtil(int[] input, int start, int end, int target){
    if(start>end)
        return -1;
    int mid = (start+end)/2;
    
    //mid element is the target
    if(input[mid] == target)
        return mid;
    
    //check if left half is sorted
    if(input[start]<input[mid]){
        if(target>input[start] && target<=input[mid]
            return findElementUtil(input, start , mid, target);
        else
            return findElementUtil(input, mid+1, end, target);
        
    }
    
    //check right half from mid
    else{
        if(target<=input[end]&&target>input[mid]
            return findElementUtil(input, mid+1, end, target);
        else
            return findElementUtil(input, start,mid, target);
    }
}

//O(log n)
