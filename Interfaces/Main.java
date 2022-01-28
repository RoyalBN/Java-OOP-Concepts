
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
        Aigle aigle = new Aigle();
        aigle.chasser();
        
        Poisson poisson = new Poisson();
        poisson.chasser();
        poisson.fuir();
        
        Lapin lapin = new Lapin();
        lapin.fuir();
    }
}
