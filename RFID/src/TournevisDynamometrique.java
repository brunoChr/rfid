import java.util.ArrayList;
import java.util.Collections;

/**
 * 
 */

/**
 * @author b.christol
 *
 */
public class TournevisDynamometrique extends Tournevis{

	private ArrayList<Integer> plageDeCouple = new ArrayList<Integer>();
	private Integer coupleActuel; 

	public TournevisDynamometrique()
	{
		super();
	}

	public TournevisDynamometrique(Integer coupleMin, Integer coupleMax)
	{
		super();
		this.plageDeCouple.add(coupleMin);
		this.plageDeCouple.add(coupleMax);
		
		try {
			setCoupleActuel(coupleMin);
			
		} catch (ExceptionCouple e) {
			// TODO: handle exception
			e.getMessage();
		}
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		String res = new String();

		for (Integer elem : plageDeCouple) res = res + elem + "N" + " - ";

		return (super.toString())
				+ ("\nPlage de Couple : " + res)
				+ ("\nPlage actuel : " + coupleActuel +"N");
	}
	
	public void setCoupleActuel(Integer coupleActuel) throws ExceptionCouple {
		
		if((coupleActuel >= Collections.min(plageDeCouple)) && (coupleActuel <= Collections.max(plageDeCouple)))
			{
				this.coupleActuel = coupleActuel;			
			}
		else 
			{
			this.coupleActuel = (Collections.min(plageDeCouple)) + 1;
			
			throw new ExceptionCouple("Le couple doit etre compris entre " 
										+ Collections.min(plageDeCouple)
										+ "N et " + Collections.max(plageDeCouple) +"N");
			}
	}
	
	public Integer getCoupleActuel() {
		return coupleActuel;
	}
	
	public ArrayList<Integer> getPlageDeCouple() {
		return plageDeCouple;
	}

}
