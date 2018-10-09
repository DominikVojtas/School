

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class SkolaTest {
    private MojDatum mojDatum1;
    private Osoba osoba1;
    private Trieda trieda1;
    private MojDatum mojDatum2;
    private Osoba osoba2;
    private Student student1;
    private MojDatum mojDatum3;
    private Osoba osoba3;
    private Student student2;
    private Skola skola1;

    @Before
    public void setUp() {
        mojDatum1 = new MojDatum(14, 2, 1984);
        osoba1 = new Osoba("Karol", "Ucitelko", mojDatum1);
        trieda1 = new Trieda("1.A", osoba1);
        mojDatum2 = new MojDatum();
        osoba2 = new Osoba("Jozo", "Vesely", mojDatum2);
        student1 = new Student(osoba2);
        trieda1.pridajStudenta(student1);
        mojDatum3 = new MojDatum();
        osoba3 = new Osoba("Anicka", "Mudra", mojDatum3);
        student2 = new Student(osoba3);
        trieda1.pridajStudenta(student2);
        student1.pridajKredit(12);
        student1.pridajKredit(12);
        student1.pridajKredit(13);
        student1.pridajKredit(5);
        student2.pridajKredit(2);
        student2.pridajKredit(8);
        student2.pridajKredit(9);
        skola1 = new Skola("Vecerna skola", osoba3);
    }
}
