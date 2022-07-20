package memento;

public class Main {

    public static void main(String[] args) throws Exception {
        OriginatorInterface originator = new Originator();
        CaretakerInterface caretaker   = new Caretaker();

        try {
            originator.setState("state is on");
            caretaker.save(new Memento(originator));
            System.out.println(originator.getState() + "\n");

            originator.setState("state is off");
            caretaker.save(new Memento(originator));
            System.out.println(originator.getState() + "\n");

            originator.setState("state is empty");
            System.out.println(originator.getState() + "\n");

            originator.setState(caretaker.undo().getMemento().getState());
            System.out.println("Restoring state...\n" + originator.getState() + "\n");

            originator.setState(caretaker.undo().getMemento().getState());
            System.out.println("Restoring state...\n" + originator.getState() + "\n");
        } catch (Exception e) {
            System.out.printf("Caught exception: %s \n", e.getLocalizedMessage());
        }
    }
}
