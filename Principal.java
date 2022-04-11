public class Principal {
    public static void main(String[]args){
        Bicicleta bike= new Bicicleta();

        Carro car=new Carro();
        Carro car2= new Carro ("1.0", "Up Tsi", 4, 63000);
        car2.dadosVeiculo();
        MinhaCalculadora calc=new MinhaCalculadora();
        System.out.println(calc.soma(38,1));
        MinhaCalculadora calc2=new MinhaCalculadora();
        System.out.println(calc.soma(38,1,1));
        MinhaCalculadora calc3=new MinhaCalculadora();
        System.out.println(calc.soma(3.50,2));
        
    }
    }
    

