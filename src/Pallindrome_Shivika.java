import java.util.Scanner;

public class Pallindrome_Shivika {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		// length of the word
		int lenOfWord = scan.nextInt();
		
		// length of the Alphabets
		int noOfAlpha = scan.nextInt();
		
		// length of the Alphabets
		int noOfDigits = scan.nextInt();
		
		// length of the Special Characters
		int noOfSpeChar = scan.nextInt();
		
		// character array of the vaild palindrome
		char[] result = new char[lenOfWord];
		
		// Initial values
		char A = 'a',zero = '0', hash = '#';
		
		//check for invalid input
		if(lenOfWord != noOfAlpha + noOfDigits + noOfSpeChar) {
			
			System.out.println("Invalid Input");
			return;
		}
		
		
		if(lenOfWord % 2 == 0){
			
			if(noOfAlpha % 2 == 0 && noOfDigits % 2 == 0 && noOfSpeChar % 2 == 0) {
				
				int i = 0,k = 0;
				
				for(int j =0 ; j < noOfAlpha/2 ;j++){
					
					result[i] = (char)((int)A + k);
					result[lenOfWord -1 - i] = result[i];
					
					k++;
					i++;
				}
				
				k = 0;
				
				for(int j =0 ; j < noOfDigits/2 ;j++){
					
					result[i] = (char)((int)zero + k);
					result[lenOfWord -1 - i] = result[i];
					
					k++;
					i++;
				}
				
				k = 0;
				
				for(int j =0 ; j < noOfSpeChar/2 ;j++){
					
					result[i] = (char)((int)hash + k);
					result[lenOfWord -1 - i] = result[i];
					
					k++;
					i++;
				}
				
				System.out.println("Valid Palindrome - " + String.valueOf(result));
				
			} else{
				
				System.out.println("Invalid Palindrome");
			}	
		} else {
			
			if((noOfAlpha % 2 + noOfDigits % 2 + noOfSpeChar % 2) == 1) {
				
				int i = 0, k = 0, x = 0;
				
				int[] arr = new int[3];
				arr[0] = noOfAlpha; arr[1] = noOfDigits; arr[2] = noOfSpeChar;
				
				while(x < 3) {
					
					if(arr[x] % 2 == 1)
						break;
					x++;
				}
				
				if( x == 2 || (x < 2 && arr[x+1] == 0)){
					
					for(int j =0 ; j < noOfAlpha/2 ;j++){
						
						result[i] = (char)((int)A + k);
						result[lenOfWord -1 - i] = result[i];
						
						k++;
						i++;
					}
					
					if(noOfAlpha % 2 == 1)
						result[lenOfWord / 2] = (char)((int)A + k); 
					
					k = 0;
					
					for(int j =0 ; j < noOfDigits/2 ;j++){
						
						result[i] = (char)((int)zero + k);
						result[lenOfWord -1 - i] = result[i];
						
						k++;
						i++;
					}
					
					if(noOfDigits % 2 == 1)
						result[lenOfWord / 2] = (char)((int)zero + k);
					
					k = 0;
					
					for(int j =0 ; j < noOfSpeChar/2 ;j++){
						
						result[i] = (char)((int)hash + k);
						result[lenOfWord -1 - i] = result[i];
						
						k++;
						i++;
					}
					
					if(noOfSpeChar % 2 == 1)
						result[lenOfWord / 2] = (char)((int)hash + k);
					
					System.out.println("Valid Palindrome - " + String.valueOf(result));
					
				} else {
					System.out.println("Invalid Palindrome");
				}
			} else {
				System.out.println("Invalid Palindrome");
			}
			
			scan.close();
		}
	}
}
