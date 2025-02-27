/* Lab 2:
 * Class: UniqueWords.java
 * Jakub Cholko
 *2/27/25
 *This code looks and counts how many unique words are in the arraylist.
 */
import java.util.ArrayList;
public class UniqueWords
{
  /**
       Counts the number of unique strings in a list
       @param list ArrayList of strings to be examined
       @return number of unique strings in the list
  */
  public static int countUnique(ArrayList<String> list)
  {
     int count = 0;
     for (int i = 0; i < list.size(); i++) {
          int similar = 0;
          for(int j = 0; j < list.size();j++) {
       	   if(list.get(i).equals(list.get(j))) {
       		   similar++;
       	   }
          }
          if(similar == 1) {
       	   count++;
          }
     }
     return count;
  }
  public static void main(String[] args)
  {
     ArrayList<String> words = new ArrayList<>();
     words.add("apple");
     words.add("orange");
     words.add("blackboard");
     words.add("apple");
     words.add("orange");
     words.add("sun");
     words.add("moon");
 
     int unique = countUnique(words);
     System.out.println(words + " has " + unique + " unique words");
  }
}

