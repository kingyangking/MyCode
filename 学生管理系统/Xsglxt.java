package ѧ������ϵͳ;

import java.util.Scanner;

public class Xsglxt {
	public static void main(String[] args) {
		int num = 100;
		String[] name = new String[num];
		double[] yw = new double[num];
		double[] sx = new double[num];
		double[] yy = new double[num];
		double[] sum = new double[num];
		double[] avg = new double[num];
		System.out.println("**************************************************");
		System.out.println("\t\tѧ����Ϣ����ϵͳ");
		String jx = new String();
		jx = "y";
		int i = 0;
		String[] stll = new String[100];
		while (jx.equals("y")) {
			i++;
			Scanner input = new Scanner(System.in);
			System.out.print("������ѧ��������");
			name[i]  = input.next();
			System.out.print("������ " + name[i]  + " �����ĳɼ���");
			yw[i] = input.nextDouble();
			System.out.print("������ " + name[i]  + " ����ѧ�ɼ���");
			sx[i] = input.nextDouble();
			System.out.print("������ " + name[i]  + " ��Ӣ��ɼ���");
			yy[i] = input.nextDouble();
			sum[i] = yw[i] + sx[i] +yy[i] ;
			avg[i] = sum[i] / 3.00;
			avg[i]= (int) (avg[i]*100);
			avg[i] = avg[i]/100;
			stll[i] = name[i] + "\t" + yw[i] + "\t" + sx[i]+ "\t"
					+ yy[i] + "\t" + avg[i] + "\t" + sum[i];
			System.out.print("�Ƿ���������Ϣ(y/n): ");
			jx = input.next();
		}
		for(int j=1;j<i;j++)
			{for(int k=j+1;k<=i;k++)
				if(sum[j]<sum[k]){
			String temp = new String(); double f ;
			temp = stll[j];f=sum[j];
			stll[j]=stll[k];sum[j]=sum[k];
			stll[k] = temp;sum[k]=f;
			}
		}
		
		System.out.println("����"+"\t"+"���ĳɼ�"+"\t"+"��ѧ�ɼ�"+"\t"+"Ӣ��ɼ�"+"\t"+"ƽ����"+"\t"+"�ܷ�"+"\t"+"����");
		for (int j = 1; j <= i; j++) {
			
			System.out.println(stll[j] + "\t"+"��" + j + "��");
		}
	}
}
