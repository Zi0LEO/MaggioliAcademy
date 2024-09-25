package memento;

import java.util.Scanner;

public class Editor {

    private String data;
    private Caretaker history;

    Scanner sc = new Scanner(System.in);

    public Editor(Caretaker history, String data){
        this.history = history;
        this.data = data;
    }

    public void write(){
        StringBuilder sb= new StringBuilder();
        sb.append(data);
        sb.append(sc.nextLine());
        data = sb.toString();
        history.somethingChanged();
    }

    public Snapshot makeSnapshot(){
        return new Snapshot(data);
    }

    public void restore(Snapshot snapshot){
        data = snapshot.data;
    }

    public static class Snapshot{
        private String data;

        private Snapshot(String data){
            this.data = data;
        }



    }
}
