package all.program.data;

public class CalenderMethod {
	
	Calender c=new Calender();
	//check leap year or not
	public static boolean leapYear(int year)
	{

        if(((year % 4 == 0) && !(year % 100 == 0)) || (year % 400 == 0))
        {
            return true;
        }
        else
        {
            return false;
        }
		
	}
	
		//This function match weekday name and return to weekday no
	public int findDay(String day)
	{
		
        String days[] = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", 
        "Saturday"};
         int f = 0;
          for(int i=0; i<7; i++)
            {
             if(day.equalsIgnoreCase(days[i]))
                 {
                       f = i;  //Saving week day no. given day (e.g. 0 for Sunday)
                 }
             }
          return f;
	
		
	}
	
	//This Function to match the given month and return its maximum days
    int findMaxDay(String month, int year)
    {
        String months[] = {"","January", "February", "March", "April", "May", "June", 
                            "July", "August", "September", "October", "November", "December"};
        int D[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
         
        if((year%400==0) || ((year%100!=0)&&(year%4==0)))
        {
            D[2]=29;
        }
        int max = 0;
        for(int i=1; i<=12; i++)
        {
            if(month.equalsIgnoreCase(months[i]))
            {
                max = D[i];  //Saving maximum day of given month
            }
        }
        return max;
    }
	//This Function for creating the calendar
    void fillCalendar(int max, int f, String month, int year)
    {
        int A[][] = new int[6][7];
        int x = 1, z = f;
     
        for(int i=0;i<6;i++)
        {
            for(int j=f; j<7; j++)
            {
                if(x<=max)
                {
                    A[i][j] = x;
                    x++;
                }
            }
            f = 0;
        }
         
        for(int j=0; j<z; j++) //Adjustment to bring last (6th) row elements to first row
        {
            A[0][j]=A[5][j];
        }    
         
        printCalendar(A, month, year); //Calling function to print the calendar
    }
     
  //Function for printing the calendar
    void printCalendar(int A[][], String mname, int y)
    {  
        System.out.println("\n\t----------------------------------------------------");
        System.out.println("\t\t\t   "+mname+" "+y); 
        System.out.println("\t----------------------------------------------------"); 
        System.out.println("\tSUN\tMON\tTUE\tWED\tTHU\tFRI\tSAT");
        System.out.println("\t----------------------------------------------------"); 
         
        for(int i = 0; i < 5; i++)
        {
            for(int j = 0; j < 7; j++)
            {
                if(A[i][j]!=0)
                    System.out.print("\t "+A[i][j]);
                else
                    System.out.print("\t ");
            }
            System.out.println("\n\t----------------------------------------------------"); 
        }
    }
	
	
	
	
	
	

}
