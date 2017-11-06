package bank;

import java.util.Scanner;

public class Bank1 {
	int num;
	String name;
	String address;
	String password;
	double balance;/* 存款余额 */
	static double min=0 ;/* 最小金额 */

	public void newaccout() {
		// 新建用户
		balance =10;
		}

	public  void drawmoney(double d) {
		// 取款
		System.out.println("余额：" + balance + "  今日取款金额: " + d);
		double m;
		m = balance - d;
		if (m <min)
			System.out.println("取款金额大于余额，拒绝取款！！");
		else
			balance = balance - d;
	}

	public  void deposit(double p) {
		// 存款
		System.out.println("余额：" + this.balance + "  今日存款金额: " + p);
		balance = balance + p;
	}

	public void printS() {
		System.out.println("账号：" + num+"  "+"密码：" + password+"  "+"姓名：" + name+"  "+"地址：" + address+"  "+"余额：" + balance);
		
		}
	public static void main(String[] args) {
		Bank1[] p = new Bank1[100];
		int n=2017001;
		for(int i=0;;i++){
		System.out.println("**************************************************");
		System.out.println("1、开户"+"  "+"2、存款"+"  "+"3、取款"+"  "+"4、退出");
		System.out.print("请输入选项： ");
		Scanner input = new Scanner(System.in);
		int m = input.nextInt();
		Bank1 p1 = new Bank1();
		switch (m) {
		case 1://新建用户
			p1.num=n;n++;
			System.out.print("请输入姓名： ");
			p1.name=input.next();
			System.out.print("请输入家庭地址： ");
			p1.address=input.next();
			System.out.print("请设置密码： ");
			p1.password=input.next();
			p1.newaccout();
			p[p1.num-2017000]=p1;
			System.out.println("开户成功 ");
			p[p1.num-2017000].printS();
			break;
		case 2://存款
			System.out.print("请输入账号： ");
			int w = input.nextInt();
			w=w-2017000;
			String q = "y";
			while(q.equals("y")){
			System.out.print("请输入密码： ");
			String t= input.next();
			if(p[w].password.equals(t)){
			System.out.print("请输入存款金额： ");
			double h = input.nextDouble();
			p[w].deposit(h);
			p[w].printS();break;}
			else
				System.out.print(" 密码错误 ！！"+"\n"+"是否重新输入密码(y/n)");
			 q= input.next();
			}
			break;
		case 3://取款
			System.out.print("请输入账号： ");
			int w1 = input.nextInt();
			w1=w1-2017000;
			String q1 = "y";
			while(q1.equals("y")){
			System.out.print("请输入密码： ");
			String t= input.next();
			if(p[w1].password.equals(t)){
			System.out.print("请输入取款金额： ");
			double h = input.nextDouble();
			p[w1].drawmoney(h);
			p[w1].printS();break;}
			else
				System.out.print(" 密码错误 ！！"+"\n"+"是否重新输入密码(y/n)");
			 q= input.next();
			}
			break;
		default:
			System.out.print("输入有误");break;
		}
		}
	}
	}