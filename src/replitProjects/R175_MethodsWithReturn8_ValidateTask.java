package replitProjects;

import java.util.Scanner;

public class R175_MethodsWithReturn8_ValidateTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(validateTask(sc.nextBoolean(),sc.nextInt(),sc.nextInt()));
    }
    public static boolean validateTask(boolean notEmpty, int taskId, int currentId) {
        if((taskId == currentId + 1) && notEmpty){
            return true;
        }else{
            return false;
        }


    }
}
