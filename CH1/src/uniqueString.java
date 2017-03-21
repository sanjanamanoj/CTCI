public class uniqueString {

    public static void main(String[] args){
        System.out.println(isUnique("heLlo"));
    }

    public static boolean isUnique(String word){
        boolean[] unique = new boolean[128];
        for(int i=0;i<word.length();i++)
        {
            if(!unique[word.charAt(i)])
                unique[word.charAt(i)] = true;
            else
                return false;

        }

        return true;
    }
}