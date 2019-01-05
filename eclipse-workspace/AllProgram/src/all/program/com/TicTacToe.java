package all.program.com;

import all.program.utility.Utility;

public class TicTacToe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Utility u=new Utility();
	System.out.println("=======================================================");
     System.out.println("***************WelCome To TicTacToe*****************");
     System.out.println("=======================================================");
     System.out.println("player 1 will be the computer :O");
     //accept the name of player 2 
     
     System.out.println("Enter name of player2 ");
     //store the name of player 2
     String name=u.inputString();
     //calling this method to play game tictacteo
     u.gameTictac(name);
     
	}

}
