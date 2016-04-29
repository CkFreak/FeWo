
public class BuchungImpl implements Buchung
{
    private Buchungsinfo _info;
    
    private static int _buchungsnummerZaehler = 1000; //TODO letzte buchungsnummer muss aus dem Speicher gelsen werden
    
    public BuchungImpl(Buchungsinfo neueInfo)
    {
        _info = neueInfo;
        
    }

    @Override
    public Buchungsinfo gibInfo()
    {
        // TODO Auto-generated method stub
        return _info;
    }

    @Override
    public void aktualisiereBuchung(Buchungsinfo neueInfo)
    {
        // TODO Auto-generated method stub

    }

}
