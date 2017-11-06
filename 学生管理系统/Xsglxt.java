package 学生管理系统;

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
		System.out.println("\t\t学生信息管理系统");
		String jx = new String();
		jx = "y";
		int i = 0;
		String[] stll = new String[100];
		while (jx.equals("y")) {
			i++;
			Scanner input = new Scanner(System.in);
			System.out.print("请输入学生姓名：");
			name[i]  = input.next();
			System.out.print("请输入 " + name[i]  + " 的语文成绩：");
			yw[i] = input.nextDouble();
			System.out.print("请输入 " + name[i]  + " 的数学成绩：");
			sx[i] = input.nextDouble();
			System.out.print("请输入 " + name[i]  + " 的英语成绩：");
			yy[i] = input.nextDouble();
			sum[i] = yw[i] + sx[i] +yy[i] ;
			avg[i] = sum[i] / 3.00;
			avg[i]= (int) (avg[i]*100);
			avg[i] = avg[i]/100;
			stll[i] = name[i] + "\t" + yw[i] + "\t" + sx[i]+ "\t"
					+ yy[i] + "\t" + avg[i] + "\t" + sum[i];
			System.out.print("是否继续添加信息(y/n): ");
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
		
		System.out.println("姓名"+"\t"+"语文成绩"+"\t"+"数学成绩"+"\t"+"英语成绩"+"\t"+"平均分"+"\t"+"总分"+"\t"+"名次");
		for (int j = 1; j <= i; j++) {
			
			System.out.println(stll[j] + "\t"+"第" + j + "名");
		}
	}
}
