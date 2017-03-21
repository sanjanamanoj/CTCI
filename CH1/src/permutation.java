/**
 * Created by sanjanamanojkumar on 3/10/17.
 */
public class permutation {

    public static void main(String[] args)
    {
        System.out.println(isPermutation("heyy", "yeyh"));
        System.out.println(isPermutationByBooleanArray("heyy", "yehh"));
    }

    public static boolean isPermutation(String str1, String str2)
    {
        if(str1.length()!=str2.length())
            return false;
        if(sort(str1).equals(sort(str2)))
            return true;
        else
            return false;
    }

    public static String sort(String word)
    {
        char[] letters = word.toCharArray();
        java.util.Arrays.sort(letters);
        return new String(letters);
    }

    public static boolean isPermutationByBooleanArray(String str1, String str2)
    {
        if(str1.length()!=str2.length())
            return false;
        int[] word = new int[128];
        for(int i=0;i<str1.length();i++)
            word[str1.charAt(i)]++;
        for(int i=0;i<str2.length();i++)
            word[str2.charAt(i)]--;
        for(int i =0;i<word.length;i++)
        {
            if(word[i]!=0)
                return false;
        }
        return true;
    }
}
