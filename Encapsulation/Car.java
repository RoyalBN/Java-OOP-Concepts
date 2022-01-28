
/**
 * Décrivez votre classe Car ici.
 *
 * @author (votre nom)
 * @version (un numéro de version ou une date)
 */
public class Car
{
    private String marque;
    private String modele;
    private int annee;
    
    Car(String marque, String modele, int annee)
    {
        this.setMarque(marque);
        this.setModele(modele);
        this.setAnnee(annee);
    }
    
    /**
     * Getters
     */
    public String getMarque()
    {
        return this.marque;
    }

    public String getModele()
    {
        return this.modele;

    }
    
    public int getAnnee()
    {
        return this.annee;
    }
    
    
    /**
     * Setters
     */
    public void setMarque(String marque)
    {
        this.marque = marque;
    }
    
    public void setModele(String modele)
    {
        this.modele = modele;
    }
    
    public void setAnnee(int annee)
    {
        this.annee = annee;
    }
    
    
}
