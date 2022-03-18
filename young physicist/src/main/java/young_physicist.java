import java.util.Scanner;

public class young_physicist {
    public String idle(int x,int y,int z){
        if (x==0 && y==0 && z==0)
            return "YES";
        else return "NO";
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt();
        int[] b = new int[a * 3];
        int x = 0, y = 0, z = 0;


        for (int i = 0; i < a * 3; i++)
            b[i] = s.nextInt();
        for (int i = 0; i < a * 3; i += 3) {
            x = x + b[i];
            y = y + b[i + 1];
            z = z + b[i + 2];

        }
    }
}
