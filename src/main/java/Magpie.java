/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:  
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 *          Handles responding to simple words and phrases 
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie
{
    /**
     * Get a default greeting   
     * @return a greeting
     */
     
    /*public static void main(String[] args){
    	System.out.println(findWord("my mother is kind", "mother"));
    	System.out.println(findWord("No talking@", "No"));
    	System.out.println(findWord("a", "."));
    	System.out.println(findWord("I am smothered.", "mother"));
		System.out.println(findWord("know", "no"));
		
    }
    */
    
    public String getGreeting()
    {
        return "Hello, let's talk.";
    }
    
    /**
     * Gives a response to a user statement
     * 
     * @param statement
     *            the user statement
     * @return a response based on the rules given
     */
    public String getResponse(String statement)
    {
        String response = "";
        
        //"negative"
        if(statement.trim().length() < 1){
        	response = "Say something, please.";
        }
        
        else if (statement.indexOf("no") >= 0)
        {
            response = "Why so negative?";
        }
        
        //family
        else if (statement.indexOf("mother") >= 0
                || statement.indexOf("father") >= 0
                || statement.indexOf("sister") >= 0
                || statement.indexOf("brother") >= 0)
        {
            response = "Tell me more about your family.";
        }
        
        else if(statement.indexOf("cat") >= 0
        		||statement.indexOf("dog") >= 0)
        {
        	response = "Tell me more about your pets.";
        }
        
        //teacher
        
        else if(statement.indexOf("Nathan") >= 0)
        {
        	response = "He sounds like a good teacher.";
        } 
        
        else if(statement.indexOf("bot") >= 0){
        	response = "Me? NO... What are you talking about?";
        }
        
        else if(statement.indexOf("tell me") >= 0){
        	response = "No! (vehemently)";
        }
        
        else if(statement.indexOf("Java") >= 0){
        	response = "I believe Java is developed by SUN and own by Oracle.";
        }
        //random
        else{
            response = getRandomResponse();
        }
        return response;
    }
    
    /**
     * Pick a default response to use if nothing else fits.
     * @return a non-committal string
     */
    public String getRandomResponse()
    {
        final int NUMBER_OF_RESPONSES = 6;
        double r = Math.random();
        int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
        String response = "";
        
        if (whichResponse == 0)
        {
            response = "Interesting, tell me more.";
        }
        else if (whichResponse == 1)
        {
            response = "Hmmm.";
        }
        else if (whichResponse == 2)
        {
            response = "Do you really think so?";
        }
        else if (whichResponse == 3)
        {
            response = "You don't say.";
        }else if (whichResponse == 4)
        {
        	response = "That's definitely something.";
        }else if (whichResponse == 5)
        {
        	response = "BEEP BEEP, I AM A BOT.";
        }
    
        return response;
    }

    // Checks to see if the String word appears as a whole word
    // in the String str (in this case, a "whole word" means that 
    // word is not just a substring of some larger word in str)

    // This method should work regardless of the capitalization 
    // of str or word

    // The method returns the index of the first character in word
    // if it is found, and returns -1 otherwise. 
    public static int findWord(String str, String word) {
    
        str = str.toLowerCase();
        word = word.toLowerCase();

    	int end = str.length() - word.length();
    	int idx = str.indexOf(word);
        
        boolean spaceBefore = false;
        boolean spaceAfter = false;
        if(idx == 0){
            spaceBefore = true;
        }

        if(idx == end){
            spaceAfter = true;
        }

        if(idx - 1 >= 0 && str.charAt(idx - 1) == ' '){
            spaceBefore = true;
        }

        if(idx + word.length() < str.length() && str.charAt(idx + word.length()) == ' '){
            spaceAfter = true;
        }

        if(spaceBefore == true && spaceAfter == true){
            return idx;
        }else{
            return -1;
        }
    }

    // We will work on the following methods later!

    /**
     * Take a statement with "I want <something>." and transform it into 
     * "Would you really be happy if you had <something>?"
     * @param statement the user statement, assumed to contain "I want"
     * @return the transformed statement
     */
    public String transformIWantStatement(String statement)
    {
        //your code here
        return "";
    }

    /**
     * Take a statement with "I <something> you" and transform it into 
     * "Why do you <something> me?"
     * @param statement the user statement, assumed to contain "I" followed by "you"
     * @return the transformed statement
     */
    public String transformIYouStatement(String statement)
    {
        //your code here
        return "";
    }

    /**
     * Take a statement with "I want to <something>." and transform it into 
     * "What would it mean to <something>?"
     * @param statement the user statement, assumed to contain "I want to"
     * @return the transformed statement
     */
    public String transformIWantToStatement(String statement)
    {
        // your code here
        return "";
    }




    /**
     * Take a statement with "you <something> me" and transform it into 
     * "What makes you think that I <something> you?"
     * @param statement the user statement, assumed to contain "you" followed by "me"
     * @return the transformed statement
     */
    public String transformYouMeStatement(String statement)
    {
        // your code here
        return "";
    }
}
