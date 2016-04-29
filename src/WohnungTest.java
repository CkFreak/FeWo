import static org.junit.Assert.*;

import org.junit.Test;

public class WohnungTest
{

    Wohnung _bspWohnung;

    final String _bspAdresse = "Alte Koppel 1";
    final int _bspPreis = 420;
    final int _bspStockwerk = 1;
    final boolean _bspHund = false;
    final int _bspPersAnzahl = 4;

    void befülleBspWohnung()
    {
        _bspWohnung = new Wohnung(_bspAdresse, _bspPreis, _bspPersAnzahl, _bspStockwerk, _bspHund);
    }

    @Test
    public void testGibAdresse()
    {
        befülleBspWohnung();
        assertEquals(_bspWohnung.gibAdresse(), _bspAdresse);
    }

    @Test
    public void testGibPreis()
    {
        befülleBspWohnung();
        assertEquals(_bspWohnung.gibPreis(), _bspPreis);
    }

    @Test
    public void testGibStockwerk()
    {
        befülleBspWohnung();
        assertEquals(_bspWohnung.gibStockwerk(), _bspStockwerk);
    }

    @Test
    public void testIstHund()
    {
        befülleBspWohnung();
        assertEquals(_bspWohnung.istHund(), _bspHund);
    }

    @Test
    public void testGibPersAnzahl()
    {
        befülleBspWohnung();
        assertEquals(_bspWohnung.gibPersAnzahl(), _bspPersAnzahl);
    }

}
