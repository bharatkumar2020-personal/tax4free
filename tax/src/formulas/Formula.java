package formulas;

/**
 * 
 * @author Bharat Kumar
 *
 */
public interface Formula {
	public void add(Formula formula);
	
	public void subtract(Formula formula);
	
	public void multiply(Formula formula);
	
	public void divide(Formula formula);
	
	public void setValue(double value);
	public void setValue(Formula formula);
	
	public double compute();
}
