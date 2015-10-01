import java.util.ArrayList;
import java.util.Collections;


/**
 * @author b.christol
 *
 */
public class TournevisTesteur extends Tournevis{

	@SuppressWarnings("serial")
	private ArrayList<String> seuilsPossibles = new ArrayList<String>() {{ add("110"); add("220");}};	
		
	protected int seuilDeDeclenchement;
	
	public TournevisTesteur()
	{
		super();
	}
	
	public TournevisTesteur(int seuilDeclenchement, int numeroRFID)
	{
		super(numeroRFID);
		
		this.seuilDeDeclenchement = verifierSeuil(seuilDeclenchement);
	}
	
	protected int verifierSeuil(int seuilDeclenchement) 
	{
				
		if(seuilsPossibles.contains(Integer.toString(seuilDeclenchement)))
		{
			System.out.print("Le seuil choisi est conforme, seuil de declenchement =  ");
			System.out.println(seuilDeclenchement);
			
			return seuilDeclenchement;
		}
		
		else
		{
			System.out.print("Le seuil choisi n'est pas conforme, seuil de declenchement = ");
			System.out.println(Collections.max(seuilsPossibles));
			
			return Integer.parseInt(Collections.max(seuilsPossibles));
		}
	}
	
	public String toString() 
	{
		String res = new String();
		
		//for (int i =0; i < seuilsPossibles.size();i++) 
		for (String elem : seuilsPossibles) res = res + elem + "V" + " - ";

		/*{
			res= res + seuilsPossibles.get(i) + "-";
		}*/
		
		return (super.toString())
				+ ("\nSeuil possible : " + res)
				+ ("\nSeuil de declenchement selectionné : " + seuilDeDeclenchement + "V");
				
	}
	
	public int getSeuilDeDeclenchement()
	{
		return seuilDeDeclenchement;
	}
}
