package conditional_states_in_java;

import java.util.Scanner;

public class conditional_states_in_javaa {
       public static void main(String[] args) {
    	  // Scanner scanner=new Scanner(System.in);
    	  // System.out.println("comparison operators;");
    	   //comparison operators
    	   /*
    	   ==  equal
    	   !=  not equal
    	   >   Is it big
    	   >=  greater than or equal to
    	   <   ıs it small
    	   <=  smaller or equal
    	   */
    	 //outputs true or false according to the comparison state.
    	   /*
    	   System.out.println(3==3);
    	   System.out.println(3!=3);
    	   System.out.println(3>3);
    	   System.out.println(3>=3);
    	   System.out.println(3<3);
    	   System.out.println(3<=3);
    	   System.out.println("hello"=="hello");
    	   System.out.println("logical operators;");
    	   */
    	   //logical operators
    	   /*
    	    &&  and
    	    ||  or
    	    !   not
    	     */
    	   /*
    	   System.out.println(3<3 && 3>=4);
    	   System.out.println(3<3 || 3>=4);
    	   System.out.println(!(3<3 || 3>=4));
    	   System.out.println(!true);
    	   */
    	   //if else if else usage in java
    	   /*
    	   if(condition) {
    		   the procedures to be done here.
    	   }
    	   }
    	   else if(condition) {
    		   try this if the top condition does not exist (you can increase the conditions by saying else if)
    		   
    	   } 
    	   
  	       else {
    		    what to do if no conditions are met
    	   
           }
           */
           //body mass index application
    	   /*
           double size;
           int weight;
           System.out.println("what is your weight:");
           weight=scanner.nextInt();
           System.out.println("what is your size (example:1,75):");
           size=scanner.nextDouble();
           double bmi=(weight/(size*size));
           if(bmi<18.5) {
        	   System.out.println("weak");
           }
           else if(bmi>=18.5 && bmi<25) {
        	   System.out.println("normal");
           }
           else if(bmi>=25 && bmi<30) {
        	   System.out.println("overweight");
           }
           else {
        	   System.out.println("obesity");
           }
           */
    	   //switch case structures(the number of cases can be increased)
    	   /*
    	    switch(anything ){
    	    case situation1:
    	 the procedures to be done here.
    	    break;
    	    case situation2:
    	   the procedures to be done here.
    	    break;
    	    case situation3:
    	 the procedures to be done here.
    	    break;
    	    default(Do this if the above conditions do not comply.):
    	   the procedures to be done here.
    	    break;
    	    }
    	    */
           // simple calculator
    	   /*
    	   int process;
    	   int number1;
    	   int number2;
    	   
    System.out.println("Welcome to the calculator app:");
    System.out.println("***********************************************");	   
    System.out.println("Click 1 to add 2 numbers\n2 to subtract 2\n3 to divide 3\n4 to multiply");
    System.out.println("**********************************************");
    System.out.println("select process:");
    process =scanner.nextInt();
    switch(process) {
    case 1:
    System.out.println("Enter the 1st number:");
    number1=scanner.nextInt();
    System.out.println("Enter the 2nd number:");
    number2=scanner.nextInt();
    System.out.println("add="+(number1+number2));
    break;
    case 2:
    System.out.println("Enter the 1st number:");
    number1=scanner.nextInt();
    System.out.println("Enter the 2nd number:");
    number2=scanner.nextInt();
    System.out.println("to subtract ="+(number1-number2));
    break;
    case 3:
    System.out.println("Enter the 1st number:");
    number1=scanner.nextInt();
    System.out.println("Enter the 2nd number:");
    number2=scanner.nextInt();
    System.out.println("to divide="+(number1/number2));
    break;
    case 4:
    System.out.println("Enter the 1st number:");
    number1=scanner.nextInt();
    System.out.println("Enter the 2nd number:");
    number2=scanner.nextInt();
    System.out.println("to multiply="+(number1*number2));
    break;
    default:
    	System.out.println("invalid operation please enter the program again and use one of the 1,2,3,4 buttons...");
    }
    */    
}
}
