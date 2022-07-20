package memento;

import java.io.Serializable;

public class Originator implements OriginatorInterface, Serializable {
    private String state;

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
