package homework;
import java.util.Scanner;
public class day {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int month, day;
		
		System.out.print("���� �Է��Ͻÿ� : ");
		month = input.nextInt();
		System.out.print("���� �Է��Ͻÿ� : ");
		day = input.nextInt();

		  int day_count = 0;

		 for(int i=1; i<month; i++){
		   if(month != 1){
			   day_count += year[i-1];
		   }
		  }
		 day_count += day;
		  System.out.println("�� ��¥�� 1���� "+day_count+"��° ���� �ش�˴ϴ�.");
		 }
		}
