package importants;

public class FrequencyOfEachCharacters2 {
    public static void main(String[] args) {
        String str = "aaaaaaaaabbbbbbbbbbbbbbcccccccccccccccccc";


        String expectedResult = ""; //"a3b2c1"


        for (int j = 0; j < str.length(); j++) {
            char ch = str.charAt(j);//'a'
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                char eachChar = str.charAt(i);

                if (ch == eachChar) {
                    count++;
                }
            }
            if(!expectedResult.contains("" + ch)) {
                expectedResult += "" + ch + count;
            }

        }
        System.out.println(expectedResult);

    }
}
