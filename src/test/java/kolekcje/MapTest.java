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
    public void podmieniaWartosc() {
        //given
        //when
       String staraWartosc =  mapa.put(new Kwota(35,0),"trzydziesci piec zl");
        //then
        Assert.assertEquals("trzydziesci piec zl zero gr",staraWartosc );
        Assert.assertTrue(mapa.containsValue("trzydziesci piec zl"));
    }

    @Test
    public void znajdujeKluczWartosc(){
        Kwota k1 = new Kwota();
        mapa.put(k1,"zero zl zero gr");
        Assert.assertTrue(mapa.containsValue("zero zl zero gr"));
        Assert.assertTrue(mapa.containsKey(k1));


    }



    @Test
    public void wartoscZaweiraKlucze(){
        //given
        Kwota[] oczekiwana = {new Kwota(),new Kwota(1,20),new Kwota(35,0)};
        //then
        Assert.assertArrayEquals(oczekiwana,mapa.keySet().toArray());

    }



}