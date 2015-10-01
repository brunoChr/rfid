// Import des biblioth�ques pour la date
import java.util.Date;

// D�finition de la classe RFID
class RFID {

	// Definition des attributs de la classe RFID
	private Date dateRetire;
	private int numeroRFID;
	private double tempsUtilisation;
	private boolean disponible;
		
	// Constructeur par default, initialisant tout les atributs � 0 et � vrai
	public RFID(){
		
		numeroRFID = 0;
		tempsUtilisation = 0;
		disponible = true;
	}
	
	// Constructeur surcharg� permettant de passer en param�tre un numero du rfid
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
		System.out.println("Cet �l�ment est d�j� retir� !");	
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
			System.out.println("Impossible de remettre un �l�ment non retir� !");
		}
	}
	
	public String toString()
	{
		return ("Numero du tag : " + numeroRFID)
				+ ("\nDate d'embrunt : " + dateRetire)
				+ ("\nTemps d'utilisation : " + (tempsUtilisation/(3600*1000)) +"h (" +tempsUtilisation+"ms)")
				+ ("\nDisponibilit� : " + disponible); 
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
