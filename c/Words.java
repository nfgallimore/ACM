import java.io.*;

public class Words {
    public static void main(){
	Scanner scanner = new Scanner(System.in);
	int numBadChar = scanner.nextInt();
	int startPoint = scanner.nextInt();
	int numWords = scanner.nextInt();
	String s = scanner.nextLine();
	char[] badLetters = char[numBadChar];
	for (int i = 0; i < s.length(); i++) {
	    badLetters[i] = s.charAt(i);
	}
	
	int numUsableChar=26-numBadChar;

	char[] alph = new char[numUsableChar];

	char[] standardAlph = ['a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'];
	int i=0;
	int j=0;
	bool add = true;

	while(i<numUsableChar){
	    for int(k=j; k<numBadChar; k++){
		    if(standardAlph[i+j]==badLetters[k]){
			boolAdd=false;
			j++;
			k=numBadChar;
		    }
		}
	    if(boolAdd==true){
		alph[i] = standardAlphabet[i+j];
	    }
	    i++;
	    boolAdd=true;
	}
	
	int start=1;
	int maxCatch=numWords;
	for(int i=0; i<numUsableChar; i++){
	    for(int j=0; j<numUsableChar; j++){
		for(int k=0; k<numUsableChar; k++){
		    for(int k=0; k<numUsableChar; k++){
			if(start>=numStart && maxCatch>0){
			    System.out.println( Alph[i] + Alph[j] + Alph[k] + Alph[l]);
			    maxCatch--;
			}
			start++;

			//if number of output reached break from all for loops
			if(maxCatch<=0){
			    i=numUsable;
			    j=numUsable;
			    k=numUsable;
			    l=numUsable;
			}
		    }
		}
	    }
	}
	    
	
    
}
