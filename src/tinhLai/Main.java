package tinhLai;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double money=1.0;
int month=1;
double intersRate=1.0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap so tien muon gui");
        money=scanner.nextDouble();
        System.out.println("Nhap so thang muon gui");
        month=scanner.nextInt();
        System.out.println("Nhap so Lai Suat");
        intersRate=scanner.nextDouble();
        double totalInterest = 0;
        for (int i =0;i<month;i++){
            totalInterest+=money*(intersRate/100)/12*month;
        }
        System.out.println("Tong lai suat"+totalInterest);
    }
}
