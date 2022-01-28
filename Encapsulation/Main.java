
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
        Car car = new Car("Renault","Mégane",2005);
    
        car.setAnnee(2020);
        
        System.out.println(car.getMarque());
        System.out.println(car.getModele());
        System.out.println(car.getAnnee());
    }
}
