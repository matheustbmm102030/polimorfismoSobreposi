public abstract class Animal {
    private double peso;
    private int idade;
    private int membros;
    
    public Animal(double p,int i,int m){
        setPeso(p);
        setIdade(i);
        setMembros(m);
    }

    public double getPeso() { return peso;}
    public int getIdade(){ return idade;}
    public int getMembros(){ return membros;}
    
    public void setPeso(double p){ this.peso=p;}
    public void setIdade(int i) { this.idade=i;}
    public void setMembros(int m) { this.membros=m;}
    
    
    public abstract void locomoção();
    public abstract void alimentar();
    public abstract void som();
}
