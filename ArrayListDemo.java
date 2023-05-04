package Collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

	public static void main(String[] args) {
		int arr[] = new int[5];
		System.out.println("Array Length before adding elements : "+arr.length);
		arr[0]=1;
		System.out.println("Array length after adding element : "+arr.length);
		System.out.println();
		System.out.println("------------------------------------------");
		List<Integer> list = new ArrayList<Integer>();
		System.out.println("Size of arraylist before : "+list.size());
		list.add(5);//adding elements in arraylist
		list.add(34);
		list.add(48);
		list.add(45);
		System.out.println("Size of arraylist after : "+list.size());
		System.out.println(list);
		System.out.println("Size of arraylist after : "+list.size());
		System.out.println();
		System.out.println("------------------------------------------");
		
		//using for loop
		System.out.println("Printing Arraylist elements using for loop : ");
        for(int i=0;i<list.size();i++)
        {
        	System.out.println(list.get(i));
        }
        System.out.println();
		System.out.println("------------------------------------------");
        //using while loop
        System.out.println("Using While loop");
        int i=0;
        while(i<list.size())
        {
        	System.out.println(list.get(i));
        	i++;
        }
        System.out.println();
		System.out.println("------------------------------------------");
        //using iterator
        System.out.println("Iterate using Iterator :");
        Iterator itr = list.iterator();
        while(itr.hasNext())
        {
        	System.out.println(itr.next());
        }
        System.out.println();
		System.out.println("------------------------------------------");
		
		//sort arraylist ascending order
		Collections.sort(list);
		System.out.println("After sorting arraylist in ascending order : ");
		System.out.println(list);
		
		System.out.println();
		System.out.println("------------------------------------------");
  
		//sort arraylist descending order
		Collections.sort(list,Collections.reverseOrder());
		System.out.println("After sorting arraylist in descending order : ");
		System.out.println(list);
		System.out.println();
		System.out.println("------------------------------------------");
		
		list.add(1, 100);//adding 100 elements in index 1
        System.out.println(list);
    	System.out.println();
		System.out.println("------------------------------------------");
		
		//copy array List
		ArrayList<Integer> list1 = new ArrayList<Integer>();
		System.out.println("ArrayList 2 before copy : ");
		System.out.println(list1);
		list1.addAll(list);
		System.out.println("Copied arraylist : "+list1);
		System.out.println();
		System.out.println("------------------------------------------");

	    //Sublist 
		//System.out.println(list.subList(1, 3));
		List<Integer> sub = list.subList(1, 3);
		System.out.println(sub);
		System.out.println();
		System.out.println("------------------------------------------");
		
		//another way
		ArrayList<Integer> list2 = new ArrayList<Integer>(list.subList(1, 3));
		System.out.println();
		System.out.println(list2);
		System.out.println();
		System.out.println("------------------------------------------");
		
		//Search Element
		System.out.println(list.contains(100));//element present in arraylist
		System.out.println(list.contains(6));//element not present in arraylist
	}

}
