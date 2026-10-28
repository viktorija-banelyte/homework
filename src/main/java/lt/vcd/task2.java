import java.util.Scanner;

static void main() {
    Scanner sc = new Scanner(System.in);
    int n, sum = 0;
    System.out.println("iveskite skaiciu");
    n=sc.nextInt();
    for(int i=2; i<=n; i=i+2){
        System.out.print(i + " ");
        sum++;
    }
    System.out.println(" ");
    System.out.println(sum);
}