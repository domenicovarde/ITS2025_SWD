package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

class PannelloCartesiano extends JPanel{
	
	private List<Point> punti = new ArrayList<>();
	private Random random = new Random();
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		disegnaAssi(g);
		disegnaPunti(g);
	}

	private void disegnaPunti(Graphics g) {
		int centroX = getWidth() / 2;
		int centroY = getHeight() / 2 ;
		
		g.setColor(Color.RED);
		
		for (Point p : punti) {
			int x = centroX + p.x;
			int y = centroY + p.y;
			g.fillOval(x-4,  y-4, 8, 8);
		}
		
	}

	private void disegnaAssi(Graphics g) {
		int w = getWidth();
		int h = getHeight();
		
		int centroX = w / 2;
		int centroY = h / 2;
		
		g.setColor(Color.BLUE);
		g.drawLine(0, centroY, w, centroY);//asse X
		g.drawLine(centroX, 0, centroX, h);//asse Y
		
		// TODO: Tacche sugli assi
		for(int i = -w/2; i <= w/2; i+=50) {
			g.drawLine(centroX + i, centroY-5, centroX+i, centroY+5);
			g.drawLine(centroX - 5, centroY+i, centroX+5, centroY+i);
		}
		
		
		// TODO: Etichette
		
	}

	public void addPuntoCasuale() {
		
		int maxX = getWidth() / 2 - 20;
		int maxY = getHeight() / 2 - 20;
		
		int x = random.nextInt(maxX * 2) - maxX;
		int y = random.nextInt(maxY * 2) - maxY;
		
		punti.add(new Point(x, y));
		repaint();
		
	}
	
	
	
}


public class QuadranteCartesiano extends JFrame {

	PannelloCartesiano pannello;
	
	public QuadranteCartesiano() {
		setTitle("Quadrante cartesiano");
		setSize(600, 600);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new BorderLayout());
		
		pannello = new PannelloCartesiano();
		
		JButton btnAddPunto = new JButton("Aggiungi un punto a caso");
		btnAddPunto.addActionListener(e -> pannello.addPuntoCasuale());
		
		add(pannello, BorderLayout.CENTER);
		add(btnAddPunto, BorderLayout.SOUTH);
		setVisible(true);
		
		
	}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(QuadranteCartesiano::new);

	}

}
