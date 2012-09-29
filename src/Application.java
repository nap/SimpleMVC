import javax.swing.JFrame;
import javax.swing.SwingUtilities;
import model.MainModel;
import controller.MainController;
import view.*;

public class Application {
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				MainModel model = new MainModel();
				MainController controller = new MainController(model);
				MainView view = new MainView(controller);
				
				model.addObserver(view);
				view.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
				view.setVisible(true);
			}
		});
	}
}
