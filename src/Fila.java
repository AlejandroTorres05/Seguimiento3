public class Fila {
    private Turno head;


    public void addTurno (Turno turno){

        if (head == null) {
            this.head = turno;
            this.head.setNext(head);
            this.head.setPrevious(head);
            return;
        }
        Turno lastPrev = head.getPrevious();
        head.setPrevious(turno); turno.setNext(head);
        lastPrev.setNext(turno); turno.setPrevious(lastPrev);
    }

    public void removeNode (int number){

        if (head.getNumber() == number){
            head.getPrevious().setNext(head.getNext());
            head.getNext().setPrevious(head.getPrevious());
            this.head = head.getNext();
            return;
        }

        removeNode(head.getNext(),number);
    }

    private void removeNode (Turno current, int number) {

        if (current.equals(head)) return;
        if (current.getNumber() == number){
            current.getPrevious().setNext(current.getNext());
            current.getNext().setPrevious(current.getPrevious());
        }
        removeNode(current.getNext(),number);
    }

    public void print (){
        if (head == null) return;
        System.out.println(head.getNumber());
        print(head.getNext());
    }

    private void print (Turno current){
        if (current.equals(head)) return;
        System.out.println(current.getNumber());
        print(current.getNext());
    }

}
