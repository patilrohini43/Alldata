/*
* Created by: BridgeLabz
* Date 16/12/2018
* Purpose:A program with cubic running time. Read in N integers and counts the
number of triples that sum to exactly 0.
**/

package all.program.utility;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Utility {
	
	static Utility u=new Utility();
	
		BufferedReader br;
		
	  public Utility()
		{
			br = new BufferedReader(new InputStreamReader(System.in));
	    }
	  
	  public int inputInteger(){
			try{
				try{	
					return Integer.parseInt(br.readLine());
				}
				catch(NumberFormatException n){
					System.out.println(n.getMessage());	
				}
			}catch(IOException io){
				System.out.println(io.getMessage());
			}
	return 0;
		
	  }

	public Double inputDouble() {
		// TODO Auto-generated method stub
		try{
			try{	
				return Double.parseDouble(br.readLine());
			}
			catch(NumberFormatException n){
				System.out.println(n.getMessage());	
			}
		}catch(IOException io){
			System.out.println(io.getMessage());
		}
        return (double) 0;
		
	
	}
	
	
	//take input word
		public String inputString(){
			try{
				return br.readLine();
			}
			catch(IOException ioe){
				System.out.println(ioe.getMessage());
			}
			return "";
	}
		
		
		
		
		/**
		 * This function is used for replace the string 
		 */
		public static String result(String str,String search,String replace)
		{
			/**
			 * Declare result to store the value of replace string
			 */
			String res=str.replace(search, replace);
			return res;
		
			
			
		}
	
		//This function is used for find the percentage of flip
		  public static void perFlip(int times) {
			double heads = 0;
			for (int i = 0; i < times; i++) {    //call the times of number
				if (Math.random() > 0.5) {        //generate random number
					heads++;                   //increment heads
				}
			}
			//display percentage using this formula
			System.out.println(heads);
			System.out.println("heads percentage is " + (float) (heads / times) * 100);
			System.out.println("tails percentage is " + (float) (times - heads) / times * 100);
	}
		
		
		
		
		//using char insert ,method
		
		public static String charInsert(String str, char c, int j) {
	        String begin = str.substring(0, j);
	        String end = str.substring(j);
	        return begin + c + end;
	    }
		
		//This function is used to find the prime number
		/**
		 * 
		 * @param n take the number from user
		 */
		public static void primeNum(int n) {
			
	        while (n%2==0) 
	        { 
	            System.out.print( 2 +" "); 
	            n /= 2; 
	        } 
	  
	      
	        for (int i = 3; i <= Math.sqrt(n); i+= 2) 
	        { 
	            // While i divides n, print i and divide n 
	            while (n%i == 0) 
	            { 
	               //System.out.print(i + ""); 
	                n /= i; 
	            } 
	        } 
	  
	        // This condition is to handle the case when 
	        // n is a prime number greater than 2 
	       if (n > 2) 
	           System.out.print(n); 
		}

		
		
        //This function calculate the wins and bets
        public static int gambler(int stake,int goal,int trials)
        {
        
        	int bets = 0;        // total number of bets made
            int wins = 0;        // total number of games won 
        
          //repeat trials times
        
        for (int t = 0; t < trials; t++) {

            
             // do one gambler's ruin simulation
             
            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                
                if (Math.random() < 0.5)
                	cash++;     // win $1
                else                    
                	cash--;     // lose $1
            }
            if (cash == goal) 
            	wins++;                // did gambler go achieve desired goal?
            return wins;   //return number of wins
        }
		return bets; //returns no of bets made
		
        }
		
        //This function is used for  to find the  harmonic numbers
        public static double harmonic(int n)
		{
        	double result=0,j=0,num=0;
	       /**
	        * use for loop 1 to n number call
	        *   & compute 1/1 + 1/2 + 1/3 + ... + 1/n
	        */
          for (j = 1; j <= n; j++) {
	      num = num + (1 / j);
	      result = num;
           }
		return result;
		}
        
        
        
        //This function is used for finding year is leap or not
        /**
         * 
         * @param year take the input from user
         * @return check and return the year is leap or not
         */
        public static int leapYear(int year)
        {

    		boolean flag=true;
    		if(year % 400 ==0)
    		{
    			flag=true;
    		}
    		else if(year % 100 == 0)
    		{
    			flag=false;
    		}
    		else if(year % 4 == 0)
    		{
    			flag=true;
    		}
    		else
    		{
    			flag=false;
    		
    		}
    		
    		 //if condition is satisfy the print leap year else not 
    		 
    		if(flag)
    		{
    			System.out.println("year " +year +" this is leap year");
    			
    		}
    		else
    		{
    			System.out.println(" year " +year+" this is not leap year");
    			
    		}
			return year;
        }
        
        
        //This function check prime number
        /**
         * 
         * @param i take the input from user
         * @return check number is prime or not
         */
        public static boolean isPrime(int i)
    	{
    		for(int j=2;j<i;j++)
    		{
    			if(i%j==0)
    			{
    	     		return false;
    	    	}
    			
    	  	}
    	 	return true;
        
    	}
		
		//This function is used to generate coupen value random
        /**
         * 
         * @param str take the input from user
         * @return generated random coupen code
         */
		public static String coupen(String str)
		{
		
			//char array to get characters for coupen
		char[] chars=str.toCharArray();
		//length of coupen limit 
	    int max=100000;

	  
	     // return a random coupon between 0 and n-1
	    
	    int random=(int) (Math.random()*max);	
	    /**
	     * Creates a StringBuffer 
	     * create the object of stringBuffer use for append
	     */
		StringBuffer sb=new StringBuffer();
		
		
		while (random>0)
		{
			
			//t will iterate till value of random not become to 0
		
			sb.append(chars[random % chars.length]);
			random /= chars.length;
			System.out.println(random + "  " + random % chars.length + "  is " + sb);
		}
		////value of sb assign to the coupen code varible
			String couponCode=sb.toString();
			return couponCode;
					
			//System.out.println("Coupon Code: " +u.coupenCold(str);	
		}
        
		
		//display method of 2D array like integer,double and boolean
		//Display all Method
		
		public static void display(int[][]x,double[][]y,String[][]z,int r,int c )
		{
			PrintWriter pw=new PrintWriter(System.out,true);
			
			System.out.println();
			pw.println("Integer Number");
			
			for(int i=0;i<r;i++)
			{
				for(int j=0;j<c;j++)
					
				{
					pw.print("\t"+x[i][j]+" ");
					
				}
				pw.print("\n");
			}
		
			
			
			
			System.out.println();
			pw.println("Double Number");
					
					for(int i=0;i<r;i++)
					{
						for(int j=0;j<c;j++)
							
						{
							pw.print("\t"+y[i][j]+" ");
						}
						pw.print("\n");
					}
			
			
					//display boolean
					System.out.println();
					pw.println(" ARRAY BOOLEAN");
							
					for(int i = 0; i<r; i++)
					{
						for (int j = 0; j<c; j++)
						{
							pw.print("\t"+z[i][j]+" ");
						} 
					pw.println("\t");
					}
				}
		
		
		
		//This functionn is find the Sum of three number =sum 
		//print all triplets with in array with sum 
		 public static List<List<Integer> > findTriplets(int[] b, int sum) 
		    { 
		  
		       //sort array
		        Arrays.sort(b); 
		         
		        
		        List<List<Integer> > pair = new ArrayList<>(); 
		        TreeSet<String> set = new TreeSet<String>(); 
		        List<Integer> triplets = new ArrayList<>(); 
		  
		      //fix the value of b[i]
		        for (int i = 0; i < b.length - 2; i++) { 
		  
		            //fix the value of b[j]
		            int j = i + 1; 
		  
		           //fix the value of b[k]
		            int k = b.length - 1; 
		  
		            while (j < k) { 
		  
		            	// printing distinct triples (i, j, k) where a[i] + a[j] + a[k] = 0
		                if (b[i] + b[j] + b[k] == sum) { 
		  
		                    String str = b[i] + ":" + b[j] + ":" + b[k]; 
		                  System.out.println(b[i] + " " + b[j] + " " + b[k]);
		                    if (!set.contains(str)) { 
		  
		                       //add the value i,j,k
		                        triplets.add(b[i]); 
		                        triplets.add(b[j]); 
		                        triplets.add(b[k]); 
		                        pair.add(triplets); 
		                        triplets = new ArrayList<>(); 
		                        //set the value 
		                        set.add(str); 
		                    } 
		  
		                    j++; 
		                    k--; 
		                       // check the sum of i,j,k is less than sum
		                } else if (b[i] + b[j] + b[k] < sum) 
		                    j++; //increment j
		  
		                else 
		                    k--; 
		            } 
		        } 
		        return pair; 
		    } 
		  
	
		 
		 
		 
