// Write a program that uses Math.sin() and Math.cos() to check that the value of 
// sin2θ + cos2θ is approximately 1 for any θ entered as a command-line argument. 
// Just print the value. Why are the values not always exactly 1?

class SinCos{

public static void main (String[]arg){

	Double argument;
	Double sinus;
	Double cosinus;
	Double result;

	// try{

	argument=Double.parseDouble(arg[0]);

	//argument= Math.toRadians(argument); // convert to radians
	
	sinus = Math.pow(Math.sin(argument),2);
	cosinus = Math.pow(Math.cos(argument),2);

	//result=Math.sin(arg)+Math.cos(arg);


	result = sinus+cosinus;

	System.out.println(result);



// } catch (Exception e){
//  System.out.println("Incorrect arguments format or arguments number.\nPlease, use the following format:\n java SinCos arg[0]\n Be careful! arg[0]");
// }
}
}