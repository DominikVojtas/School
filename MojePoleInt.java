
import java.util.Random;
public class MojePoleInt {
    private int aPocetPrvkov;
    private int[] aPole;
    
    public MojePoleInt(int paRozsahPola) {
        aPocetPrvkov = 0;
        aPole = new int[paRozsahPola];
    }
    
    public MojePoleInt() {
        aPocetPrvkov = 0;
        aPole = new int[50];
    }
    
    public boolean vlozPrvok(int paHodnota) {
    boolean vysledok = false;
        if (aPocetPrvkov < aPole.length) {
    aPole[aPocetPrvkov] = paHodnota;
    aPocetPrvkov++;
    vysledok = true;
        
       
   }
   return vysledok;
}

   public void naplnPoleNahodne(int paDH, int paHH) {
   Random generator;
   generator = new Random();
   
 while (aPocetPrvkov< aPole.length) {
    int cislo = paDH + generator.nextInt(paHH - paDH + 1);
    aPole[aPocetPrvkov] = cislo;
    aPocetPrvkov++;
           
}
}

public int dajSucet() {
     int sucet = 0; 
    for (int i = 0; i < aPocetPrvkov; i++) {
   sucet += aPole[i];
    
}
return sucet;
}

public double dajPriemer() {
 double priemer = 0; 
 priemer = (this.dajSucet()) * 1.0 / aPocetPrvkov;
 return priemer;
}

public int dajMin() {
 int min = Integer.MAX_VALUE;
 for (int i = 0; i < aPocetPrvkov; i++) {
 if (aPole[i] < min) {
     min = aPole[i];
}
}
return min;
}

public int dajMax() {
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < aPocetPrvkov; i++) {
        if (aPole[i] > max) {
            max = aPole[i];
        }
   
    
}
return max;
}

public String toString() {
    String vysledok = "";
    String vypis = "";
    for(int i = 0; i < aPocetPrvkov - 1; i++) {
        vypis += aPole[i] + ", ";
    }
    
    
    vysledok = String.format("Pole o pocte prvkov = " + aPole.length + " : " + vypis);
    return vysledok;    
    
}

public int sucetNeparnych() {
 int sucet = 0;
 for(int i = 0; i < aPocetPrvkov ; i++) {
        if (aPole[i] %2 != 0) { 
            sucet += aPole[i];
          
    }

}
return sucet;
}

public int sucetParnych() {
 int sucet = 0;
 for(int i = 0; i < aPocetPrvkov ; i++) {
        if (aPole[i] %2 == 0) { 
            sucet += aPole[i];
          
    }

}
return sucet;
}

public double dajPriemerNaNeparnychPoziciach() {
 double priemer = 0; 
 int sucet = 0;
 int pocet = 0;
  for(int i = 1; i < aPocetPrvkov;i = i + 2) {
        if (i %2 != 0) { 
            sucet = sucet + aPole[i];
            pocet++;
    }

 
 
 
}
priemer = (sucet * 1.0) / pocet;
return priemer;
}

// public int dajPoziciuMax() {
//     int pozicia = 0;
//     for(int i = 0; i < aPocetPrvkov; i++) {
//         if (i > pozicia) {
//             
//             pozicia = i;
//         }
//    
//     
// }
// return pozicia;
// }

public int dajPoziciuMax() {
    int max = Integer.MIN_VALUE;
    int pozicia = 0;
    for(int i = 0; i < aPocetPrvkov; i++) {
        if (aPole[i] > max) {
            max = aPole[i];
            pozicia++;
        }
   
    
}
return pozicia;
}

public int dajPocetVyskytov(int paHladany) {
     int pocetVyskytov = 0;
    for(int i = 0; i < aPocetPrvkov; i++) {
        if (aPole[i] == paHladany) {
            pocetVyskytov++;
        }
   
    
}
return pocetVyskytov;
}

public boolean ciSaNachadza(int paHladany) {
     boolean vysledok = false;
     
    for(int i = 0; i < aPocetPrvkov; i++) {
        if (aPole[i] == paHladany) {
            vysledok = true;
        } else {
            vysledok = false;
    
}

}
return vysledok;
}

public DveCisla dajDveMax() {
    int max1 = Integer.MIN_VALUE;
   int max2 = Integer.MIN_VALUE;
    
     
    
    for(int i = 0; i < aPocetPrvkov; i++) {
     if (aPole[i] > max2) {
            max2 = aPole[i];
      } if (aPole[i] > max1) {
              max2 = max1;
              max1 = aPole[i];
   
    
     }


}
 return new DveCisla(max1, max2);
}

public String toString2() {
    
    String vypis = String.format("Max je na: " + this.dajPoziciuMax());
    for(int i = 0; i < aPocetPrvkov; i++) {
         vypis += this.dajPoziciuMax() ;
    }
    
    
    return vypis;    
    
}

public String dajVsetkyPozicieVyskytovMax() {
    String vysledok = "";
    int max = Integer.MIN_VALUE;
    int pocetVyskytov = 0;
    for (int i = 0; i < aPocetPrvkov;i++) {
        if (aPole[i] > max) {
            max = aPole[i];
            vysledok = "" + i;
            pocetVyskytov = 1;
            
} else {
    if (aPole[i] == max) {
        pocetVyskytov++;
        vysledok = vysledok + " " + i;
    }
    
}
}
return vysledok;
}

public int[] dajPoleVyskytovMax() {
    int[] vysledok = new int[aPole.length];
    int max = Integer.MIN_VALUE;
    int pocetVyskytov = 0;
    for (int i = 0; i < aPocetPrvkov;i++) {
        if (aPole[i] > max) {
            max = aPole[i];
            pocetVyskytov = 1;
            vysledok = new int[aPole.length];
            vysledok[0] = i;
  } else {
    if (aPole[i] == max) {
        vysledok [pocetVyskytov] = i;
        pocetVyskytov++;
        
  }
  }
  }
  int[] vysledokUpraveny = new int[pocetVyskytov];
  for (int i = 0; i < pocetVyskytov; i++) {
    vysledokUpraveny[i] = vysledok[i];
  }
  return vysledokUpraveny;
 }
}






