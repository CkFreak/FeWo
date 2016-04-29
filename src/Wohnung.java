
public class Wohnung
{
    private String _adresse;
    private int _preis;
    private int _stockwerk;
    private boolean _hund;
    private int _persAnzahl;

    public Wohnung(String adresse, int preis, int persAnzahl, int stockwerk,
            boolean hund)
    {
        _adresse = adresse;
        _preis = preis;
        _stockwerk = stockwerk;
        _hund = hund;
        _persAnzahl = persAnzahl;
    }

    public String gibAdresse()
    {
        return _adresse;
    }

    public int gibPreis()
    {
        return _preis;
    }

    public int gibStockwerk()
    {
        return _stockwerk;
    }

    public boolean istHund()
    {
        return _hund;
    }

    public int gibPersAnzahl()
    {
        return _persAnzahl;
    }
}
