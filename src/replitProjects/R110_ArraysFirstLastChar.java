package replitProjects;

public class R110_ArraysFirstLastChar {
    /*
    Given a String array words, iterate through each word and
    print first and last letter of each element in separate lines.
Example:
words → ["hello", "why", "by", "apple" , "note"]
print:
       ho
       wy
       by
       ae
       ne
     */
    public static void main(String[] args) {

        String[] words = {"hello", "why", "by", "apple" , "note"};

        for(String eachWords : words){

                String result = eachWords.substring(0,1) + eachWords.substring(eachWords.length()-1);
            System.out.println(result);
        }
        System.out.println();

    }
}
