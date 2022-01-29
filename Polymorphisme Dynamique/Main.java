import java.util.Scanner;
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
        Scanner scanner = new Scanner(System.in);
        Animal animal;
        
        System.out.println("Quel animal souhaitez-vous ?");
        System.out.print("(1=chat) ou (2=chien): ");
        
        
        int choixAnimal = scanner.nextInt(); 
        
        if(choixAnimal == 1)
        {
            animal = new Chat();
            animal.sonAnimal();
        }
        else if(choixAnimal == 2)
        {
            animal = new Chien();
            animal.sonAnimal();
        }
        else
        {
            animal = new Animal();
            System.out.println("Le choix est invalide");
            animal.sonAnimal();
        }
    }
}
