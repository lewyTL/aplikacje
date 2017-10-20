package kolekcje;

import finanse.Kwota;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListaKwotaTest {
    private List<Kwota> lista;

    @Test
    public void dodawanieIpobieranieDziala(){
        lista = new LinkedList<Kwota>();
        Kwota k1 = new Kwota();
        Kwota k2 = new Kwota(10,15);
        Kwota k3 = new Kwota (1,2);
        Kwota[] oczekiwana = {k1, k2, k3};

        lista.add(new Kwota());
        lista.add(new Kwota(10,15));
        lista.add(new Kwota (1,2));

        Assert.assertArrayEquals(oczekiwana, lista.toArray());
    }
}
