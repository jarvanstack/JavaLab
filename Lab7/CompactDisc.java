package Git.Gitee.javalab.Lab7;

/*This program creates a list of songs for a CD by reading from a file*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CompactDisc {
    public static void main(String[] args) throws IOException {
        // I can not use the relative path because of the package.So I use
        //absolutely path instead of relative path.
        FileReader file = new FileReader("D:\\Program Files\\JetBrains\\test1\\Lab\\src\\Git\\Gitee\\javalab\\Lab7\\Classics.txt");
        BufferedReader input = new BufferedReader(file);
        String title;
        String artist;

        //Declare an array of songs, called cd, of size 6
        String[] cd = new String[6];
        for (int i = 0; i < cd.length; i++) {
            title = input.readLine();
            artist = input.readLine();
            // fill the array by creating a new song with
            // the title and artist and storing it in the
            // appropriate position in the array
            cd[i] = title + " by " + artist;
        }

        System.out.println("Contents of Classics:");
        for (int i = 0; i < cd.length; i++) {
            //print the contents of the array to the console
            System.out.println(cd[i]);
        }
    }
}
