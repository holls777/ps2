package MainPackage;
class MyInteger{
	int value; 
	
	MyInteger(int newValue) {
		value=newValue;
		}
	public int getValue() {
		return value;
		}

	public  boolean isEven() {
        if (value % 2 == 0) 
            return true;
        return false;
    	}
	
	public boolean isOdd() {
        if (value % 2==1)
            return true;
        return false;  
    	}
	
	 public  boolean isPrime() {
	        for (int divisor = 2; divisor <= value / 2; divisor++) //note: remember divisor thing exists, it's surprisingly useful
	            if (value % divisor == 0) 
	                return false; 
	        return true;
			}
	public static boolean isEven(MyInteger input1) {
		        return input1.isEven();
		    }
	
	public static boolean isOdd(MyInteger input2) {
		        return input2.isOdd();
		    }

	public static boolean isPrime(MyInteger input3) {
		        return input3.isPrime();
		    }

	public boolean equals (MyInteger input4) { 
        if(input4.value==value) 
            return true;
        return false;
    		}
	
	public static int parseInt(String s) {
		        return Integer.parseInt(s);
		    }

	
	public static int parseInt(char[] input5){
		return parseInt(new String(input5));

			}
	
	}