//Calculate the distance using math function
public double distance1(int x1, int y1, int x2, int y2) {
	// TODO Auto-generated method stub
	
    return Math.sqrt(Math.pow(x2 - x1, 2) +  
                Math.pow(y2 - y1, 2) * 1.0); 
	
} 
	



//this function is find the permutation string
/**
 * 
 * @param str take the input from user
 * @returns the generated permutation numbers
 */
public static Set<String> permutationFinder(String str) {
	
    Set<String> perm = new HashSet<String>();
    //Handling error scenarios
    if (str == null) {
        return null;
    } else if (str.length() == 0) {
        perm.add("");
        return perm;
    }
    /**
     * first char = A and remaining chars permutations are BC and CB.
       Now we can insert first char in the available positions in the permutations.
      BC -> ABC, BAC, BCA
        CB -> ACB, CAB, CBA
     */
    char initial = str.charAt(0); // first character
    String rem = str.substring(1); // Full string without first character
    Set<String> words = permutationFinder(rem);
    for (String strNew : words) {
        for (int i = 0;i<=strNew.length();i++){
            perm.add(u.charInsert(strNew, initial, i));
        }
    }
    return perm;
}





//________________________________________________________________________//

/** 
 * permutation function 
 * @param str string to calculate permutation for 
 * @param l starting index 
 * @param r end index 
 */
