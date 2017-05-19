public class JenisKucing extends Kucing  {
 
    private String JenisKelamin ;
    private String Makanan;
   
    public void setJenisKelamin(String jk){
        this.JenisKelamin=jk;
    }
    public void setMakanan(String mk){
        this.Makanan = mk;        
    }
    public String getJenisKelamin(){
        return this.JenisKelamin;
    }
    public String getMakanan(){
        return this.Makanan;
    }    

    
    @Override
    protected void Tampilras() {
     super.setras("Persia"); 
     System.out.println("Nama Ras = " +super.getras());
    }

    @Override
    protected void Tampilwarnabulu() {
       super.setwarnabulu("Kuning"); 
     System.out.println("Warna Bulu = " +super.getwarnabulu());
    } 
}
