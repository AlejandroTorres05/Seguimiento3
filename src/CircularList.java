public class CircularList {
    private Node head;
    private Node tail;

    public void addNode (Node node){

        if (head == null) {
            this.head = node;
            this.head.setNext(head);
            this.head.setPrevious(head);
            return;
        }
        Node lastPrev = head.getPrevious();
        head.setPrevious(node); node.setNext(head);
        lastPrev.setNext(node); node.setPrevious(lastPrev);
    }

    public void removeNode (String name){

        if (head.getName().equals(name)){
            head.getPrevious().setNext(head.getNext());
            head.getNext().setPrevious(head.getPrevious());
            this.head = head.getNext();
            return;
        }

        removeNode(head.getNext(),name);
    }

    private void removeNode (Node current, String name) {

        if (current.equals(head)) return;
        if (current.getName().equals(name)){
            current.getPrevious().setNext(current.getNext());
            current.getNext().setPrevious(current.getPrevious());
        }
        removeNode(current.getNext(),name);
    }

    public void print (){
        if (head == null) return;
        System.out.println(head.getName());
        print(head.getNext());
    }

    private void print (Node current){
        if (current.equals(head)) return;
        System.out.println(current.getName());
        print(current.getNext());
    }


}
