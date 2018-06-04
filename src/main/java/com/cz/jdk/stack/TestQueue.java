package com.cz.jdk.stack;

/**
 * @author partner
 * @date 2018/6/1 13:14
 */
public class TestQueue {
    public static void main(String[] args) {
        Queue stack = new QueueImpl();
        String tmp;
        stack.push("1");
        stack.push("2");
        stack.push("3");
        tmp=stack.pop();
        System.out.println(tmp);//3
        stack.push("4");
        tmp=stack.pop();
        System.out.println(tmp);//4
        tmp=stack.pop();
        System.out.println(tmp);//2
        stack.push("5");
        stack.push("6");
        tmp=stack.pop();
        System.out.println(tmp);//6
        tmp=stack.pop();
        System.out.println(tmp);//5
        tmp=stack.pop();
        System.out.println(tmp);//1
    }
}
