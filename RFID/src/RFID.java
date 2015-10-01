// Import des bibliothéques pour la date
import java.util.Date;

// Définition de la classe RFID
class RFID {

	// Definition des attributs de la classe RFID
	private Date dateRetire;
	private int numeroRFID;
	private double tempsUtilisation;
	private boolean disponible;
		
	// Constructeur par default, initialisant tout les atributs à 0 et à vrai
	public RFID(){
		
		numeroRFID = 0;
		tempsUtilisation = 0;
		disponible = true;
	}
	
	// Constructeur surchargé permettant de passer en paramétre un numero du rfid
	public RFID(int numeroRFID)
	{
		this.numeroRFID = numeroRFID;
		tempsUtilisation = 0;
		disponible = true;
	}
		
	
	public void debutEmprunt()
	{
	if(disponible == true)
		{	
		dateRetire = new Date();
		disponible = false;
		}
	else
		{
		System.out.println("Cet élément est déjà retiré !");	
		}
	}
	
	public void finEmprunt()
	{
		if(disponible == false)
		{
		Date dateFinEmprunt = new Date();
		disponible = true;
		
		// Calcul le temps d'utilisation en heure)
		tempsUtilisation = (dateFinEmprunt.getTime() - dateRetire.getTime());
		}
		else
		{
			System.out.println("Impossible de remettre un élément non retiré !");
		}
	}
	
	public String toString()
	{
		return ("Numero du tag : " + numeroRFID)
				+ ("\nDate d'embrunt : " + dateRetire)
				+ ("\nTemps d'utilisation : " + (tempsUtilisation/(3600*1000)) +"h (" +tempsUtilisation+"ms)")
				+ ("\nDisponibilité : " + disponible); 
	}
	
	
	public int getNum()
	{
		return numeroRFID;
	}
	
	public Date getDateRetire()
	{
		return dateRetire;
	}
	
	public double getTempsUtilisation()
	{
		return tempsUtilisation;
	}
	
	public boolean isDisponible()
	{
		return disponible;
	}
}
