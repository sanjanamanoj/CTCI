/**
 * Created by sanjanamanojkumar on 3/15/17.
 */
public class stringRotation {

    public static void main(String[] args){
        System.out.println(isRotation("waterbottle", "erbottlewat"));
    }

    public static boolean isRotation(String s1, String s2){
        if(s1.length() == s2.length())
        {
            String s1s1 = s1+s1;
            if (s1s1.contains(s2))
                return true;
        }
        return false;
    }
}
