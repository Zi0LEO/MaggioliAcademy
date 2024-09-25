package memento;

import java.util.LinkedList;

public class Caretaker {

    Editor editor;
    LinkedList<Editor.Snapshot> history;

    public void undo(){
        Editor.Snapshot snapshot = history.removeLast();
        editor.restore(snapshot);
    }

    public void somethingChanged(){
        Editor.Snapshot snapshot = editor.makeSnapshot();
        history.add(snapshot);
    }
}
