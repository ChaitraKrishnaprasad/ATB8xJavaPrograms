package Oct.ex_30102024_CollectionFrameWorkP2;

import java.util.Stack;

public class Lab181_Stack {
    public static void main(String[] args) {
        //Vector and stack - legacy classess
        //95% we will not use these things in automation
        // We will use ArrayList in automation 95%.
        //LinkList also rare in use
        //LIFO
        Stack s = new Stack();
        s.add("Chaitra");
        s.add("Krishnaprasad");
        System.out.println(s);
        System.out.println(s.pop());// it will remove last added element : Krishnaprasad
        System.out.println(s.peek());
        System.out.println(s);
        s.add("Sunil");
        System.out.println(s);
        System.out.println(s.size());
        System.out.println(s.empty());
        System.out.println(s.add("Pruthvi"));
        System.out.println(s);
        s.push("Lucky");
        System.out.println(s);
        s.add(0,"Myfamily:");
        System.out.println(s);
        System.out.println(s.remove("Lucky"));
        System.out.println(s);



    }
}
