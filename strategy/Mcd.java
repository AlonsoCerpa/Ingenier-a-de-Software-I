package strategy;

public class Mcd implements StrategyOperation{
	public int operate(int a, int b) {
		return a != b ? (a>b ? operate(a-b, b) : operate(a, b-a)) : a;
	}

}