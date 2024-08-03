public class Main {
    public static void main(String[] args) {
        
        //SINGLY LINKED LIST
        // LinkedList myLinkedList = new LinkedList(1);

        // myLinkedList.getHead();
        // myLinkedList.getTail();
        // myLinkedList.getLength();

        // myLinkedList.append(3);
        // myLinkedList.append(23);
        // myLinkedList.append(7);

        // System.out.println(myLinkedList.insert(1,2));
        // myLinkedList.prepend(0);
        // System.out.println(myLinkedList.remove(1));
        // myLinkedList.printList();

        // System.out.println(myLinkedList.removeFirst());


        // System.out.println(myLinkedList.removeLast().value);
        // System.out.println(myLinkedList.removeLast().value);
        // System.out.println(myLinkedList.removeLast());
        

        //DOUBLY LINKED LIST
        DoublyLinkedList myDLL = new DoublyLinkedList(1);
        // myDLL.getHead();
        // myDLL.getTail();
        // myDLL.getLength();
        myDLL.append(2);
        myDLL.prepend(0);
        myDLL.printList();


        // System.out.println(myDLL.removeLast().value);
        // System.out.println(myDLL.removeLast().value);
        // System.out.println(myDLL.removeLast());
       
    }
    
}