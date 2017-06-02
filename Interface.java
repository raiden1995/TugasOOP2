public interface Interface {
   public String Hewan = "Sapi";
   public String Berkaki = "Empat";

   /*Interface tidak dapat di inisiasi*/
public static void main (String[] Args) {
        Interface In = new Interface();
    }
}

/*class Abstract Dapat mengImplement interface dengan bebas */
public abstract class abstrak implements Interface {
    protected String getHewan(){
        return this.hewan;
    }
	
/* implement variable interface */
public class impl implements Interface {
    public static void main (String[] Args) {
        impl pg = new impl();
        pg.Hewan;
        pg.Berkaki;
    }
  } 
}