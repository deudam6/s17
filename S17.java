import java.util.*; 
public class SortedIntegers { 
 public static void main(String[] args) { 
 Scanner scanner = new Scanner(System.in); 
 System.out.print("Enter the number of integers: "); 
 int n = scanner.nextInt(); 
 Set<Integer> set = new TreeSet<>(); 
 for (int i = 1; i <= n; i++) { 
 System.out.print("Enter integer #" + i + ": "); 
 int num = scanner.nextInt(); 
 set.add(num); 
 } 
 System.out.println("The integers in sorted order are: "); 
 for (int num : set) { 
 System.out.print(num + " "); 
 } 
 } 
} 
2.o/p
import java.awt.BorderLayout; 
import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener; 
import javax.swing.JButton; 
import javax.swing.JFrame; 
import javax.swing.JPanel; 
import javax.swing.JTextField; 
public class NumberDisplay implements Runnable { 
 private JTextField textField; 
 public NumberDisplay(JTextField textField) { 
 this.textField = textField; 
 } 
 @Override 
 public void run() { 
 for (int i = 1; i <= 100; i++) { 
 textField.setText(Integer.toString(i)); 
 try { 
 Thread.sleep(100); 
 } catch (InterruptedException e) { 
 e.printStackTrace(); 
 } 
 } 
 } 
 public static void main(String[] args) { 
 JFrame frame = new JFrame("Number Display"); 
 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
 JTextField textField = new JTextField(10); 
 JButton button = new JButton("Start"); 
 JPanel panel = new JPanel(); 
 panel.add(textField); 
 panel.add(button); 
 frame.add(panel, BorderLayout.CENTER); 
 frame.pack(); 
 frame.setVisible(true); 
 button.addActionListener(new ActionListener() { 
 @Override 
 public void actionPerformed(ActionEvent e) { 
 NumberDisplay numberDisplay = new NumberDisplay(textField); 
 Thread thread = new Thread(numberDisplay); 
 thread.start(); 
 } 
 }); 
 } 
} 
