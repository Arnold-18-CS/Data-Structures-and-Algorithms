//import static sun.jvm.hotspot.runtime.BasicObjectLock.size;

public class Node {
    Object data; //data variable where the info to be stored resides.
    Node next; //next variable  is self-referential link to the next data item

    public Node(Object data){ //constructor initializes the node object by storing the dara that was given as an argument and sets the next reference to null
        this.data =  data;
        this.next = null;
    }
    // stores the methods that can operate on the node and contains a link to the 1st item of the list
    Node head;
    void List(){
            head = null;
        }

    public void traverse(){
        Node current = head; /// stores the current position in the list

        while (current != null){ // step through the list until the end of the list
            System.out.println(current.data); // print out the node present in the current node
            current = current.next;
        }
    }

    public Object getIndex(int index){
        if (index <=0)
            return null;
        return null;
    }

    public void  addToHead(Object data){
        Node newNODE = new Node(data); // create a new node tp store the given data

        newNODE.next = head; // set the new node's next reference to that of the first node

        head = newNODE; //rest the head ref to the newly created node
    }

    public void addToTail(Object data){

        Node insert = head; // traverse the list to the desired insertion point

        while (insert.next != null) {
            insert = insert.next;
        }

        Node newNode = new Node(data); // create a new node to store the given data

        newNode.next = insert.next; // set the new node's next ref to that of the insertion point node

        insert.next = newNode; //reset the insertion point's next ref to that of the newly created node

    }

    public void addToTheTail(Object data){
        Node temp = new Node(data);
        Node current = head;

        while (current.next != null)
            current = current.next;

        current.next =temp;
    }

    public void addToPosition(Object data, int index) { /// insert to a specific index in the list
        Node temp = new Node(data);
        Node current = head;

        //step to the required index
        for (int i = 1; i<index && current.next!=null; i++)
            current = current.next;

        //set the new node's next ref to this node's next ref
        temp.next = current.next;
        //set this node's next ref to the new node
        current.next = temp.next;
    }

    public Object retrieve(int key) {

        Node current = head;
        while (current != null){ // traverse the list

            if (Integer.parseInt((String) current.data) == key) // while traversing compare the key to the data in each node
                return data; // match found will return the matching data

            current = current.next;
        }
        return "NOT FOUND"; // error message returned if data not found
    }

    public boolean deleteByData(Object key) {

        Node current = head;
        Node previous = null;

        while (current != null){ // traverse the list maintaining both the current and prev ref

            //if the search key matches the current data node, 'jump over the current node and return success
            if( current.data == key){
                previous.next = current.next;
                return true;
            }

            previous = current;
            current = current.next;
        }

        return false; /// if hte list is exhausted without data find, return failure signal
    }

//    public boolean deleteByIndex(int index){
//
//        // if index is out of range, exit
//        if(index<1 || index>size())
//            return false;
//
//        Node current = head;
//
//        for (int i=1 ; i<index ; i++){
//            if(current.next == null)
//                return false;
//
//            current = current.next;;
//        }
//        current.next = current.next;
//
//        return true;
//    }
}


