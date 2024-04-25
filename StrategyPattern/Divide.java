package StrategyPattern;

import StrategyPattern.Interface.IStrategy;

public class Divide implements IStrategy {
    @Override
    public int caculate(int a, int b) {
        return a / b;
    }
}