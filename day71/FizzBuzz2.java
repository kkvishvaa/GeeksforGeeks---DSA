public class FizzBuzz2 {

    public static ArrayList<String> fizzBuzz(int n) {
        // code here
        ArrayList<String> list=new ArrayList<String>();
        list.add("1");
        list.add("2");
        for(int i=3;i<n+1;i++){
            if(i%3==0 && i%5==0){
                list.add("FizzBuzz");
            }
            else if(i%3==0){
                 list.add("Fizz");
            }
            else if(i%5==0){
                 list.add("Buzz");
            }
            else{
                list.add(Integer.toString(i));
            }
        }
        return list;
    }
}


