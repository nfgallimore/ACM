import java.util.*;
import java.lang.*;
import java.io.*;

public class Polish {
    public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	int n = 0;
	if (scan.hasNextInt()) {
	    int tmpn = scan.nextInt();
	    if (1 <= tmpn && tmpn <= 25) n = tmpn;
	}
	String s = "";
	int numVals = n;
	while (numVals > 0) {
	    String tmp = scan.next();
	    if ((numVals - n) % 2 == 1) {
		if (1 <= tmp.charAt(numVals) && tmp.charAt(numVals) <= 9) {
		    s += tmp;
		    numVals--;
		}
	    }
	    else {
		s += tmp;
		numVals--;
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
