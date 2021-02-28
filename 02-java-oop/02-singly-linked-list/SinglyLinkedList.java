public class SinglyLinkedList {
    public Node head;
    public int size;
    public SinglyLinkedList() {
        // your code here - Create a constructor method that sets the head to null of your SinglyLinkedList objects
        this.head = null;
        this.size = 0;

    }
    // SLL methods go here. As a starter, we will show you how to add a node to the list.
    public void add(int value) {
        Node newNode = new Node(value);
        if(this.head == null) {
            this.head = newNode;
            System.out.println(value + " has been added as the head node");
            this.size++;
        } else {
            Node runner = this.head;
            while(runner.next != null) {
                runner = runner.next;
            }
            runner.next = newNode;
            System.out.println(value + " has been added to the last node");
            this.size++;
        }
    } 
    // Create a remove() method that will remove a node from the end of your list   
    public void remove(){
        if (this.head == null){
            System.out.println("The list is empty");
        }
        Node runner = this.head;
        while (runner.next.next != null){
            runner = runner.next;
        }
        runner.next = null;
    }
    // Create printValues() method that will print all the values of each node in the list in order
    public void printValues(){
        if (this.head == null){
            System.out.println("The List is empty");
        }
        Node runner = head;
        int counter = 0;
        while (runner != null){
            if(counter < 1){
                System.out.println("Head: "  + runner.value);
                counter++;
                runner = runner.next;
            }
            else {
                System.out.println("Node " + counter + " : " + runner.value);
                counter++;
                runner = runner.next;
            }
        }
    }
    // Implement a find(int) method that will return the first node with the value in the parameter
    public void find(int val){
        if (this.head == null){
            System.out.println("The list is empty");
        }
        Node runner = this.head;
        while (runner.next != null){
            if (runner.value == val){
                System.out.println(val);
            }
            runner = runner.next;
        }

    }
    //Implement a removeAt(int) method that will remove the node after n nodes, where n is the parameter. For example, if n is 0, remove the first node. If n is 1, remove the second node. Similar to Arrays.
    public void removeAt(int n){
        if (this.head == null){
            System.out.println("The list is empty");
        }
        Node runner = this.head;
        if (n == 0 && this.size > 1){
            this.head= runner.next;
        } else {
            int counter = 0;
            while (runner.next != null){
                if (counter == n-1){
                    runner.next = runner.next.next;
                    return;
                }
                runner = runner.next;
                counter++;
            }
        }
    }
}