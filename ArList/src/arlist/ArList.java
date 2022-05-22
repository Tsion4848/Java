package arlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArList {

    public static void main(String[] args) {
    //heterogeneous arraylist
        ArrayList aList = new ArrayList();
        aList.add(2);
        aList.add("welcome");
        aList.add("here we are");
        aList.add('A');
        aList.add(true);
        
        System.out.println(aList);
        System.out.println("number of elements in the arraylist: " + aList.size());
        aList.remove(true);
        System.out.println("after removing the first element: " + aList);
        aList.add(2,"hihi");
        System.out.println("after adding the second element: " + aList);        
        System.out.println(aList.get(2));
        aList.set(3,"hello there");
        System.out.println("after replacing the forth element: " + aList);   
        System.out.println("the list contains \"welcome\": " + aList.contains("welcome"));  
        System.out.println("the list contains \"phyton\": " + aList.contains("hi"));
        System.out.println("the list is empty: " + aList.isEmpty());  
        System.out.println();
        System.out.println("the whole elements of the list using get() are: ");
        for (int i = 0 ; i < aList.size() ; i++){
            System.out.println(aList.get(i));
        }
        System.out.println();
        System.out.println("the whole elements of the list using foreach() are: ");
        for (Object x:aList){
            System.out.println(x);
        }
        System.out.println();
        System.out.println("the whole elements of the list using iterator() are: ");
        Iterator it = aList.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println();
        
     //homogeneous arraylist
        ArrayList dup = new ArrayList();
        dup.addAll(aList);
        System.out.println("the duplicated elements are: " + dup);
        dup.removeAll(dup);
        System.out.println("duplicated array after removal of its elements" + dup);
        System.out.println("is duplicated list empty? " + dup.isEmpty());
                
        System.out.println();
        
        dup.add("A");
        dup.add("H");
        dup.add("D");
        dup.add("B");
        dup.add("Z");
        dup.add("T");
        
        System.out.println("dup after insertion of elements: "  + dup);  
        
        Collections.sort(dup);
        System.out.println("dup after being sortrd: " + dup);
        
        Collections.sort(dup, Collections.reverseOrder());
        System.out.println("dup after being sorted in reverse order: " + dup);
        System.out.println();
        Collections.shuffle(dup);
        System.out.println("dup after shuffling: " + dup);
                
        System.out.print("dup after using \"asList\": ");
        ArrayList al = new ArrayList(Arrays.asList(dup));
        System.out.println(al);
        
    }
    
}
