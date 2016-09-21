/*@author Ahmed Alsabbah
date: 08/30/16
period 1
*/

public class Calculate {
	
	public static double square (double number) { //squares a number
		return(number * number);
	}
	
	public static double cube (double number) { //cubes a number
		return(number * number * number);
	}
	
	public static double average (double n1, double n2) { //finds the average of two numbers
		return((n1 + n2) / 2);
	}
	
	public static double average (double n1, double n2, double n3) { //finds the average of three numbers
		return((n1 + n2 + n3) / 3);
    }
	
	public static double toDegrees (double number) { //converts from radians to degrees
		return(number * (180 / 3.14159));
    }
	
	public static double toRadians (double number) { //converts from degrees to radians
		return(number * (3.14159 / 180));
    }
	
	public static double discriminant (double a, double b, double c) { //finds the discriminant of a, b, c
		return((b * b) - 4 * a * c);
    }
	
	public static String toImproperFrac (int n, int nu, int de) { //converts mixed numbers to improper fractions
		int part = n * de + nu;
		return(part + "/" + de);
	}
	
	public static String toMixedNum (int nu, int de) {
		int part = nu / de;
		return (part + "_" + (nu % de) + "/" + de);
	}
	
	public static String foil (int a, int b, int c, int d, String n) {
		int first = a * c;
		int outin = a * d + b * c;
		int last = b * d;
		return(first + "n" + "^2 + " + outin + n + " + " + last);
    }
	
	public static boolean isDivisibleBy (int n1, int n2) {
		if (n1 % n2 == 0) {
		return(true);
		}
		else {
		return false;
		}
	}
	
	public static double absValue (double number) {
		if (number < 0) {
		return(number * -1);
		}
		else {
		return(number); 
		}
	}
	
	public static int max (int n1, int n2) {
		if (n1 > n2) {
		return(n1);
		}
		else {
		return(n2);
		}
	}
	
	public static double max (double n1, double n2, double n3) {
			if(n1 > n2 && n1 > n3) {
				return (n1);
			}
			else if(n2 > n1 && n2 > n3) {
				return (n2);
			}
			else {
				return (n3);
			}
	}
	
	public static int min (int n1, int n2) {
		if (n1 < n2) {
			return(n1);
		}
		else {
			return(n2);
		}
	}
	
	public static double round2 (double n1) {
		double add = n1 + 0.005;
		double times = add * 100;
		int div = (int) times / 100;
		return(div);
	}

	public static double exponent(double x, int y){
		int n1 = 0;
		double answer = 1;
		while(n1 <= 0){
			answer = answer * x;
		}
		return (answer);
	}
	
	public static int factorial(int n1) {
		int answer = 1;
		for (int i = 1; i <= n1; i++)  {
		answer = answer * i;
		}
		return answer;
	}
	
	public static boolean isPrime (int n1) {
	    for(int i = 2; i < n1; i++) {
	        if(n1 % i == 0) {
	            return (false);
	    }
	    	}
	    return(true);
	}
	    
	public static int gcf(int n1, int n2) { 
		int g = 1;
			if(n1 > n2) {
				for(int i = n2; i >= 1; i--) { 
					if(n1 % n2 == 0 && n2 % i == 0) { 
	return i;
			} 
				} 
					} 
	else { 
		for(int k = n1; k >= 1; k--) {
			  if(n1 % k == 0 && n2 % k == 0) {
	                return k;
	          }
	    }
	}   
	    return g;
	}
		
	public static double sqrt(double n) {
	return Math.sqrt(n);
	}
}

