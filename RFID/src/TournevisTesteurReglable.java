/**
 * 
 */

/**
 * @author b.christol
 *
 */
public class TournevisTesteurReglable extends TournevisTesteur {

	public TournevisTesteurReglable()
	{
		super();
	}
	
	public TournevisTesteurReglable(int seuilDeclenchement, int numeroRFID)
	{

		super(seuilDeclenchement,numeroRFID);
	}
	
	public void setSeuilDeDeclenchement(int seuilDeclenchement)
	{
		this.seuilDeDeclenchement = seuilDeclenchement;	
	}
	
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
