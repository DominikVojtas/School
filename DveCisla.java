


public class DveCisla {
    private double aX1;
    private double aX2;
    
    public DveCisla(double paX1, double paX2) {
        aX1 = paX1;
        aX2 = paX2;
    }
    
    public String toString () {
        return "[X1 = " + aX1 + ", X2 = " + aX2 + "]";
    }
    
    public double getX1() {
        return aX1;
    }
    
    public double getX1X2 () {
        return aX1;
        
    }
    
    public void setX1(double paX1) {
        aX1 = paX1;
    }
    
    public void setX2(double paX2) {
        aX2 = paX2;
    }
    
    public void setX1X2(double paX1, double paX2) {
        aX1 = paX1;
        aX2 = paX2;
    }
    
    public double dajMax() {
        if (aX1 > aX2) {
            return aX1;
        } else { 
            return aX2;
        }    
    }
    
    public double dajMin() {
        if (aX1 < aX2) {
            return aX1;
        } else { 
            return aX2;
        }    
    }
    
}

