import java.util.Scanner;
public class redpacket {
	public static void main (){
		double min = 0.01;
		Scanner input = new Scanner(System.in);
		System.out.print("�����ܽ�");
		double total = input.nextDouble();
		System.out.print("������������");
		int num = input.nextint();
		
		for(int i=1;i<num;i++){
			double total1=(total-(num-i)*min)/(num-i);
			double money=Math.random()*(total1-min)+min;
			BigDecimal money_bd=new BigDecimal (money);
			money=money_bd.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
			total=total-money;
			BigDecimal total_bd=new BigDemical(total);
			total=total_bd.setScale(2,BigDecimal.ROUND_HALF_UP).doubleValue();
			System.out.println("��"+i+"������Ľ��Ϊ��"+money+"Ԫ");
		}
		System.out.println("��"+num+"������Ľ��Ϊ��"+money+"Ԫ");
	}
}