public class Mahasiswa {
	String nama;
	
	Mahasiswa() { //konstruktor
		nama = "java";
		System.out.println(nama);
}
public static void main (String[] args) {
		Mahasiswa mhs = new Mahasiswa ();
		System.out.println(mhs.nama);
}
}