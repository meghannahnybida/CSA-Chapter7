package exercises;

public class CountMovieSpaces {

    public static void main(String [] args)
    {
        String movieQuote = "I like standing next to you Sean, it makes me look tough.";
        int count = 0;
        int stringLength = movieQuote.length();

        for(int i = 0; i < stringLength; i++)
        {
            if(movieQuote.charAt(i) == ' ')
            {
                count++;
            }
        }
        System.out.println("My favorite movie quote has " + count + " spaces.");
    }
}
