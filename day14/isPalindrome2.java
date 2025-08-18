public class isPalindrome2 {
    public static isPal(String s,int start,int end ){
        if(start>=end)
        return true;
        return (s.charAt(start)==s.chartAt(end)) && isPal(s,start+1,end-1);  //T(n)=T(n-1)+theta(n)    time and space=theta(n)
    }
}
