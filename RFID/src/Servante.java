import java.util.ArrayList;

/**
 * 
 */

/**
 * @author b.christol
 *
 */
public class Servante {

	private ArrayList<Rangeable> tiroir = new ArrayList<Rangeable>();
	
	public Servante() {
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "\nNombre d'élément(s) : " + tiroir.size();
	}
}
