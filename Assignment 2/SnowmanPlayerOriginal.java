import java.util.*;

public class SnowmanPlayer
{
    private static int[] vowelFrequencies = new int[6]; //number of frequencies each letter occur (vowel)                            
    private static int[] consonantsFrequencies = new int[20]; //number of frequencies each letter occur (consonant)               
    private static ArrayList <String> totalWords = new ArrayList<String>(); // Store words used in the game (within the range of the minimum and maximum length)  
    private static ArrayList <String> finalWords = new ArrayList<String>(); // Store words of a certain length to be tested    
    private static ArrayList <String> possibleWords = new ArrayList<String>();
    private static ArrayList <String> possibleWords2 = new ArrayList<String>();
    private static ArrayList <String> possibleWords3 = new ArrayList<String>();
    private static ArrayList <String> possibleWords4 = new ArrayList<String>();
    private static ArrayList <String> possibleWords5 = new ArrayList<String>();
    private static ArrayList <String> possibleWords6 = new ArrayList<String>();
    private static ArrayList <String> possibleWords7 = new ArrayList<String>();
    private static ArrayList <String> possibleWords8 = new ArrayList<String>();
    private static ArrayList <String> possibleWords9 = new ArrayList<String>();
    private static ArrayList <String> possibleWords10 = new ArrayList<String>();
    private static ArrayList <String> possibleWords11 = new ArrayList<String>();
    private static ArrayList <String> possibleWords12 = new ArrayList<String>();
    private static ArrayList <String> possibleWords13 = new ArrayList<String>();
    private static ArrayList <String> possibleWords14 = new ArrayList<String>();
    private static ArrayList <String> possibleWords15 = new ArrayList<String>();
    private static ArrayList <String> possibleWords16 = new ArrayList<String>();
    private static ArrayList <String> possibleWords17 = new ArrayList<String>();
    private static ArrayList <String> possibleWords18 = new ArrayList<String>();
    private static ArrayList <String> possibleWords19 = new ArrayList<String>();
    private static ArrayList <String> possibleWords20 = new ArrayList<String>();
    private static ArrayList <String> possibleWords21 = new ArrayList<String>();
    private static ArrayList <String> possibleWords22 = new ArrayList<String>();
    private static ArrayList <String> possibleWords23 = new ArrayList<String>();
    private static ArrayList <String> possibleWords24 = new ArrayList<String>();
    private static ArrayList <String> possibleWords25 = new ArrayList<String>();
    private static ArrayList <String> possibleWords26 = new ArrayList<String>();
    private static ArrayList <String> possibleWords27 = new ArrayList<String>();
   
    
    public static String getAuthor()
    {
        return "Levina, Felicia";
    }

    public static void startGame(String[] words, int minLength, int maxLength, String allowedChars)
    {
        for (int i = 0; i < words.length; i++)
            {
                String test = words[i]; // Words that are tested whether between minimum and maximum length (they are added to the array list if they fit condition)                

                if (test.length() >= minLength && test.length() <= maxLength)
                    {
                        totalWords.add(test);
                    }
            }
    }

    public static void startNewWord(int length)
    {
        for (int i = 0; i < totalWords.size(); i++)
            {
                String test1 = totalWords.get(i); // Words used to test whether they're equal to the length of the new possible word                                                

                if (test1.length() == length)
                    {
                        finalWords.add(test1);
                    }
            }
    }


