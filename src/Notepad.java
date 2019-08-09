import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;

public class Notepad extends JFrame{
	
	public Notepad() {
		
		setTitle("Notepad");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(585, 535);
		
		setLocationRelativeTo(null);
		
		JMenuBar jMenuBar = new JMenuBar();
		JMenu fileMenu = new JMenu("File");
		jMenuBar.add(fileMenu);
		
		JMenuItem newMenuItem = new JMenuItem("New");
		newMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK));
		
		newMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				new Notepad();
				
			}
		});
		fileMenu.add(newMenuItem);	
		
		JMenuItem newWindowItem = new JMenuItem("New Window");
		newWindowItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK+ActionEvent.SHIFT_MASK));
		fileMenu.add(newWindowItem);
		
		JMenuItem saveItem = new JMenuItem("Save");
		saveItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK));
		fileMenu.add(saveItem);
		
		JMenuItem saveAsItem = new JMenuItem("Save As ...");
		saveAsItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK+ActionEvent.SHIFT_MASK));
		fileMenu.add(saveAsItem);
		
		JMenuItem pageSetupItem = new JMenuItem("Page Setup ...");
		fileMenu.add(pageSetupItem);
		
		
		JMenuItem printItem = new JMenuItem("Print ...");
		printItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK));
		fileMenu.add(printItem);
		
		JMenuItem exitMenuItem = new JMenuItem("Exit");
		exitMenuItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		
		exitMenuItem.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
				
			}
		});
		fileMenu.add(exitMenuItem);
		
		
		JMenu editMenu = new JMenu("Edit");
		jMenuBar.add(editMenu);
		
		JMenuItem undoItem = new JMenuItem("Undo");
		undoItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Z, ActionEvent.CTRL_MASK));
		editMenu.add(undoItem);
		
		JMenuItem cutItem = new JMenuItem("Cut");
		cutItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK));
		editMenu.add(cutItem);
		
		JMenuItem copyItem = new JMenuItem("Copy");
		copyItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK));
		editMenu.add(copyItem);
		
		JMenuItem pasteItem = new JMenuItem("Paste");
		pasteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK));
		editMenu.add(pasteItem);
		
		JMenuItem deleteItem = new JMenuItem("Delete");
		deleteItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_DELETE, 0));
		editMenu.add(deleteItem);
		
		JMenuItem searchBingItem = new JMenuItem("Search with Bing ...");
		searchBingItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK));
		editMenu.add(searchBingItem);
		
		JMenuItem findItem = new JMenuItem("Find ...");
		findItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK));
		editMenu.add(findItem);
		
		JMenuItem findNextItem = new JMenuItem("Find Next");
		findNextItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, 0));
		editMenu.add(findNextItem);
		
		JMenuItem findPreviousItem = new JMenuItem("Find Previous");
		findPreviousItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F3, ActionEvent.SHIFT_MASK));
		editMenu.add(findPreviousItem);
		
		JMenuItem replaceItem = new JMenuItem("Replace");
		replaceItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_H, ActionEvent.CTRL_MASK));
		editMenu.add(replaceItem);
		
		JMenuItem gotoItem = new JMenuItem("Go To ...");
		gotoItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_G, ActionEvent.CTRL_MASK));
		editMenu.add(gotoItem);
		
		JMenuItem selectAllItem = new JMenuItem("Select All");
		selectAllItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK));
		editMenu.add(selectAllItem);
		
		JMenuItem timeDateItem = new JMenuItem("Time/Date");
		timeDateItem.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_F5, 0));
		editMenu.add(timeDateItem);
		
		
		JMenu formatMenu = new JMenu("Format");
		jMenuBar.add(formatMenu);
		
		JMenuItem wordWrapItem = new JMenuItem("Word Wrap");
		formatMenu.add(wordWrapItem);
		
		JMenuItem fontItem = new JMenuItem("Font ...");
		formatMenu.add(fontItem);
		
		
		JMenu viewMenu = new JMenu("View");
		jMenuBar.add(viewMenu);
		
		JMenuItem zoomItem = new JMenuItem("Zoom");
		viewMenu.add(zoomItem);
		
//		JMenuItem zoomInItem = new JMenuItem("Zoom in");
//		zoomItem.add(zoomInItem);
//		JMenuItem zoomOutItem = new JMenuItem("Zoom out");
//		zoomItem.add(zoomOutItem);
//		
		
		JMenuItem statusBarItem = new JMenuItem("Status Bar");
		viewMenu.add(statusBarItem);
		
		
		JMenu helpMenu = new JMenu("Help");
		jMenuBar.add(helpMenu);
		
		JMenuItem viewHelpItem = new JMenuItem("View Help");
		helpMenu.add(viewHelpItem);
		
		JMenuItem feedbackItem = new JMenuItem("Send Feedback");
		helpMenu.add(feedbackItem);
		
		JMenuItem aboutNotepadItem = new JMenuItem("About Notepad");
		helpMenu.add(aboutNotepadItem);
		
		setJMenuBar(jMenuBar);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new Notepad();

	}

}
