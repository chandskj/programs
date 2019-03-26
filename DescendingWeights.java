import java.util.*;
class Descending{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();

        Integer [] z = new Integer[n];

        for(int i=0;i<n;i++)
            z[i] = in.nextInt();

        Arrays.sort(z,(a,b) -> {
            int x = a%k;
            int y = b%k;
            
            if(x < y)
                return 1;
            if(x == y)
                return a-b;
            else return -1;        
        });    

        for(int x:z)
            System.out.print(x + " ");
    }
}