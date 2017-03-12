import java.util.*;
import java.lang.*;
import java.io.*;

public class Polish 
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner(System.in);

	int n = null;
	
	if (scan.hasNextInt())
	{
		int tmpn = scan.nextInt();
		if (1 <= tmpn <= 25) 
	    n = scan.nextInt();
	}
	
	String str = scan.nextLine();

	String operStack;
	String digitStack;
	for (int i = n-1; i > 0; i--)
	{
		if (str.charAt(i) == '+') {
			operStack += '+';
		}
		else if (str.charAt(i) == '-') {
			operStack += '-';
		}
		else if (str.charAt(i) == '*') {
			operStack += '*';
		}
		else if (str.charAt(i) == '/') {
			operStack += '/';
		}
		else if (strArr.charAt(i).isDigit()) {
			digitStack += strArr.charAt(i);
		}
	}
	int operIteratorCount = 0;
	String out = "";
	while (operIteratorCount < operStack.length()) {
		if (operStack.charAt(digitStack.charAt(operIteratorCount)) == '+') {
			operIteratorCount++;
		}
		if (operStack.charAt(digitStack.charAt(operIteratorCount)) == '-') {
			operIteratorCount++;
		}
		if (operStack.charAt(digitStack.charAt(operIteratorCount)) == 'x') {
			operIteratorCount++;
		}
		if (operStack.charAt(digitStack.charAt(operIteratorCount)) == '/') {
			operIteratorCount++;
		}
	while (digitIteratorCount < operStack.length()) {
			out += digitStack.charAt(operDigitCount) / digitStack.charAt(operDigitCount+1);
			operDigitCount++;
		}
	}
	int numVals = n;
	while (numVals > 0) {
	    String tmp = scan.next();
	    if (1 <= tmp.charAt(numVals) && tmp.charAt(numVals) <= 9) {
		s += tmp;
		numVals--;
	    }
	    else {
		r
	    }
	    
	}
	numVals = n - 1;
	int value = (int)s.charAt(n-1);
	value -=48;
	numVals--;
	int i = numVals;
	while(i > 0) {
	    int operand = s.charAt(i) - 48;
	    i--;
	    char operator = s.charAt(i);
	    i--;
	    // System.out.println(operator + " operator");
	    // System.out.println(operand + " operand");
	    if (operator == '+') {
		value += operand;
		// System.out.println("plus");
	    }
	    else if (operator == 'x' || operator == '*') {
		value *= operand;
		// System.out.println("times");

	    }
	    else if (operator == '/') {
		value /= operand;
		// System.out.println("div");

	    }
	    else if (operator == '-') {
		value -= operand;
		// System.out.println("-");

	    }
	}

	System.out.println(value);
	
    }
}
