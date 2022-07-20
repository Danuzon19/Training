package memento;

import java.io.IOException;

public interface CaretakerInterface {
    public MementoInterface undo() throws IOException;

    public void save(MementoInterface memento) throws IOException, Exception;
}