package kolekcje;

import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class ListaTest {

    private List lista = new ArrayList<String>();
    String[] oczekiwanaPoDodaniu = {"Ala", "Tomek", "Mateusz", "Tomek"};
    String[] oczekiwanaPoUsunieciu = {"Ala", "Mateusz", "Tomek"};

    @Before
    public void setUp(){
        lista.add("Ala");
        lista.add("Tomek");
        lista.add("Mateusz");
        lista.add("Tomek");
    }

    @Test
    public void dodawanieIpobieranieDziałaPoprawnie(){
        lista = new ArrayList<String>();
        lista.add("Ala");
        lista.add("Tomek");
        lista.add("Mateusz");
        lista.add("Tomek");
        Assert.assertArrayEquals(oczekiwanaPoDodaniu, lista.toArray());
    }

    @Test
    public void listUsuwaPierwszyNaptokany(){
        lista.remove("Tomek");
        Assert.assertArrayEquals(oczekiwanaPoUsunieciu, lista.toArray());
    }

    @Test
    public void znajdujeTylkoElementyNaLiscie(){
        Assert.assertTrue(lista.contains("Tomek"));
        Assert.assertFalse(lista.contains("Wojtek"));
    }
}
