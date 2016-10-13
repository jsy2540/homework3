package homework;

import java.util.Scanner;


public class maxmin {

	public static void main(String a[]){
		Scanner input = new Scanner(System.in); 

		   int num1   , num2 , num3 ;
		   int min_num = 0   , max_num = 0 ;
		   
		   System.out.println("첮 번째 숫자를 입력하세요.");
		   num1 = input.nextInt();
		   
		   System.out.println("두 번째 숫자를 입력하세요.");
		   num2 = input.nextInt();
		   
		   System.out.println("세 번째 숫자를 입력하세요.");
		   num3 = input.nextInt();
		   
		   if(num1 > num2 && num1 > num3){
			   max_num = num1;
		   }else{
			   min_num = num1;
		   }
		   if(num2 > num1 && num2 > num3){
			   max_num = num2;
		   }else {
			   if(num2 < min_num)
			   min_num = num2;
		   }
		   if(num3 > num1 && num3 > num2){
			   max_num = num3;
		   }else{
			   min_num = num3;
		   }
		   

		  System.out.println("가장 큰 수는  " + max_num +"이고"+ " 가장 작은 수는 "+ min_num +"입니다.");
		  }
		 }