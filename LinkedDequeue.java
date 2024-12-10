// File LinkedDequeue.java 
/** 
 *  This class represents a Queue datatype implemented using a singly-linked
 *  list with appropriate operations.
 *
 * @author:	Henry Leitner
 * @version: Last modified on April 11, 2015
 * Implements a Queue as a linked-list
 */

public class LinkedDequeue
{
    private QueueNode tail;
    private QueueNode head;
    private int count;
    
    /**
     *  The QueueNode class is an inner class implemented to model a queue node;
     *  it can contain an Object type of data, and also holds the link to the
     *  next node in the queue.  If there are no other nodes, the link will be null.
     */
     class QueueNode        // an inner class
     {
	    private Object item;
	    private QueueNode link;
     }

    /**
     *  This constructor for the class will set up the needed instance variables
     *  which begin with no nodes present and thus are set to null.
     */
    public LinkedDequeue ()
    {
	   tail = head = null;
	   count = 0;
    }

    /**
     *  This method will construct a new QueueNode and add it onto the tail
     *  of the queue (standard FIFO behavior). If it is the first node added into
     *  the queue, both head and tail will reference it, otherwise it is added
     *  using the tail variable.  The node counter is also updated.
     *
     *  @param   x     The Object to be added as part of a new QueueNode
     */
    public void tailAdd (Object x)
    {
	   QueueNode temp = new QueueNode();
	   temp.item = x;
	   temp.link = null;
	
	   if (tail == null) head = tail = temp;
	   else
	   {
	     tail.link = temp;
	     tail = temp;
	   }
	   count++ ;
    }


    /**
     * This method will construct a new QueueNode and add it onto the head
     * of the queue. If it is the first node added into
     * the queue, both head and tail will reference it, otherwise it is added
     * using the head variable.  The node counter is also updated.
     * @param x
     */

    public void headAdd (Object x) {
      QueueNode temp = new QueueNode();
      temp.item = x;
      temp.link = null;
   
      if (tail == null) head = tail = temp;
      else
      {
        temp.link = head;
        head = temp;
      }
      count++ ;
    }

    /**
     *  This method will test for an empty queue and return a boolean result.
     *
     *  @return     true for an empty list; false if the queue contains QueueNodes.
     */
    public boolean isEmpty()
    {
	   return ( count == 0 );
    }
   
    /**
     *  This method will evaluate and return the current size of the queue.
     *
     *  @return     An int describing the current number of nodes in the queue
     */
    public int size()
    {
	    return count;
    }
    
    /**
     *  This method will remove an item from the head of the queue.  
     *  In doing so, the queue variables are reset to detach the node,
     *  and the Object which it contains is then returned.  The queue
     *  counter is also updated to reflect the removal.
     *
     *  @return     The Object which was just removed from the queue.
     */
   public Object headRemove ()
   {
     if ( isEmpty() ) return null;
     else
     {
        Object tempItem = head.item;
        head = head.link;
        if (head == null)   tail = null;
        count -- ;
        return tempItem;
      }
   }

      /**
       * This method will remove an item from the tail of the queue.
       *  In doing so, the queue variables are reset to detach the node,
       *  and the Object which it contains is then returned.  The queue
       *  counter is also updated to reflect the removal.
       *
       * @return  The Object which was just removed from the queue.
       */
   public Object tailRemove ()
   {
     if ( isEmpty() ) return null;
     else if (tail == head) {
        Object tempItem = tail.item;
        head = null;
        tail = null;
        count -- ;
        return tempItem;
     }
     else 
     {
        Object tempItem = tail.item;
        QueueNode trav = head;
        QueueNode trail = null;

        while (trav.link != null) {
          trail = trav;
          trav = trav.link;
        }
        tail = trail;
        tail.link = null;
        count -- ;
        return tempItem;
      }
   }


   
   /**
    * This method will return a reference to the head of the LinkedDequeue.
    * If the LinkedDequeue is empty, it will return null;
    *
    * @return a reference to the head of the LinkedDequeue.
    */


   public Object headPeek () {
      if (isEmpty()) {
        return null;
      }
      else {
        return head.item;
      }
   }

   
   /**
    * This method will return a reference to the tail of the LinkedDequeue.
    * If the LinkedDequeue is empty, it will return null;
    *
    * @return a reference to the tail of the LinkedDequeue.
    */
   public Object tailPeek () {
      if (isEmpty()) {
        return null;
      }
      else {
        return tail.item;
      }
   }

   /**
    * This method will return a String description of the LinkedDequeue object,
    * by printing each element followed by a comma and a space, except at the end.
    * Will return "empty LinkedDequeue" if the LinkedDequeue object is empty
    */

   public String toString () {
      if (head == null) {
        return "empty LinkedDequeue";
      }
      else {
        QueueNode trav = head;
        StringBuilder str = new StringBuilder("");
        while (trav != null) {
          str.append(trav.item.toString());
          str.append(", ");
          trav = trav.link;
        }

        String export = str.substring(0, str.length()-2); //Removing the trailing space and comma
        return export;
      }
   }
}
