package composite;

import java.util.ArrayList;

public class Manager implements Dipendente{

    ArrayList<Dipendente> sottoposti;

    @Override
    public void parla() {
        System.out.println("Sono un manager");
    }

    public void aggiungi(Dipendente dipendente){
        sottoposti.add(dipendente);
    }

    public void rimuovi(Dipendente dipendente){
        if(sottoposti.contains(dipendente)){
            sottoposti.remove(dipendente);
            return;
        }
        for(Dipendente sottoposto: sottoposti){
            if(sottoposto instanceof Manager){
                ((Manager) sottoposto).rimuovi(dipendente);
            }
        }
    }

    public ArrayList<Dipendente> getChildren(){
        return sottoposti;
    }
}
