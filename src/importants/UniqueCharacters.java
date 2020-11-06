package importants;

public class UniqueCharacters {

    public static void main(String[] args) {
        String str = "abcababe";

        String result = "";  //"ce"

        for(int j = 0; j < str.length(); j++ ){ // j represents the index num of str

            char ch = str.charAt(j);  //each char in str
            int count = 0; // for the frequency of ch

            for(int i = 0; i< str.length(); i++ ){ // i represents the index num of str
                char  eachChar =  str.charAt(i);  // each characters of the str
                if(eachChar == ch){
                    count++;
                }
            } // count the frequency of ch and then assign it to the count

            if(count == 1){ // if the frequency is one, it means it's unique
                result += ch;
            }

        }


        System.out.println(result);





    }
}
