

public class Osoba {
    
     private String aMeno;
     private String aPriezvisko;
     private MojDatum aDatumNarodenia;
    public Osoba(String paMeno, String paPriezvisko, MojDatum paDatumNarodenia) {
        aMeno = paMeno;
        aPriezvisko = paPriezvisko;
        aDatumNarodenia = paDatumNarodenia;
    }
    
    public String toString() {
        return String.format ("[%s %s narodeny: %s]", aMeno, aPriezvisko, aDatumNarodenia);
    }
    
    public void setMeno(String paMeno) {
        aMeno = paMeno;
    }
    
    public void setPriezvisko(String paPriezvisko){
        aPriezvisko = paPriezvisko;
    }
    
    public String getMeno() {
        return aMeno;
    }
    
    public String getPriezvisko() {
        return aPriezvisko;
    }
    
    public MojDatum getDatumNarodenia() {
        return aDatumNarodenia; 
    }
    
}

    
    
