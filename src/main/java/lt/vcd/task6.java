import java.util.Scanner;

static void main() {
    Scanner sc = new Scanner(System.in);
    int n;
    System.out.println("iveskite skaiciu kuris ne mazesnis 2");
    n=sc.nextInt();
    for(int i=2; i<=n; i++){
        boolean prime = true;
        for(int j = 2; j < i; j++) {
            if (i % j == 0) {
                prime = false;
                break;
            }
        }
        if(prime){
            System.out.println(i + " ");
        }
    }
}