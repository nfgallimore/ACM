import java.io.*;
import java.util.*;
public class Words {
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int numBadChar = scanner.nextInt();
	int startPoint = scanner.nextInt();
	int numWords = scanner.nextInt();
	String s = "";
	int tmp = numBadChar;
	while (tmp > 0){
	    s = scanner.next();
	    tmp--;
	}
	char[] badLetters = new char[numBadChar];
	for (int i = 0; i < s.length(); i++) {
	    badLetters[i] = s.charAt(i);
	}
	
	int numUsableChar=26-numBadChar;

	char[] alph = new char[numUsableChar];

	char[] standardAlph = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 
			       'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
	int i1=0;
	int j1=0;
	boolean boolAdd = true;

	while(i1<numUsableChar){
	    for (int k=j1; k<numBadChar; k++){
		    if(standardAlph[i1+j1]==badLetters[k]){
			boolAdd=false;
			j1++;
			k=numBadChar;
		    }
		}
	    if(boolAdd==true){
		alph[i1] = standardAlph[i1+j1];
	    }
	    i1++;
	    boolAdd=true;
	}
	
	int start=1;
	int maxCatch=numWords;
	for(int i=0; i<numUsableChar; i++){
	    for(int j=0; j<numUsableChar; j++){
		for(int k=0; k<numUsableChar; k++){
		    for(int l=0; l<numUsableChar; l++){
			if(start>=startPoint && maxCatch>0){
			    
			     System.out.println(""
					       + standardAlph[i] 
					       + standardAlph[j] 
					       + standardAlph[k] 
					       + standardAlph[l]
					       );
			    maxCatch--;
			}
			start++;

			//if number of output reached break from all for loops
			if(maxCatch<=0){
			    i=numUsableChar;
			    j=numUsableChar;
			    k=numUsableChar;
			    l=numUsableChar;
			}
		    }
		}
	    }
	}
	    
    }
    
}
