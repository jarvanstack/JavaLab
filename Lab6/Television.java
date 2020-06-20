package Git.Gitee.javalab.Lab6;
//Task #1 2. Put a program header (comments/documentation) at the top of the file
// The purpose of this class is to model a television
// Your name and today’s date
public class Television {
    //Task #1 3. Declare the 2 constant fields listed in the UML diagram.
    private static  String MANUFACTURER ;//The manufacturer attribute will hold the brand name
    private static  int SCREEN_SIZE ;//The screenSize attribute will hold the size of the television screen

    //Task #1 4. Declare the 3 remaining fields listed in the UML diagram.
    private boolean powerOn;//The powerOn attribute will hold the value true if the power is on, and false if the power is off.
    private int channel;//The channel attribute will hold the value of the station that the television is showing.
    private int volume;//The volume attribute will hold a number value representing the loudness(0 being no sound).

    /**
     * Task #2 Writing a Constructor
     * 1. Create a constructor definition that has two parameters, a manufacturer’s brand
     * and a screen size. These parameters will bring in information
     *
     * @param brand
     * @param size
     */
    public Television(String brand,int size){
        //Task #2 3. Initialize the powerOn field to false (power is off), the volume to 20, and the
        //channel to 2.
        MANUFACTURER = brand;
        SCREEN_SIZE = size;
        powerOn = false;
        volume = 20;
        channel = 2;
    }

    /**
     * Task #3 1. Define accessor methods called getVolume, getChannel, getManufacturer, and
     * getScreenSize that return the value of the corresponding field.
     * this one would get the Manufacturer
     *
     * @return this method will return the Manufacturer
     */
    public static String getManufacturer() {
        return MANUFACTURER;
    }

    /**
     * this method will return the screenSize
     *
     * @return this method will return the screenSize
     */
    public static int getScreenSize() {
        return SCREEN_SIZE;
    }
    /**
     * this method will return the channel
     *
     * @return this method will return the channel
     */
    public int getChannel() {
        return channel;
    }
    /**
     * this method will return the volume
     *
     * @return this method will return the volume
     */
    public int getVolume() {
        return volume;
    }

    /**
     * 2. Define a mutator method called setChannel accepts a value to be stored in the
     * channel field.
     *
     * @param station
     */
    public void setChannel(int station){
        channel = station;
    }

    /**
     * Task #3
     * 3. Define a mutator method called power that changes the state from true to false or
     * from false to true.
     */
    public void power(){
        powerOn = !powerOn;
    }

    /**
     * Task #3
     * 4.  One method should be called increaseVolume and will increase the volume by 1.
     */
    public void increaseVolume(){
        volume ++;
    }

    /**
     * The other method should be
     * called decreaseVolume and will decrease the volume by 1.
     */
    public void decreaseVolume(){
        volume --;
    }

}
