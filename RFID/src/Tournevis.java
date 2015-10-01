/**
 * 
 */

/**
 * @author b.christol
 *
 */

// Declaration de la classe Tournevis hérité de la classe Outils
public class Tournevis extends Outils {

	private TypeDeTournevis type;   // Declaration de l'attribut "type" de type TypeDeTournevis
	private double diametre;		// Declaration de l'attribut "diametre" de type double
	
	// Constucteur par default de la classe Tournevis
	public Tournevis()
	{
		super(); // Appelle le constructeur de la classe Outils
		this.type = TypeDeTournevis.Plat;
		diametre = 5;
	}
	
	public Tournevis(int numeroRFID)
	{
		super(numeroRFID);  // Appelle le constructeur de la classe Outils avec l'argument numeroRFID
		this.type = TypeDeTournevis.Plat;
		diametre = 5;	
	}
	
	public String toString()
	{
		return (super.toString())
				+("\nType de Tournevis : " + type)
				+("\nDiamétre du tournevis : " + diametre);	
	}
	
	public TypeDeTournevis getType()
	{
		return type;
	}
	
	
	public void setType(TypeDeTournevis type)
	{
		this.type = type;
	}
	
	public double getDiametre()
	{
		return diametre;
	}
	
	public void setDiametre(double diametre)
	{
		this.diametre = diametre;
	}
}
