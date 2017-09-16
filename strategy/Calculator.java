package strategy;

import java.util.HashMap;
import java.util.Map;

public class Calculator {
	private Map<String, StrategyOperation> operations = new HashMap<>();

	public void register(String op, StrategyOperation strategy) {
		operations.put(op, strategy);
	}
	
	public int execute(String op, int a, int b) {
		StrategyOperation strategy = operations.get(op);
		return strategy.operate(a, b);
	}
	
}
