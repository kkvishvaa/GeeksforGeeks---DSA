public class Vowel {
    String isVowel(char c) {
        // code here
        c=Character.toLowerCase(c);
        if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
          return "YES";  
        }else{
            return "NO";
        }
    }
}

