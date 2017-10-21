import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyDriver {
    /**
    public static void main(String[] args) {
        BasicLinkedList<Integer> list = new BasicLinkedList<Integer>();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);
        
        System.out.println("List size: " + list.size());
       // list.printList();
        /*
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();
        System.out.println("List after adding 3 at index 2: " );
        list.add(2, 3);
        System.out.println("List size: " + list.size());
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        */
    /*
        list.add(2, 3);
        System.out.println("List after adding 3 at index 2: " );
        System.out.println("List size: " + list.size());
        //list.printList();
        
        System.out.println(list.contains(2));
       // System.out.println(list.indexOf(0));
        /*
        list.clear();
        System.out.println("List size: " + list.size());
        list.printList();       
        */
        
        
       //Test remove() method
    /*
        System.out.println();
        System.out.println("List before remove is called: ");
        System.out.println("List size: " + list.size());
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        
        list.remove(3);
        System.out.println("List after remove is called on index 3: ");
        System.out.println("List size: " + list.size());
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        
        list.add(3, 5);
        
        //Test set() method
        System.out.println();
        System.out.println("List before set is called: ");
        System.out.println("List size: " + list.size());
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        
        list.set(3, 11);
        
        System.out.println("List after set to replace index 3 with 11: ");
        System.out.println("List size: " + list.size());
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }        
        
        //Test the IndexOutOfBoundsException for set
        /*
        list.set(9, 11);
        
        System.out.println();
        System.out.println("List before remove is called: ");
        System.out.println("List size: " + list.size());
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        
        list.remove(3);
        System.out.println("List after remove is called on index 3: ");
        System.out.println("List size: " + list.size());
        for(int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        */
        
        
      
       //Iterator testing
       /*
       System.out.println();
       list.clear();
       list.add(1);
       list.add(2);
       BasicListIterator<Integer> iterator = list.basicListIterator();
       System.out.println(iterator.hasNext());
       System.out.println(iterator.next());
       System.out.println(iterator.hasNext());
       System.out.println(iterator.next());
       System.out.println(iterator.hasNext());
       
       System.out.println(iterator.hasPrevious());
       System.out.println(iterator.previous());
       System.out.println(iterator.hasPrevious());
       System.out.println(iterator.previous());
       System.out.println(iterator.hasPrevious());
       System.out.println(iterator.previous());
       /*
       */
    /*
       list.clear();
       System.out.println();
       int expected[] = {88, 66, 77, 55, 99};
       int i = 0;
       
    }
 **/
       /*
       for (int i = 0; i < expected.length; i++) {
           list.add(expected[i]);
       }
       
       
       BasicListIterator<Integer> ll = list.basicListIterator();
       int i = 0;
       while(ll.hasNext()) {
           System.out.print("next: " + ll.next() + " " +  "Expected: " + expected[i++]);
           System.out.println();
       }
       while(ll.hasPrevious()) {
           System.out.print("previous: " + ll.previous() + " " +  "Expected: " + expected[--i]);
           System.out.println();
       }
       
       list.add(50);
       for(int j = 0; j < list.size(); j++) {
           System.out.println(list.get(j));
       }   
       */     
       
    // Test list of many...
       public static void main(String[] args)
       {
          System.out.println("Testing BasicListIterator...");
          boolean pass = true;
          BasicLinkedList<Integer> list = new BasicLinkedList<Integer>();
          int[] ints = new int[] {99, 88, 77, 66, 55};
          
          BasicListIterator<Integer> iter;
          
          // Test that remove method of Iterator interface throws as specified...
          boolean caught = false;
          
          iter = list.basicListIterator();      
          try
          {
             iter.remove();
          }
          catch(UnsupportedOperationException e)
          {
             caught = true;
          }
          
          pass &= test(caught, "ListIterator.remove() not throwing UnsupportedOperationException");
             
          // Test empty list...      
          pass &= test(!iter.hasNext(), "ListIterator.hasNext() on empty list");
          pass &= test(!iter.hasPrevious(), "ListIterator.hasPrevious() on empty list");
          
          caught = false;
          try
          {
             iter.next();
          }
          catch (NoSuchElementException e)
          {
             caught = true;
          }
          
          pass &= test(caught, "ListIterator.next() not throwing when it should");

          caught = false;
          try
          {
             iter.previous();
          }
          catch (NoSuchElementException e)
          {
             caught = true;
          }
          
          pass &= test(caught, "ListIterator.previous() not throwing when it should");

          // Test list of one...
          list.add(ints[0]);
          iter = list.basicListIterator();

          pass &= test(iter.hasNext(), "ListIterator.hasNext() on list of one");
          pass &= test(!iter.hasPrevious(), "ListIterator.hasPrevious() on list of one");
          
          caught = false;
          try
          {
             pass &= test(iter.next() == ints[0], "ListIterator.hasNext() on non-empty list");
          }
          catch (NoSuchElementException e)
          {
             caught = true;
          }
          
          pass &= test(!caught, "ListIterator.next() throwing when it should not");

          caught = false;
          try
          {
             pass &= test(iter.previous() == ints[0], "ListIterator.hasPrevious() on non-empty list");
          }
          catch (NoSuchElementException e)
          {
             caught = true;
          }
          
          pass &= test(!caught, "ListIterator.previous() throwing when it should not");

          caught = false;
          try
          {
             iter.next();
             iter.next();
          }
          catch (NoSuchElementException e)
          {
             caught = true;
          }
          
          pass &= test(caught, "ListIterator.next() not throwing when it should");

          // Test list of two...
          list.add(ints[1]);
          iter = list.basicListIterator();
          
          int i = 0;
          while(iter.hasNext())
          {
             pass &= test(iter.next() == ints[i++], "ListIterator not working correctly");
          }
          
          caught = false;
          try
          {
             iter.next();
           }
          catch (NoSuchElementException e)
          {
             caught = true;
          }
          
          pass &= test(caught, "ListIterator.next() not throwing when it should");

          while(iter.hasPrevious())
          {
             pass &= test(iter.previous() == ints[--i], "ListIterator not working correctly");
          }

          caught = false;
          try
          {
             iter.previous();
          }
          catch (NoSuchElementException e)
          {
             caught = true;
          }
          
          pass &= test(caught, "ListIterator.previous() not throwing when it should");

          // Test list of many...
          list.add(ints[2]);
          list.add(ints[3]);
          list.add(ints[4]);
          iter = list.basicListIterator();

          i = 0;
          while(iter.hasNext())
          {
             pass &= test(iter.next() == ints[i++], "ListIterator not working correctly");
          }
          
          caught = false;
          try
          {
             iter.next();
           }
          catch (NoSuchElementException e)
          {
             caught = true;
          }
          
          pass &= test(caught, "ListIterator.next() not throwing when it should");

          while(iter.hasPrevious())
          {
             pass &= test(iter.previous() == ints[--i], "ListIterator not working correctly");
          }

          caught = false;
          try
          {
             iter.previous();
          }
          catch (NoSuchElementException e)
          {
             caught = true;
          }
          
          pass &= test(caught, "ListIterator.previous() not throwing when it should");
          
          // Remove some elements and iterate over remaining ones...

          for(int j = 0; j < list.size(); j++) {
              System.out.println(list.get(j));
          }
          pass &= test(list.remove(2) == ints[2], "remove(int) after iteration");
          pass &= test(list.remove(3) == ints[4], "remove(int) after iteration");
          pass &= test(list.remove(0) == ints[0], "remove(int) after iteration");
          
          for(int j = 0; j < list.size(); j++) {
              System.out.println(list.get(j));
          }
          iter = list.basicListIterator();
          
          pass &= test(iter.hasNext(), "hasNext() after remove(int)");
          pass &= test(iter.next() == ints[1], "next() after remove(int)");
          
          pass &= test(iter.hasNext(), "hasNext() after remove(int)");
          pass &= test(iter.next() == ints[3], "next() after remove(int)");

         // Add some elements and iterate over list...
          //list.add(2, ints[2]);
          //list.get(2);
          list.add(ints[2]);
          list.add(ints[4]);
          list.add(ints[0]);
          System.out.println(list.get(4));
          for(int j = 0; j < list.size(); j++) {
              System.out.println(list.get(j));
          }
          iter = list.basicListIterator();
          
          //iter = list.basicListIterator();
          while(iter.hasNext())
              System.out.println(iter.next());
          
          pass &= test(list.size() == 5,"size() after remove-add");
          
          iter = list.basicListIterator();
          i = 0;
          
          int expected[] = {88, 66, 77, 55, 99};
          
          for(int j = 0; j < ints.length; j++) {
              System.out.println(ints[i]);
          }
          
          System.out.println(list.size());
          for(int j = 0; j < list.size(); j++) {
              System.out.println(list.get(j));
          }
          
          while(iter.hasNext())
          {
             System.out.println(iter.next() + " " + i++);
             //pass &= test(iter.next() == expected[i++], "ListIterator not working correctly");
          }
          
          caught = false;
          try
          {
             iter.next();
          }
          catch (NoSuchElementException e)
          {
             caught = true;
          }
          
          pass &= test(caught, "ListIterator.next() not throwing when it should");

          while(iter.hasPrevious())
          {
              System.out.println(iter.previous() + " " + --i);
             //pass &= test(iter.previous() == expected[--i], "ListIterator not working correctly");
          }

          caught = false;
          try
          {
             iter.previous();
          }
          catch (NoSuchElementException e)
          {
             caught = true;
          }
          
          pass &= test(caught, "ListIterator.previous() not throwing when it should");

          // Remove all and iterate...
          list.remove(4);
          list.remove(1);
          list.remove(2);
          list.remove(0);
          list.remove(0);
          
          pass &= test(list.size() == 0, "size() after remove(int)");
          
          iter = list.basicListIterator();
          
          pass &= test(!iter.hasNext(), "ListIterator.hasNext() after remove(int)");
          pass &= test(!iter.hasPrevious(), "ListIterator.hasPrevious() after remove(int)");
          
          // Add some and iterate...
          for (i = ints.length - 1; i > -1; i--)
          {
             list.add(ints[i]);
          }
          
          iter = list.basicListIterator();

          i = 4;
          while(iter.hasNext())
          {
             pass &= test(iter.next() == ints[i--], "ListIterator.next() after add(E)");
          }

          pass &= test(iter.hasPrevious(), "ListIterator.hasPrevious() after next()");

          // Clear and iterate...
          list.clear();

          iter = list.basicListIterator();
          
          pass &= test(!iter.hasNext(), "ListIterator.hasNext() after clear()");
          pass &= test(!iter.hasPrevious(), "ListIterator.hasPrevious() after clear()");
       }
    
    private static boolean test(boolean pass, String msg)
    {
       if (!pass)
       {
          (new Throwable("   Failed: " + msg)).printStackTrace();
       }
       
       return pass;
    }
    
    
    
}