    public static char guessLetter(String pattern, String previousGuesses)
    {
	char result = 'a';
	int highest = 0;
	int letterPosition = 0;
	boolean match = false; 
	
	if (previousGuesses.length() == 0)
	    {
		vFrequencies(finalWords);

		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
	    }
    
	if (previousGuesses.length() == 1)
	    {
		match = false;

		for (int i = 0; i < pattern.length(); i++)
		    {
			if (pattern.charAt(i) == previousGuesses.charAt(0))
			    {
				match = true;
				break;
			    }
		    }
	    
	
		if (previousGuesses.length() == 1 && match == true)
		    {		
			for (int k = 0; k < finalWords.size(); k++)
			    {
				String test = finalWords.get(k);
				
				for (int i = 0; i < pattern.length() && i < test.length(); i++)
				    {
					if (previousGuesses.charAt(0) == pattern.charAt(i)) 
					    {
						letterPosition = i;
						
						if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
						    {
							possibleWords.add(test);
						    }
					    }
				    }	    
			    }	    

                        vFrequencies(possibleWords);
                        subtractFrequencies(previousGuesses);
                        highest = 0;

                        for (int i = 0; i < vowelFrequencies.length; i++)
                            {
                                if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
                                    {
                                        highest = vowelFrequencies[i];
                                    }
                            }

                        if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
                            {
                                result = 'a';
                            }
                        else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
                            {
                                result = 'e';
                            }
                        else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
                            {
                                result = 'i';
                            }
                        else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
                            {
                                result = 'o';
                            }
                        else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
                            {
                                result = 'u';
                            }
                        else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
                            {
                                result = 'y';
                            }
		    }	    	
		
		else if (previousGuesses.length() == 1 && match == false)
		    {
			for (int k = 0; k < finalWords.size(); k++)
			    {
				String test = finalWords.get(k);
				
				for (int i = 0; i < test.length(); i++)
				    {
					if (test.charAt(i) == previousGuesses.charAt(0))
					    {
						finalWords.remove(test);
					    }
				    }
			    }
			
			for (int i = 0; i < finalWords.size(); i++)
			    {
				possibleWords.add(finalWords.get(i));
			    }
			
			vFrequencies(possibleWords);
			subtractFrequencies(previousGuesses);
			highest = 0;

			for (int i = 0; i < vowelFrequencies.length; i++)     
			    {
				if (vowelFrequencies[i] > highest)
				    {
					highest = vowelFrequencies[i];
				    }
			    }
	       		
			if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
			    {
				result = 'a';
			    }
			else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
			    {
				result = 'e';
			    }
			else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
			    {
				result = 'i';
			    }
			else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
			    {
				result = 'o';
			    }
			else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
			    {
				result = 'u';
			    }
			else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
			    {
				result = 'y';
			    }	    
		    }
	    }


	if (previousGuesses.length() == 2)
	    {
		match = false;
		
		for (int i = 0; i < pattern.length(); i++)
		    {
			if (pattern.charAt(i) == previousGuesses.charAt(1))
			    {
				match = true;
				break;
			    }
		    }
		
		if (previousGuesses.length() == 2 && match == true)
		    {
			for (int k = 0; k < possibleWords.size(); k++)
			    {
				String test = possibleWords.get(k);
				
				for (int i = 0; i < pattern.length() && i < test.length(); i++)
				    {
					if (previousGuesses.charAt(1) == pattern.charAt(i)) 
					    {
						letterPosition = i;
						
						if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
						    {
							possibleWords2.add(test);
						    }
					    }
				    }	    
			    }

                        vFrequencies(possibleWords2);
                        subtractFrequencies(previousGuesses);
                        highest = 0;

                        for (int i = 0; i < vowelFrequencies.length; i++)
                            {
                                if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
                                    {
                                        highest = vowelFrequencies[i];
                                    }
                            }

                        if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
                            {
                                result = 'a';
                            }
                        else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
                            {
                                result = 'e';
                            }
                        else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
                            {
                                result = 'i';
                            }
                        else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
                            {
                                result = 'o';
                            }
                        else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
                            {
                                result = 'u';
                            }
                        else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
                            {
                                result = 'y';
                            }
		    }
		
		else if (previousGuesses.length() == 2 && match == false)
		    {
			for (int k = 0; k < possibleWords.size(); k++)
			    {
				String test = possibleWords.get(k);
				
				for (int i = 0; i < test.length(); i++)
				    {
					if (test.charAt(i) == previousGuesses.charAt(1))
					    {
						possibleWords.remove(test);
					    }
				    }
			    }
			
			for (int i = 0; i < possibleWords.size(); i++)
			    {
				possibleWords2.add(possibleWords.get(i));
			    }
			
			vFrequencies(possibleWords2);
			subtractFrequencies(previousGuesses);
			
			highest = 0;
			for (int i = 0; i < vowelFrequencies.length; i++)     
			    {
				if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
				    {
					highest = vowelFrequencies[i];
				    }
			    }
	       		
			if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
			    {
				result = 'a';
			    }
			else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
			    {
				result = 'e';
			    }
			else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
			    {
				result = 'i';
			    }
			else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
			    {
				result = 'o';
			    }
			else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
			    {
				result = 'u';
			    }
			else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
			    {
				result = 'y';
			    }	    
		    }
	    }

	if (previousGuesses.length() == 3)
	    {
		
		match = false;
		
		for (int i = 0; i < pattern.length(); i++)
		    {
			if (pattern.charAt(i) == previousGuesses.charAt(2))
			    {
				match = true;
				break;
			    }
		    }
		
		if (previousGuesses.length() == 3 && match == true)
		    {
			for (int k = 0; k < possibleWords2.size(); k++)
			    {
				String test = possibleWords2.get(k);
				
				for (int i = 0; i < pattern.length() && i < test.length(); i++)
				    {
					if (previousGuesses.charAt(2) == pattern.charAt(i)) 
					    {
						letterPosition = i;
						
						if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
						    {
							possibleWords3.add(test);
						    }
					    }
				    }	    
			    }	

			cFrequencies(possibleWords3);

			for (int i = 0; i < consonantsFrequencies.length; i++)
                            {
                                if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
                                    {
                                        highest = consonantsFrequencies[i];
                                    }
                            }

			if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
                            {
                                result = 'b';
                            }
                        else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
                            {
                                result = 'c';
                            }
                        else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
                            {
                                result = 'd';
                            }
                        else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
                            {
                                result = 'f';
                            }
                        else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
                            {
                                result = 'g';
                            }
                        else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
                            {
                                result = 'h';
                            }
                        else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
                            {
                                result = 'j';
                            }
                        else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
                            {
                                result = 'k';
                            }
                        else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
			    {
                                result = 'l';
                            }
                        else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
                            {
                                result = 'm';
                            }
                        else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                            {
                                result = 'n';
                            }
                        else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                            {
                                result = 'p';
                            }
                        else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                            {
                                result = 'q';
                            }
                        else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                            {
                                result = 'r';
                            }
                        else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                            {
                                result = 's';
                            }
                        else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                            {
                                result = 't';
                            }
                        else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                            {
                                result = 'v';
                            }
                        else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                            {
                                result = 'w';
                            }
                        else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                            {
                                result = 'x';
                            }
                        else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                            {
                                result = 'z';
                            }
		    }	    	
		
		else if (previousGuesses.length() == 3 && match == false)
		    {
			for (int k = 0; k < possibleWords2.size(); k++)
			    {
				String test = possibleWords2.get(k);
				
				for (int i = 0; i < test.length(); i++)
				    {
					if (test.charAt(i) == previousGuesses.charAt(2))
					    {
						possibleWords2.remove(test);
					    }
				    }
			    }
			
			for (int i = 0; i < possibleWords2.size(); i++)
			    {
				possibleWords3.add(possibleWords2.get(i));
			    }
			
			vFrequencies(possibleWords3);
			cFrequencies(possibleWords3);
			subtractFrequencies(previousGuesses);
			highest = 0;			

			for (int i = 0; i < vowelFrequencies.length; i++)     
			    {
				if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
				    {
					highest = vowelFrequencies[i];
				    }
			    }
			
			for (int i = 0; i < consonantsFrequencies.length; i++)
			    {
				if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
				    {
					highest = consonantsFrequencies[i];
				    }
			    }
	       		
			if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
			    {
				result = 'a';
			    }
			else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
			    {
				result = 'e';
			    }
			else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
			    {
				result = 'i';
			    }
			else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
			    {
				result = 'o';
			    }
			else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
			    {
				result = 'u';
			    }
			else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
			    {
				result = 'y';
			    }
			else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
			    {
				result = 'b';
			    }
			else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
			    {
				result = 'c';
			    }
			else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
			    {
				result = 'd';
			    }
			else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
			    {
				result = 'f';
			    }
			else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
			    {
				result = 'g';
			    }
			else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
			    {
				result = 'h';
			    }
			else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
			    {
				result = 'j';
			    }
			else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
			    {
				result = 'k';
			    }
			else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
			    {
				result = 'l';
			    }
			else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
			    {
				result = 'm';
			    }
			else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
			    {
				result = 'n';
			    }
			else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
			    {
				result = 'p';
			    }
			else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
			    {
				result = 'q';
			    }
			else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
			    {
				result = 'r';
			    }
			else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
			    {
				result = 's';
			    }
			else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
			    {
				result = 't';
			    }
			else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
			    {
				result = 'v';
			    }
			else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
			    {
				result = 'w';
			    }
			else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
			    {
				result = 'x';
			    }
			else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
			    {
				result = 'z';
			    }
		    }
	    }


	if (previousGuesses.length() == 4)
	    {
		match = false;
		
		for (int i = 0; i < pattern.length(); i++)
		    {
			if (pattern.charAt(i) == previousGuesses.charAt(3))
			    {
				match = true;
				break;
			    }
		    }
		
		if (previousGuesses.length() == 4 && match == true)
		    {
			for (int k = 0; k < possibleWords3.size(); k++)
			    {
				String test = possibleWords3.get(k);
				
				for (int i = 0; i < pattern.length() && i < test.length(); i++)
				    {
					if (previousGuesses.charAt(3) == pattern.charAt(i)) 
					    {
						letterPosition = i;
						
						if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
						    {
							possibleWords4.add(test);
						    }
					    }
				    }	    
			    }

                        vFrequencies(possibleWords4);
                        cFrequencies(possibleWords4);
                        subtractFrequencies(previousGuesses);
                        highest = 0;

                        for (int i = 0; i < vowelFrequencies.length; i++)
                            {
                                if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
                                    {
                                        highest = vowelFrequencies[i];
                                    }
                            }

                        for (int i = 0; i < consonantsFrequencies.length; i++)
                            {
                                if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
                                    {
                                        highest = consonantsFrequencies[i];
                                    }
                            }

                        if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
                            {
                                result = 'a';
                            }
                        else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
                            {
                                result = 'e';
                            }
                        else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
                            {
                                result = 'i';
                            }
                        else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
                            {
                                result = 'o';
                            }
			else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
			    {
                                result = 'u';
                            }
                        else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
                            {
                                result = 'y';
                            }
                        else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
                            {
                                result = 'b';
                            }
                        else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
                            {
                                result = 'c';
                            }
                        else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
                            {
                                result = 'd';
                            }
                        else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
                            {
                                result = 'f';
                            }
                        else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
                            {
                                result = 'g';
                            }
                        else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
                            {
                                result = 'h';
                            }
                        else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
                            {
                                result = 'j';
                            }
                        else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
                            {
                                result = 'k';
                            }
                        else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
                            {
                                result = 'l';
                            }
                        else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
                            {
                                result = 'm';
                            }
			else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
			    {
				result = 'n';
			    }
			else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
			    {
				result = 'p';
			    }
			else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
			    {
				result = 'q';
			    }
			else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
			    {
				result = 'r';
			    }
			else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
			    {
				result = 's';
			    }
			else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
			    {
				result = 't';
			    }
			else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
			    {
				result = 'v';
			    }
			else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
			    {
				result = 'w';
			    }
			else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
			    {
				result = 'x';
			    }
			else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
			    {
				result = 'z';
			    }
		    }
		
		else if (previousGuesses.length() == 4 && match == false)
		    {
			for (int k = 0; k < possibleWords3.size(); k++)
			    {
				String test = possibleWords3.get(k);
				
				for (int i = 0; i < test.length(); i++)
				    {
					if (test.charAt(i) == previousGuesses.charAt(3))
					    {
						possibleWords3.remove(test);
					    }
				    }
			    }
			
			for (int i = 0; i < possibleWords3.size(); i++)
			    {
				possibleWords4.add(possibleWords3.get(i));
			    }
			
			vFrequencies(possibleWords4);
			cFrequencies(possibleWords4);
			subtractFrequencies(previousGuesses);
			highest = 0;

			for (int i = 0; i < vowelFrequencies.length; i++)     
			    {
				if (vowelFrequencies[i] > highest)
				    {
					highest = vowelFrequencies[i];
				    }
			    }
			
			for (int i = 0; i < consonantsFrequencies.length; i++)
			    {
				if (consonantsFrequencies[i] > highest)
				    {
					highest = consonantsFrequencies[i];
				    }
			    }
	       		
			if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
			    {
				result = 'a';
			    }
			else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
			    {
				result = 'e';
			    }
			else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
			    {
				result = 'i';
			    }
			else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
			    {
				result = 'o';
			    }
			else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
			    {
				result = 'u';
			    }
			else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
			    {
				result = 'y';
			    }
			else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
			    {
				result = 'b';
			    }
			else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
			    {
				result = 'c';
			    }
			else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
			    {
				result = 'd';
			    }
			else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
			    {
				result = 'f';
			    }
			else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
			    {
				result = 'g';
			    }
			else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
			    {
				result = 'h';
			    }
			else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
			    {
				result = 'j';
			    }
			else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
			    {
				result = 'k';
			    }
			else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
			    {
				result = 'l';
			    }
			else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
			    {
				result = 'm';
			    }
			else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
			    {
				result = 'n';
			    }
			else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
			    {
				result = 'p';
			    }
			else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
			    {
				result = 'q';
			    }
			else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
			    {
				result = 'r';
			    }
			else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
			    {
				result = 's';
			    }
			else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
			    {
				result = 't';
			    }
			else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
			    {
				result = 'v';
			    }
			else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
			    {
				result = 'w';
			    }
			else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
			    {
				result = 'x';
			    }
			else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
			    {
				result = 'z';
			    }	        
		    }	    	
	    }

	if (previousGuesses.length() == 5)
	    {
		match = false;

		for (int i = 0; i < pattern.length(); i++)
		    {
			if (pattern.charAt(i) == previousGuesses.charAt(4))
			    {
				match = true;
				break;
			    }
		    }
		
		if (previousGuesses.length() == 5 && match == true)
		    {
			for (int k = 0; k < possibleWords4.size(); k++)
			    {
				String test = possibleWords4.get(k);
				
				for (int i = 0; i < pattern.length() && i < test.length(); i++)
				    {
					if (previousGuesses.charAt(4) == pattern.charAt(i)) 
					    {
						letterPosition = i;
						
						if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
						    {
							possibleWords5.add(test);
						    }
					    }
				    }	    
			    }

                        vFrequencies(possibleWords5);
                        cFrequencies(possibleWords5);
                        subtractFrequencies(previousGuesses);
                        highest = 0;

                        for (int i = 0; i < vowelFrequencies.length; i++)
                            {
                                if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
                                    {
                                        highest = vowelFrequencies[i];
                                    }
                            }

                        for (int i = 0; i < consonantsFrequencies.length; i++)
                            {
                                if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
                                    {
                                        highest = consonantsFrequencies[i];
                                    }
                            }

                        if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
                            {
                                result = 'a';
                            }
                        else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
                            {
                                result = 'e';
                            }
                        else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
                            {
                                result = 'i';
                            }
                        else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
                            {
                                result = 'o';
                            }
			else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
			    {
                                result = 'u';
                            }
                        else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
                            {
                                result = 'y';
                            }
                        else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
                            {
                                result = 'b';
                            }
                        else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
                            {
                                result = 'c';
                            }
                        else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
                            {
                                result = 'd';
                            }
                        else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
                            {
                                result = 'f';
                            }
                        else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
                            {
                                result = 'g';
                            }
                        else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
                            {
                                result = 'h';
                            }
                        else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
                            {
                                result = 'j';
                            }
                        else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
                            {
                                result = 'k';
                            }
                        else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
                            {
                                result = 'l';
                            }
                        else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
                            {
                                result = 'm';
                            }
			else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
			    {
				result = 'n';
			    }
			else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
			    {
				result = 'p';
			    }
			else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
			    {
				result = 'q';
			    }
			else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
			    {
				result = 'r';
			    }
			else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
			    {
				result = 's';
			    }
			else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
			    {
				result = 't';
			    }
			else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
			    {
				result = 'v';
			    }
			else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
			    {
				result = 'w';
			    }
			else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
			    {
				result = 'x';
			    }
			else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
			    {
				result = 'z';
			    }
		    }
		
		else if (previousGuesses.length() == 5 && match == false) 
		    {
			for (int k = 0; k < possibleWords4.size(); k++)
			    {
				String test = possibleWords4.get(k);
				
				for (int i = 0; i < test.length(); i++)
				    {
					if (test.charAt(i) == previousGuesses.charAt(4))
					    {
						possibleWords4.remove(test);
					    }
				    }
			    }
			
			for (int i = 0; i < possibleWords4.size(); i++)
			    {
				possibleWords5.add(possibleWords4.get(i));
			    }
			
			vFrequencies(possibleWords5);
			cFrequencies(possibleWords5);
			subtractFrequencies(previousGuesses);
			highest = 0;
			
			for (int i = 0; i < vowelFrequencies.length; i++)     
			    {
				if (vowelFrequencies[i] > highest)
				    {
					highest = vowelFrequencies[i];
				    }
			    }
			
			for (int i = 0; i < consonantsFrequencies.length; i++)
			    {
				if (consonantsFrequencies[i] > highest)
				    {
					highest = consonantsFrequencies[i];
				    }
			    }
	       		
			if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
			    {
				result = 'a';
			    }
			else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
			    {
				result = 'e';
			    }
			else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
			    {
				result = 'i';
			    }
			else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
			    {
				result = 'o';
			    }
			else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
			    {
				result = 'u';
			    }
			else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
			    {
				result = 'y';
			    }
			else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
			    {
				result = 'b';
			    }
			else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
			    {
				result = 'c';
			    }
			else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
			    {
				result = 'd';
			    }
			else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
			    {
				result = 'f';
			    }
			else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
			    {
				result = 'g';
			    }
			else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
			    {
				result = 'h';
			    }
			else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
			    {
				result = 'j';
			    }
			else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
			    {
				result = 'k';
			    }
			else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
			    {
				result = 'l';
			    }
			else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
			    {
				result = 'm';
			    }
			else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
			    {
				result = 'n';
			    }
			else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
			    {
				result = 'p';
			    }
			else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
			    {
				result = 'q';
			    }
			else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
			    {
				result = 'r';
			    }
			else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
			    {
				result = 's';
			    }
			else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
			    {
				result = 't';
			    }
			else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
			    {
				result = 'v';
			    }
			else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
			    {
				result = 'w';
			    }
			else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
			    {
				result = 'x';
			    }
			else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
			    {
				result = 'z';
			    }	        
		    }
	    }

	if (previousGuesses.length() == 6)
	    {
    
		match = false;
		
		for (int i = 0; i < pattern.length(); i++)
		    {
			if (pattern.charAt(i) == previousGuesses.charAt(5))
			    {
				match = true;
				break;
			    }
		    }
		
		if (previousGuesses.length() == 6 && match == true)
		    {
			for (int k = 0; k < possibleWords5.size(); k++)
			    {
				String test = possibleWords5.get(k);
				
				for (int i = 0; i < pattern.length() && i < test.length(); i++)
				    {
					if (previousGuesses.charAt(5) == pattern.charAt(i)) 
					    {
						letterPosition = i;
						
						if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
						    {
							possibleWords6.add(test);
						    }
					    }
				    }	    
			    }

                        vFrequencies(possibleWords6);
                        cFrequencies(possibleWords6);
                        subtractFrequencies(previousGuesses);
                        highest = 0;

                        for (int i = 0; i < vowelFrequencies.length; i++)
                            {
                                if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
                                    {
                                        highest = vowelFrequencies[i];
                                    }
                            }

                        for (int i = 0; i < consonantsFrequencies.length; i++)
                            {
                                if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
                                    {
                                        highest = consonantsFrequencies[i];
                                    }
                            }

                        if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
                            {
                                result = 'a';
                            }
                        else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
                            {
                                result = 'e';
                            }
                        else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
                            {
                                result = 'i';
                            }
                        else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
                            {
                                result = 'o';
                            }
			else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
			    {
                                result = 'u';
                            }
                        else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
                            {
                                result = 'y';
                            }
                        else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
                            {
                                result = 'b';
                            }
                        else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
                            {
                                result = 'c';
                            }
                        else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
                            {
                                result = 'd';
                            }
                        else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
                            {
                                result = 'f';
                            }
                        else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
                            {
                                result = 'g';
                            }
                        else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
                            {
                                result = 'h';
                            }
                        else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
                            {
                                result = 'j';
                            }
                        else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
                            {
                                result = 'k';
                            }
                        else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
                            {
                                result = 'l';
                            }
                        else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
                            {
                                result = 'm';
                            }
			else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
			    {
				result = 'n';
			    }
			else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
			    {
				result = 'p';
			    }
			else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
			    {
				result = 'q';
			    }
			else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
			    {
				result = 'r';
			    }
			else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
			    {
				result = 's';
			    }
			else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
			    {
				result = 't';
			    }
			else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
			    {
				result = 'v';
			    }
			else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
			    {
				result = 'w';
			    }
			else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
			    {
				result = 'x';
			    }
			else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
			    {
				result = 'z';
			    }
		    }
		
		else if (previousGuesses.length() == 6 && match == false)
		    {
			for (int k = 0; k < possibleWords5.size(); k++)
			    {
				String test = possibleWords5.get(k);
				
				for (int i = 0; i < test.length(); i++)
				    {
					if (test.charAt(i) == previousGuesses.charAt(5))
					    {
						possibleWords5.remove(test);
					    }
				    }
			    }

			for (int i = 0; i < possibleWords5.size(); i++)
			    {
				possibleWords6.add(possibleWords5.get(i));
			    }
			
			vFrequencies(possibleWords6);
			cFrequencies(possibleWords6);
			subtractFrequencies(previousGuesses);
			highest = 0;
			
			for (int i = 0; i < vowelFrequencies.length; i++)     
			    {
				if (vowelFrequencies[i] > highest)
				    {
					highest = vowelFrequencies[i];
				    }
			    }
			
			for (int i = 0; i < consonantsFrequencies.length; i++)
			    {
				if (consonantsFrequencies[i] > highest)
				    {
					highest = consonantsFrequencies[i];
				    }
			    }
	       		
			if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
			    {
				result = 'a';
			    }
			else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
			    {
				result = 'e';
			    }
			else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
			    {
				result = 'i';
			    }
			else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
			    {
				result = 'o';
			    }
			else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
			    {
				result = 'u';
			    }
			else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
			    {
				result = 'y';
			    }
			else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
			    {
				result = 'b';
			    }
			else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
			    {
				result = 'c';
			    }
			else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
			    {
				result = 'd';
			    }
			else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
			    {
				result = 'f';
			    }
			else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
			    {
				result = 'g';
			    }
			else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
			    {
				result = 'h';
			    }
			else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
			    {
				result = 'j';
			    }
			else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
			    {
				result = 'k';
			    }
			else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
			    {
				result = 'l';
			    }
			else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
			    {
				result = 'm';
			    }
			else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
			    {
				result = 'n';
			    }
			else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
			    {
				result = 'p';
			    }
			else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
			    {
				result = 'q';
			    }
			else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
			    {
				result = 'r';
			    }
			else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
			    {
				result = 's';
			    }
			else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
			    {
				result = 't';
			    }
			else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
			    {
				result = 'v';
			    }
			else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
			    {
				result = 'w';
			    }
			else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
			    {
				result = 'x';
			    }
			else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
			    {
				result = 'z';
			    }	        
		    }
	    }

	if (previousGuesses.length() == 7)
	    {
		match = false;
		
		for (int i = 0; i < pattern.length(); i++)
		    {
			if (pattern.charAt(i) == previousGuesses.charAt(6))
			    {
				match = true;
				break;
			    }
		    }
		
		if (previousGuesses.length() == 7 && match == true)
		    {
			for (int k = 0; k < possibleWords6.size(); k++)
			    {
				String test = possibleWords6.get(k);
				
				for (int i = 0; i < pattern.length() && i < test.length(); i++)
				    {
					if (previousGuesses.charAt(6) == pattern.charAt(i)) 
					    {
						letterPosition = i;
						
						if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
						    {
							possibleWords7.add(test);
						    }
					    }
				    }	    
			    }

                        vFrequencies(possibleWords7);
                        cFrequencies(possibleWords7);
                        subtractFrequencies(previousGuesses);
                        highest = 0;

                        for (int i = 0; i < vowelFrequencies.length; i++)
                            {
                                if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
                                    {
                                        highest = vowelFrequencies[i];
                                    }
                            }

                        for (int i = 0; i < consonantsFrequencies.length; i++)
                            {
                                if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
                                    {
                                        highest = consonantsFrequencies[i];
                                    }
                            }

                        if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
                            {
                                result = 'a';
                            }
                        else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
                            {
                                result = 'e';
                            }
                        else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
                            {
                                result = 'i';
                            }
                        else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
                            {
                                result = 'o';
                            }
			else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
			    {
                                result = 'u';
                            }
                        else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
                            {
                                result = 'y';
                            }
                        else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
                            {
                                result = 'b';
                            }
                        else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
                            {
                                result = 'c';
                            }
                        else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
                            {
                                result = 'd';
                            }
                        else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
                            {
                                result = 'f';
                            }
                        else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
                            {
                                result = 'g';
                            }
                        else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
                            {
                                result = 'h';
                            }
                        else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
                            {
                                result = 'j';
                            }
                        else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
                            {
                                result = 'k';
                            }
                        else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
                            {
                                result = 'l';
                            }
                        else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
                            {
                                result = 'm';
                            }
			else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
			    {
				result = 'n';
			    }
			else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
			    {
				result = 'p';
			    }
			else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
			    {
				result = 'q';
			    }
			else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
			    {
				result = 'r';
			    }
			else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
			    {
				result = 's';
			    }
			else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
			    {
				result = 't';
			    }
			else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
			    {
				result = 'v';
			    }
			else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
			    {
				result = 'w';
			    }
			else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
			    {
				result = 'x';
			    }
			else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
			    {
				result = 'z';
			    }
		    }
		
		else if (previousGuesses.length() == 7 && match == false)
		    {
			for (int k = 0; k < possibleWords6.size(); k++)
			    {
				String test = possibleWords6.get(k);
				
				for (int i = 0; i < test.length(); i++)
				    {
					if (test.charAt(i) == previousGuesses.charAt(6))
					    {
						possibleWords6.remove(test);
					    }
				    }
			    }
			
			for (int i = 0; i < possibleWords6.size(); i++)
			    {
				possibleWords7.add(possibleWords6.get(i));
			    }
			
			vFrequencies(possibleWords7);
			cFrequencies(possibleWords7);
			subtractFrequencies(previousGuesses);
			highest = 0;

			for (int i = 0; i < vowelFrequencies.length; i++)     
			    {
				if (vowelFrequencies[i] > highest)
				    {
					highest = vowelFrequencies[i];
				    }
			    }
	  		
			for (int i = 0; i < consonantsFrequencies.length; i++)
			    {
				if (consonantsFrequencies[i] > highest)
				    {
					highest = consonantsFrequencies[i];
				    }
			    }
			
			if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
			    {
				result = 'a';
			    }
			else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
			    {
				result = 'e';
			    }
			else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
			    {
				result = 'i';
			    }
			else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
			    {
				result = 'o';
			    }
			else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
			    {
				result = 'u';
			    }
			else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
			    {
				result = 'y';
			    }
			else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
			    {
				result = 'b';
			    }    
			else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
			    {
				result = 'b';
			    }
			else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
			    {
				result = 'c';
			    }
			else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
			    {
				result = 'd';
			    }
			else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
			    {
				result = 'f';
			    }
			else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
			    {
				result = 'g';
			    }
			else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
			    {
				result = 'h';
			    }
			else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
			    {
				result = 'j';
			    }
			else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
			    {
				result = 'k';
			    }
			else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
			    {
				result = 'l';
			    }
			else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
			    {
				result = 'm';
			    }
			else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
			    {
				result = 'n';
			    }
			else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
			    {
				result = 'p';
			    }
			else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
			    {
				result = 'q';
			    }
			else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
			    {
				result = 'r';
			    }
			else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
			    {
				result = 's';
			    }
			else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
			    {
				result = 't';
			    }
			else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
			    {
				result = 'v';
			    }
			else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
			    {
				result = 'w';
			    }
			else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
			    {
				result = 'x';
			    }
			else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
			    {
				result = 'z';
			    }	        
		    }
	    }

	if (previousGuesses.length() == 8)
	    {
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(7))
		    {
			match = true;
			break;
		    }
	    }
	
