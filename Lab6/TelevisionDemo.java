package Git.Gitee.javalab.Lab6;

/** This class demonstrates the Television class*/
import java.util.Scanner;
public class TelevisionDemo
{
    public static void main(String[] args)

    {
        //create a Scanner object to read from the keyboard
        Scanner keyboard = new Scanner (System.in);

        //declare variables
        int station; //the user’s channel choice

        //declare and instantiate a television object
        Television bigScreen = new Television("Toshiba", 55);
        //turn the power on
        bigScreen.power();
        //display the state of the television
        System.out.println("A " + bigScreen.getScreenSize() +
                bigScreen.getManufacturer() + " has been turned on.");
        //prompt the user for input and store into station
        System.out.print("What channel do you want? ");
        station = keyboard.nextInt();

        //change the channel on the television
        bigScreen.setChannel(station);
        //increase the volume of the television
        bigScreen.increaseVolume();
        //display the the current channel and volume of the television
        System.out.println("Channel: " + bigScreen.getChannel() +
                " Volume: " + bigScreen.getVolume());
        System.out.println("Too loud!! I am lowering the volume.");
        //decrease the volume of the television
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        bigScreen.decreaseVolume();
        //display the current channel and volume of the television
        System.out.println("Channel: " + bigScreen.getChannel() +
                " Volume: " + bigScreen.getVolume());
        System.out.println(); //for a blank line
        //HERE IS WHERE YOU DO TASK #5
        //Task #5
        //2. Declare another Television object called portable.
        //3. Instantiate portable to be a Sharp 19 inch television.
        Television portabel = new Television("portabel", 19);
        //Task #5 4. Use a call to the power method to turn the power on.
        portabel.power();
        // Task #5 5. Use calls to the accessor methods to print what television was turned on.
        System.out.println("A " + portabel.getScreenSize() +
                portabel.getManufacturer() + " has been turned on.");
        //prompt the user for input and store into station
        System.out.print("What channel do you want? ");
        station = keyboard.nextInt();

        //change the channel on the television
        portabel.setChannel(station);
        //Task #5 6. decrease the volume by two.
        portabel.decreaseVolume();
        portabel.decreaseVolume();
        //Task #5 7. Use calls to the accessor methods to print the changed state of the portable.
        System.out.println("Channel: " + portabel.getChannel() +
                " Volume: " + portabel.getVolume());


    }
}