public class Cachorro extends Animal{
    private String corPelo;

    public Cachorro(double p,int i, int m,String cp){
        super(p,i,m);
        setCorPelo(cp);
    }
    
    public String getCorPelo(){ return corPelo;}

    public void setCorPelo(String cp){ this.corPelo=cp;}
    
    public void locomoção(){
        System.out.println("Caminhando");
    }
    public void alimentar(){
        System.out.println("Ração");
    }
    public void som(){
        System.out.println("auau");
    }
}
