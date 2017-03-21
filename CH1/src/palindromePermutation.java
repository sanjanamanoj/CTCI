/**
 * Created by sanjanamanojkumar on 3/16/17.
 */
public class palindromePermutation {

    public static void main(String[] args)
    {
System.out.println(isPalindrome("tacocat"));
    }

    public static boolean isPalindrome(String word)
    {
        int oddCount = 0;
        int[] table = new int[ Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
        for(int i=0;i<word.length();i++)
        {
            int x = word.charAt(i)%table.length;
            table[x]++;
            if(table[x]%2 == 1)
                oddCount++;
            else
                oddCount--;
        }
        return oddCount<=1;
    }
}
