package Unit03;
//finally always run means
//1. if there is no exception finally would run
//2. if there is exception finally would run
//if compiler  accessed the program in compile time then compiler will 

//if any exception bypasses the compiler process and break at run time then it is
//called checked exception
public class sample {

	public static void main(String[] args) {
	//	try {
		//	int b=0;
		//	int a = 100/b;
	//	}catch (ArithmeticException e) {
		//	System.out.println(e.getMessage());
		//}
	//	catch (Exception e) {
		//	System.out.println(e.getMessage());
	//	}
		//finally {
			//System.out.println("The try catch block is finished");
	//	}
	
		int a = 100/0;
	    if(a<10)
	    {
	    	throw new IOException();
	    }
	}

}