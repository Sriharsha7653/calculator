import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Calculator extends Frame implements ActionListener {
    //Initilizing
    Label lb;
    TextField Display;
    Button bt0,bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9,btadd,btmul,btsub,btdiv,btpow,btreset,btbackspace,bteql,btlight,btdark;
    Calculator(){
        //LABEL
        lb= new Label("DEVELOPED BY SRIHARSHA M");
        lb.setBounds(70,50,500,50);
        lb.setFont(new Font("Bazooka",Font.BOLD,30));
        lb.setForeground(Color.WHITE);
        //TEXTFIELD 
        Display=new TextField("");
        Display.setFont(new Font("ARIAL",Font.BOLD,40));
        Display.setBounds(50,100,500,50);
        setSize(600,600);
        //BUTTON 1
        bt1= new Button("1");
        bt1.setBounds(50,170,70,70);
        bt1.setFont(new Font("Arial",Font.BOLD,50));
        bt1.setBackground(Color.PINK);
        bt1.addActionListener(this);
        //BUTTON 2
        bt2= new Button("2");
        bt2.setBounds(150,170,70,70);
        bt2.setFont(new Font("Arial",Font.BOLD,50));
        bt2.setBackground(Color.PINK);
        bt2.addActionListener(this);
        //BUTTON 3
        bt3= new Button("3");
        bt3.setBounds(250,170,70,70);
        bt3.setFont(new Font("Arial",Font.BOLD,50));
        bt3.setBackground(Color.PINK);
        bt3.addActionListener(this);
        //BUTTON 4
        bt4= new Button("4");
        bt4.setBounds(50,260,70,70);
        bt4.setFont(new Font("Arial",Font.BOLD,50));
        bt4.setBackground(Color.PINK);
        bt4.addActionListener(this);
        //BUTTON 5
        bt5= new Button("5");
        bt5.setBounds(150,260,70,70);
        bt5.setFont(new Font("Arial",Font.BOLD,50));
        bt5.setBackground(Color.PINK);
        bt5.addActionListener(this);
        //BUTTON 6
        bt6= new Button("6");
        bt6.setBounds(250,260,70,70);
        bt6.setFont(new Font("Arial",Font.BOLD,50));
        bt6.setBackground(Color.PINK);
        bt6.addActionListener(this);
        //BUTTON 7
        bt7= new Button("7");
        bt7.setBounds(50,360,70,70);
        bt7.setFont(new Font("Arial",Font.BOLD,50));
        bt7.setBackground(Color.PINK);
        bt7.addActionListener(this);
        //BUTTON 8
        bt8= new Button("8");
        bt8.setBounds(150,360,70,70);
        bt8.setFont(new Font("Arial",Font.BOLD,50));
        bt8.setBackground(Color.PINK);
        bt8.addActionListener(this);
        //BUTTON 9
        bt9= new Button("9");
        bt9.setBounds(250,360,70,70);
        bt9.setFont(new Font("Arial",Font.BOLD,50));
        bt9.setBackground(Color.PINK);
        bt9.addActionListener(this);
        //BUTTON 0
        bt0= new Button("0");
        bt0.setBounds(150,460,70,70);
        bt0.setFont(new Font("Arial",Font.BOLD,50));
        bt0.setBackground(Color.PINK);
        bt0.addActionListener(this);
        //BUTTON RESET
        btreset= new Button("RESET");
        btreset.setBounds(450,260,110,50);
        btreset.setFont(new Font("Bazooka",Font.BOLD,20));
        btreset.setBackground(Color.PINK);
        btreset.addActionListener(this);
        //BUTTON +
        btadd= new Button("+");
        btadd.setBounds(350,170,70,70);
        btadd.setFont(new Font("Arial",Font.BOLD,50));
        btadd.setBackground(Color.PINK);
        btadd.addActionListener(this);
        //BUTTON -
        btsub= new Button("-");
        btsub.setBounds(350,260,70,70);
        btsub.setFont(new Font("Arial",Font.BOLD,50));
        btsub.setBackground(Color.PINK);
        btsub.addActionListener(this);
        //BUTTON x
        btmul= new Button("x");
        btmul.setBounds(350,360,70,70);
        btmul.setFont(new Font("Arial",Font.BOLD,50));
        btmul.setBackground(Color.PINK);
        btmul.addActionListener(this);
        //BUTTON /
        btdiv= new Button("/");
        btdiv.setBounds(350,460,70,70);
        btdiv.setFont(new Font("Arial",Font.BOLD,50));
        btdiv.setBackground(Color.PINK);
        btdiv.addActionListener(this);
         //BUTTON POWER
        btpow= new Button("^");
        btpow.setBounds(250,460,70,70);
        btpow.setFont(new Font("Arial",Font.BOLD,50));
        btpow.setBackground(Color.PINK);
        btpow.addActionListener(this);
        //BUTTON BACKSPACE
        btbackspace= new Button("BACKSPACE");
        btbackspace.setBounds(450,170,130,70);
        btbackspace.setFont(new Font("Bazooka",Font.BOLD,20));
        btbackspace.setBackground(Color.PINK);
        btbackspace.addActionListener(this);
        //BUTTON EQUAL
        bteql= new Button("=");
        bteql.setBounds(450,330,70,130);
        bteql.setFont(new Font("Bazooka",Font.BOLD,60));
        bteql.setBackground(Color.PINK);
        bteql.addActionListener(this);
        //BUTTON LIGHT
        btlight= new Button("Light");
        btlight.setBounds(50,470,70,40);
        btlight.setFont(new Font("Bazooka",Font.BOLD,10));
        btlight.setBackground(Color.white);
        btlight.addActionListener(this);
        //BUTTON DARK
        //BUTTON LIGHT
        btdark= new Button("Dark");
        btdark.setBounds(50,530,70,40);
        btdark.setFont(new Font("Bazooka",Font.BOLD,10));
        btdark.setBackground(Color.black);
        btdark.setForeground(Color.white);
        btdark.addActionListener(this);
        //ADDING INTO THE WINDOW
        add(lb);
        add(Display);
        add(bt1);
        add(bt2);
        add(bt3);
        add(bt4);
        add(bt5);
        add(bt6);
        add(bt7);
        add(bt8);
        add(bt9);
        add(bt0);
        add(btreset);
        add(btadd);
        add(btsub);
        add(btmul);
        add(btdiv);
        add(btpow);
        add(btbackspace);
        add(bteql);
        add(btlight);
        add(btdark);
        //CONSTRAINTS FOR THE WINDOW 
        setBackground(Color.BLACK);
        setLayout(null);
        setTitle("Calculator");
        setVisible(true);
        //WINDOW CLOSING
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                dispose();
            }
        });
    }
    //BUTTON LISTENER
    public void actionPerformed( ActionEvent E){
         //THEMES OF THE INTERFACE
          if(E.getSource()==btlight){
            setBackground(Color.white);
            lb.setBackground(Color.WHITE);
            lb.setForeground(Color.black);
        }
        if(E.getSource()==btdark){
            setBackground(Color.black);
            lb.setBackground(Color.BLACK);
            lb.setForeground(Color.white);
            
        }
        //NUMBERS BUTTON
        if(E.getSource()==bt0){
            String inline=Display.getText();
            inline+="0";
            Display.setText(inline);
        }
        if(E.getSource()==bt1){
            String inline=Display.getText();
            inline+="1";
            Display.setText(inline);
        }
        if(E.getSource()==bt2){
            String inline=Display.getText();
            inline+="2";
            Display.setText(inline);
        }
        if(E.getSource()==bt3){
            String inline=Display.getText();
            inline+="3";
            Display.setText(inline);
        }
        if(E.getSource()==bt4){
            String inline=Display.getText();
            inline+="4";
            Display.setText(inline);
        }
        if(E.getSource()==bt5){
            String inline=Display.getText();
            inline+="5";
            Display.setText(inline);
        }
        if(E.getSource()==bt6){
            String inline=Display.getText();
            inline+="6";
            Display.setText(inline);
        }
        if(E.getSource()==bt7){
            String inline=Display.getText();
            inline+="7";
            Display.setText(inline);
        }
        if(E.getSource()==bt8){
            String inline=Display.getText();
            inline+="8";
            Display.setText(inline);
        }
        if(E.getSource()==bt9){
            String inline=Display.getText();
            inline+="9";
            Display.setText(inline);
        }
        //OPERATORS
        if(E.getSource()==btadd){
            String inline=Display.getText();
            inline+="+";
            Display.setText(inline);
        }
        if(E.getSource()==btsub){
            String inline=Display.getText();
            inline+="-";
            Display.setText(inline);
        }
        if(E.getSource()==btmul){
            String inline=Display.getText();
            inline+="x";
            Display.setText(inline);
        }
        if(E.getSource()==btdiv){
            String inline=Display.getText();
            inline+="/";
            Display.setText(inline);
        }
        //RESET AND BACKSPACE BUTTON
        if(E.getSource()==btreset){
            String inline=Display.getText();
            Display.setText("");
        }
        if(E.getSource()==btpow){
            String inline=Display.getText();
            inline+="^";
            Display.setText(inline);
        }
        if(E.getSource()==btbackspace){
            String inline=Display.getText();
            if(!inline.isEmpty()){
                inline=inline.substring(0,inline.length()-1);
                Display.setText(inline);
            }
        }
        if(E.getSource()==bteql){
            int a,b,i;
            char operator='+';
            String beforesign="";
            String aftersign="";
            String expression=Display.getText();
            for(i=0;i<expression.length();i++){
                if(Character.isDigit(expression.charAt(i))){
                    beforesign+=expression.charAt(i);
                }
                else{
                    operator=expression.charAt(i);
                    break;
                }
            }
            aftersign=expression.substring(i+1);
           a=Integer.parseInt(beforesign);
           b=Integer.parseInt(aftersign);
           int result=0;
           switch (operator) {
            case '+':
                result=a+b;
                break;
           
            case '-':
                result=a-b;
                break;
            case 'x':
                result=a*b;
                break;
            case '/':
                try{
                    result=a/b;
                }
                catch(Exception e){
                    break;
                }
            case '^':
                result=(int)Math.pow(a,b);
                break;    
                    
           }
           Display.setText(String.valueOf(result));
        }

    }
    public static void main(String[] args) { 
       new Calculator();
    }
}
