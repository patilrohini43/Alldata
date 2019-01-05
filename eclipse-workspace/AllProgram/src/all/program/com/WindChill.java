/***
* Created by:Rohini Patil
* Date 17/12/2018
* Purpose:Takes two double command­line arguments t and v and prints the wind chill

**/

package all.program.com;

import all.program.utility.*;
public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Utility u=new Utility();
    //accept the value of temperature
	System.out.println("Enter the temperature t (in Fahrenheit)");
	// double value oftemperature in fahreinheit
	double temp=u.inputDouble();
	
	//accept the value of speed
	  System.out.println("Enter he wind speed v (in miles per hour)");
	  //the double value of windspeed in mile per hour
	  double speed=u.inputDouble();
	  u.windChill(temp, speed);
	}
	
}
