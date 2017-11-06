package 学生管理系统;

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
		System.out.println("\t\t学生信息管理系统");
		String jx ;
		jx = "y";
		int i = 0;
		while (jx.equals("y")) {
			i++;
			Xg2 stu = new Xg2();
			Scanner input = new Scanner(System.in);
			System.out.print("请输入学生姓名：");
			stu.name = input.next();
			System.out.print("请输入 " + stu.name  + " 的语文成绩：");
			stu.yw = input.nextDouble();
			System.out.print("请输入 " + stu.name  + " 的数学成绩：");
			stu.sx = input.nextDouble();
			System.out.print("请输入 " + stu.name + " 的英语成绩：");
			stu.yy = input.nextDouble();
			stu.ds();
			stu.avg();
			student[i] = stu;
			xs[i]=stu.stll();
			System.out.print("是否继续添加信息(y/n): ");
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
	
	System.out.println("姓名"+"\t"+"语文成绩"+"\t"+"数学成绩"+"\t"+"英语成绩"+"\t"+"平均分"+"\t"+"总分"+"\t"+"名次");
	for (int j = 1; j <= i; j++) {
		
		System.out.println(xs[j] + "\t"+"第" + j + "名");
		
	}
	}
}



