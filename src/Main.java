public class Main {
    public static void main(String[] args) {
        
        LinkedList myLinkedList = new LinkedList(1);

        // myLinkedList.getHead();
        // myLinkedList.getTail();
        // myLinkedList.getLength();

        myLinkedList.append(2);
        myLinkedList.printList(0);

        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast().value);
        System.out.println(myLinkedList.removeLast());
        


    }
    
}