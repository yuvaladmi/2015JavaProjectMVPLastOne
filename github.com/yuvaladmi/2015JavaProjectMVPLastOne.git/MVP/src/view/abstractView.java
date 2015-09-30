package view;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Observable;

public abstract class abstractView extends Observable implements View {
	

	public abstractView() {
//		cm = new CommandManager(new BufferedReader(new InputStreamReader(System.in)), new PrintWriter(System.out));
	}

	public abstract void displayByte(byte[] arr);

	public abstract void displayString(String arr);

	public abstract void displayInt(int[][] arr);

	public abstract void start();
	
	public abstract void exit();

//	@Override
//	public abstract void addObservers(Observer o);

}
