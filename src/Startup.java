import java.util.List;
import java.util.Scanner;

public class Startup
{
    static String eingabe;
    static Scanner scanner;

    static Buchungsmanager bm;

    public static void main(String[] args)
    {
        scanner = new Scanner(System.in);

        bm = new Buchungsmanager();

        do
        {
            System.out.println("=================================");
            System.out.println(">1< erstelleNeueBuchung");
            System.out.println(">2< zeigeAlleBuchungen");
            System.out.println(">3< löscheBuchung");
            System.out.println(">4< sucheBuchung");
            System.out.println(">beenden< beende das Programm");
            System.out.println("=================================");

            eingabe = scanner.nextLine();

            if (eingabe.equals("1"))
            {
                erstelleNeueBuchung();
            }
            else if (eingabe.equals("2")) {
                zeigeAlleBuchungen();
            }
            else if (eingabe.equals("3")) {
                loescheBuchung();
            }
            else if (eingabe.equals("4")) {
                sucheBuchung();
            }

        }
        while (!(eingabe.equals("beenden")));
        scanner.close();
    }

    static void erstelleNeueBuchung()
    {
        Buchungsinfo binfo = new Buchungsinfo();
        int tag;
        int monat;
        int jahr;

        System.out.println("=================================");
        System.out.println("Name:");
        System.out.println("=================================");

        binfo._name = scanner.nextLine();

        System.out.println("=================================");
        System.out.println("Buchungsnummer:");
        System.out.println("=================================");

        binfo._buchungsnummer = scanner.nextInt();

        System.out.println("=================================");
        System.out.println("Anreisetag:");
        System.out.println("=================================");

        tag = scanner.nextInt();

        System.out.println("=================================");
        System.out.println("Anreisemonat:");
        System.out.println("=================================");

        monat = scanner.nextInt();

        System.out.println("=================================");
        System.out.println("Anreisejahr:");
        System.out.println("=================================");

        jahr = scanner.nextInt();
        binfo._anreisetag = new Datum(tag, monat, jahr);

        System.out.println("=================================");
        System.out.println("Abreisetag:");
        System.out.println("=================================");

        tag = scanner.nextInt();

        System.out.println("=================================");
        System.out.println("Abreisemonat:");
        System.out.println("=================================");

        monat = scanner.nextInt();

        System.out.println("=================================");
        System.out.println("Abreisejahr:");
        System.out.println("=================================");

        jahr = scanner.nextInt();
        binfo._abreisetag = new Datum(tag, monat, jahr);

        bm.fuegeBuchungHinzu(new BuchungImpl(binfo));

        System.out.println(">>>Neue Buchung wurde hinzugefügt<<<");

    }

    static void zeigeAlleBuchungen()
    {
        List<Buchung> temp;
        
        temp = bm.gibAlleBuchungen();
        
        for(Buchung b : temp)
        {
            b.gibInfo();
            System.out.println("=================================");
        }
    }

    static void loescheBuchung()
    {
        System.out.println("=================================");
        System.out.println("Buchungsnummer:");
        System.out.println("=================================");
        
        int tempNummer = scanner.nextInt();
        
        bm.loescheBuchung(tempNummer);
        
        System.out.println(">>>Die Buchung wunrde gelöscht<<<");
    }

    static void sucheBuchung()
    {
        System.out.println("=================================");
        System.out.println(">1< sucheNachName");
        System.out.println(">2< sucheNachDatum");
        System.out.println(">3< sucheNachZeitraum");
        System.out.println("=================================");
        
        eingabe = scanner.nextLine();
        
        if(eingabe.equals("1"))
        {
            sucheNachName();
        }
        else if (eingabe.equals("2")) {
            sucheNachDatum();
        }
        else if (eingabe.equals("3")) {
            sucheNachZeitraum();
        }
    }
    
    static void sucheNachName()
    {
        List<Buchung> temp;
        
        System.out.println("=================================");
        System.out.println("Name:");
        System.out.println("=================================");
        
        eingabe = scanner.nextLine();
        
        temp = bm.sucheNachBuchungen(eingabe);
        
        for(Buchung b : temp)
        {
            b.gibInfo();
            System.out.println("===============================");
        }
    }
    
    static void sucheNachDatum()
    {
        List<Buchung> temp;
        int tag;
        int monat;
        int jahr;
        
        System.out.println("=================================");
        System.out.println("Tag:");
        System.out.println("=================================");
        
        tag = scanner.nextInt();
        
        
        System.out.println("=================================");
        System.out.println("Monat:");
        System.out.println("=================================");
        
        monat = scanner.nextInt();
        
        
        System.out.println("=================================");
        System.out.println("Jahr:");
        System.out.println("=================================");
        
        jahr = scanner.nextInt();
        
        temp = bm.sucheNachBuchungen(new Datum(tag, monat, jahr));
        
        for(Buchung b : temp)
        {
            b.gibInfo();
            System.out.println("===============================");
        }
    }
    
    
    static void sucheNachZeitraum()
    {
        List<Buchung> temp;
        Datum datum1;
        Datum datum2;
        int tag;
        int monat;
        int jahr;
        
        System.out.println("=================================");
        System.out.println("Anfangstag:");
        System.out.println("=================================");
        
        tag = scanner.nextInt();
        
        
        System.out.println("=================================");
        System.out.println("Anfangsmonat:");
        System.out.println("=================================");
        
        monat = scanner.nextInt();
        
        
        System.out.println("=================================");
        System.out.println("Anfangsjahr");
        System.out.println("=================================");
        
        jahr = scanner.nextInt();
        
        datum1 = new Datum(tag, monat, jahr);
        
        
        
        
        System.out.println("=================================");
        System.out.println("Endtag:");
        System.out.println("=================================");
        
        tag = scanner.nextInt();
        
        
        System.out.println("=================================");
        System.out.println("Endmonat:");
        System.out.println("=================================");
        
        monat = scanner.nextInt();
        
        
        System.out.println("=================================");
        System.out.println("Endjahr");
        System.out.println("=================================");
        
        jahr = scanner.nextInt();
        
        datum2 = new Datum(tag, monat, jahr);
        
        temp = bm.sucheNachBuchungen(datum1, datum2);
        
        for(Buchung b : temp)
        {
        	b.gibInfo();
            System.out.println("===============================");
        }
    }

}
