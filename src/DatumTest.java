import static org.junit.Assert.*;

import org.junit.Test;

public class DatumTest
{

    Datum testDatum;
    final int TAG_KORREKT = 3;
    final int MONAT_KORREKT = 12;
    final int JAHR_KORREKT = 2016;
    
   
    
    @Test
    public void testIstDatumZwischen()
    {
        Datum datum1 = new Datum(1, 1, 2016);
        Datum datum2 = new Datum(2, 1, 2016);
        Datum datum3 = new Datum(1, 2, 2016);
        Datum datum4 = new Datum(1, 1, 2017);
        
        
        
        assertEquals(true, Datum.istDatumZwischen(datum1, datum1, datum2));
        
        assertEquals(true,  Datum.istDatumZwischen(datum1, datum2, datum3));
        
        assertEquals(true,  Datum.istDatumZwischen(datum2, datum3, datum4));
        
        assertEquals(false,  Datum.istDatumZwischen(datum1, datum2, datum1));
        
        assertEquals(false,  Datum.istDatumZwischen(datum4, datum2, datum3));
        
        assertEquals(false,  Datum.istDatumZwischen(datum2, datum1, datum3));
       
    }

    @Test
    public void testGibTag()
    {
        testDatum = new Datum(TAG_KORREKT, MONAT_KORREKT, JAHR_KORREKT);
        
        assertEquals(TAG_KORREKT, testDatum.gibTag());
    }

    @Test
    public void testGibMonat()
    {
        testDatum = new Datum(TAG_KORREKT, MONAT_KORREKT, JAHR_KORREKT);
        
        assertEquals(MONAT_KORREKT, testDatum.gibMonat());
    }

    @Test
    public void testGibJahr()
    {
        testDatum = new Datum(TAG_KORREKT, MONAT_KORREKT, JAHR_KORREKT);
        
        assertEquals(JAHR_KORREKT, testDatum.gibJahr());
    }

}
