package main;

import java.awt.EventQueue;
import java.io.IOException;

import javax.swing.JOptionPane;

import net.Net;

import presentation.loginui.LoginUI;

public class Startup {

	public static LoginUI window;
	public static Net net;

	public static void main(String[] args) {

		try {
			EventQueue.invokeLater(new Runnable() {

				@Override
				public void run() { // TODO Auto-generated method stub
					window = new LoginUI();
				}
			});
		} catch (Exception e) {
			e.printStackTrace();
		}
		try {
			net = new Net();
		}
		// TODO Auto-generated
		catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Õ¯¬Á“Ï≥£");
			window.frame.dispose();
		}
	}
}
