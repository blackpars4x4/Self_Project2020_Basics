package replitProjects;

public class R_MethodsWithArray_GetDuplicates {

    public static void main(String[] args) {
        String[] arr = {"1", "2", "1", "1"};
        System.out.println(getDup(arr));
    }

    public static int getDup(String[] r) {
        int k=0;

        for (String s : r) {
            int count = 0;

            for (String value : r) {
                if (s.equals(value)) {
                    count++;

                }
            }
            if (count > 1){
                k =count;
            }
        }

        return k;

    }


}
/*
getDup accepts an array and returns an int.

If there is any element is duplicated, method counts how many of those present in the array.
For example :

getDup(["1","2","aa"',"1"])
returns:2 ("1" is duplicated and there are two "1"s so return is 2)

getDup(["1","2","aa"',"1", "aa"])
returns:4 ("1" is duplicated and there are two "1"s
           and 2 "aa"s so return is 4)


getDup(["1","g","aabb',"7","7","2","aa"',"7"])
returns:3

hint:

you will need a nested array the will run on the array we get from the method argument.
inside the nested loop you will need to check if the main array element is equal to the current

 */