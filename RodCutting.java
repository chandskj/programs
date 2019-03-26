
import java.util.*;
class Rod_Cutting
{
       int rod_cut(int rod_len)
       {
            int c=0;
            if(rod_len==1 || rod_len==2)
                return 0;
            else if(rod_len==3)
                return 1;
            while(rod_len>2)
            {
                rod_len=special_rod(rod_len);
                    c++;
            }
            return c;
       }
       int special_rod(int len)
       {
            int len1;
            len1=len-1;
            return (len1/2);
       }
}
class TestClass {
    public static void main(String args[] ) throws Exception {
        try
        {
            Scanner sc=new Scanner(System.in);
            int q=sc.nextInt();
            Sol s=new Sol();
            for(int i=1;i<=q;i++)
            {
                int rod_len=sc.nextInt();
                int res=s.rod_cut(rod_len);
                System.out.println(res);
            }
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
}