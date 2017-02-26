import java.util.Map;
import java.util.HashMap;

public class WordList
{
    public static void main(String[] args)
    {
        new WordList().numWords("Cat is smaller than dog and dog is bigger than cat.");
    }
    public void numWords(String input)
    {
        Map map = new HashMap();
        
        if (input != null)
        {
            String [] wordSeparation = input.split(" ");
            for (String s : wordSeparation)
            {
                if (map.containsKey(s))
                {
                    int count = Integer.parseInt((String)map.get(s));
                    map.put(s, String.valueOf(count + 1));
                }
                else
                {
                    map.put(s, "1");
                }
            }
        }
        System.out.println("Each word is written this many times: " + map);
    }
}