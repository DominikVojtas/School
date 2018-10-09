import java.util.ArrayList;

public class Skola {
    private ArrayList<Trieda>aTriedy;
    private ArrayList<Osoba>aUcitelia;
    private Osoba aRiaditel;
    private String aNazovSkoly;
    public Skola(String paNazovSkoly, Osoba paRiaditel) {
        aNazovSkoly = paNazovSkoly;
        aRiaditel = paRiaditel;
        aTriedy = new ArrayList<Trieda>();
        aUcitelia = new ArrayList<Osoba>();
        
        aUcitelia.add(paRiaditel);
        
        //this.pridajUcitela(paRiaditel);
    }
    
    public boolean pridajUcitela(Osoba paUcitel) {
    return aUcitelia.add(paUcitel);
    } 
    
    public boolean pridajTriedu(Trieda paTrieda) {
    return aTriedy.add(paTrieda);
    }
    
    public boolean pridajTriedu(String paNazov, Osoba paTriednyUcitel ) {
    return aTriedy.add(new Trieda (paNazov, paTriednyUcitel));
    }
    
    public boolean pridajStudenta(Student paNovyStudent, int paIndexTriedy) {
     if (paIndexTriedy < 0 || paIndexTriedy > aTriedy.size() ) {
        return false;
        } else {
        return aTriedy.get(paIndexTriedy).pridajStudenta(paNovyStudent);
        }
    }
}
