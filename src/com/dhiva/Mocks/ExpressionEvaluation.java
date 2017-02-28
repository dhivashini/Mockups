package com.dhiva.Mocks;
/*
(+ 12 4) returns 16

(- 10 0) returns 10

(+ (* 2 3) (/ (+ 4 5) 3)) returns 9

Compute the value given the string. The four operators are +, -, *, and /.
*/
/*
1.(/ 12 4) output: 3

2. (- 0 0) output: 0 

*/

int compute(String s) {         // + * 2 3 / + 4 5 3
    //to reverse the input
    StringBuilder input = new StringBuilder(s);
    String expression = input.reverse().toString();  // 4 12 /
    //stack to push operands
    Stack<Float> operandStack = new Stack<>();  //stack = empty
    
    Scanner sc = new Scanner(expression);
    
    //iterate over the input until end
    while(sc.hasNext()){                
         //if current input is an operand
        if(sc.hasNext()){
            operandStack.push(sc.hasNext());     //stack = 4->12
            continue;
        }
        
        //if current input is operator
        if(!sc.hasNext()){
            float operand2 = operandStack.pop();  //12
            float operand1 = operandStack.pop();  //4
            
            //check the operator
            char operator = sc.next();
            if(operator == '+')
                operandStack.push(operand2+operand1);  //12+4  stack =16
            if(operator == '-')
                operandStack.push(operand2-operand1);  //10-0 stack = 10
            if(operator == '*')
                operandStack.push(operand2*operand1);
            if(operator =='/')
                operandStack.push(operand2/operand1);  //12/4 stack = 3
            
        }
    }
    
    //returns final result of my expression
    return operandStack.pop();   //3
    
    
}
