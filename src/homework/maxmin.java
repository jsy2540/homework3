package homework;

import java.util.Scanner;


public class maxmin {

	public static void main(String a[]){
		Scanner input = new Scanner(System.in); 

		   int num1   , num2 , num3 ;
		   int min_num = 0   , max_num = 0 ;
		   
		   System.out.println("�R ��° ���ڸ� �Է��ϼ���.");
		   num1 = input.nextInt();
		   
		   System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
		   num2 = input.nextInt();
		   
		   System.out.println("�� ��° ���ڸ� �Է��ϼ���.");
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
		   

		  System.out.println("���� ū ����  " + max_num +"�̰�"+ " ���� ���� ���� "+ min_num +"�Դϴ�.");
		  }
		 }