public class Overloading{
	public static void main(String[]args){
	Overloading method = new Overloading();
	method.methodTampilkan("Belajar Java Yuks");
	method.methodTampilkan("Belajar Java Yuks","Hingga Mengerti");
	}
private void methodTampilkan (String nama){
	System.out.println(nama);
}
	private void methodTampilkan (String nama1,String nama2){
	System.out.println(nama1+nama2);
	}
}