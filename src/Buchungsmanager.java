import java.util.ArrayList;
import java.util.List;

public class Buchungsmanager
{
    List<Buchung> _alleBuchungen;
    //    List<Buchung> _aktuelleBuchungen;
    //    List<Buchung> _vergangeneBuchungen;

    public Buchungsmanager()
    {
        _alleBuchungen = new ArrayList<Buchung>();
    }

    public void fuegeBuchungHinzu(Buchung neueBuchung)
    {
        _alleBuchungen.add(neueBuchung);
    }

    //    TODO buchungsnummer als String
    public void loescheBuchung(int buchungsnummer)
    {
        for(int i=0; i<_alleBuchungen.size(); i++)   //for each? L
        {
            if(_alleBuchungen.get(i).gibInfo()._buchungsnummer == buchungsnummer)
            {
                _alleBuchungen.remove(i);
            }
        }
    }
    
    public List<Buchung> gibAlleBuchungen()
    {
        return _alleBuchungen;
    }

    /**
     * Durchsucht die Liste aller Buchungen nach den Buchungen, die für die übergebene Wohnung sind.
     * @param wohnung Die wohnung, nach der die Liste aller Buchungen durchsucht wird.
     * @return Liste mit allen Buchungen für die übergebene Wohnung.
     */
    public List<Buchung> sucheNachBuchungen(Wohnung wohnung)
    {
        System.out.println("NOCH NICHT IMPLEMENTIERT, ergebnisliste leer");
        List<Buchung> ergebnisListe = new ArrayList<Buchung>();
//
//        for (Buchung buchung : _alleBuchungen)
//        {
//            if (buchung.gibInfo()._wohnung == wohnung)
//            {
//                ergebnisListe.add(buchung);
//            }
//        }
//
//        return ergebnisListe;
        return ergebnisListe;
    }

    public List<Buchung> sucheNachBuchungen(Datum tag)
    {

        List<Buchung> ergebnisListe = new ArrayList<Buchung>();

        for (Buchung buchung : _alleBuchungen)
        {
            if (Datum.istDatumZwischen(buchung.gibInfo()._anreisetag, tag, buchung.gibInfo()._abreisetag))
            {
                ergebnisListe.add(buchung);
            }
        }
        return ergebnisListe;
    }

    public List<Buchung> sucheNachBuchungen(Datum anfangsTag, Datum endTag)
    {
        List<Buchung> ergebnisListe = new ArrayList<Buchung>();

        for (Buchung buchung : _alleBuchungen)
        {
            if (Datum.istDatumZwischen(buchung.gibInfo()._anreisetag, anfangsTag, buchung.gibInfo()._abreisetag)
                    || Datum.istDatumZwischen(buchung.gibInfo()._anreisetag, endTag, buchung.gibInfo()._abreisetag)
                    || Datum.istDatumZwischen(anfangsTag, buchung.gibInfo()._anreisetag, endTag))
            {
                ergebnisListe.add(buchung);
            }
        }

        return ergebnisListe;
    }

    public List<Buchung> sucheNachBuchungen(String name)
    {
        List<Buchung> ergebnisListe = new ArrayList<Buchung>();
        
        for (Buchung buchung : _alleBuchungen)
        {
            if (buchung.gibInfo()._name.toLowerCase().contains(name))
            {
                ergebnisListe.add(buchung);
            }
        }
        return ergebnisListe;
    }

}
