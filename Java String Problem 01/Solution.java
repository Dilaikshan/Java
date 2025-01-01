
class fun{
    public static String reverseSentence(String sentence)
    {
        String[] words = sentence.split(" "); //split the words have in the sentence

        //create for loop to read each word
        for(int i=0;i<words.length;i++)
        {
            //check the word has more than or equal 5 letters
            if (words[i].length()>=5) {
                words[i]= new StringBuilder(words[i]).reverse().toString();//if have it reverese the word using StringBuilder class
            }
        }

        String result = String.join(" ",words);//join the words in one string from the array
        return result;
    }
    
}

public class Solution {
    public static void main(String[] args) {
        System.out.println(fun.reverseSentence("Hey fellow warriors"));
    }
}
