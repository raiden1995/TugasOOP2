public class Gendong extends Tas{
	
	@Override
	public String getjenis(){
	return jenis = "Sling Bag";
}
	public String getbahan(){
	return bahan = "Wol";
	}

public static void main(String args[]){
		Gendong g = new Gendong(); 
		Tas t= new Tas();
		g.getjenis();
		System.out.println(g.jenis);
		t.getbahan();
		System.out.println(t.bahan);

}
	}
