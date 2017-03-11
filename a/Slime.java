import java.util.*;
import java.math.*;

public class Slime {

    public static void main(String[] args)
    {
	System.out.println(helper());
    }
    public static int helper() {
	Scanner scan = new Scanner(System.in);
        while (scan.hasNextInt()) {
	    int val = scan.nextInt();
	    if (1 <= val && val <= 30)
		return (int)Math.pow(2,val);
	}
	return 0;
    }
}
