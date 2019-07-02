public class TestaAnimais {
    public static void main(String []Args){
        
        Cachorro rex=new Cachorro(5,2,4,"preto");
        Cobra valde=new Cobra(2,1,1,"verde");
        Golfinho peixe=new Golfinho(15,4,3,"azul");
        Galinha marisvalda=new Galinha(2,2,4,"cinza");
        
        rex.locomoção();
        rex.alimentar();
        
        valde.locomoção();
        valde.alimentar();
        
        peixe.locomoção();
        peixe.alimentar();
        
        marisvalda.locomoção();
        marisvalda.alimentar();
        
    }
}
