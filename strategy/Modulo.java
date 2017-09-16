package strategy;

public class Modulo implements StrategyOperation{
	public int operate(int a, int b) {
		Suma s = new Suma();
		Resta r = new Resta();
		Division d = new Division();
		Multiplicacion m = new Multiplicacion();

		return d.operate( r.operate( m.operate(2, a), b ), s.operate( 3, a ) );
	}

}