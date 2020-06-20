package Git.Gitee.javalab.Lab8;

import java.util.Scanner;

public class TimeDemo
{
    public static void main (String [ ] args)
    {
        Scanner keyboard = new Scanner(System.in);
        char answer = 'Y';
        String enteredTime;
        String response;

        while (Character.toUpperCase(answer) == 'Y')//CHECK ANSWER AFTER CONVERTING TO CAPITAL)
        {
            System.out.print(
                    "Enter a miitary time using the ##:## form ");
            enteredTime = keyboard.nextLine();
            Time time = new Time(enteredTime);
            System.out.println(
                    "Do you want to enter another (Y/N)? ");
            response = keyboard.nextLine();
            answer = response.charAt(0);
        }

    }
}
