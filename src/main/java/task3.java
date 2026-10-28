import java.util.Scanner;

static void main() {
    System.out.println("iveskite skaiciu nuo 0 iki 12");
    int a, res=1;
    Scanner sc = new Scanner(System.in);
    a = sc.nextInt();
    if (a==0){
        res=1;
    }
    else {
        for(int i=1; i<=a; i++){
            res*=i;
        }
    }
    System.out.println("faktorialas: " + res);
}