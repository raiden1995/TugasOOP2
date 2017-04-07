public class Jinjing extends Tas{
	
	@Override
	public String getwarna(){
	return warna = "Maroon";
}
	@Override
	public String getbahan(){
	return bahan = "Wol";
	}

public static void main(String args[]){
		Jinjing j = new Jinjing();  // konstruktor
		Tas t= new Tas(); // konstruktor
		j.getwarna();
		System.out.println(j.warna);
		t.getbahan();
		System.out.println(t.bahan);

}
	}
