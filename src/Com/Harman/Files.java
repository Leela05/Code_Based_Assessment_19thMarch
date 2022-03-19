/*
2.	Create a java project and in that , you have to create a file named
“data.txt” and store this data in that file “HAPPY NEW YEAR” . Create a
program to read the data from the file and display the count of  each of VOWELS
( A E I O U )
 */
package Com.Harman;
import java.io.*;

public class Files {
    public static void main(String[] args) {
        try
        {
            FileInputStream obj_inp = new FileInputStream("data.txt");
            DataInputStream in = new DataInputStream(obj_inp);
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            String str = br.readLine();
            int count[] = new int[5];
            for (int i = 0; i < str.length(); ++i)
            {
                if (str.charAt(i) == 'a' || str.charAt(i) == 'A')
                {
                    count[0]++;
                }
                if (str.charAt(i) == 'e' || str.charAt(i) == 'E') {
                    count[1]++;
                }
                if (str.charAt(i) == 'i' || str.charAt(i) == 'I')
                {
                    count[2]++;
                }
                if (str.charAt(i) == 'o' || str.charAt(i) == 'O')
                {
                    count[3]++;
                }
                if (str.charAt(i) == 'u' || str.charAt(i) == 'U')
                {
                    count[4]++;
                }
            }
            System.out.println("Count of A = " + count[0]);
            System.out.println("Count of E = " + count[1]);
            System.out.println("Count of I = " + count[2]);
            System.out.println("Count of O = " + count[3]);
            System.out.println("Count of U = " + count[4]);
        }
        catch (FileNotFoundException e)
        {
            System.out.println(e);
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
