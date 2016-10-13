package homework;
import java.util.Scanner;
public class day {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year[] = {31,28,31,30,31,30,31,31,30,31,30,31};
		int month, day;
		
		System.out.print("월을 입력하시오 : ");
		month = input.nextInt();
		System.out.print("일을 입력하시오 : ");
		day = input.nextInt();

		  int day_count = 0;

		 for(int i=1; i<month; i++){
		   if(month != 1){
			   day_count += year[i-1];
		   }
		  }
		 day_count += day;
		  System.out.println("이 날짜는 1년중 "+day_count+"번째 날에 해당됩니다.");
		 }
		}
