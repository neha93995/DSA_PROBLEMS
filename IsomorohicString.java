import java.util.*;

public class IsomorohicString {
    
    public static boolean isIsomorphic(String s, String t) {
        
        HashMap hm = new HashMap();

        for(int i=0; i<s.length(); i++)
        {
            if(hm.containsKey(s.charAt(i)))
            {
                if( t.charAt(i)!=(char)hm.get(s.charAt(i)))
                {
                    return false;
               }
            } 
            else if(hm.containsValue(t.charAt(i)) )
            {
                return false;
            }
            hm.put(s.charAt(i), t.charAt(i));
            

        }


        System.out.println(hm);
        return true;
        
    }

public static void main(String[] args) {
    
    String s1 = "egg";
    String s2 = "add";

    System.out.println(isIsomorphic(s1, s2));

    
}
    
}
