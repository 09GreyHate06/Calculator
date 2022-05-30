package backend;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class ShuntingYard {
	
	public int getOperatorPrecedence(char op) {
		switch(op) {
		case '(':
		case ')':
			return 3;
		case '^':
			return 2;
		case '*':
		case '/':
			return 1;
		case '+':
		case '-':
			return 0;
		default:
			return -1;
		}
	}
	
	public Queue<String> toPostFix(String expression) {
		Stack<Character> operators = new Stack<Character>();
		Queue<String> outputQueue = new LinkedList<String>();
		
		for(int i = 0; i < expression.length(); i++) {
			StringBuilder numStr = new StringBuilder();
			while(i < expression.length() && (Character.isDigit(expression.charAt(i)) ||
					expression.charAt(i) == 'n' || expression.charAt(i) == '.')) {
				numStr.append(expression.charAt(i));
				i++;
			}
			
			if(!numStr.isEmpty()) {
				outputQueue.add(numStr.toString());
			}
			
			if(i >= expression.length())
				break;
			
			Character op = expression.charAt(i);
			if(op.equals(')')) {
				while(operators.peek() != '(') {
					outputQueue.add(operators.pop().toString());
				}
				
				operators.pop();
				
				continue;
			}
			
			int precedence = getOperatorPrecedence(op.charValue());
			while(!operators.empty() && operators.peek() != '(' && getOperatorPrecedence(operators.peek()) >= precedence) {
				outputQueue.add(operators.pop().toString());
			}
			operators.add(op);
		}
		
		while(!operators.empty()) {
			outputQueue.add(operators.pop().toString());
		}
			
		return outputQueue;
	}

}