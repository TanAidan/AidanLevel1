import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class youtubePlayer implements ActionListener  {
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton ducks = new JButton("ducks");
	JButton frog = new JButton("frog");
	JButton fluffyUnicorns = new JButton("fluffyUnicorns");

	public static void main(String[] args) {
		youtubePlayer player = new youtubePlayer();
		player.createUi();
	}

	private void createUi() {
frame.add(panel);
frame.setVisible(true);
panel.add(ducks);
panel.add(frog);
panel.add(fluffyUnicorns);
frame.pack();
ducks.addActionListener(this);
frog.addActionListener(this);
fluffyUnicorns.addActionListener(this);
	}

	void showDucks() {
		playVideo("T0Rne4KbZSE");
	}

	void showFrog() {
		playVideo("aSjCb-FfxhI");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID
					+ "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		JButton buttonPressed=(JButton)arg0.getSource();
		if(buttonPressed.equals(ducks)){
			showDucks();
		}
		else if(buttonPressed.equals(frog)){
			showFrog();
		}
		else if(buttonPressed.equals(fluffyUnicorns)){
			showFluffyUnicorns();
		}
	}

}
