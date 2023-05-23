import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String string1=scn.nextLine();
        String string2=scn.nextLine();

        int flag=0;
        int val=0;
        while ((val=string1.indexOf(string2,val))!=-1){
            int index=string1.indexOf(string2,val);
            val++;
            flag++;

        }
        System.out.println(flag);

    }
}
