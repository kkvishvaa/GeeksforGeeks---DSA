public class SearchChar {
    // User function Template for Java

    // Function to search for a character in the string
    public int searchCharacter(String s, char ch) {
        // code here
      char[] charr= s.toCharArray();
       for(int i=0;i<charr.length;i++){
           if(charr[i]==ch){
               return i;
           }
       }
       
       return -1;
    }
}

