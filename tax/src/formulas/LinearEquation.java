package formulas;

/**
 * 
 * @author Bharat Kumar
 *
 */
public class LinearEquation {
	
	private double m;
	private double b;
	
	private double finalResult;
	
	public LinearEquation() {
		this.m = 0;
		this.b = 0;
		this.finalResult = 0;
	}
	
	public LinearEquation(double m, double b) {
		this.m = m;
		this.b = b;
		this.finalResult = 0;
	}
	
	public void add(Formula formula) {
		
	}
	
	public void subtract(Formula formula) {
		
	}
	
	public void multiply(Formula formula) {
		
	}
	
	public void divide(Formula formula) {
		
	}
	
	public void setValue(double value) {
		
	}
	
	public void setValue(Formula formula) {
		
	}
	
	public double compute() {
		return this.finalResult;
	}
}
