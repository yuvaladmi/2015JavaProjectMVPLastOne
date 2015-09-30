package view;

public abstract class MyAbstractObservableGuiView extends abstractView {

	
	@Override
	public abstract void displayByte(byte[] arr);

	@Override
	public abstract void displayString(String arr);

	@Override
	public abstract void displayInt(int[][] arr);


	@Override
	public abstract void exit();
	
}
