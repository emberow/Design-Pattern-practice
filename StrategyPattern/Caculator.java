package StrategyPattern;

import StrategyPattern.Interface.IStrategy;

public class Caculator {
    IStrategy strategy;

    public int execute(int a, int b) {
        return strategy.caculate(a, b);
    }

    public void setStrategy(DoType doType) {
        switch (doType){
            case ADD:
                this.strategy = new Add();
                break;
            case MINUS:
               this.strategy = new Minus();
                break;
            case DIVIDE:
                this.strategy = new Divide();
                break;
            case MULTYPLY:
               this.strategy = new Multyply();
                break;
        }
    }

    enum DoType{
        ADD , MINUS , DIVIDE , MULTYPLY
    }
}
