import java.util.HashMap;
import java.util.Map;

class CountCharOccurence {
  
  public void countOccurence(String input){
    
    Map<Character, Integer> countMap = new HashMap<Character,Integer>();
    
    char[] inputArray = input.toCharArray();
    
     for(int i=0; i<inputArray.length; i++){
         
       if(!countMap.containsKey(inputArray[i])){
         countMap.put(inputArray[i],1);
       }
       else{
          countMap.put(inputArray[i],countMap.get(inputArray[i])+1);
       }
     }
       
     for (Map.Entry<Character,Integer> entry : countMap.entrySet())  
            System.out.println("character = " + entry.getKey() + 
                             ", occurences = " + entry.getValue()); 
     
  }
  
  public static void main(String[] args) {
    
    String input = "This is brown fox with a pair of Socks";
    
    CountCharOccurence c = new CountCharOccurence();
    
    c.countOccurence(input);
    
    
  }
}
