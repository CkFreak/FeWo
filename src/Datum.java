
public class Datum
{
    private int _tag;
    private int _monat;
    private int _jahr;

    /*
     * Ein Datum besteht aus drei ganzzahligen Parametern mit einem
     * speziellen Wertebereich.
     * Dieser beträgt bei den Tagen 1 bis 31. Bei den Monaten 1 bis 12
     * und bei den Jahren von 2016 bis 2020.
     * 
     * @param tag Tag als Ganzzahl 
     * @param monat Monat als Ganzzahl
     * @param jahr Jahr als Ganzzahl
     * 
     * @require tag > 0 && tag < 32
     * @require monat > 0 && monat <= 12
     * @require jahr >= 2016 && jahr <= 2020
     */
    public Datum(int tag, int monat, int jahr)
    {
        assert tag > 0 && tag < 32 : "Bitte geben Sie einen Wert zwischen"
                + "1 und 31 ein";
        assert monat > 0 && monat <= 12 : "Bitte geben Sie einen Wert zwischen"
                + "1 und 12 ein";
        assert jahr >= 2016
                && jahr <= 2020 : "Bitte geben Sie einen Wert zwischen"
                        + "2016 und 2020 ein";

        _tag = tag;
        _monat = monat;
        _jahr = jahr;
    }

    /**
     * Prüft ob ein Datum zwischen zwei anderen Daten liegt.
     * @param anfangsDatum Anfangsdatum des zu prüfenden Zeitraums
     * @param zuPruefendesDatum Datum, welches geprüft werden soll ob es im Zeitraum liegt
     * @param endDatum Enddatum des zu prüfenden Zeitraums
     * @return true wenn zuPruefendesDatum zwischen anfangsDatum und endDatum liegt.
     */
    public static boolean istDatumZwischen(Datum anfangsDatum, Datum zuPruefendesDatum, Datum endDatum)
    {
        if (anfangsDatum.equals(zuPruefendesDatum) || zuPruefendesDatum.istSpaeterAls(anfangsDatum))
        {
            if (endDatum.equals(zuPruefendesDatum) || endDatum.istSpaeterAls(zuPruefendesDatum))
            {
                return true;
            }
        }

        return false;
    }

    /**
     * Prüft ob das Datum hinter dem übergebenen Datum liegt.
     * @param anderesDatum
     * @return
     */
    private boolean istSpaeterAls(Datum anderesDatum)
    {
        if (_jahr > anderesDatum._jahr)
        {
            return true;
        }
        else if (_jahr == anderesDatum._jahr)
        {
            if (_monat > anderesDatum._monat)
            {
                return true;
            }
            else if (_monat == anderesDatum._monat)
            {
                if (_tag > anderesDatum._tag)
                {
                    return true;
                }
            }
        }

        return false;
    }

    @Override
    public int hashCode()
    {
        return _jahr + _monat + _tag; //der hashcode muss nicht einzigartig sein. jedes objekt was gleich ist muss aber den selben hashcode haben
    }

    @Override
    public boolean equals(Object o)
    {
        if (o == null)
        {
            return false;
        }

        if (o == this)
        {
            return true;
        }

        if (o instanceof Datum)
        {
            Datum temp = (Datum) o;
            if (temp._jahr == this._jahr && temp._monat == this._monat
                    && temp._tag == this._tag)
            {
                return true;
            }
        }

        return false;

    }
/**
 * Gibt das Datum im Stringformat zurück
 * 
 * @return Das Datum als String
 */
    public String gibDatum()
    {
        String datum;
        datum = _tag + "." + _monat + "." + _jahr;
        return datum;
    }

    public int gibTag()
    {
        return _tag;
    }

    public int gibMonat()
    {
        return _monat;
    }

    public int gibJahr()
    {
        return _jahr;
    }
}
