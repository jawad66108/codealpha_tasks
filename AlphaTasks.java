import java.util.Scanner;

class Marks {
    public void findMaxMin(int[] a, int n) {
        int max = a[0];
        int min = a[0];

        for (int i = 1; i < n; i++) {
            if (a[i] > max) {
                max = a[i];
            }
            if (a[i] < min) {
                min = a[i];
            }
        }

        System.out.println("Maximum marks: " + max);
        System.out.println("Minimum marks: " + min);
    }
}

public class AlphaTasks {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int t_std = in.nextInt();

        int[] t_marks = new int[t_std];
        int sum = 0;

        for (int i = 0; i < t_std; i++) {
            System.out.print("Enter marks for Student " +(i+1)+ ": ");
            t_marks[i] = in.nextInt();
            sum += t_marks[i];
        }

        double avg = (double) sum / t_std;
        System.out.println("\nTotal Marks: " + sum);
        System.out.println("Average Marks: " + avg);

        Marks m = new Marks();
        m.findMaxMin(t_marks, t_std);
    }
}