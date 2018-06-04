package com.cz.jdk.stack;

import java.util.Stack;

/**
 * @author partner
 * @date 2018/6/1 13:11
 */
public class QueueImpl implements  Queue{
    Stack<String> stack1 = new Stack<String>();
    Stack<String> stack2 = new Stack<String>();

    public void push(String node) {
        while(!stack2.isEmpty()){
            stack1.add(stack2.pop());
        }
        stack1.push(node);

    }

    public String pop() {
        while(!stack1.isEmpty()){
            stack2.add(stack1.pop());
        }


        return stack2.pop();

    }
}
