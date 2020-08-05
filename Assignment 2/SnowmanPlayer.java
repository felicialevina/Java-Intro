import java.util.*;

public class SnowmanPlayer
{
    private static ArrayList<String> allWords = new ArrayList<String>();
    private static ArrayList<String> filter;
    private static int[] vowFreq = new int[6];
    private static String stored = "";

    public static String getAuthor()
    {
	    return "Levina, Felicia";
    }

    public static void startGame(String[] words, int minLength, int maxLength, String allowedChars)
    {
	    for(int i = 0; i < words.length; i++)
	    {
            allWords.add(words[i]);
        }
    }

    public static void startNewWord(int length)
    {
	    filter = new ArrayList<String>();
	    for(int i = 0; i < allWords.size(); i++)
	    {
	    	int test = allWords.get(i).length();
	    	if(test == length)
	    	{
                filter.add(allWords.get(i));
                
                for(int j = 0; j < test; j++)
                {
                    if(allWords.get(i).charAt(j) == 'a')
                    {vowFreq[0]++;}
                    else if(allWords.get(i).charAt(j) == 'e')
                    {vowFreq[1]++;}
                    else if(allWords.get(i).charAt(j) == 'i')
                    {vowFreq[2]++;}
                    else if(allWords.get(i).charAt(j) == 'o')
                    {vowFreq[3]++;}
                    else if(allWords.get(i).charAt(j) == 'u')
                    {vowFreq[4]++;}
                    else if(allWords.get(i).charAt(j) == 'y')
                    {vowFreq[5]++;}
                }
	    	}
        }
    }

    public static char guessLetter(String pattern, String previousGuesses)
    {
        String trial = "*****";
        for(int i = 5; i < pattern.length(); i++)
        {
            trial += "*";
        }

        if(pattern.equals(trial))
        {
            int maxVal = vowFreq[0];
            int ind = 0;
            for(int i = 1; i < vowFreq.length; i++)
            {
                if(vowFreq[i] > maxVal)
                {
                    maxVal = vowFreq[i];
                    ind = i;
                }
            }
            vowFreq[ind] = 0;
            if(ind == 0)
                {return 'a';}
            else if (ind == 1)
                {return 'e';}
            else if (ind == 2)
                {return 'i';}
            else if (ind == 3)
                {return 'o';}
            else if (ind == 4)
                {return 'u';}
            else
                {return 'y';}
        }

        char find = previousGuesses.charAt(previousGuesses.length()-1);
        int last = pattern.indexOf(find);
        if(last == -1)
        {
            for(int i = 0; i < filter.size(); i++)
            {
                String remove = filter.get(i);
                for(int j = 0; j < pattern.length(); j++)
                {
                    if(remove.charAt(j) == find)
                    {
                        filter.remove(remove);
                        break;
                    }
                }
            }
        }


        for(int i = 0; i < filter.size(); i++)
        {
            String check = filter.get(i);
            for(int j = 0; j < pattern.length(); j++)
            {
                if(pattern.charAt(j) != '*')
                {
                    if(check.charAt(j) != pattern.charAt(j))
                    {
                        filter.remove(check);
                    }
                }

            }
        }

        for (int i = 0; i < pattern.length(); i++)
        {
            if(pattern.charAt(i) == '*')
            {
                int another = previousGuesses.indexOf(filter.get(0).charAt(i));
                if(another == -1)
                {   
                    return filter.get(0).charAt(i);
                }
            }
        }

        filter.remove(0);

        for(int i = 0 ; i < pattern.length(); i++)
        {
            if(pattern.charAt(i) == '*')
            {
                return filter.get(0).charAt(i);
            }
        }

        return 'z';

    }
}
