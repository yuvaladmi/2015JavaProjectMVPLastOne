package view;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

public abstract class BasicWindow implements Runnable{
	
	Display display;
	protected Shell shell;
	
 	public BasicWindow(String title, int width,int height) {
 		display=new Display();
 		shell  = new Shell(display);
 		shell.setSize(width,height);
 		shell.setText(title);
	}
 	
 	public abstract void initWidgets();

	@Override
	public void run() {
		initWidgets();
		shell.open();
		// main event loop
		 while(!shell.isDisposed()){ // while window isn't closed

		    // 1. read events, put then in a queue.
		    // 2. dispatch the assigned listener
		    if(!display.readAndDispatch()){ 	// if the queue is empty
		       display.sleep(); 			// sleep until an event occurs 
		    }

		 } // shell is disposed

		 display.dispose(); // dispose OS components
	}
//	public static void main(String[] args) {
//		BasicWindow bw = new BasicWindow("Hello",500,300) {
//			
//			@Override
//			void initWidgets() {
//				Button button = new Button(shell, SWT.PUSH);
//				button.setLayoutData(new GridData(SWT.BEGINNING, SWT.CENTER, false, false));
//				button.setText("Start");
//				button.addSelectionListener(new SelectionAdapter() {
//					@Override
//					public void widgetSelected(SelectionEvent e) {
//						
//					}
//				});
//				
//				
//			}
//		};
//		bw.run;
//	}

}
