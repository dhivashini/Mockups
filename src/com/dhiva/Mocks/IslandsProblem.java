package com.dhiva.Mocks;

/*
Given as input, a 2 dimensional array of 1's and 0's
0 0 1 0 0 0
1 0 0 0 0 0
0 0 1 1 0 0
0 0 1 0 0 0
0 0 1 0 0 0

1's are land and 0's are water (also regions outside array are water).
Group of connected 1's form an island

Find the number of islands in the array
*/

Test cases:
1. 0 0
   0 0
   
   output=0;
2. 1 1
   1 1
   
   output =1;
   
3. 1 1 1
   1 0 1
   1 1 1
   
   output =1;
4.   0 0 1 0 0 0
    1 0 0 0 0 0
    0 0 1 1 0 0
    0 0 1 0 0 0
    0 0 1 0 0 0 
    
    output = 3;
    
Solution:

Check each element in my input and mark if visited in my temp 2D array.
Check each elemnt in the input, i need to check the top,left,right and bottom of my input.
for every element in input
    mark visited
    if element is 1, increment count of islands by 1
    check the elements top, bottom,left and right
        if any of those elements is visited, dont increment count


public int countNumberOfIslands(int[][] input, int c, int r){
    int count = 0;
    boolean[][] visited = new boolean[r][c];
    
    for(int i =0; i < r;i++){
        for(int j = 0; j < c; j++){
            
            if(!visited[i][j]){
                visited[i][j] = true;
                if(input[i][j] == 1)
                    count++;
                checkElements(input,i,j,r,c,visited);
            }
        }
    }
}

private void checkElements(int[][] input, int i, int j, int r, int c, int[][] visited){
    // for element at (i,j) index
    //i,j-1 --> top
    // i,j+1 --> bottom
    //i+1,j --> right
    // i-1,j --> left
    if(i < 0 || i >= r || j < 0 || j >= c) {
        return;
    }
    
    
        if(input[i][j]==1){
            visited[i][j] =true;
        }
    
      
        checkElements(input, i,j-1,r,c,visited);
        checkElements(input, i,j+1,r,c,visited);
        checkElements(input, i+1,j,r,c,visited);
        checkElements(input, i-1,j,r,c,visited);    
       
}                  
    
    
    
++
- chunking the problem into smaller parts with test cases
- comes up with an overall approach.


(--)
- difficult to coach, not able to follow suggestions, tips.
- gets struck on finding the bug to provide a solution and able to fix the bug with correct code.
- need to clearly articluate the solution with clear comment before starting solution
- goes silent while typing
- syntax error in function decleration, needs to be clareful in declaring the functions
- need to write thought process as comment, so it will help the interviewer what you are thinking
