import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MemModelStarter {

	public static void main(String[] args) {
		WidgetViewer wv = new WidgetViewer();
		
		JTextField j0 = new JTextField("Change Me");
		JButton pushMe = new JButton("push me");
		wv.add(j0, 10, 30, 100, 20);
		
		// do only one of the following
		wv.addAndWait(pushMe);
		// wv.addButtonAndWait("push me");

		String j0Text = j0.getText();
		
	}

}
