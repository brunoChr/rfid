
public abstract class Outils implements Rangeable {

	private RFID id;
	
	public Outils()
	{
		this.id = new RFID();
	}
	
	public Outils(int numeroRFID)
	{
		this.id = new RFID(numeroRFID);
	}
	
	public String toString()
	{
		return id.toString();
	}
	
	public RFID getId()
	{
		return id;
	}
	
	public void ajouter()
	{
		id.debutEmprunt();
	}
	
	public void retirer()
	{
		id.finEmprunt();
	}
}
