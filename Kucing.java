public abstract class Kucing {
    
    protected String ras;
    protected String warnabulu;
	
    protected String getras() {
        return this.ras;
        
    }
    
    protected String getwarnabulu() {
        return this.warnabulu;
        
    }
    public void setras(String ras) {
      this.ras= ras;  
        
    }
    
    public void setwarnabulu(String wb) {
        this.warnabulu=wb;
    }
    
    protected abstract void Tampiljenis();
    protected abstract void Tampilwb();
    
	
}