package abc;
import java.util.Scanner;
public class bcd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("�������ʫ");
		String line = sc.nextLine();
		
		String result = "";
		
		char[] chs = line.toCharArray();
		int o=0;
		while(o<1) {
			if(chs.length%7==0) {
				o=1;
			}
			else {
				System.out.println("�Բ������������Ϣ�����ϸ�ʽ");
				sc = new Scanner(System.in);
				System.out.println("�����������ʫ");
				line = sc.nextLine();
				result = "";
				chs = line.toCharArray();
				o=0;
			}
			for (int x = 0; x<= chs.length - 1; x++) {
				result += chs[x];
			}
		}
		for (int i = 0; i<= chs.length - 1; i++) {
			int j=(i+1)/7;
			System.out.print(chs[i]);
			if((i+1)%7==0) {
				if(j % 2==1)
					System.out.print("��");
				if(j % 2==0)
					System.out.println("��");
			}
		}
		System.out.println("������Ҫ���ҵ��ֻ��");;
		line = sc.nextLine();
		String Result = "";
		char[] cha = line.toCharArray();
		for (int x = 0; x<= cha.length - 1; x++) {
			Result += cha[x];
		}
		int sum=0;
		for (int i = 0; i<= chs.length - 1; i++) {
			if (cha[0]==chs[i])
				for (int j = 0; j<= cha.length - 1; j++) {
					if (cha[j]==chs[i+j])
						sum=sum+1;
					else
						sum=sum;
				}
			else
				sum=sum;
		}
		sum=sum/cha.length;
		System.out.println("�����ҵ��ֻ����ʫ�е���Ŀ�ǣ�"+sum);
		System.out.println("�ټ���");
	}
}
