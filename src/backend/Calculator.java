package backend;
import java.util.*;

public class Calculator {
	
	ShuntingYard _sy;
	
	public Calculator(){
		_sy = new ShuntingYard();
	}
	
	public float solve(String expression) {
		String exp = expression.replaceAll("\\s", "");
		
		Queue<String> postfix = _sy.toPostFix(exp);
		Stack<String> outputStack = new Stack<String>();
		
		while(!postfix.isEmpty()) {
			if(!Character.isDigit(postfix.peek().charAt(0)) && postfix.peek().charAt(0) != 'n') {
				Character op = postfix.poll().charAt(0); 
				
				String rhs = outputStack.pop().replace('n', '-');
				String lhs = outputStack.pop().replace('n', '-');
				
				float result = 0.0f;
				switch(op.charValue()) {
				case '+':
					result = Float.parseFloat(lhs) + Float.parseFloat(rhs);
					break;
				case '-':
					result = Float.parseFloat(lhs) - Float.parseFloat(rhs);
					break;
				case '*':
					result = Float.parseFloat(lhs) * Float.parseFloat(rhs);
					break;
				case '/':
					result = Float.parseFloat(lhs) / Float.parseFloat(rhs);
					break;
				case '^':
					result = (float) Math.pow(Float.parseFloat(lhs), Float.parseFloat(rhs));
					break;
				default:
					break;
				}
				
				outputStack.push(Float.toString(result));
				
				continue;
			}
			
			outputStack.push(postfix.poll());
		}
		
		return Float.parseFloat(outputStack.pop());
	}
}
