public class KucingTes {
        public static void main (String[] args) {
        Kucing ku = new Kucing();
        
        ku.setJenisKelamin("Betina");
		ku.setMakanan("Whiskas");
        System.out.println("Jenis Kelamin Kucing = " +ku.getJenisKelamin());
        System.out.println("Makanan Kucing = " +ku.getMakanan());
        ku.Tampilras();
        ku.Tampilwarnabulu();
    }

    
}
