public class Student {
    
    // atributy instanci
    private Osoba aOsobneUdaje;
    private MojePoleInt aKredity;
    private int aId;
    
    //atributy triedy
    private static final int MAX_POCET_KREDITOV = 15;
    private static int aPosledneId = 1000;
    
    public Student(Osoba paOsobneUdaje) {
        aOsobneUdaje = paOsobneUdaje;
        aId = aPosledneId++;
        //skladanie kompozicou
        aKredity = new MojePoleInt(MAX_POCET_KREDITOV);
    }
    
    
    public static int dajPosledneId() {
        return aPosledneId;
    }
    
    public int dajId() {
        return aId;
    }
    public boolean pridajKredit(int paHodnota) {
        return aKredity.vlozPrvok(paHodnota);
    }
    
    public int sucetKreditov() {
        return aKredity.dajSucet();
    }
    
    public double priemerKreditov() {
        return  aKredity.dajPriemer();
    }
    
    public void zmenOsobneUdaje(Osoba paOsobneUdaje){
        aOsobneUdaje = paOsobneUdaje;
    }
    
    public void zmenOsobneUdaje2(String paMeno, String paPriezvisko){
        aOsobneUdaje.setMeno(paMeno);
        aOsobneUdaje.setPriezvisko(paPriezvisko);
    }
    
    public Osoba vratOsobu() {
        return aOsobneUdaje;
    }
    
    //public String toString() {
      //  return  (aId + " . " + aOsobneUdaje + " kredity: " + aKredity + " sucet kreditov: " + this.sucetKreditov());
    //}
    
    public String toString() {
        return String.format("[%5d.]%40s kredity %s sucet: 5d]", 
        aId, aOsobneUdaje, aKredity, this.sucetKreditov());
    }
    
    public boolean ciJeLepsi(Student paStudent){ 
        return (paStudent != null && paStudent.sucetKreditov() > this.sucetKreditov());
    }
}
