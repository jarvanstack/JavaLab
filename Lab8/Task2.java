package Git.Gitee.javalab.Lab8;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * 2. Write a main method that will read the file secret.txt, separate it into word tokens.
 * 3. You should process the tokens by taking the first letter of every fifth word,
 * starting with the first word in the file. These letters should converted to capitals,
 * then be appended to a StringBuffer object to form a word which will be printed to
 * the console to display the secret message.
 */
public class Task2 {
    public static void main(String[] args) {
        //because of the package of the Class so I can not use the relative path
        //I use absolutely path instead it.
        try {
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            FileReader fileReader = new FileReader("D:\\Program Files\\JetBrains\\test1\\" +
                    "Lab\\src\\Git\\Gitee\\javalab\\Lab8\\secret.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            while ((line = bufferedReader.readLine()) != null) {
                //use StringTokenizer to split the String
                StringTokenizer stringTokenizer = new StringTokenizer(line);
                while (stringTokenizer.hasMoreElements()){
                    stringBuilder.append(stringTokenizer.nextToken().charAt((0)));
                }
            }
            System.out.println("the result is : " + stringBuilder);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
// *               ii.                                         ;9ABH,
// *              SA391,                                    .r9GG35&G
// *              &#ii13Gh;                               i3X31i;:,rB1
// *              iMs,:,i5895,                         .5G91:,:;:s1:8A
// *               33::::,,;5G5,                     ,58Si,,:::,sHX;iH1
// *                Sr.,:;rs13BBX35hh11511h5Shhh5S3GAXS:.,,::,,1AG3i,GG
// *                .G51S511sr;;iiiishS8G89Shsrrsh59S;.,,,,,..5A85Si,h8
// *               :SB9s:,............................,,,.,,,SASh53h,1G.
// *            .r18S;..,,,,,,,,,,,,,,,,,,,,,,,,,,,,,....,,.1H315199,rX,
// *          ;S89s,..,,,,,,,,,,,,,,,,,,,,,,,....,,.......,,,;r1ShS8,;Xi
// *        i55s:.........,,,,,,,,,,,,,,,,.,,,......,.....,,....r9&5.:X1
// *       59;.....,.     .,,,,,,,,,,,...        .............,..:1;.:&s
// *      s8,..;53S5S3s.   .,,,,,,,.,..      i15S5h1:.........,,,..,,:99
// *      93.:39s:rSGB@A;  ..,,,,.....    .SG3hhh9G&BGi..,,,,,,,,,,,,.,83
// *      G5.G8  9#@@@@@X. .,,,,,,.....  iA9,.S&B###@@Mr...,,,,,,,,..,.;Xh
// *      Gs.X8 S@@@@@@@B:..,,,,,,,,,,. rA1 ,A@@@@@@@@@H:........,,,,,,.iX:
// *     ;9. ,8A#@@@@@@#5,.,,,,,,,,,... 9A. 8@@@@@@@@@@M;    ....,,,,,,,,S8
// *     X3    iS8XAHH8s.,,,,,,,,,,...,..58hH@@@@@@@@@Hs       ...,,,,,,,:Gs
// *    r8,        ,,,...,,,,,,,,,,.....  ,h8XABMMHX3r.          .,,,,,,,.rX:
// *   :9, .    .:,..,:;;;::,.,,,,,..          .,,.               ..,,,,,,.59
// *  .Si      ,:.i8HBMMMMMB&5,....                    .            .,,,,,.sMr
// *  SS       :: h@@@@@@@@@@#; .                     ...  .         ..,,,,iM5
// *  91  .    ;:.,1&@@@@@@MXs.                            .          .,,:,:&S
// *  hS ....  .:;,,,i3MMS1;..,..... .  .     ...                     ..,:,.99
// *  ,8; ..... .,:,..,8Ms:;,,,...                                     .,::.83
// *   s&: ....  .sS553B@@HX3s;,.    .,;13h.                            .:::&1
// *    SXr  .  ...;s3G99XA&X88Shss11155hi.                             ,;:h&,
// *     iH8:  . ..   ,;iiii;,::,,,,,.                                 .;irHA
// *      ,8X5;   .     .......                                       ,;iihS8Gi
// *         1831,                                                 .,;irrrrrs&@
// *           ;5A8r.                                            .:;iiiiirrss1H
// *             :X@H3s.......                                .,:;iii;iiiiirsrh
// *              r#h:;,...,,.. .,,:;;;;;:::,...              .:;;;;;;iiiirrss1
// *             ,M8 ..,....,.....,,::::::,,...         .     .,;;;iiiiiirss11h
// *             8B;.,,,,,,,.,.....          .           ..   .:;;;;iirrsss111h
// *            i@5,:::,,,,,,,,.... .                   . .:::;;;;;irrrss111111
// *            9Bi,:,,,,......                        ..r91;;;;;iirrsss1ss1111***/
//
