package T2;

import java.util.Scanner;

class calcAvg {
    double m1;
    double m2;
    double m3;
    double avg;

    public calcAvg() {
        m1 = 0;
        m2 = 0;
        m3 = 0;
    }

    public calcAvg(double m1, double m2, double m3) {
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    public void calc() {
        avg = (m1 + m2 + m3) / 3.0;
    }

    public void display(String id, String name) {
        System.out.println("Name = " + name);
        System.out.println("ID = " + id);
        System.out.println("Avg = " + avg);
    }
}

public class Ex1 {
    public static void main(String[] args) {

        String id = "IT2137798";
        String name = "Kamal";

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter mark 1 : ");
        double mark1 = sc.nextDouble();

        System.out.print("Enter mark 2 : ");
        double mark2 = sc.nextDouble();

        System.out.print("Enter mark 3 : ");
        double mark3 = sc.nextDouble();

        calcAvg av = new calcAvg(mark1, mark2, mark3);

        av.calc();
        av.display(id, name);

    }
}