package ProxyPattern;

public class Main {

    public static void main(String[] args){
        
        LittleEngineer littleEngineer = new LittleEngineer();
        EstateAgent estateAgent = new EstateAgent(littleEngineer);

        estateAgent.findHouse();
        estateAgent.priceTooHigh();
        estateAgent.defendPrice();
        estateAgent.finish();
        
    }
}
