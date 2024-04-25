package StrategyPattern;

import StrategyPattern.Caculator.DoType;

public class Main {

    public static void main(String[] args){
        Caculator caculator = new Caculator();

        caculator.setStrategy(DoType.ADD);
        System.out.println(caculator.execute(2, 3));

        caculator.setStrategy(DoType.MINUS);
        System.out.println(caculator.execute(2, 3));

        caculator.setStrategy(DoType.MULTYPLY);
        System.out.println(caculator.execute(2, 3));

        caculator.setStrategy(DoType.DIVIDE);
        System.out.println(caculator.execute(2, 3));
    }
}
