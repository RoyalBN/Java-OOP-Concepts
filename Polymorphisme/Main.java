
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
        Chat chat = new Chat();
        Chien chien = new Chien();
        Ane ane = new Ane();
        Vache vache = new Vache();
        
        Animal[] bruits = {chat,chien,ane,vache};
        
        for(Animal x: bruits){
            x.bruitAnimal();
        }
    }
}
