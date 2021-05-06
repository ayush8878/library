// Find Longest subsequence with K distinct character

public class LongestSubSequenceWithKDistinctCharacter
{
 /*
  * This method  will find longest subsequence with k distinct characters
  */
 public static int findLongestSubSequenceWithKDistinctCharacter(String str,int k)
                          {
                          if(str == null || str.length() == 0 || k<0 )
                             {
                               return -1;
                             }
                            int longestSubSequence = 0;
                            int windowStart = 0;
                            java.util.HashMap<Character,Integer> charFrequencyMap = new java.util.HashMap<>(); 
                            for(int windowEnd = 0 ;windowEnd < str.length(); windowEnd++)
                                 {
                                  char charAtEnd = str.charAt(windowEnd);
                                  // Map will store character occurrences in string 
                                  addCharToFrequencyMap(charAtEnd , charFrequencyMap);
                                 
                              while(charFrequencyMap.size() > k)
                                       {
                                          char charAtStart = str.charAt(windowStart);
                                          windowStart++;
                                          removeCharFromFrequencyMap(charAtStart ,charFrequencyMap );
                                        }
                               longestSubSequence  = Math.max(longestSubSequence ,windowEnd - windowStart + 1);    
                                }
                             return longestSubSequence ;
                          }
/*
 * This method will add character in frequency map
 */
private static void  addCharToFrequencyMap( char ch, java.util.HashMap<Character,Integer> charFrequencyMap)
                             {
                               charFrequencyMap.put(ch , charFrequencyMap.getOrDefault(ch,0) + 1 );
                               }





/*
 * This method will remove character frequency from Frequency Map
 */
private static void  removeCharFromFrequencyMap( char ch, java.util.HashMap<Character,Integer> charFrequencyMap)
      {                         
                               charFrequencyMap.put(ch , charFrequencyMap.getOrDefault( ch,0 ) - 1);
                               if(charFrequencyMap.get(ch) == 0)
                                 {
                                  charFrequencyMap.remove(ch);
                                  }
       }

public static void main(String args[])
          {
System.out.print("Longest subsequence with 4 distinct character =  " + findLongestSubSequenceWithKDistinctCharacter("ayushsharma",4));
           }
}
