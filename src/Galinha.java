public class Galinha extends Animal{
    private String corPenas;

    public Galinha(double p,int i, int m,String cpn){
        super(p,i,m);
        setCorPenas(cpn);
    }    
    
    public String getCorPenas(){ return corPenas;}

    public void setCorPenas(String cpn){ this.corPenas=cpn;}
    
    public void locomoção(){
        System.out.println("caminhando");
    }
    public void alimentar(){
        System.out.println("milho");
    }
    public void som(){
        System.out.println("po po po");
    }
}
