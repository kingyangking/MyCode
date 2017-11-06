package 自学网;

import java.awt.*;
import javax.swing.*;

public class QQck extends JFrame {
			JLabel bq1,bq2,bq3,bq4,bq5,bq6,bq7;
			JPanel mb1,mb2,mb3,mb4;
			JButton an1,an2,an3,an4;
			JTextField wbk;
			JPasswordField mmk;
			JCheckBox fxk1,fxk2;
			JTabbedPane xxk;	//选项卡
			public static void main(String[] args) {
				QQck  lx = new QQck ();// 只需定义一列表名
			}

			public QQck () {
				bq1 = new JLabel(new ImageIcon("images/muuyjd.gif"));
				bq2 =new JLabel("qq号码",JLabel.CENTER);//字体居中
				bq3 = new JLabel("登入密码",JLabel.CENTER);
				bq4 = new JLabel("忘记密码",JLabel.CENTER);
				bq4.setForeground(Color.BLUE);
				bq4.setFont(new Font("宋体",Font.PLAIN+Font.ITALIC,16));
				//plain 字体为一般，bold为粗体，italic为斜体 
				//Font.PLAIN+Font.ITALIC  一般加斜体
				bq5 = new JLabel("<html><a href='www.qq.com'>申请密码保护</a>");
				bq5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				//超链接
				bq6 = new JLabel(new ImageIcon("images/04.png"));
				bq7 = new JLabel(new ImageIcon("images/324.png"));
				mb1 = new JPanel();
				mb2 = new JPanel();
				mb3 = new JPanel();
				mb4 = new JPanel();
				an1 = new JButton(new ImageIcon("images/qqan.png"));//按钮添加图片
				an2 = new JButton("登入");
			    an2.setForeground(Color.BLUE);//设置字体颜色
				an3 = new JButton("取消");
				an3.setBackground(Color.BLUE);//设置按钮背景颜色
				an4 = new JButton("注册");
				an4.setForeground(Color.BLUE);
				wbk = new JTextField(15);
				mmk = new JPasswordField(15);
				fxk1 =new JCheckBox("隐身登入");
				fxk2 = new JCheckBox("记住密码");
				xxk = new JTabbedPane();
				//将三个面板添加到选项卡
				xxk.add("普通用户",mb1); xxk.add("QQ会员",mb2); xxk.add("管理员",mb3);
				
				mb1.setLayout(new GridLayout(3,3));
				//面板1将分成3*3网格
				mb1.add(bq2); mb1.add(wbk); mb1.add(an1);
				mb1.add(bq3); mb1.add(mmk); mb1.add(bq4);
				mb1.add(fxk1);mb1.add(fxk2);mb1.add(bq5);
				mb2.add(bq6);mb3.add(bq7);
				mb4.add(an2); mb4.add(an3); mb4.add(an4);
				
				this.add(bq1,BorderLayout.NORTH);
				this.add(xxk,BorderLayout.CENTER);
				this.add(mb4,BorderLayout.SOUTH);
				
				this.setTitle("QQ登入");
				this.setSize(350, 450);
				this.setIconImage(new ImageIcon("images/qq1.png").getImage());
				this.setLocation(200, 80); // 定义窗口显示位置
				this.setResizable(false);
				this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);// 关闭进程
				this.setVisible(true);
			}
		}

