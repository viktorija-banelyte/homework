import java.util.Scanner;

static void main() {
Scanner sc = new Scanner(System.in);
    System.out.println("iveskite auksti (ne maziau nei 2): ");
int height = sc.nextInt();
    System.out.println("iveskite ploti(ne maziau nei 2): ");
int width = sc.nextInt();

for (int i = 1; i <= height; i++) {
    for (int j = 1; j <= width; j++) {
        if (i == 1 || i == height || j == 1 || j == width) {
        System.out.print("*");
        }
        else {
            System.out.print(" ");
        }
    }
        System.out.println();
}
}
