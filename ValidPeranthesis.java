public class ValidPeranthesis {
    public static boolean isValid(String s) {

       
        StringBuilder ss= new StringBuilder("");
        
        for(int i=0; i<s.length(); i++)
        {
            char ch = s.charAt(i);
            int len = ss.length();
            System.out.println(ss+" "+len);
            
            if(ch=='(')
            {
                ss.append(ch);
            }
            else if(ch==')')
            {
                if(len>0 && ss.charAt(len-1)=='(')
                {
                    ss.deleteCharAt(len-1);
                }
                else{
                    return false;
                }
                System.out.println(ss);
                
            }
            else if(ch=='{')
            {
                ss.append(ch);
            }
            else if(ch=='}')
            {
                if(len>0 &&  ss.charAt(len-1)=='{')
                {
                    ss.deleteCharAt(len-1);
                }
                else{
                    return false;
                }
                
            }
            else if(ch=='[')
            {
                ss.append(ch);
            }
            else if(ch==']')
            {
                if(len>0 && ss.charAt(len-1)=='[')
                {
                    ss.deleteCharAt(len-1);
                }
                else{
                    return false;
                }
                
            }
        }

        if(ss.isEmpty())
        {
            System.out.println("dsfsdfsdfsdfsdfsd");
            return true;
        }
        else{
            return false;
        }
       


        
    }

    public static void main(String[] args) {
        
        String s = "]";
        System.out.println(isValid(s));
    }
}