	if (previousGuesses.length() == 8 && match == true)
	    {
		for (int k = 0; k < possibleWords7.size(); k++)
		    {
			String test = possibleWords7.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(7) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords8.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords8);
		cFrequencies(possibleWords8);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }

	else if (previousGuesses.length() == 8 && match == false)
	    {
			for (int k = 0; k < possibleWords7.size(); k++)
		    {
			String test = possibleWords7.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(7))
				    {
					possibleWords7.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords7.size(); i++)
		    {
			possibleWords8.add(possibleWords7.get(i));
		    }

        	vFrequencies(possibleWords8);
		cFrequencies(possibleWords8);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }

	if (previousGuesses.length() == 9)
	    {
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(8))
		    {
			match = true;
			break;
		    }
	    }

	if (previousGuesses.length() == 9 && match == true)
	    {
		for (int k = 0; k < possibleWords8.size(); k++)
		    {
			String test = possibleWords8.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(8) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords9.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords9);
		cFrequencies(possibleWords9);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
                        result = 'u';
                    }
                else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
                    {
                        result = 'y';
                    }
                else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
                    {
                        result = 'b';
                    }
                else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
                    {
                        result = 'c';
                    }
                else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
                    {
                        result = 'd';
                    }
                else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
                    {
                        result = 'f';
                    }
                else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
                    {
                        result = 'g';
                    }
                else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
                    {
                        result = 'h';
                    }
                else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
                    {
                        result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
                    {
                        result = 'k';
                    }
                else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
                    {
                        result = 'l';
                    }
                else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
                    {
                        result = 'm';
                    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }

	else if (previousGuesses.length() == 9 && match == false)
	    {
		for (int k = 0; k < possibleWords8.size(); k++)
		    {
			String test = possibleWords8.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(8))
				    {
					possibleWords8.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords8.size(); i++)
		    {
			possibleWords9.add(possibleWords8.get(i));
		    }

        	vFrequencies(possibleWords9);
		cFrequencies(possibleWords9);
		subtractFrequencies(previousGuesses);
		highest = 0;
		
		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }

	if (previousGuesses.length() == 10)
	    {
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(9))
		    {
			match = true;
			break;
		    }
	    }
	
	if (previousGuesses.length() == 10 && match == true)
	    {
		for (int k = 0; k < possibleWords9.size(); k++)
		    {
			String test = possibleWords9.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(9) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords10.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords10);
		cFrequencies(possibleWords10);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }
	else if (previousGuesses.length() == 10 && match == false)
	    {
			for (int k = 0; k < possibleWords9.size(); k++)
		    {
			String test = possibleWords9.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(9))
				    {
					possibleWords9.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords9.size(); i++)
		    {
			possibleWords10.add(possibleWords9.get(i));
		    }

        	vFrequencies(possibleWords10);
		cFrequencies(possibleWords10);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }

       	if (previousGuesses.length() == 11)
	    {

	match = false;

	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(10))
		    {
			match = true;
			break;
		    }
	    }	
	if (previousGuesses.length() == 11 && match == true)
	    {
		for (int k = 0; k < possibleWords10.size(); k++)
		    {
			String test = possibleWords10.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(10) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords11.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords11);
		cFrequencies(possibleWords11);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }
	else if (previousGuesses.length() == 11 && match == false)
	    {
			for (int k = 0; k < possibleWords10.size(); k++)
		    {
			String test = possibleWords10.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(10))
				    {
					possibleWords10.remove(test);
				    }
			    }
		    }
			
		for (int i = 0; i < possibleWords10.size(); i++)
		    {
			possibleWords11.add(possibleWords10.get(i));
		    }

        	vFrequencies(possibleWords11);
		cFrequencies(possibleWords11);
		subtractFrequencies(previousGuesses);
		highest = 0;
		
		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }

	if (previousGuesses.length() == 12)
	    {
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(11))
		    {
			match = true;
			break;
		    }
	    }
	
	if (previousGuesses.length() == 12 && match == true)
	    {
	       	for (int k = 0; k < possibleWords11.size(); k++)
		    {
			String test = possibleWords11.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(11) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords12.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords12);
		cFrequencies(possibleWords12);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }
	else if (previousGuesses.length() == 12 && match == false)
	    {
			for (int k = 0; k < possibleWords11.size(); k++)
		    {
			String test = possibleWords11.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(11))
				    {
					possibleWords11.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords11.size(); i++)
		    {
			possibleWords12.add(possibleWords11.get(i));
		    }

        	vFrequencies(possibleWords12);
		cFrequencies(possibleWords12);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }

	if (previousGuesses.length() == 13)
	    {
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(12))
		    {
			match = true;
			break;
		    }
	    }
	
	if (previousGuesses.length() == 13 && match == true)
	    {
		for (int k = 0; k < possibleWords12.size(); k++)
		    {
			String test = possibleWords12.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(12) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords13.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords13);
		cFrequencies(possibleWords13);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }

	else if (previousGuesses.length() == 13 && match == false)
	    {
		for (int k = 0; k < possibleWords12.size(); k++)
		    {
			String test = possibleWords12.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(12))
				    {
					possibleWords12.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords12.size(); i++)
		    {
			possibleWords13.add(possibleWords12.get(i));
		    }

        	vFrequencies(possibleWords13);
		cFrequencies(possibleWords13);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }

	if (previousGuesses.length() == 14)
	    {
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(13))
		    {
			match = true;
			break;
		    }
	    }
	
	if (previousGuesses.length() == 14 && match == true)
	    {
		for (int k = 0; k < possibleWords13.size(); k++)
		    {
			String test = possibleWords13.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(13) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords14.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords14);
		cFrequencies(possibleWords14);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }
	else if (previousGuesses.length() == 14 && match == false)
	    {
			for (int k = 0; k < possibleWords13.size(); k++)
		    {
			String test = possibleWords13.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(13))
				    {
					possibleWords13.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords13.size(); i++)
		    {
			possibleWords14.add(possibleWords13.get(i));
		    }

        	vFrequencies(possibleWords14);
		cFrequencies(possibleWords14);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }


	if (previousGuesses.length() == 15)
	    {
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(14))
		    {
			match = true;
			break;
		    }
	    }
	
	if (previousGuesses.length() == 15 && match == true)
	    {
		for (int k = 0; k < possibleWords14.size(); k++)
		    {
			String test = possibleWords14.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(14) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords15.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords15);
		cFrequencies(possibleWords15);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }

	else if (previousGuesses.length() == 15 && match == false)
	    {
			for (int k = 0; k < possibleWords14.size(); k++)
		    {
			String test = possibleWords14.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(14))
				    {
					possibleWords14.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords14.size(); i++)
		    {
			possibleWords15.add(possibleWords14.get(i));
		    }

        	vFrequencies(possibleWords15);
		cFrequencies(possibleWords15);
		subtractFrequencies(previousGuesses);
		highest = 0;
		
		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }


	if (previousGuesses.length() == 16)
	    {
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(15))
		    {
			match = true;
			break;
		    }
	    }
	
	if (previousGuesses.length() == 16 && match == true)
	    {
		for (int k = 0; k < possibleWords15.size(); k++)
		    {
			String test = possibleWords15.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(15) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords16.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords16);
		cFrequencies(possibleWords16);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }

	else if (previousGuesses.length() == 16 && match == false)
	    {
		for (int k = 0; k < possibleWords15.size(); k++)
		    {
			String test = possibleWords15.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(15))
				    {
					possibleWords15.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords15.size(); i++)
		    {
			possibleWords16.add(possibleWords15.get(i));
		    }

        	vFrequencies(possibleWords16);
		cFrequencies(possibleWords16);
		subtractFrequencies(previousGuesses);
		highest = 0;
		
		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }



	if (previousGuesses.length() == 17)
	    {
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(16))
		    {
			match = true;
			break;
		    }
	    }
	
	if (previousGuesses.length() == 17 && match == true)
	    {
		for (int k = 0; k < possibleWords16.size(); k++)
		    {
			String test = possibleWords16.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(16) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords17.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords17);
		cFrequencies(possibleWords17);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }

	else if (previousGuesses.length() == 17 && match == false)
	    {
		for (int k = 0; k < possibleWords16.size(); k++)
		    {
			String test = possibleWords16.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(16))
				    {
					possibleWords16.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords16.size(); i++)
		    {
			possibleWords17.add(possibleWords16.get(i));
		    }

        	vFrequencies(possibleWords17);
		cFrequencies(possibleWords17);
		subtractFrequencies(previousGuesses);
		highest = 0;		

		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }
	
	if (previousGuesses.length() == 18)
	    {
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(17))
		    {
			match = true;
			break;
		    }
	    }
	
	if (previousGuesses.length() == 18 && match == true)
	    {
		for (int k = 0; k < possibleWords17.size(); k++)
		    {
			String test = possibleWords17.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(17) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords18.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords18);
		cFrequencies(possibleWords18);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }

	else if (previousGuesses.length() == 18 && match == false)
	    {
		for (int k = 0; k < possibleWords17.size(); k++)
		    {
			String test = possibleWords17.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(17))
				    {
					possibleWords17.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords17.size(); i++)
		    {
			possibleWords18.add(possibleWords17.get(i));
		    }

        	vFrequencies(possibleWords18);
		cFrequencies(possibleWords18);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }
	if (previousGuesses.length() == 19)
	    {
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(18))
		    {
			match = true;
			break;
		    }
	    }
	
	if (previousGuesses.length() == 19 && match == true)
	    {
		for (int k = 0; k < possibleWords18.size(); k++)
		    {
			String test = possibleWords18.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(18) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords19.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords19);
		cFrequencies(possibleWords19);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }

	else if (previousGuesses.length() == 19 && match == false)
	    {
			for (int k = 0; k < possibleWords18.size(); k++)
		    {
			String test = possibleWords18.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(18))
				    {
					possibleWords18.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords18.size(); i++)
		    {
			possibleWords19.add(possibleWords18.get(i));
		    }

        	vFrequencies(possibleWords19);
		cFrequencies(possibleWords19);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }

	if (previousGuesses.length() == 20)
	    {
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(19))
		    {
			match = true;
			break;
		    }
	    }
	
	if (previousGuesses.length() == 20 && match == true)
	    {
		for (int k = 0; k < possibleWords19.size(); k++)
		    {
			String test = possibleWords19.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(19) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords20.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords20);
		cFrequencies(possibleWords20);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }

	else if (previousGuesses.length() == 20 && match == false)
	    {
		for (int k = 0; k < possibleWords19.size(); k++)
		    {
			String test = possibleWords19.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(19))
				    {
					possibleWords19.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords19.size(); i++)
		    {
			possibleWords20.add(possibleWords19.get(i));
		    }

        	vFrequencies(possibleWords20);
		cFrequencies(possibleWords20);
		subtractFrequencies(previousGuesses);
		highest = 0;
		
		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }

	if (previousGuesses.length() == 21)
	    {
	
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(20))
		    {
			match = true;
			break;
		    }
	    }
	
	if (previousGuesses.length() == 21 && match == true)
	    {
		for (int k = 0; k < possibleWords20.size(); k++)
		    {
			String test = possibleWords20.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(20) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords21.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords21);
		cFrequencies(possibleWords21);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }

	else if (previousGuesses.length() == 21 && match == false)
	    {
			for (int k = 0; k < possibleWords20.size(); k++)
		    {
			String test = possibleWords20.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(20))
				    {
					possibleWords20.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords20.size(); i++)
		    {
			possibleWords21.add(possibleWords20.get(i));
		    }

        	vFrequencies(possibleWords21);
		cFrequencies(possibleWords21);
		subtractFrequencies(previousGuesses);
		highest = 0;
		
		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }

	if (previousGuesses.length() == 22)
	    {
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(21))
		    {
			match = true;
			break;
		    }
	    }
	
	if (previousGuesses.length() == 22 && match == true)
	    {
		for (int k = 0; k < possibleWords21.size(); k++)
		    {
			String test = possibleWords21.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(21) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords22.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords22);
		cFrequencies(possibleWords22);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }

	else if (previousGuesses.length() == 22 && match == false)
	    {
			for (int k = 0; k < possibleWords21.size(); k++)
		    {
			String test = possibleWords21.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(21))
				    {
					possibleWords21.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords21.size(); i++)
		    {
			possibleWords22.add(possibleWords21.get(i));
		    }

        	vFrequencies(possibleWords22);
		cFrequencies(possibleWords22);
		subtractFrequencies(previousGuesses);
		highest = 0;
		
		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }

	if (previousGuesses.length() == 23)
	    {
	
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(22))
		    {
			match = true;
			break;
		    }
	    }
	
	if (previousGuesses.length() == 23 && match == true)
	    {
		for (int k = 0; k < possibleWords22.size(); k++)
		    {
			String test = possibleWords22.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(22) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords23.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords23);
		cFrequencies(possibleWords23);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }

	else if (previousGuesses.length() == 23 && match == false)
	    {
		for (int k = 0; k < possibleWords22.size(); k++)
		    {
			String test = possibleWords22.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(22))
				    {
					possibleWords22.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords22.size(); i++)
		    {
			possibleWords23.add(possibleWords22.get(i));
		    }

        	vFrequencies(possibleWords23);
		cFrequencies(possibleWords23);
		subtractFrequencies(previousGuesses);
		highest = 0;
		
		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }

	if (previousGuesses.length() == 24)
	    {
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(23))
		    {
			match = true;
			break;
		    }
	    }
	
	if (previousGuesses.length() == 24 && match == true)
	    {
		for (int k = 0; k < possibleWords23.size(); k++)
		    {
			String test = possibleWords23.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(23) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords24.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords24);
		cFrequencies(possibleWords24);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }

	else if (previousGuesses.length() == 24 && match == false)
	    {
			for (int k = 0; k < possibleWords23.size(); k++)
		    {
			String test = possibleWords23.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(23))
				    {
					possibleWords23.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords23.size(); i++)
		    {
			possibleWords24.add(possibleWords23.get(i));
		    }

        	vFrequencies(possibleWords24);
		cFrequencies(possibleWords24);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }

	if (previousGuesses.length() == 25)
	    {
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(24))
		    {
			match = true;
			break;
		    }
	    }
	
	if (previousGuesses.length() == 25 && match == true)
	    {
		for (int k = 0; k < possibleWords24.size(); k++)
		    {
			String test = possibleWords24.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(24) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords25.add(test);
					    }
				    }
			    }	    
		    }

		vFrequencies(possibleWords25);
		cFrequencies(possibleWords25);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }
	    
	else if (previousGuesses.length() == 25 && match == false)
	    {
			for (int k = 0; k < possibleWords24.size(); k++)
		    {
			String test = possibleWords24.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(24))
				    {
					possibleWords24.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords24.size(); i++)
		    {
			possibleWords25.add(possibleWords24.get(i));
		    }

        	vFrequencies(possibleWords25);
		cFrequencies(possibleWords25);
		subtractFrequencies(previousGuesses);
		highest = 0;
		
		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }

	if (previousGuesses.length() == 26)
	    {
	match = false;
	
	for (int i = 0; i < pattern.length(); i++)
	    {
		if (pattern.charAt(i) == previousGuesses.charAt(25))
		    {
			match = true;
			break;
		    }
	    }
	
	if (previousGuesses.length() == 26 && match == true)
	    {
		for (int k = 0; k < possibleWords25.size(); k++)
		    {
			String test = possibleWords25.get(k);
			
			for (int i = 0; i < pattern.length() && i < test.length(); i++)
			    {
				if (previousGuesses.charAt(25) == pattern.charAt(i)) 
				    {
					letterPosition = i;
						
					if (test.charAt(letterPosition) == pattern.charAt(letterPosition))
					    {
						possibleWords26.add(test);
					    }
				    }
			    }	    
		    }
		vFrequencies(possibleWords26);
		cFrequencies(possibleWords26);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)
		    {
			if (vowelFrequencies[i] > highest && vowelFrequencies[i] != 0)
			    {
				highest = vowelFrequencies[i];
			    }
		    }

		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest && consonantsFrequencies[i] != 0)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }

		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
                    {
                        result = 'n';
                    }
                else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
                    {
                        result = 'p';
                    }
                else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
                    {
                        result = 'q';
                    }
                else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
                    {
                        result = 'r';
                    }
                else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
                    {
                        result = 's';
                    }
                else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
                    {
                        result = 't';
                    }
                else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
                    {
                        result = 'v';
                    }
                else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
                    {
                        result = 'w';
                    }
                else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
                    {
                        result = 'x';
                    }
                else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
                    {
                        result = 'z';
                    }
	    }
	    
	else if (previousGuesses.length() == 26 && match == false)
	    {
		for (int k = 0; k < possibleWords25.size(); k++)
		    {
			String test = possibleWords25.get(k);

			for (int i = 0; i < test.length(); i++)
			    {
				if (test.charAt(i) == previousGuesses.charAt(25))
				    {
					possibleWords25.remove(test);
				    }
			    }
		    }

		for (int i = 0; i < possibleWords25.size(); i++)
		    {
			possibleWords26.add(possibleWords25.get(i));
		    }

        	vFrequencies(possibleWords26);
		cFrequencies(possibleWords26);
		subtractFrequencies(previousGuesses);
		highest = 0;

		for (int i = 0; i < vowelFrequencies.length; i++)     
		    {
			if (vowelFrequencies[i] > highest)
			    {
	       	       		highest = vowelFrequencies[i];
	       		    }
		    }
		
		for (int i = 0; i < consonantsFrequencies.length; i++)
		    {
			if (consonantsFrequencies[i] > highest)
			    {
				highest = consonantsFrequencies[i];
			    }
		    }
	       		
		if (highest == vowelFrequencies[0] && vowelFrequencies[0] != 0)
		    {
			result = 'a';
		    }
		else if (highest == vowelFrequencies[1] && vowelFrequencies[1] != 0)
		    {
			result = 'e';
		    }
		else if (highest == vowelFrequencies[2] && vowelFrequencies[2] != 0)
		    {
			result = 'i';
		    }
		else if (highest == vowelFrequencies[3] && vowelFrequencies[3] != 0)
		    {
			result = 'o';
		    }
		else if (highest == vowelFrequencies[4] && vowelFrequencies[4] != 0)
		    {
			result = 'u';
		    }
		else if (highest == vowelFrequencies[5] && vowelFrequencies[5] != 0)
		    {
			result = 'y';
		    }
		else if (highest == consonantsFrequencies[0] && consonantsFrequencies[0] != 0)
		    {
			result = 'b';
		    }
		else if (highest == consonantsFrequencies[1] && consonantsFrequencies[1] != 0)
		    {
			result = 'c';
		    }
		else if (highest == consonantsFrequencies[2] && consonantsFrequencies[2] != 0)
		    {
			result = 'd';
		    }
		else if (highest == consonantsFrequencies[3] && consonantsFrequencies[3] != 0)
		    {
			result = 'f';
		    }
		else if (highest == consonantsFrequencies[4] && consonantsFrequencies[4] != 0)
		    {
			result = 'g';
		    }
		else if (highest == consonantsFrequencies[5] && consonantsFrequencies[5] != 0)
		    {
			result = 'h';
		    }
		else if (highest == consonantsFrequencies[6] && consonantsFrequencies[6] != 0)
		    {
			result = 'j';
		    }
		else if (highest == consonantsFrequencies[7] && consonantsFrequencies[7] != 0)
		    {
			result = 'k';
		    }
		else if (highest == consonantsFrequencies[8] && consonantsFrequencies[8] != 0)
		    {
			result = 'l';
		    }
		else if (highest == consonantsFrequencies[9] && consonantsFrequencies[9] != 0)
		    {
			result = 'm';
		    }
		else if (highest == consonantsFrequencies[10] && consonantsFrequencies[10] != 0)
		    {
			result = 'n';
		    }
		else if (highest == consonantsFrequencies[11] && consonantsFrequencies[11] != 0)
		    {
			result = 'p';
		    }
		else if (highest == consonantsFrequencies[12] && consonantsFrequencies[12] != 0)
		    {
			result = 'q';
		    }
		else if (highest == consonantsFrequencies[13] && consonantsFrequencies[13] != 0)
		    {
			result = 'r';
		    }
		else if (highest == consonantsFrequencies[14] && consonantsFrequencies[14] != 0)
		    {
			result = 's';
		    }
		else if (highest == consonantsFrequencies[15] && consonantsFrequencies[15] != 0)
		    {
			result = 't';
		    }
		else if (highest == consonantsFrequencies[16] && consonantsFrequencies[16] != 0)
		    {
			result = 'v';
		    }
		else if (highest == consonantsFrequencies[17] && consonantsFrequencies[17] != 0)
		    {
			result = 'w';
		    }
		else if (highest == consonantsFrequencies[18] && consonantsFrequencies[18] != 0)
		    {
			result = 'x';
		    }
		else if (highest == consonantsFrequencies[19] && consonantsFrequencies[19] != 0)
		    {
			result = 'z';
		    }	        
	    }
	    }
    
	    
	return result;
    }
	    
	    
	private static void vFrequencies(ArrayList<String> inputArray)
	{
        for (int i = 0; i < inputArray.size(); i++)                 
            {
                String countLetter = inputArray.get(i);                  
                for (int j = 0; j < countLetter.length(); j++) 
                    {
                        if (countLetter.charAt(j) == 'a')
			    {
				vowelFrequencies[0]++;
			    }
                        else if (countLetter.charAt(j) == 'e')
			    {
				vowelFrequencies[1]++;
			    }
                        else if (countLetter.charAt(j) == 'i')
			    {
				vowelFrequencies[2]++;
			    }
                        else if (countLetter.charAt(j) == 'o')
			    {
				vowelFrequencies[3]++;
			    }
                        else if (countLetter.charAt(j) == 'u')
			    {
				vowelFrequencies[4]++;
			    }
			else if (countLetter.charAt(j) == 'y')
			    {
				vowelFrequencies[5]++;
			    }
		    }
	    }
    }

    
    private static void cFrequencies(ArrayList<String> inputArray)
    {
        for (int i = 0; i < inputArray.size(); i++) 
            {
                String countLetter2 = inputArray.get(i);                  
                for (int j = 0; j < countLetter2.length(); j++)                     
                    {
                        if (countLetter2.charAt(j) == 'b')
                            {
                                consonantsFrequencies[0]++;
                            }
                        else if (countLetter2.charAt(j) == 'c')
                            {
                                consonantsFrequencies[1]++;
                            }
                        else if (countLetter2.charAt(j) == 'd')
                            {
                                consonantsFrequencies[2]++;
                            }
                        else if (countLetter2.charAt(j) == 'f')
                            {
                                consonantsFrequencies[3]++;
                            }
                        else if (countLetter2.charAt(j) == 'g')
                            {
                                consonantsFrequencies[4]++;
                            }
                        else if (countLetter2.charAt(j) == 'h')
			    {
                                consonantsFrequencies[5]++;
			    }
                        else if (countLetter2.charAt(j) == 'j')
			    {
                                consonantsFrequencies[6]++;
			    }
                        else if (countLetter2.charAt(j) == 'k')
			    {
                                consonantsFrequencies[7]++;
			    }
                        else if (countLetter2.charAt(j) == 'l')
			    {
                                consonantsFrequencies[8]++;
			    }
                        else if (countLetter2.charAt(j) == 'm')
			    {
                                consonantsFrequencies[9]++;
			    }
                        else if (countLetter2.charAt(j) == 'n')
			    {
                                consonantsFrequencies[10]++;
			    }
                        else if (countLetter2.charAt(j) == 'p')
			    {
                                consonantsFrequencies[11]++;
			    }
                        else if (countLetter2.charAt(j) == 'q')
			    {
                                consonantsFrequencies[12]++;
			    }
                        else if (countLetter2.charAt(j) == 'r')
			    {
                                consonantsFrequencies[13]++;
			    }
                        else if (countLetter2.charAt(j) == 's')
			    {
                                consonantsFrequencies[14]++;
			    }
                        else if (countLetter2.charAt(j) == 't')
			    {
                                consonantsFrequencies[15]++;
			    }
                        else if (countLetter2.charAt(j) == 'v')
			    {
                                consonantsFrequencies[16]++;
			    }
                        else if (countLetter2.charAt(j) == 'w')
			    {
                                consonantsFrequencies[17]++;
			    }
                        else if (countLetter2.charAt(j) == 'x')
			    {		    
                                consonantsFrequencies[18]++;
			    }
                        else if (countLetter2.charAt(j) == 'z')
			    {
                                consonantsFrequencies[19]++;
			    }
		    }
	    }
    }


    private static void subtractFrequencies(String previousGuesses)  
    {
	for (int i = 0; i < previousGuesses.length(); i++)
	{
	    if (previousGuesses.charAt(i) == 'a')
		{
		    vowelFrequencies[0] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'e')
		{
		    vowelFrequencies[1] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'i')
		{
		    vowelFrequencies[2] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'o')
		{
		    vowelFrequencies[3] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'u')
		{
		    vowelFrequencies[4] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'y')
		{
		    vowelFrequencies[5] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'b')
		{
		    consonantsFrequencies[0] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'c')
		{
		    consonantsFrequencies[1] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'd')
		{
		    consonantsFrequencies[2] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'f')
		{
		    consonantsFrequencies[3] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'g')
		{
		    consonantsFrequencies[4] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'h')
		{
		    consonantsFrequencies[5] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'j')
		{
		    consonantsFrequencies[6] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'k')
		{
		    consonantsFrequencies[7] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'l')
		{
		    consonantsFrequencies[8] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'm')
		{
		    consonantsFrequencies[9] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'n')
		{
		    consonantsFrequencies[10] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'p')
		{
		    consonantsFrequencies[11] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'q')
		{
		    consonantsFrequencies[12] = 0;
                            }
	    else if (previousGuesses.charAt(i) == 'r')
		{
		    consonantsFrequencies[13] = 0;
		}
	    else if (previousGuesses.charAt(i) == 's')
		{
		    consonantsFrequencies[14] = 0;
		}
	    else if (previousGuesses.charAt(i) == 't')
		{
		    consonantsFrequencies[15] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'v')
		{
		    consonantsFrequencies[16] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'w')
		{
		    consonantsFrequencies[17] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'x')
		{
		    consonantsFrequencies[18] = 0;
		}
	    else if (previousGuesses.charAt(i) == 'z')
		{
		    consonantsFrequencies[19] = 0;
		}
	}
    }
}
