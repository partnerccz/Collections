package com.cz.jdk.list;

/**
 * @author partner
 * @date 2018/6/7 10:15
 */
public class TestList {

    public static void main(String[] args) {
        // method test1()
        test1();

        // method test2()
        test2();
    }

    private static void test1() {
        MyList<String> myList = new MyArrayList();
        myList.add("aaa");
        myList.add("ccc");
        myList.add("ddd");
        myList.add("eee");
        myList.add("fff");
        myList.add("ggg");
        myList.add("hhh");
        myList.add("iii");
        myList.add("jjj");
        myList.add("kkk");
        myList.add("lll");
        myList.insert(1, "bbb");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
        System.out.println("remove before contains:"+myList.contains("ccc"));
        myList.remove(2);
        System.out.println("remove after:"+myList.get(2));
//        System.out.println("------------------------  remove ------------------------");
//        for (int i = 0; i < myList.size(); i++) {
//            System.out.println(myList.get(i));
//        }
        System.out.println("remove after contains:"+myList.contains("ccc"));




        myList.clearAll();
        System.out.println("------------------------  clearAll ------------------------");
        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }
    }

    private static void test2() {

        MyList list = new MyArrayList();
        list.add(1);
        list.add("b");
        list.add(1.2);
        System.out.println("------------------------  test2 method ------------------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
