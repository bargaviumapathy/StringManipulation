
class ReverseEachWord {
 
  public static void main(String[] args) {
    
    String input = "This is string reversal";
    
    String[] splitted = input.split("\\s+");
    
    for(int i=0; i<splitted.length; i++){
   
      for(int j= splitted[i].length()-1; j>=0; j--){
        System.out.print(splitted[i].charAt(j));
      }
      
      System.out.print("\t");   
    }
  }
}
