import org.w3c.dom.ls.LSOutput;

import java.util.*;
public class Input {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            //int n = Integer.parseInt(sc.nextLine());
            String name = sc.nextLine();
            System.out.println("Hi " + name + "," + "How r you?");
            for(int i=1; i<=n; i++){
                System.out.println(i);
            }
    }
}
