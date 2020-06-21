import java.util.Scanner;

public class AssignmentOneF17
{
    public static void main(String[] args)
    {
	Scanner scan = new Scanner (System.in);

	boolean start = true; // boolean for the first loop - scanner 		

	
	do { 	// do while loop for getting 5 different input hands

        String hand = scan.next();
	
	if (hand.equals("quit")) //condition to quit the program
	    {
		start = false;
	    }

	else 
	    {
       	char suitFirst = hand.charAt(1); // indicating the suit of the first card

	char rankFirst = hand.charAt(0); // indicating the number of the first card
	
	char rankSecond = hand.charAt(2); // indicating the number of the second card

	char rankThird = hand.charAt(4); // indicating the number of the third card

	char rankFourth = hand.charAt(6); //indicating the number of the fourth card

	char rankFifth = hand.charAt(8); // indicating the number of the fifth card
	
       
	//FLUSH
	boolean f = true;	// boolean for the loop - checking flush

        int i = 3;

	while (i < 10 && f == true) // while loop for checking characters at odd number positions
	    {
		if (suitFirst == hand.charAt(i))
		    {
			i = i + 2;
		    }
		else 
		    {
			f = false;
		    }	    
	    }

	if (f == true)
	{
	    System.out.println("flush");
	}

	//FOUR OF A KIND
        else if (rankFirst == rankSecond && rankFirst == rankThird && rankFirst == rankFourth)
	    {
	       	System.out.println("four of  a kind");
	    }
	else if (rankFirst == rankSecond && rankFirst == rankThird && rankFirst == rankFifth)
	    {
	       	System.out.println("four of  a kind");
	    }
	else if (rankFirst == rankSecond && rankFirst == rankFourth && rankFirst == rankFifth)
	    {
	       	System.out.println("four of  a kind");
	    }
        else if (rankFirst == rankThird && rankFirst == rankFourth && rankFirst == rankFifth) 
	    {
	       	System.out.println("four of  a kind");
	    }
	else if (rankSecond == rankThird && rankSecond == rankFourth && rankSecond == rankFifth)
	    {
	       	System.out.println("four of  a kind");
	    }

       	//FULL HOUSE
       	else if (rankFirst == rankSecond && rankFirst == rankThird && rankFourth == rankFifth)
	    {
		 System.out.println("full house");
	    }
	
	else if (rankFirst == rankSecond && rankFirst == rankFourth && rankThird == rankFifth) 
	    {
		 System.out.println("full house");
	    }

	else if (rankFirst == rankSecond && rankFirst == rankFifth && rankThird == rankFourth) 
	    {
		 System.out.println("full house");
	    }

	else if (rankFirst == rankThird && rankFirst == rankFourth && rankSecond == rankFifth)
	    {
		 System.out.println("full house");
	    }

	else if (rankFirst == rankThird && rankFirst == rankFifth && rankSecond == rankFourth)
	    {
		 System.out.println("full house");
	    }

	else if (rankFirst == rankFourth && rankFirst == rankFifth && rankSecond == rankThird)
	    {
		 System.out.println("full house");
	    }       	

	else if (rankSecond == rankThird && rankSecond == rankFourth && rankFirst == rankFifth) 
	    {
		 System.out.println("full house");
	    }

	else if (rankSecond == rankThird && rankSecond == rankFifth && rankFirst == rankFourth)
	    {
		 System.out.println("full house");
	    }

	else if (rankSecond == rankFourth && rankSecond == rankFifth && rankFirst == rankThird)
	    {
		 System.out.println("full house");
	    }

	else if (rankThird == rankFourth && rankThird == rankFifth && rankFirst == rankSecond)
	    {
		 System.out.println("full house");
	    }

       	//THREE OF A KIND
       	else if (rankFirst == rankSecond && rankFirst == rankThird)
	    {
	      	System.out.println("three of a kind");
	    }

	else if (rankFirst == rankSecond && rankFirst == rankFourth)
	    {
	      	System.out.println("three of a kind");
	    }

	else if (rankFirst == rankSecond && rankFirst == rankFifth) 
	    {
	      	System.out.println("three of a kind");
	    }

	else if (rankFirst == rankThird && rankFirst == rankFourth)  
	    {
	      	System.out.println("three of a kind");
	    }

	else if (rankFirst == rankThird && rankFirst == rankFifth)  
	    {
	      	System.out.println("three of a kind");
	    }

	else if (rankFirst == rankFourth && rankFirst == rankFifth)  
	    {
	      	System.out.println("three of a kind");
	    }

	else if (rankSecond == rankThird && rankSecond == rankFourth) 
	    {
	      	System.out.println("three of a kind");
	    }

	else if (rankSecond == rankThird && rankSecond == rankFifth) 
	    {
	      	System.out.println("three of a kind");
	    }

	else if (rankSecond == rankFourth && rankSecond == rankFifth)
	    {
	      	System.out.println("three of a kind");
	    }

	else if (rankThird == rankFourth && rankThird == rankFifth)
	    {
	      	System.out.println("three of a kind");
	    }

	//PAIR
       	else if (rankFirst == rankSecond)
	    {
       		System.out.println("pair");
	    }

	else if (rankFirst == rankThird) 
	    {
       		System.out.println("pair");
	    }

	else if (rankFirst == rankFourth)
	    {
       		System.out.println("pair");
	    }

	else if (rankFirst == rankFifth)
	    {
       		System.out.println("pair");
	    }

	else if (rankSecond == rankThird) 
	    {
       		System.out.println("pair");
	    }

	else if (rankSecond == rankFourth)
	    {
       		System.out.println("pair");
	    }

        else if (rankSecond == rankFifth)	
	    {
       		System.out.println("pair");
	    }

        else if (rankThird == rankFourth) 
	    {
       		System.out.println("pair");
	    }

        else if (rankThird == rankFifth) 
	    {
       		System.out.println("pair");
	    }

        else if (rankFourth == rankFifth)
       	    {
       		System.out.println("pair");
       	    }   

	    }
	
	}while (start == true);

    }	    
    
}
