import java.util.Scanner;

public class HackerCallange102 {

    public static void main(String[] args) {

        int B,H,Area;
        Scanner inp= new Scanner(System.in);
        do {
            System.out.print("Enter B : ");
            B = inp.nextInt();
        }while (B>=100||B<=-100);
        do {
            System.out.print("Enter H : ");
            H = inp.nextInt();
        }while (H>=100||H<=-100);


        if(B<=0||H<=0){
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }else{
            Area=B*H;
            System.out.println("Area= "+Area);
        }

    }
}
