public class PenggunaanSuperChild extends PenggunaanSuper {
	int num = 10;
	public void tampilkan() {
		System.out.println("ini tampilkan dari sub kelas");
	}
	public void penggunaanSuper() {
		tampilkan();
		super.tampilkan();
		System.out.println("Nilai Variabel num pada sub kelas:" + num);
		System.out.println("Nilai Variabel num pada sub kelas:" + super.num);
	}
	public static void main(String args[]) {
		PenggunaanSuperChild obj = new PenggunaanSuperChild();
		obj.penggunaanSuper();
		}
}