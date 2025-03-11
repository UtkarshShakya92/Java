package ibmAssesment;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		findDuplicateWords("Java is great and Java is fun. Programming in Java is great.");
	}
	
	public static void findDuplicateWords(String inputString)
	{
		//split and store in array
		String[] words = inputString.split(" ");
		
		//Create an hashMap
		
		Map<String,Integer> wordCount= new HashMap<String, Integer>();
		
		//for loop to iterate over words and store it in map with key and value
		
		for(String word: words)
		{
			//if words is present then increase the value by 1 , 
			//else if words not present put it in key an value
			
			if(wordCount.containsKey(word))
			{
				wordCount.put(word.toLowerCase(),wordCount.get(word)+1 );
			}
			
			else
			{
				wordCount.put(word, 1);
			}
			}
		
		//extracting all the keys of map wordCount
		
		Set<String> wordsInString = wordCount.keySet();
		
		//loop through all the words in Wordcount
		
		for(String word : wordsInString)
		{
			if(wordCount.get(word)>1)
			{
				System.out.println(word +" : "+ wordCount.get(word));
			}
		}
		}


}
