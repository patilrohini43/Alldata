package all.program.com;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ButtonDemo extends Frame implements WindowListener,ActionListener {

    private int count = 0;
    int startTimer = 0;
    int endTimer = 0;

    public static void main(String[] args) {
            ButtonDemo b = new ButtonDemo();
            b.setSize(350,100);
            b.setVisible(true);
    }
    public ButtonDemo() {

         
           setLayout(new FlowLayout());
           addWindowListener(this);
          Button  b = new Button("Click me");
            add(b);
            b.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
           
       
        count++;
         
            if(count == 1) {
                //startTimer = System.currentTimeMillis();
            	System.out.println("please click again");
            }
           
            if(count==2) {
               
                //endTimer = System.currentTimeMillis();
               
                if((endTimer - startTimer)< 50) {
             
                    System.out.println("WelCome Rohini");
                   
            }
                else {
                    System.out.println("error");
                }
               
               
               
    }
            }
   

    public void windowClosing(WindowEvent e) {
            dispose();
            System.exit(0);
    }

   public void windowOpened(WindowEvent e) {}
    public void windowActivated(WindowEvent e) {}
    public void windowIconified(WindowEvent e) {}
    public void windowDeiconified(WindowEvent e) {}
    public void windowDeactivated(WindowEvent e) {}
    public void windowClosed(WindowEvent e) {}

}

