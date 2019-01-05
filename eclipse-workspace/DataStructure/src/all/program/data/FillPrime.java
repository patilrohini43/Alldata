package all.program.data;

import java.io.*;

import all.program.utility.Utility;
class FillPrime
{
  
    
  public static void main(String args[])throws IOException
  {
      FillPrime ob = new FillPrime();
      PrimeMethod p=new PrimeMethod();
      Utility u=new  Utility();
    
      int m=5,n=5;
      p.primMethods(m, n);
      
       //u.isanagram(n1, n2);
  }
}
