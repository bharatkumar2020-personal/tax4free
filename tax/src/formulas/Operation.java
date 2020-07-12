package formulas;

import utils.StringUtils;

/**
 * 
 * @author Bharat Kumar
 *
 */
public class Operation {
	
	public Operation() {
		
	}
	
	public double compute(String expression) {
		double result = 0;
		
		String[] distinctExpressionsInParanthesis = StringUtils.split(expression, '(');
		
		for (int i = 0; i < distinctExpressionsInParanthesis.length; i++) {
			distinctExpressionsInParanthesis[i] = StringUtils.removeCharacter(')', distinctExpressionsInParanthesis[i]);
		}
		
		if (distinctExpressionsInParanthesis.length > 1) {
			for (int i = 0; i < distinctExpressionsInParanthesis.length; i++) {
				result += this.compute(distinctExpressionsInParanthesis[i]);
			}
			
			return result;
		}
		
		String[] splitPlus = StringUtils.split(expression, '+');
		if (splitPlus.length > 1) {
			for (int i = 0; i < splitPlus.length; i++) {
				result += this.compute(splitPlus[i]);
			}
			return result;
		}
		
		String[] splitMinus = StringUtils.split(expression, '-');
		if (splitMinus.length > 1) {
			for (int i = 0; i < splitMinus.length; i++) {
				result -= this.compute(splitMinus[i]);
			}
			return result;
		}
		
		String[] splitMultiply = StringUtils.split(expression, '*');
		if (splitMultiply.length > 1) {
			for (int i = 0; i < splitMultiply.length; i++) {
				result *= this.compute(splitMultiply[i]);
			}
			return result;
		}
		
		String[] splitDivide = StringUtils.split(expression, '/');
		if (splitDivide.length > 1) {
			for (int i = 0; i < splitDivide.length; i++) {
				result /= this.compute(splitDivide[i]);
			}
			return result;
		}
		
		
		
		return result;
	}
}
