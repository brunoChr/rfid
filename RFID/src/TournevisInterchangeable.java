
public class TournevisInterchangeable extends Tournevis {

	private Embout embout = null;
	
	/**
	 * Constructeur par default qui créer un TournevisInterchangeable avec un tag RFID spécifique.
	 */
	public TournevisInterchangeable() {
		// TODO Auto-generated constructor stub
		// Appelle du constructeur par default de la classe parent tournevis
		super();
	}
	
	
	/**
	 * Constructeur qui créer un TournevisInterchangeable (d'un certain diamètre, de type Interchangeable) avec un tag RFID spécifique.
	 * @param numeroRFID Le numéro à attribuer au tag RFID.
	 * @param diametre Le diamètre du tournevis.
	 */
	public TournevisInterchangeable(double diametre, int numeroRFID) {
		// TODO Auto-generated constructor stub
		// Appelle du constructeur surchargé de la classe parent tournevis avec comme parametre numeroRFID
		super(numeroRFID);
		
		this.setType(TypeDeTournevis.Interchangeable);
		
		// Le diametre de la classe parent tournevis vaut le diametre passé en parametre
		super.setDiametre(diametre);
		}
	
	/**
	 * Permet de retirer l'embout du tournevis.
	 * @param rien
	 * @return rien
	 */
	public void retirerEmbout() {
		// TODO Auto-generated method stub
		// Si il y'a un embout sur le tournevisInterchangeable 
		if(this.embout != null) 
		{  
			System.out.println("\nOn retire l'embout du tournevis ...\n");
			// On retire l'embout du tournevis
			this.embout.setTournevis(null);
			// On supprime cet embout
			this.embout = null;
		}
		else System.out.println("\nL'embout ne peut être retirer du tournevis ...\n");
	}
	
	
	/**
	 * Permet de mettre un embout sur le tournevis.
	 * @param embout, L'embout à mettre sur le tournvis
	 * @return rien
	 */
	public void mettreEmbout(Embout embout) 
	{
		// TODO Auto-generated method stub
		if((this.embout == null)									// Si le tournevis ne possede pas d'embout 	
				&& (embout != null) 								// et si l'embout existe
				&& (!embout.isSurTournevis())  						//et si l'embout n'est pas deja associé à un tournevis
				&& (this.getDiametre() == embout.getDiametre()))	// et si l'embout est du meme diametre que le tournevis
		{
			System.out.println("\nOn met l'embout sur le tournevis ...\n");
			// On assigne l'embout passé en parametre sur le tournevis
			embout.setTournevis(this);
			// On precise à l'embout qu'il est sur le tournevis
			this.embout = embout;
		}
		
		else System.out.println("\nL'embout ne peut etre mis sur le tournevis ...\n");
	}
	
	@Override
	/**
	 * Permet d'obtenir la description de l'objet.
	 * @param rien
	 * @return String la chaine de caractere des attributs
	 */
	public String toString() {
		// TODO Auto-generated method stub
		return  "Tournevis interchangeable\n"
				+ super.toString();
	}
	
	public Embout getEmbout() {
		return embout;
	}
}
