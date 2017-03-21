/**
 * Created by sanjanamanojkumar on 3/15/17.
 */
public class URLify {

    public static void main(String[] args)
    {
        String sentence = "Mr John Smith    ";
        System.out.println(urlify(sentence.toCharArray(),13));
    }

    public static String urlify(char[] str, int len)
    {
        int spaceCount =0;
        for(int i=0;i<len;i++)
        {
            if(str[i] == ' ')
                spaceCount++;
        }
        int index = len + spaceCount *2;
        if(len < str.length)
            str[len]='\0';
        for(int i = len -1;i>=0;i--)
        {
            if(str[i]==' ')
            {
                str[index - 1] = '0';
                str[index - 2] = '2';
                str[index - 3] = '%';
                index -=3;
            }
            else
            {
                str[index -1] = str[i];
                index--;
            }
        }
        return new String(str);
    }
}
