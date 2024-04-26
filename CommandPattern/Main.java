package CommandPattern;

public class Main {
    public static void main(String[] args){
        Light light = new Light();
        Invoker invoker = new Invoker();
        invoker.addCommand(new TurnOn(light));
        invoker.addCommand(new TurnOff(light));
    }
}
