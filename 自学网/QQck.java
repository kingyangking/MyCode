package ��ѧ��;

import java.awt.*;
import javax.swing.*;

public class QQck extends JFrame {
			JLabel bq1,bq2,bq3,bq4,bq5,bq6,bq7;
			JPanel mb1,mb2,mb3,mb4;
			JButton an1,an2,an3,an4;
			JTextField wbk;
			JPasswordField mmk;
			JCheckBox fxk1,fxk2;
			JTabbedPane xxk;	//ѡ�
			public static void main(String[] args) {
				QQck  lx = new QQck ();// ֻ�趨��һ�б���
			}

			public QQck () {
				bq1 = new JLabel(new ImageIcon("images/muuyjd.gif"));
				bq2 =new JLabel("qq����",JLabel.CENTER);//�������
				bq3 = new JLabel("��������",JLabel.CENTER);
				bq4 = new JLabel("��������",JLabel.CENTER);
				bq4.setForeground(Color.BLUE);
				bq4.setFont(new Font("����",Font.PLAIN+Font.ITALIC,16));
				//plain ����Ϊһ�㣬boldΪ���壬italicΪб�� 
				//Font.PLAIN+Font.ITALIC  һ���б��
				bq5 = new JLabel("<html><a href='www.qq.com'>�������뱣��</a>");
				bq5.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
				//������
				bq6 = new JLabel(new ImageIcon("images/04.png"));
				bq7 = new JLabel(new ImageIcon("images/324.png"));
				mb1 = new JPanel();
				mb2 = new JPanel();
				mb3 = new JPanel();
				mb4 = new JPanel();
				an1 = new JButton(new ImageIcon("images/qqan.png"));//��ť���ͼƬ
				an2 = new JButton("����");
			    an2.setForeground(Color.BLUE);//����������ɫ
				an3 = new JButton("ȡ��");
				an3.setBackground(Color.BLUE);//���ð�ť������ɫ
				an4 = new JButton("ע��");
				an4.setForeground(Color.BLUE);
				wbk = new JTextField(15);
				mmk = new JPasswordField(15);
				fxk1 =new JCheckBox("�������");
				fxk2 = new JCheckBox("��ס����");
				xxk = new JTabbedPane();
				//�����������ӵ�ѡ�
				xxk.add("��ͨ�û�",mb1); xxk.add("QQ��Ա",mb2); xxk.add("����Ա",mb3);
				
				mb1.setLayout(new GridLayout(3,3));
				//���1���ֳ�3*3����
				mb1.add(bq2); mb1.add(wbk); mb1.add(an1);
				mb1.add(bq3); mb1.add(mmk); mb1.add(bq4);
				mb1.add(fxk1);mb1.add(fxk2);mb1.add(bq5);
				mb2.add(bq6);mb3.add(bq7);
				mb4.add(an2); mb4.add(an3); mb4.add(an4);
				
				this.add(bq1,BorderLayout.NORTH);
				this.add(xxk,BorderLayout.CENTER);
				this.add(mb4,BorderLayout.SOUTH);
				
				this.setTitle("QQ����");
				this.setSize(350, 450);
				this.setIconImage(new ImageIcon("images/qq1.png").getImage());
				this.setLocation(200, 80); // ���崰����ʾλ��
				this.setResizable(false);
				this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);// �رս���
				this.setVisible(true);
			}
		}

