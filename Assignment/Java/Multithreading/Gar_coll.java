
public class Gar_coll {

	public static void main(String[] args) {
		Gar_coll c=new Gar_coll();
		c=null;
		System.gc();

	}
	public void finalize()
	{
		
	}

}
