public class Cobra extends Animal{
    private String corEscamas;

    public Cobra(double p,int i, int m,String ce){
        super(p,i,m);
        setCorEscamas(ce);
    }
    
    public String getCorEscamas(){ return corEscamas;}

    public void setCorEscamas(String ce){ this.corEscamas=ce;}
    
    public void locomoção(){
        System.out.println("Rastejando");
    }
    public void alimentar(){
        System.out.println("pequenos animais");
    }
    public void som(){
        System.out.println("sssssss");
    }
}
