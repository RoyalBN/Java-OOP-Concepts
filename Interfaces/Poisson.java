
/**
 * Décrivez votre classe Poisson ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Poisson implements Proie,Predateur
{
    @Override
    public void fuir()
    {
        System.out.println("Le poisson prend la fuite");
    }
    
    @Override
    public void chasser()
    {
        System.out.println("Le poisson chasse sa proie");
    }
}
