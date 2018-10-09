

public class Trieda {
    //atributy instancii
    private Osoba aTriednyUcitel;
    private Student[] aPoleStudentov;
    private String aNazovTriedy;
    private int aPocetStudentov;
    //atributy triedy
    private static final int MAX_POCET_STUDENTOV = 20;
    private static int aPocetTried = 0;
    
    public Trieda(String paNazov, Osoba paTriednyUcitel) {
        aNazovTriedy = paNazov;
        aTriednyUcitel = paTriednyUcitel;
        aPocetStudentov = 0;
        aPoleStudentov = new Student[MAX_POCET_STUDENTOV];//vytvarame pole studentov, ak pouzijeme () vytvorime len jedneho
    }
    
    private static int dajPocetTried() {
        return aPocetTried;
    }
    
    public boolean pridajStudenta(Student paPridany) {
        if (aPocetStudentov > aPoleStudentov.length) {
            return false;
        }  else {
            aPoleStudentov[aPocetStudentov] = paPridany;
            aPocetStudentov++;
            return true;
        }
    }
    
    public int dajIndexStudenta(int paIdHladaneho) {
        
        int hladane = -1;
    for (int i = 0; i < aPocetStudentov;i++) {
        if (aPoleStudentov[i].dajId() == paIdHladaneho) {
         hladane = i;
         return hladane;
        }
    }
    return hladane;
    }
    
    public boolean pridajKreditStudentovi(int paIdKtoremu, int paHodnotaKreditu) {
         int index = this.dajIndexStudenta(paIdKtoremu);
         
        if (index < 0  || (index > aPocetStudentov)) {
            return false;
        } else {
            
            
            
            return  (aPoleStudentov[index].pridajKredit(paHodnotaKreditu));
            
            
        }
        
        
    
    }
    
    public void zmenRiaditela(Osoba paNovyRiaditel) {
        aTriednyUcitel = paNovyRiaditel;
    
    }
    
    public Student dajStudenta(int paIdKtoreho) {
        
        Student pomStudent = null;
        for(int i = 0; i < aPocetStudentov;i++){
        if (paIdKtoreho == aPoleStudentov[i].dajId()){
        pomStudent = aPoleStudentov[i];
        }
        }
    return  pomStudent;
    }
      
   
   
    public int dajPocetStudentov() {
    return aPocetStudentov;
    }
    
    

    public int dajSucetKreditovTriedy() {
     int sucet = 0;
     for(int i = 0; i < aPocetStudentov;i++) {
         sucet += aPoleStudentov[i].sucetKreditov();
        }
     return sucet;
    }
    
    public String toString() {
        String x = "";
         for(int i = 0; i < aPocetStudentov;i++) {
             x += aPoleStudentov[i].toString() + "\n";
            }
         
        return "Trieda" + aNazovTriedy + " triedny ucitel:" + aTriednyUcitel + " \n " +  "vypis studentov triedy " + "\n"+ x;
    }
    
    public Student najdiNajlepsieho() {
      int max = 0;
      Student Pravy = null;
        for (int i = 0; i < aPocetStudentov;i++) {
          int sucet = aPoleStudentov[i].sucetKreditov(); 
          if (aPoleStudentov[i].sucetKreditov() > max) {
             max = aPoleStudentov[i].sucetKreditov(); 
             Pravy = aPoleStudentov[i];
            }
    }
    
    return  Pravy;
}
}
    
    