import java.util.Scanner;

public class CheckGrade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int size;
        do {
            System.out.print("Nhap vao kich thuoc danh sach : ");
            size = input.nextInt();
            if (size > 30) {
                System.out.println("Chi cho phep quan ly toi da 30 nguoi. Vui long nhap lai");
            }
        } while (size > 30);

        int[] grade = new int[size];
        for (int i = 0; i < size;) {
            System.out.printf("Nhap vao diem cua hoc sinh %d : ", i + 1);
            grade[i] = input.nextInt();
            if (grade[i] >10){
                System.out.println("Su dung thang diem 10, vui long nhap lai");
            } else {
                i++;
            }
        }

        int count = 0;
        for (int i = 0; i < size; i++) {
            if (grade[i]>=5){
                count++;
            }
        }

        System.out.printf("Ket qua : Co %d hoc sinh thi do",count);
    }
}
