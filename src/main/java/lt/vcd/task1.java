import java.util.Scanner;

static void main() {
    int a;
    Scanner sc = new Scanner(System.in);
    System.out.println("iveskite skaiciu");
    a=sc.nextInt();
    for (int i = 1; i <= 10; i++){
        System.out.println(a + "x" + i + "=" + a*i);
    }
}
