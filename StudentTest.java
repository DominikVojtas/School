

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class StudentTest {
    private MojDatum mojDatum1;
    private Osoba osoba1;
    private Student student1;
    private MojDatum mojDatum2;
    private Osoba osoba2;
    private Student student2;

    
    
    

    @Before
    public void setUp() {
        mojDatum1 = new MojDatum(24, 12, 0);
        osoba1 = new Osoba("Jezis", "Kristus", mojDatum1);
        student1 = new Student(osoba1);
        student1.pridajKredit(7);
        student1.pridajKredit(6);
        student1.toString();
        mojDatum2 = new MojDatum();
        osoba2 = new Osoba("Jezis", "Boh", mojDatum2);
        student2 = new Student(osoba2);
    }
}
