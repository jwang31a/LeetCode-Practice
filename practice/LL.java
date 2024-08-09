public class LL<THING> {
    THING car; 
    LL<THING> cdr;
    
    public LL(THING car) {
        this.car = car;
    }

    public LL(THING[] array) {
        //convert an array into a list
    }

    public THING car() {
        return(car);
    }

    public LL<THING> cdr() {
        return cdr;
    }

    public void setCar(THING newCar) {
        car = newCar;
    }

    public void setCdr(LL<THING> newCdr) {
        cdr = newCdr;
    }

    public static void main(String[] args) {
        LL<Integer> linkedlist = new LL<>(1);
        System.out.println(linkedlist.car());
        linkedlist.setCar(132);
        System.out.println(linkedlist.car());

    }
}