public void permute(String str, int l, int r) 
{ 
    if (l == r)    //check the 
        System.out.println(str); 
    else
    { 
        for (int i = l; i <= r; i++) 
        { 
            str = swap(str,l,i); //A swap the A permutation like as A A,A B
            permute(str, l+1, r); //A is fixed the position ABC 1,2 ,then B is fixed BAC 1,2
            str = swap(str,l,i); //swap the permutation A A,then swap B A
        } 
    } 
} 

/** 
 * Swap Characters at position 
 * @param a string value 
 * @param i position 1 
 * @param j position 2 
 * @return swapped string 
 */
public String swap(String a, int i, int j) 
{ 
    char temp; 
    char[] charArray = a.toCharArray(); 
    temp = charArray[i] ; 
    charArray[i] = charArray[j]; 
    charArray[j] = temp; 
    return String.valueOf(charArray); 
} 

//___________________________________________________________________//

/**
 * 
 * @param num take the input from user
 * @return power of 2
 */
public static int power(int num)
{
	int i=0;
	int powerOfTwo=1;


// check the number is greater than num
 
while
	(i<=num)
{
	
	// print the power of 2
	
	System.out.println(i + " " + powerOfTwo);  

	// get the double to next
	 
	powerOfTwo = 2 * powerOfTwo; 
      i = i + 1;
}
return powerOfTwo;
}


//This function is used to find the running time 

private int startTime=0;
private int  endTime=0;
private long running;

public void start()
	{
		startTime=(int) System.currentTimeMillis();
		System.out.println("Start Time is: "+startTime);
  }

public void end()
	{
		endTime=(int) System.currentTimeMillis();
		System.out.println("End Time is: "+endTime);
  }

public long RunningTime()
{ 
	//calculate the running time of start and end time process 
	 running=endTime-startTime;
	 return running;
	 
}



//calculate the Quadratic program using formula
public static void roots(int a, int b, int c) {
	// calculating delta value
	int delta = Math.abs(b * b - 4 * a * c);
	double x1 = (-b + Math.pow(delta, 1 / 2)) / (2 * a);
	double x2 = (-b - Math.pow(delta, 1 / 2)) / (2 * a);
	System.out.println("First Root:-"+x1);
    System.out.println("Second Root:-"+x2);
 

}

///////////////////////////////////////////////////////////////////////

public static int findDistinctTriplets(int b[],int length)
{
	
	System.out.println();
	int i,j,k,count=0;
	for(i=0;i<length;i++)
	{
		for(j=i+1;j<length;j++)
		{
			for(k=j+1;k<length;k++)
			{
				
				if (b[i] + b[j] + b[k] == 0)
				{
					System.out.println(b[i] + " " + b[j] + " " + b[k]);
					count++;
				}
			}
		}
	}
	
	return count;
}

