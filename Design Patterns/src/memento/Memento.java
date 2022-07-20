package memento;

import java.io.Serializable;

public class Memento implements MementoInterface, Serializable {
    private final OriginatorInterface memento;

    public Memento(OriginatorInterface originator){
        this.memento = originator;
    }

    public OriginatorInterface getMemento() {
        return this.memento;
    }
}
