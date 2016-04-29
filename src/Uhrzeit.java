
public class Uhrzeit
{
    private int _minute;
    private int _stunde;

    /**
     * Der Konstruktor erzeugt eine neue Uhrzeit. Dabei werden die minten und stunden
     * per Ganzzahl übergeben. Es wird geprüft ob die Minuten sich im Wertebereich 
     * befinden (0 bis 59) und die Stunden (1 bis 24). Falls dies nicht der Fall ist,
     * wird eine Fehlermeldung ausgegeben.
     * 
     * @param minute
     * @param stunde
     * 
     * @require minute < 60 && minute >=0
     * @require stunde <= 24 && stunde > 0
     */
    public Uhrzeit(int stunde, int minute)
    {
        // prüfeEingabe(minute, stunde);
        assert minute < 60 && minute >= 0 : "Bitte Werte von 0 bis 59 benutzen.";
        assert stunde <= 24 && stunde > 0 : "Bitte Werte von 1 bis 24 benutzen.";
        
        _minute = minute;
        _stunde = stunde;
    }
    
    /**
     * Gibt die Uhrzeit als String zurück. Mit dem Aufbau: "mm:ss"
     * @return Uhrzeit als String
     */
    public String gibUhrzeit()
    {
        String uhrzeit;
        uhrzeit = _stunde + ":" + _minute;
        return uhrzeit;
    }
    
    /**
     * Gibt die Stunden als Ganzzahl zurück.
     * @return stunde
     */
    public int gibStunde()
    {
        return _stunde;
    }    
    
    /**
     * Gibt die Minuten als Ganzzahl zurück.
     * @return minute
     */
    public int gibMinute()
    {
        return _minute;
    } 
    
    /**
     * Prüft die an den Konstrukter übergebenen Werte, ob diese im 
     * geforderten Wertebereich liegen. 
     * Falls nicht, wird eine Fehlermeldung auf die Konsole geschrieben.
     * @param minute
     * @param stunde
     */
    /*private void prüfeEingabe(int minute, int stunde)
    {
        if(minute >= 60 && minute < 0)
        {
            System.out.println("Bitte Werte von 0 bis 59 benutzen.");
        }
        
        if(stunde >= 24 && stunde < 1)
        {
            System.out.println("Bitte Werte von 1 bis 24 benutzen.");
        }
    }*/
    
    
}
