package homework;
import java.util.*;
public class apartment {

	public static void main(String[] args) {
		Scanner value=new Scanner(System.in);

		System.out.print("����Ʈ�� �о� ����(��������)�� �Է��Ͻÿ�. ");
		double m2_area = value.nextDouble();
		
		double pyung_area = m2_area / 3.305;
		System.out.printf("����Ʈ�� ������   %.1f  �Դϴ�.\n",pyung_area);

		if(pyung_area < 15){
		System.out.println("���� ����Ʈ �Դϴ�.");
		}
		if(15 <= pyung_area && pyung_area < 30){
		System.out.println("�߼��� ����Ʈ �Դϴ�.");
	 	}
		if(30 <= pyung_area && pyung_area < 50){
	        System.out.println("���� ����Ʈ �Դϴ�.");
		}
		if(50 <= pyung_area){
	        System.out.println("���� ����Ʈ �Դϴ�.");
		}					    
		   }
	      }

	