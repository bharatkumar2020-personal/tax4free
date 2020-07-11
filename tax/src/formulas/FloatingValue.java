package formulas;

/**
 * 
 * @author Bharat Kumar
 *
 */
public class FloatingValue implements Formula {
	
	private double finalResult;
	
	public FloatingValue() {
		this.finalResult = 0;
	}
	
	public FloatingValue(double value) {
		this.finalResult = value;
	}
	 
	public FloatingValue(Formula formula) {
		this.finalResult = formula.compute();
	}
	
	public void add(Formula formula) {
		this.finalResult = this.finalResult + formula.compute();
	}
	
	public void subtract(Formula formula) {
		this.finalResult = this.finalResult - formula.compute();
	}
	
	public void multiply(Formula formula) {
		this.finalResult = this.finalResult * formula.compute();
	}
	
	public void divide(Formula formula) {
		this.finalResult = (1.0 * this.finalResult) / formula.compute();
	}
	
	public void setValue(double value) {
		this.finalResult = value;
	}
	
	public void setValue(Formula formula) {
		this.finalResult = formula.compute();
	}
	
	public double compute() {
		return this.finalResult;
	}
}
