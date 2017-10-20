package finanse;

import org.junit.Assert;
import org.junit.Test;

public class KwotaTest {
    @Test
    public void metodaToStringDziala() {
        //given
        Kwota kwota = new Kwota(10, 15);
        //when
        String s = kwota.toString();
        //then
        Assert.assertEquals("10 zł 15 gr", s);
    }
        @Test
        public void metodaToStringDzialaDla00Gr(){
            //given
            Kwota kwota = new Kwota(10, 0);
            //when
            String s = kwota.toString();
            //then
            Assert.assertEquals("10 zł 0 gr", s);
    }
    @Test(expected = IllegalArgumentException.class)
    public void kwotaNieMozeMiecUjemnychGroszy(){
            //when
        Kwota kwota = new Kwota(10, -15);
    }
    @Test(expected = IllegalArgumentException.class)
    public void kwotaNieMozeMiecUjemnychZlotych(){
        //when
        Kwota kwota = new Kwota(-10, 15);
    }

    @Test
    public void metodaDodaj(){
        //given
        Kwota kwota = new Kwota(10, 15);
        Kwota kwota2 = new Kwota(15, 10);
        //when
        Kwota kwotaWynik = kwota.dodaj(kwota2);
        String s = kwotaWynik.toString();
        //then
        Assert.assertEquals("25 zł 25 gr", s);
    }
}
