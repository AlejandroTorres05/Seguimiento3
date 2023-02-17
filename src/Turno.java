public class Turno {

    private int number;
    private int vuelta;
    private Turno next;
    private Turno previous;

    public Turno(int number){

        this.number = number;
        this.vuelta = 0;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public Turno getNext() {
        return next;
    }

    public void setNext(Turno next) {
        this.next = next;
    }

    public Turno getPrevious() {
        return previous;
    }

    public void setPrevious(Turno previous) {
        this.previous = previous;
    }

    public int getVuelta() {
        return vuelta;
    }

    public void sumarVuelta() {
        this.vuelta += 1;
    }
}
