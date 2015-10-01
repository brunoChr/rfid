
public class Embout implements Rangeable {

	private TypeDeTournevis type;
	private RFID id;
	private TournevisInterchangeable tournevis = null;
	private double diametre;
	
	public Embout() 
	{
		this.id = new RFID();	
	}
	
	public Embout(TypeDeTournevis type, double diametre, int numeroRFID)
	{
		this.id = new RFID(numeroRFID);
		this.type = type;
		this.diametre = diametre;
	}
	
	public void ajouter()
	{
		if (!id.isDisponible()) 
		{
			System.out.println("\nOn remet l'embout ...");
			id.finEmprunt();
		}
		else 
		{
			System.out.println("\nImpossible de remettre un embout non retiré !");
		}
	}
	
	public void retirer()
	{
		if (!id.isDisponible()) 
		{
			System.out.println("Cet embout est déjà retiré !");
		} 
		
		else 
		{
			System.out.println("\nOn retire l'embout");
			id.debutEmprunt();
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "L'embout est de\ntype : "
				+ type
				+ "\ndiametre : "
				+ diametre
				+ "\n" + id
				+ "\nEst-il sur un tournevis : "
				+ isSurTournevis();
	}
	
	public RFID getId() {
		return id;
	}
	
	public double getDiametre() {
		return diametre;
	}

	
	public boolean isSurTournevis() {
		// TODO Auto-generated method stub
		if(tournevis == null) return false;
		else return true;
	}
	
	public TypeDeTournevis getType() {
		return type;
	}
	
	public TournevisInterchangeable getTournevis() {
		return tournevis;
	}
	
	
	public void setTournevis(TournevisInterchangeable tournevis) {
		this.tournevis = tournevis;
	}
	
}
