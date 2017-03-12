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
		else if (str.charAt(i) == 'x') {
			operStack += '*';
		}
		else if (str.charAt(i) == '/') {
			operStack += '/';
		}
		else if (strArr.charAt(i).isDigit()) {
			digitStack += strArr.charAt(i);
		}
	}
	int operIteratorCount = 0, digitIteratorCount = 0;
	int out = 0;
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
	}
	while (digitIteratorCount < operStack.length()) {
			out += digitStack.charAt(digitStack.length() - 2 - digitIteratorCount) / digitStack.charAt(digitStack.length() - 1 - digitIteratorCount);
			digitIteratorCount++;
		}
	}
}
