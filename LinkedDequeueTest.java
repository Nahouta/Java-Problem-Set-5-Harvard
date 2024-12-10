public class LinkedDequeueTest {

    public static void main (String [] args) {
        System.out.println("---------------LinkedDequeue Demonstration---------------\n");
        System.out.println("\n1. Creating an Empty LinkedDequeue Object, printed using toString()");

        LinkedDequeue ldq = new LinkedDequeue();
        System.out.println(ldq.toString());

        System.out.println("\n2.1 tailAdd : Inserting the 5 last letters of the alphabet using headAdd");
        ldq.tailAdd("V");
        ldq.tailAdd("W");
        ldq.tailAdd("X");
        ldq.tailAdd("Y");
        ldq.tailAdd("Z");
        System.out.println("\n2.2 tailAdd : Printing the resulting LinkedDequeue object using toString(); Letters should be in aphabetical order");
        System.out.println(ldq.toString());

        System.out.println("\n3. Printing the size of the LinkedDequeue object using size() (Should be 5)");
        System.out.println(ldq.size());

        System.out.println("\n4.1 headAdd : Adding the first 5 letters of the alphabet and three dots, in the front, (In reverse order) using headAdd");
        ldq.headAdd("...");
        ldq.headAdd("E");
        ldq.headAdd("D");
        ldq.headAdd("C");
        ldq.headAdd("B");
        ldq.headAdd("A");
        System.out.println("\n4.2 headAdd : Printing the resulting LinkedDequeue object using toString(); Letters should be in aphabetical order");
        System.out.println(ldq.toString());

        System.out.println("\n5. Accessing the item in the head, using headPeek(), and printing its value");
        System.out.println(ldq.headPeek().toString());

        System.out.println("\n5. Accessing the item in the tail, using tailPeek(), and printing its value");
        System.out.println(ldq.tailPeek().toString());

        System.out.println("\nRemoving the Node at the head, using headRemove() and printing the result");
        ldq.headRemove();
        System.out.println(ldq.toString());

        System.out.println("\nRemoving the Node at the tail, using tailRemove() and printing the result");
        ldq.tailRemove();
        System.out.println(ldq.toString());


    }
    
}
