package bank;

import java.util.Scanner;

public class Bank1 {
	int num;
	String name;
	String address;
	String password;
	double balance;/* ������ */
	static double min=0 ;/* ��С��� */

	public void newaccout() {
		// �½��û�
		balance =10;
		}

	public  void drawmoney(double d) {
		// ȡ��
		System.out.println("��" + balance + "  ����ȡ����: " + d);
		double m;
		m = balance - d;
		if (m <min)
			System.out.println("ȡ����������ܾ�ȡ���");
		else
			balance = balance - d;
	}

	public  void deposit(double p) {
		// ���
		System.out.println("��" + this.balance + "  ���մ����: " + p);
		balance = balance + p;
	}

	public void printS() {
		System.out.println("�˺ţ�" + num+"  "+"���룺" + password+"  "+"������" + name+"  "+"��ַ��" + address+"  "+"��" + balance);
		
		}
	public static void main(String[] args) {
		Bank1[] p = new Bank1[100];
		int n=2017001;
		for(int i=0;;i++){
		System.out.println("**************************************************");
		System.out.println("1������"+"  "+"2�����"+"  "+"3��ȡ��"+"  "+"4���˳�");
		System.out.print("������ѡ� ");
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		Bank1 p1 = new Bank1();
		switch (m) {
		case 1://�½��û�
			p1.num=n;n++;
			System.out.print("������������ ");
			p1.name=input.next();
			System.out.print("�������ͥ��ַ�� ");
			p1.address=input.next();
			System.out.print("���������룺 ");
			p1.password=input.next();
			p1.newaccout();
			p[p1.num-2017000]=p1;
			System.out.println("�����ɹ� ");
			p[p1.num-2017000].printS();
			break;
		case 2://���
			System.out.print("�������˺ţ� ");
			int w = input.nextInt();
			w=w-2017000;
			String q = "y";
			while(q.equals("y")){
			System.out.print("���������룺 ");
			String t= input.next();
			if(p[w].password.equals(t)){
			System.out.print("��������� ");
			double h = input.nextDouble();
			p[w].deposit(h);
			p[w].printS();break;}
			else
				System.out.print(" ������� ����"+"\n"+"�Ƿ�������������(y/n)");
			 q= input.next();
			}
			break;
		case 3://ȡ��
			System.out.print("�������˺ţ� ");
			int w1 = input.nextInt();
			w1=w1-2017000;
			String q1 = "y";
			while(q1.equals("y")){
			System.out.print("���������룺 ");
			String t= input.next();
			if(p[w1].password.equals(t)){
			System.out.print("������ȡ��� ");
			double h = input.nextDouble();
			p[w1].drawmoney(h);
			p[w1].printS();break;}
			else
				System.out.print(" ������� ����"+"\n"+"�Ƿ�������������(y/n)");
			 q= input.next();
			}
			break;
		default:
			System.out.print("��������");break;
		}
		}
	}
	}