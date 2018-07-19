import java.rmi.StubNotFoundException;
import java.util.Optional;

import com.exception.StudentNotFound;

public class OptionalExample {
	 public static void main(String args[]) {
		 OptionalExample java8Tester = new OptionalExample();
	      Integer value1 = null;
	      Integer value2 = new Integer(10);
			
	      //Optional.ofNullable - allows passed parameter to be null.
	      Optional<Integer> a = Optional.ofNullable(value1);
			System.out.println(a.orElse(1));
	      //Optional.of - throws NullPointerException if passed parameter is null
	      Optional<Integer> b = Optional.of(value2);
	      Integer sum=java8Tester.sum(a,b);
	      
	      System.out.println(sum +" fajopp");
	   }
		
	   public Integer sum(Optional<Integer> a, Optional<Integer> b) {
	      //Optional.isPresent - checks the value is present or not
	      System.out.println("First parameter is present: " + a.isPresent());
	      System.out.println("Second parameter is present: " + b.isPresent());
			
	      //Optional.orElse - returns the value if present otherwise returns
	      //the default value passed.
	      Integer value1 = a.orElse(new Integer(0));
	  	try {
	  		if(value1==0)
				throw new StudentNotFound("Value is zero:"+value1);
			} catch (StudentNotFound e) {
				// TODO Auto-generated catch block
				
				e.printStackTrace();
			}
	  	System.out.println("stepping>>>>");
			Integer value2=b.orElse(new Integer(0));
	      //Optional.get - gets the value, value should be present
	      //Integer value2 = b.get();
	      return value1 + value2;
	   }
}
