package ѧ������ϵͳ;

import java.util.Scanner;

class Xg2 {
	String name ;
	double yw ;
	double sx ;
	double yy ;
	double sum ;
	double ds()
	{
		this.sum = yw+sx+yy;
		return this.sum;
	}
	double avg(){
		double avg;
		avg=this.sum/3;
		avg= (int) (avg*100);
		avg = avg/100;
		return avg;
	}
      String stll (){
		return (this.name+"\t"+this.yw+"\t"+this.sx+"\t"+this.yy+"\t"
				+this.avg()+"\t"+this.sum);
	}
	public static void main(String[] args) {
		Xg2[] student = new Xg2[100];
		String[] xs = new String[100];
		System.out.println("**************************************************");
		System.out.println("\t\tѧ����Ϣ����ϵͳ");
		String jx ;
		jx = "y";
		int i = 0;
		while (jx.equals("y")) {
			i++;
			Xg2 stu = new Xg2();
			Scanner input = new Scanner(System.in);
			System.out.print("������ѧ��������");
			stu.name = input.next();
			System.out.print("������ " + stu.name  + " �����ĳɼ���");
			stu.yw = input.nextDouble();
			System.out.print("������ " + stu.name  + " ����ѧ�ɼ���");
			stu.sx = input.nextDouble();
			System.out.print("������ " + stu.name + " ��Ӣ��ɼ���");
			stu.yy = input.nextDouble();
			stu.ds();
			stu.avg();
			student[i] = stu;
			xs[i]=stu.stll();
			System.out.print("�Ƿ���������Ϣ(y/n): ");
			jx = input.next();
		}
		for(int j=1;j<i;j++)
		{for(int k=j+1;k<=i;k++)
			if(student[j].sum<student[k].sum){
		String temp = new String(); double f ;
		temp = xs[j];f=student[j].sum;
		xs[j]=xs[k];student[j].sum=student[k].sum;
		xs[k] = temp;student[k].sum=f;
		}
	}
	
	System.out.println("����"+"\t"+"���ĳɼ�"+"\t"+"��ѧ�ɼ�"+"\t"+"Ӣ��ɼ�"+"\t"+"ƽ����"+"\t"+"�ܷ�"+"\t"+"����");
	for (int j = 1; j <= i; j++) {
		
		System.out.println(xs[j] + "\t"+"��" + j + "��");
		
	}
	}
}



