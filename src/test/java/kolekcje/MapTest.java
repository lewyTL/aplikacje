package kolekcje;

import finanse.Kwota;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    private Map<Kwota, String> mapa;

    @Before
    public void setUp(){
        mapa = new HashMap<Kwota, String>();
        mapa.put(new Kwota(), "zero zł zero gr");
        mapa.put(new Kwota(1,20),"jeden zl dwadziescia gr");
        mapa.put(new Kwota(35,0),"trzydziesci piec zl zero gr");
    }

    @Test
    public void znajdujeKluczWartosc(){
        Kwota k1 = new Kwota();
        mapa.put(k1,"zero zl zero gr");
        Assert.assertTrue(mapa.containsValue("zero zl zero gr"));
        Assert.assertTrue(mapa.containsKey(k1));


    }
}