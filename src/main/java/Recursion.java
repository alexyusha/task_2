import java.util.Arrays;
import java.util.List;

public  class Recursion {

    public static Character[] lit = new Character[]{'a','e', 'i', 'o', 'u', 'y', 'A','E', 'I', 'O', 'U', 'Y'};
    public static  List<Character> list = Arrays.asList(lit);
    public  static char space = 32;

    public String recurse(String line){
        if (line.length() <= 0){
            return line;
        }
        else{
            if ( line.length() >= 2 && list.contains(line.charAt(0)) && !(space == line.charAt(1))){
                    return  line.charAt(0) + "*" + recurse(line.substring(1));
            }
            else {
                if (line.length() >= 2 && list.contains(line.charAt(1)) && !(space == line.charAt(0))){
                    return line.charAt(0) + "*" + recurse(line.substring(1));
                }
                else{
                    return line.charAt(0)  + recurse(line.substring(1));
                }
            }
        }
    }
}
