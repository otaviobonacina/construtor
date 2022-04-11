public class Carro{
    private String motor;
    private String modelo;
    private int roda;
    private double preco;

    public Carro() {

    }
    public Carro(String motor,String modelo, int roda, double preco){
    this.motor=motor;    
    this.modelo=modelo;
    this.roda=roda;
    this.preco=preco;
    }
    public void dadosVeiculo(){
        System.out.println("motor: "+ this.motor);
        System.out.println("Modelo do carro: "+ this.modelo);
        System.out.println("Numero de rodas: "+ this.roda);
        System.out.println("Preço do veiculo: "+ this.preco);
    }
}