////////////////////////////////////////////////////////////////////////








/**
 *  this function for windchill check the formula of windchill is valued or not
 */

public static double windChill(double temp,double speed)
{

	//use the formula to calculate the windchill
double windChill=35.74+0.6214 * temp + (0.4275 * temp -35.75) * Math.pow(speed,0.16);

/**
 * the formula is not valid if t is larger than 50 
 * in absolute value or if v is larger
  than 120 or less than 3
 */

if(temp >=50 ||  speed >=120 || speed <=3)
	 
{
	 System.out.println("The formula is not valid" );
	 
}
else
{
	 System.out.println("The formula is valid" +windChill);
}
return windChill;
}

//########################################TicTacTao############################################//



public static void gameTictac(String name)
{
	//this board is an array to initailize play board
	String[] board = new String[9];
	String turn = "X";   //player Turn
    String winner = null; //to check who is win
    String player2; //name of player 2
    
    //calling this method to load the board instruction
    isEmptyBoard(board);
    
    player2=name;
    System.out.println("Board Insrtuction");
    //this varible number to get player chosen number of slot
    System.out.println("Enter slot number to place in");
    printBoard(board);
    int num;
    turn="0";
    //

    //check the condition who is win assign the condition to enter input between o to n
      //and they index filled
	while (winner == null) {
		
		try {
			
			if(turn.equalsIgnoreCase("0"))
			{
			Random rn = new Random();	
			num=rn.nextInt(10);
			System.out.println("Computer choosed slot number"+num);
			
				
			}
			else
			{
			
			
			  num=u.inputInteger();
			}
			if (!(num > 0 && num <= 9)) {
				System.out.println("Invalid input; re-enter slot number:");
				continue;
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input; re-enter slot number:");
			continue;
		}
		if (board[num-1].equals(String.valueOf(num))) {
			board[num-1] = turn;
			if (turn.equals("X")) {
				turn = "0";
			} else {
				turn = "X";
			}
			printBoard(board);
			winner = checkWinner(board,turn);
		} else {
			System.out.println("Slot already taken; re-enter slot number:");
			continue;
		}
	}
	//check the who is win otherwise play again task
	if (winner.equalsIgnoreCase("draw")) {
		System.out.println("It's a draw! Thanks for playing.");
	} else {
		System.out.println("Congratulations! " + winner + "'s have won! Thanks for playing.");
	}
}

//this are the condition to check  win or not
public static String checkWinner(String[] board,String turn) {
	for (int a = 0; a < 8; a++) {
	
		String line = null;
		switch (a) {
		case 0:
			line = board[0] + board[1] + board[2];
			break;
		case 1:
			line = board[3] + board[4] + board[5];
			break;
		case 2:
			line = board[6] + board[7] + board[8];
			break;
		case 3:
			line = board[0] + board[3] + board[6];
			break;
		case 4:
			line = board[1] + board[4] + board[7];
			break;
		case 5:
			line = board[2] + board[5] + board[8];
			break;
		case 6:
			line = board[0] + board[4] + board[8];
			break;
		case 7:
			line = board[2] + board[4] + board[6];
			break;
		}
		if (line.equals("XXX")) {
			return "X";
		} else if (line.equals("OOO")) {
			return "O";
		}
	}

	for (int a = 0; a < 9; a++) {
		
		if (Arrays.asList(board).contains(String.valueOf(a+1))) {
			break;
		}
		else if (a == 8) return "draw";
	}

	//String turn = "X";
	System.out.println(turn + "'s turn; enter a slot number to place " + turn + " in:");
	return null;
}

//This method is used to print the board 

public static void printBoard(String[] board) {

	System.out.println("/------|------|------\\");
	System.out.println("| " + board[0] + " | " + board[1] + " | " + board[2] + " |");
	System.out.println("|----------------------");
	System.out.println("| " + board[3] + " | " + board[4] + " | " + board[5] + " |");
	System.out.println("|----------------------");
	System.out.println("| " + board[6] + " | " + board[7] + " | " + board[8] + " |");
	System.out.println("/------|------|------\\");
}

//this is board instruction
public static void isEmptyBoard(String[] board) {
	for (int a = 0; a < 9; a++) {
		
		board[a] = String.valueOf(a+1);
}
	
}

























}









