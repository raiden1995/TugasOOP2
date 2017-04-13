//Buat Class Binatang
public class PolymorphismBinatang {
 
   public static void main(String[] args) {  //method void main utama
   Anjing object = new Anjing();
   Kucing object2 = new Kucing();
   object.tampilSuara(); //memanggil method sama namun dengan hasil berbeda
   object2.tampilSuara(); //memanggil method sama namun dengan hasil berbeda
      }
}
//Buat Class Anjing
class Anjing extends PolymorphismBinatang {
   
    public void tampilSuara(){
        //membuat method tampilSuara() yang sama dengan class Binatang
    System.out.println("Suara Anjing : Guk Guk Guk ");
       //statement  dari perilaku yaitu menampilkan pesan text
       // berbeda dari class binatang
   }
}
//Buat Class Kucing
class Kucing extends PolymorphismBinatang
{
  public void tampilSuara(){
     //membuat method tampilSuara() yang sama dengan class Binatang
    System.out.println("Suara Kucing : Meow Meow");
     //statement  dari perilaku yaitu menampilkan pesan text
       // berbeda dari class binatang
       
   }
   
}
