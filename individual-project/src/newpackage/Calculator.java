package newpackage;
import java.awt.*;
import java.awt.event.*;

class Calculator extends Frame implements ActionListener{

	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30;
	Panel p1,p2;
	TextField t1,t;
	MenuBar mb;
	Menu m,m1,m2,m3;
	MenuItem mi,mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11,mi12,mi13,mi14,mi15,mi16,mi17;
	String fv,lv,symbol,symbol1;
	int x=1;
	int y=2;
	int j=1;
	int k=2;
	
		
	Calculator(){

		setSize(500,500);
		setLocation(300,200);
		setTitle("Calculator");
		
		p1=new Panel();
		p2=new Panel();

		t1=new TextField("",50);
		t=new TextField("",50);

		p1.add(t1);
		p1.add(t);

		mb=new MenuBar();

		m=new Menu("View");
		m1=new Menu("Convertor");
		m2=new Menu("Edit");
		m3=new Menu("Help");

		mi=new MenuItem("Standard");
		mi1=new MenuItem("Scientific");
		mi2=new MenuItem("Programmer");
		mi3=new MenuItem("Date calculation");
		mi4=new MenuItem("Volume");
		mi5=new MenuItem("Length");
		mi6=new MenuItem("Weight and Mass");
		mi7=new MenuItem("Temperature");
		mi8=new MenuItem("Energy");
		mi9=new MenuItem("Area",new MenuShortcut(KeyEvent.VK_A));
		mi10=new MenuItem("Speed");
		mi11=new MenuItem("Time");
		mi12=new MenuItem("Power");
		mi13=new MenuItem("Data");
		mi14=new MenuItem("Pressure");
		mi15=new MenuItem("Angle");
		mi16=new MenuItem("View Help F1");
		mi17=new MenuItem("About Calculator");

		setMenuBar(mb);
		getMenuBar();
		
		mb.add(m);
		mb.add(m1);
		mb.add(m2);
		mb.add(m3);
		
		m.add(mi);
		m.add(mi1);
		m.add(mi2);
		m.add(mi3);		
		m1.add(mi4);
		m1.add(mi5);
		m1.add(mi6);
		m1.add(mi7);
		m1.add(mi8);
		m1.add(mi9);
		m1.add(mi10);
		m1.add(mi11);
		m1.add(mi12);
		m1.add(mi13);
		m1.add(mi14);
		m1.add(mi15);
		m3.add(mi16);
		m3.add(mi17);

		

		b1=new Button("MC");
		b2=new Button("MR");
		b3=new Button("MS");
		b4=new Button("M+");
		b5=new Button("M-");
		b6=new Button("<-");
		b7=new Button("CE");
		b8=new Button("C");
		b9=new Button("+/-");
		b10=new Button("SQRT");
		b11=new Button("7");
		b12=new Button("8");
		b13=new Button("9");
		b14=new Button("/");
		b15=new Button("%");
		b16=new Button("4");
		b17=new Button("5");
		b18=new Button("6");
		b19=new Button("*");
		b20=new Button("1/x");
		b21=new Button("1");
		b22=new Button("2");
		b23=new Button("3");
		b24=new Button("-");
		b25=new Button("=");
		b26=new Button("");
		b27=new Button("0");
		b28=new Button(".");
		b29=new Button("+");
		b30=new Button("");
		

		GridLayout g1=new GridLayout(1,1,4,4);
		GridLayout g2=new GridLayout(6,5,4,4);
		p1.setLayout(g1);
		p2.setLayout(g2);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(b10);
		p2.add(b11);
		p2.add(b12);
		p2.add(b13);
		p2.add(b14);
		p2.add(b15);
		p2.add(b16);
		p2.add(b17);
		p2.add(b18);
		p2.add(b19);
		p2.add(b20);
		p2.add(b21);
		p2.add(b22);
		p2.add(b23);
		p2.add(b24);
		p2.add(b25);
		p2.add(b26);
		p2.add(b27);
		p2.add(b28);
		p2.add(b29);
		p2.add(b30);
		
		
		p1.setForeground(Color.red);
		p1.setBackground(Color.red);

		p2.setBackground(Color.red);
		
		b1.setBackground(Color.CYAN);
		b2.setBackground(Color.CYAN);
		b3.setBackground(Color.CYAN);
		b4.setBackground(Color.CYAN);
		b5.setBackground(Color.CYAN);
		b6.setBackground(Color.CYAN);
		b7.setBackground(Color.CYAN);
		b8.setBackground(Color.CYAN);
		b9.setBackground(Color.CYAN);
		b10.setBackground(Color.CYAN);
		b11.setBackground(Color.PINK);
		b11.setForeground(Color.red);
		b12.setBackground(Color.PINK);
		b12.setForeground(Color.red);
		b13.setBackground(Color.PINK);
		b13.setForeground(Color.red);
		b14.setBackground(Color.CYAN);
		b15.setBackground(Color.CYAN);
		b16.setBackground(Color.PINK);
		b16.setForeground(Color.red);
		b17.setBackground(Color.PINK);
		b17.setForeground(Color.red);
		b18.setBackground(Color.PINK);
		b18.setForeground(Color.red);
		b19.setBackground(Color.CYAN);
		b20.setBackground(Color.CYAN);
		b21.setBackground(Color.PINK);
		b21.setForeground(Color.red);
		b22.setBackground(Color.PINK);
		b22.setForeground(Color.red);
		b23.setBackground(Color.PINK);
		b23.setForeground(Color.red);
		b24.setBackground(Color.CYAN);
		b25.setBackground(Color.CYAN);
		b26.setBackground(Color.LIGHT_GRAY);
		b27.setBackground(Color.PINK);
		b27.setForeground(Color.red);
		b28.setBackground(Color.CYAN);
		b29.setBackground(Color.CYAN);
		b30.setBackground(Color.LIGHT_GRAY);
		
		t.setBackground(Color.PINK);
		t.setForeground(Color.BLACK);

		t1.setBackground(Color.CYAN);
		t1.setForeground(Color.BLACK);

		add(p1,BorderLayout.NORTH);
		add(p2,BorderLayout.CENTER);

		b8.addActionListener(this);
		b11.addActionListener(this);
		b12.addActionListener(this);
		b13.addActionListener(this);
		b16.addActionListener(this);
		b17.addActionListener(this);
		b18.addActionListener(this);
		b21.addActionListener(this);
		b22.addActionListener(this);
		b23.addActionListener(this);
		b27.addActionListener(this);
		b28.addActionListener(this);
		b29.addActionListener(this);
		b24.addActionListener(this);
		b19.addActionListener(this);
		b14.addActionListener(this);
		b15.addActionListener(this);
		b10.addActionListener(this);
		b25.addActionListener(this);
		b20.addActionListener(this);
		b7.addActionListener(this);
		mi9.addActionListener(this);
		
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent e){
		Object ob=e.getSource();

		if(b11.equals(ob)){
			String s1=t.getText();
			t.setText(s1+"7");
			t1.setText(t1.getText()+"7");
		}
		if(b12.equals(ob)){
			t.setText(t.getText()+"8");
			t1.setText(t1.getText()+"8");
		}
		if(b13.equals(ob)){
			t.setText(t.getText()+"9");
			t1.setText(t1.getText()+"9");
		}
		if(b16.equals(ob)){
			t.setText(t.getText()+"4");
			t1.setText(t1.getText()+"4");
		}if(b17.equals(ob)){
			t.setText(t.getText()+"5");
			t1.setText(t1.getText()+"5");
		}if(b18.equals(ob)){
			t.setText(t.getText()+"6");
			t1.setText(t1.getText()+"6");
		}if(b21.equals(ob)){
			t.setText(t.getText()+"1");
			t1.setText(t1.getText()+"1");
		}if(b22.equals(ob)){
			t.setText(t.getText()+"2");
			t1.setText(t1.getText()+"2");
		}if(b23.equals(ob)){
			t.setText(t.getText()+"3");
			t1.setText(t1.getText()+"3");
		}if(b27.equals(ob)){
			t.setText(t.getText()+"0");
			t1.setText(t1.getText()+"0");
		}
		if(b28.equals(ob)){
			if(x==1){
				t.setText(t.getText()+".");
				t1.setText(t1.getText()+".");
			}if(x!=1){
				t.setText(t.getText());
				t1.setText(t1.getText());
			}
			x=y;
		}
		if(b7.equals(ob)){
			t.setText("");
			x=1;
		}
		if(b8.equals(ob)){
			x=1;
			t.setText("");
			t1.setText("");
		}
		if(b29.equals(ob)){
			fv=t.getText();
			x=1;
			symbol="+";
			//t.setText("");
			//t1.setText(t1.getText()+"+");
			if(j==1){
				t.setText("");
				t1.setText(t1.getText()+"+");
			}if(j!=1){
				t.setText(t.getText());
				t1.setText(t1.getText());
			}
			j=k;
		}
		if(b24.equals(ob)){
			fv=t.getText();
			x=1;
			symbol="-";
			t.setText("");
			t1.setText(t1.getText()+"-");
		}if(b19.equals(ob)){
			fv=t.getText();
			x=1;
			symbol="*";
			t.setText("");
			t1.setText(t1.getText()+"*");
		}if(b14.equals(ob)){
			fv=t.getText();
			x=1;
			symbol="/";
			t.setText("");
			t1.setText(t1.getText()+"/");
		}
		if(b15.equals(ob)){
			symbol1=symbol;
			x=1;
			symbol="%";
			t1.setText(t1.getText()+"%");
			if(symbol1=="SQRT"){
				t.setText("");
			}
			if(symbol1=="1/x"){
				t.setText("");
			}
		}
		if(b10.equals(ob)){
			x=1;
			fv=t.getText();
			symbol="SQRT";
			t1.setText(t1.getText()+"SQRT");
		}
		if(b20.equals(ob)){
			x=1;
			fv=t.getText();
			symbol="1/x";
			t1.setText(t1.getText()+"1/x");
		}
		if(b25.equals(ob)){
			j=1;
			lv=t.getText();
			t1.setText(t1.getText()+"=");
			if(symbol.equals("+")){
				double d1=Double.parseDouble(fv);
				double d2=Double.parseDouble(lv);
				System.out.println("a");
				t.setText((d1+d2)+"");
			}
			if(symbol.equals("-")){
				double d1=Double.parseDouble(fv);
				double d2=Double.parseDouble(lv);
				t.setText((d1-d2)+"");
			}
			if(symbol.equals("*")){
				double d1=Double.parseDouble(fv);
				double d2=Double.parseDouble(lv);
				t.setText((d1*d2)+"");
			}
			if(symbol.equals("/")){
				double d1=Double.parseDouble(fv);
				double d2=Double.parseDouble(lv);
				t.setText((d1/d2)+"");
			}
			if(symbol.equals("%")){
				double d1=Double.parseDouble(fv);
				double d2=Double.parseDouble(lv);
				double d3=(d2/100);
				double d4=(d1*d3);
				
				if(symbol1.equals("+")){
					t.setText((d1+d4)+"");
				}
				if(symbol1.equals("-")){
					t.setText((d1-d4)+"");
				}
				if(symbol1.equals("*")){
					t.setText((d1*d4)+"");
				}
				if(symbol1.equals("/")){
					t.setText((d1/d4)+"");
					t1.setText(t1.getText()+"/");
				}
				
			}
			if(symbol.equals("SQRT")){
				double d1=Double.parseDouble(lv);
				double squareRoot = Math.sqrt(d1);
				t.setText(squareRoot+"");
			}
			if(symbol.equals("1/x")){
				double d1=Double.parseDouble(fv);
				double d2=(1/d1);
				t.setText(d2+"");
			}
		
		}
				
	}
	

	public static void main(String args[]){
		new Calculator();		
	}
}