package importants;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aaabbc";//a43b2c1

        //Step 1: remove duplicates;
        String nonDuplicate = ""; //'a'


        for (int i = 0; i < str.length(); i++) {//i: 0,1,2,3,4,5

            String eachChar = "" + str.charAt(i);//a,a,a,b,b,c

            if (!nonDuplicate.contains(eachChar)) {// checking non duplicate from each characters
                nonDuplicate += eachChar;
            }


        }
        System.out.println(nonDuplicate);

        System.out.println("============================================");

        String result = ""; // "a3b2c1"
        //Step 2: Find the frequency of nonDuplicate character from orginal string

        for (int j = 0; j < nonDuplicate.length(); j++) {
            char ch = nonDuplicate.charAt(j);//a, b, c
            int count = 0; // to contain frequency of char value (ch)

            for (int i = 0; i < str.length(); i++) {
                char eachChar = str.charAt(i);// a, a, a, b, b, c
                if (ch == eachChar) {
                    count++;
                }
            }

            result += "" + ch + count;


        }
        System.out.println(result);
    }
}
