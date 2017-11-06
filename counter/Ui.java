package counter;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import javax.swing.JTextArea;


public class Ui extends JFrame implements ActionListener {
	JPanel mb1;
	JButton[] an=new JButton[21];
	JTextArea wby;
	Counter counter = new Counter(); 
	Ui()
	{
		
		 mb1 = new JPanel();
		 an[1] =new JButton("1");an[2] =new JButton("2");an[3] =new JButton("3");an[4] =new JButton("4");
		 an[5] =new JButton("5");an[6] =new JButton("6");an[7] =new JButton("7");an[8] =new JButton("8");
		 an[9] =new JButton("9");an[10]=new JButton("0");an[11] =new JButton("C");an[12]=new JButton("←");
	     an[13]=new JButton("÷");an[14] =new JButton("+");an[15]=new JButton("-");an[16]=new JButton("×");
		 an[17]=new JButton("=");an[18]=new JButton("."); an[19]=new JButton("{}");an[20] =new JButton("%");
		 wby = new JTextArea();
		 wby.setFont(new Font("宋体",Font.BOLD,30));
		 wby.setEditable(false);
		
		 for(int i=1;i<=20;i++)
		 {
			 an[i].addActionListener(this);
		 }
		 mb1.setLayout(new GridLayout(5,4));
		 mb1.add(an[11]);mb1.add(an[12]);mb1.add(an[20]);mb1.add(an[13]);
		 mb1.add(an[7]);mb1.add(an[8]);mb1.add(an[9]);mb1.add(an[16]);
		 mb1.add(an[4]);mb1.add(an[5]);mb1.add(an[6]);mb1.add(an[15]);
		 mb1.add(an[1]);mb1.add(an[2]);mb1.add(an[3]);mb1.add(an[14]);
		 mb1.add(an[19]);mb1.add(an[10]);mb1.add(an[18]);mb1.add(an[17]);
		 this.add(wby);
		 this.add(mb1,BorderLayout.SOUTH);
		 
		 this.setTitle("计算器");
			this.setSize(400, 350);
			//this.setIconImage(new ImageIcon("images/qq1.png").getImage());
			//窗口显示照片，但照片没上传
			this.setLocation(200, 80); // 定义窗口显示位置
			this.setResizable(false);
			this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);// 关闭进程
			this.setVisible(true);		 
		 
	}
	public void actionPerformed(ActionEvent e) {
		String cmd = e.getActionCommand();
		String result = null;
		result = counter.callMethod(cmd, wby.getText());
		wby.setText(result);
		//缺点：看不见计算式子、求和后不能清空文本域	 
	}
public static void main(String[] args) {
		
		new Ui();
	}
	
}
