
//Reverse each word using split
public class Main {
 
      public static void main(String[] args) {
 
          String str = "Java Programming";
          
           //Create an array of words
           //[Java,Programming]
          String[] words = str.split(" ");
          String revString = "";
          
          for(int i = 0; i < words.length; i++) {
              String word = words[i];
              String revWord = "";
 
              for(int j = word.length() - 1; j >= 0; j--) {
                   revWord = revWord + word.charAt(j);
                //System.out.println(revWord);
              }
             //System.out.print(revWord);
              revString = revString + revWord +" " ; 
   }
             
          System.out.println(revString);
     }
}
