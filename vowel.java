import java.util.Scanner;

/*
Problem Statement
Write a Java program to count both vowels and consonants in a given string Conditions
Only alphabets should be considered for counting
Input:
Hello World!
Output:
Vowels count - 3
Consonants count - 7
Explanation
The vowels in the given string are e,o and o and so the vowels count is 3.
Likewise, the consonants in the given string are h,l,l,w,r,l and d and so the count is 7.
*/
public class vowel
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        str = str.toLowerCase();
        int v= 0, c = 0;
        for(int i=0;i<str.length();i++)
        {
            char ch=str.charAt(i);
            if(ch>='a' && ch<='z')
            {
                if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')
                {
                    v=v+1;
                }
                else
                {
                    c=c+1;
                }
            }
        }
        System.out.println("Vowels count - "+v);
        System.out.println("Consonant Count - "+c);
    }
}
