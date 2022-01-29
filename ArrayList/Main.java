import java.util.ArrayList;

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
        ArrayList<String> food = new ArrayList<String>();
        
        food.add("pizza");
        food.add("hamburger");
        food.add("hotdog");
        
        food.set(0, "sushi");
        food.remove(2);
        food.clear();     
        
        for(int i=0; i<food.size(); i++)
        {
            System.out.println(food.get(i));
        }
    }
}
