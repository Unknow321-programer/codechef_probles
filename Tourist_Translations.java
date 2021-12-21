import java.util.Scanner;
public class Tourist_Translations {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++)
            arr[i] = scan.next();
        String ans="";
        for (int i = 0; i < n; i++) {
            String temp = arr[i];
            for (int j = 0; j < temp.length(); j++) {
                // int a = temp.charAt(j)-'a';
                if(temp.charAt(j)>='A' && temp.charAt(j)<='Z') {
                    int a = temp.charAt(j)-'A';
                    ans = ans +(char) ((s.charAt(a))-32);
                }
                else if(temp.charAt(j)=='_') {
                    ans+=" ";
                }
                else if(temp.charAt(j)>='a' && temp.charAt(j) <='z') {
                    int a = temp.charAt(j)-'a';
                    ans = ans+s.charAt(a);
                }
                else {
                    ans =ans+temp.charAt(j);
                }
                // System.out.println(a+" "+ans +" "+temp.charAt(j));
                
            }
            System.out.println(ans);
            ans="";
        }
        scan.close();
    }
}
