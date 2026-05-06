import java.util.*;

public class CyclicSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();
        int n=s.length();

        String t=s+s;  

        Set<Character> set = new HashSet<>();
        int j=0,maximum=0, current=0;

        for (int i=0;i<2*n;i++) {
            char ch=t.charAt(i);

           
            while (set.contains(ch) || (i-j + 1) > n) {
                char lch= t.charAt(j);
                set.remove(lch);
                current-=(lch - 'a' + 1);
                j++;
            }

            set.add(ch);
            current+=(ch - 'a' + 1);

            maximum=Math.max(maximum,current);
        }

        System.out.println(maximum);
        sc.close();
    }
}