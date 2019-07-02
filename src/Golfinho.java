public class Golfinho extends Animal{
    private String corPele;

    public Golfinho(double p,int i, int m,String cpe){
        super(p,i,m);
        setCorPele(cpe);
    }    
    
    public String getCorPele(){ return corPele;}

    public void setCorPele(String cpe){ this.corPele=cpe;}
    
    public void locomoção(){
        System.out.println("nadando");
    }
    public void alimentar(){
        System.out.println("pequenos peixes");
    }
    public void som(){
        System.out.println("criqueteira");
    }
}
