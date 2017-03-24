public class Mahasiswa{

	public String nama ;
	
	public void kuliah (){
		System.out.println ("Kuliah");
	}
	
	public static void main (String[]args){
		Mahasiswa rendy = new Mahasiswa();
		
		rendy.nama= "Rai Pangestu ";
		rendy.kuliah();
	}

}