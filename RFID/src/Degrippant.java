	
public class Degrippant implements Rangeable {

	private RFID rfid;

	public Degrippant()
	{
		this.rfid = new RFID();
	}
	
	public Degrippant(int numeroRFID)
	{
		this.rfid = new RFID(numeroRFID);

	}
	
	public String toString()
	{
		return rfid.toString();
	}
	
	public RFID getId()
	{
		return rfid;		
	}
	
	public void ajouter()
	{
		rfid.debutEmprunt();
	}
	
	public void retirer()
	{
		rfid.finEmprunt();
	}
}


