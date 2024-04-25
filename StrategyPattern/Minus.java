package StrategyPattern;

import StrategyPattern.Interface.IStrategy;

public class Minus implements IStrategy {
    @Override
    public int caculate(int a, int b) {
        return a - b ;
    }
}