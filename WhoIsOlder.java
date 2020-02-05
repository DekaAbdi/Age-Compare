/*
 * This programs determines who is older between 2 people
 */
import java.util.Scanner;

public class WhoIsOlder {
	public static void main( String[] args )
  {
   Scanner input = new Scanner(System.in);
			int date;
			int month;
			int year = 1900;
			
		boolean leapYear;	
	    leapYear = (year%4 == 0);
		leapYear = leapYear && ( year%100 != 0);
		leapYear = leapYear || ( year%400 == 0);
		
			int friendsDate;
			int friendsMonth;
			int friendsYear = 1900;
	   boolean friendLeapYear = (friendsYear%4 == 0);
			friendLeapYear = friendLeapYear && (friendsYear%100!= 0);
			friendLeapYear = friendLeapYear || (friendsYear%400 == 0);
			
	      System.out.println( "Enter the year you were born" );
		  year = input.nextInt();
		   System.out.println( "Enter the month you were born " );
		   month = input.nextInt();
		   System.out.println( "Enter the day you were born" );
		   date = input.nextInt();
		  
		if (year < 1900 || year > 2018) 
		  System.out.println( "Enter your year correctly" );
		else 
		if (month < 1 || month > 12 )
			System.out.println( "Enter your month correctly" );
		else
		if (month == 1 || month == 3 || month == 5 || month == 7 || month ==8 || month == 10 || month == 12) 
			{
			  if( date < 1 || date > 31 ) 
				 System.out.println( "Enter correct date" );		
				}
		 else 
		 if(month == 4 || month == 6 || month == 9 || month == 11)
		  {
		    if( date < 1 || date > 30 ) 
			 System.out.println( "Enter correct date" );	
		   }
		 else
		 if((leapYear == true) && (date < 1 || date > 29)) 
			 System.out.println( "Enter correct date" );	
		 else
			 if (leapYear == false) 
				 if (date < 1 && date > 28)
			    System.out.println( "Enter correct date" );
		
	      
	     System.out.println( "Enter the year your friend was born" );
		friendsYear = input.nextInt();
	     System.out.println( "Enter the month your friend was born " );
	     friendsMonth = input.nextInt();
	    System.out.println( "Enter the day your day was born" );
	    friendsDate = input.nextInt();

		
	    if (friendsYear < 1900 || friendsYear > 2018) 
			  System.out.println( "Enter your friend's year correctly" );
			else 
			if (friendsMonth < 1 ||friendsMonth > 12 )
				System.out.println( "Enter your friend's Month correctly" );
			else
			if (friendsMonth == 1 || friendsMonth == 3 ||friendsMonth == 5 ||friendsMonth== 7 || friendsMonth ==8 ||friendsMonth == 10 || friendsMonth == 12) 
				{
				  if( friendsDate < 1 || friendsDate > 31 ) 
					 System.out.println( "Enter correct date" );		
					}
			 else 
			 if(month == 4 || month == 6 || month == 9 || month == 11)
			  {
			    if( friendsDate < 1 || friendsDate > 30 ) 
				 System.out.println( "Enter correct date" );	
			   }
			 else
			 if((leapYear == true) && (friendsDate < 1 ||friendsDate > 29)) 
				 System.out.println( "Enter correct date" );	
			 else
				 if (leapYear == false) 
					 if (friendsDate < 1 && friendsDate > 28)
				    System.out.println( "Enter correct date" );
			
		
	
  } 
}
