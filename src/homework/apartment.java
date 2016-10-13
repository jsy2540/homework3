package homework;
import java.util.*;
public class apartment {

	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);

		System.out.print("아파트의 분양 면적(제곱미터)를 입력하시오. ");
		double m2_area = value.nextDouble();
		
		double pyung_area = m2_area / 3.305;
		System.out.printf("아파트의 평형은   %.1f  입니다.\n",pyung_area);

		if(pyung_area < 15){
		System.out.println("소형 아파트 입니다.");
		}
		if(15 <= pyung_area && pyung_area < 30){
		System.out.println("중소형 아파트 입니다.");
	 	}
		if(30 <= pyung_area && pyung_area < 50){
	        System.out.println("중형 아파트 입니다.");
		}
		if(50 <= pyung_area){
	        System.out.println("대형 아파트 입니다.");
		}					    
		   }
	      }

	