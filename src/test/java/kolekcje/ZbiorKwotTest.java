package kolekcje;

import finanse.Kwota;
import org.junit.Assert;
import org.junit.Test;

import java.util.Set;
import java.util.TreeSet;

public class ZbiorKwotTest {
    private Set<Kwota> zbior;

    @Test
    public void dodawanieIpobieranieOk(){
        Kwota k1 = new Kwota();
        Kwota k2 = new Kwota(10,15);
        Kwota k3 = new Kwota (1,2);
        Kwota[] oczekiwana = {k1, k2, k3};
        zbior = new TreeSet<Kwota>();

        zbior.add(new Kwota());
        zbior.add(new Kwota (1,2));
        zbior.add(new Kwota(10,15));

        Assert.assertArrayEquals(oczekiwana, zbior.toArray());
    }
}
