import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RecursionMain {
    public static void main(String[] args) throws IOException {
        Recursion recursion = new Recursion();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        System.out.println("To exit, enter \"exit\".");
        System.out.print("Enter a string: ");
        while (!(line = reader.readLine()).equals("exit")) {
            System.out.println(recursion.recurse(line));
            System.out.print("Enter a string: ");
        }
    }
}
