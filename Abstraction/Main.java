
/**
 * Décrivez votre classe Main ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Main
{
    public static void main(String[] args) 
    {
        Labrador labrador = new Labrador();
        labrador.aboyer();
        labrador.manger();
        
        Dalmatien dalmatien = new Dalmatien();
        dalmatien.aboyer();
        dalmatien.manger();
        
        Patou patou = new Patou();
        patou.aboyer();
        patou.manger();
    }    
}
