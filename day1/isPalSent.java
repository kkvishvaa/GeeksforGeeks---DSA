class Solution {
    public boolean isPalinSent(String s) {
       
        String cleaned = s.toLowerCase().replaceAll("[^a-z0-9]", "");

   
       
        
            String reversed = new StringBuilder(cleaned).reverse().toString();
        
          
        return cleaned.equals(reversed);

    }
}