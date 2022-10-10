package challenges;

//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class JavaMap {
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        in.nextLine();

        HashMap<String, Integer> contacts = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            String name=in.nextLine();
            int phone=in.nextInt();
            in.nextLine();
            contacts.put(name, phone);
        }
        while(in.hasNext())
        {
            String s=in.nextLine();
            if (contacts.get(s) == null) {
                System.out.println("Not found");
            } else {
                System.out.println(s + "=" + contacts.get(s));
            }
        }
    }

}
