package Oct.ex_28102024_CollectionFrameWorkP1;

import java.util.ArrayList;

public class Lab172_Array_ArrayList_CF {
    public static void main(String[] args) {
        //Collection - Interface
        //List - Interface
        //List--> Arraylist, Linkedlist, Stack and Vector -Class
//        Compiled from "Collection.java"
//        public interface java.util.Collection<E> extends java.lang.Iterable<E> {
//            public abstract int size();
//            public abstract boolean isEmpty();
//            public abstract boolean contains(java.lang.Object);
//            public abstract java.util.Iterator<E> iterator();
//            public abstract java.lang.Object[] toArray();
//            public abstract <T> T[] toArray(T[]);
//            public default <T> T[] toArray(java.util.function.IntFunction<T[]>);
//            public abstract boolean add(E);
//            public abstract boolean remove(java.lang.Object);
//            public abstract boolean containsAll(java.util.Collection<?>);
//            public abstract boolean addAll(java.util.Collection<? extends E>);
//            public abstract boolean removeAll(java.util.Collection<?>);
//            public default boolean removeIf(java.util.function.Predicate<? super E>);
//            public abstract boolean retainAll(java.util.Collection<?>);
//            public abstract void clear();
//            public abstract boolean equals(java.lang.Object);
//            public abstract int hashCode();
//            public default java.util.Spliterator<E> spliterator();
//            public default java.util.stream.Stream<E> stream();
//            public default java.util.stream.Stream<E> parallelStream();
        //Collection framework is a collection of Items with diffrent data type
        //Ex below collection of framework for Student list
        ArrayList studentlist = new ArrayList();//No fix size is given like array Integer []arr =new Integer[5]
        studentlist.add("Chaitra");
        studentlist.add("Krishnaprasad");
        studentlist.add("Krishnaprasad");//Dulicate value is allowed
        studentlist.add("Sunil");
        studentlist.add("Pruthvik");
        studentlist.add("Advith");
        studentlist.add(true);//boolean data type is allowed
        studentlist.add(123);//Integer is allowed
        studentlist.add(null);//Null is allowed
        System.out.println(studentlist);


        }

    }

