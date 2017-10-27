package kolekcje;

import finanse.Kwota;
import org.junit.Before;

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
}
