package phase1_Assistedpractice;

public class ThreadAssignment extends Thread{
		
	 	public void run()
	 	{
	  		System.out.println("concurrent thread started running..");
	}
	 	public static void main( String args[] )
	 	{
	 		ThreadAssignment mt = new ThreadAssignment ();
	  		mt.start();
	 	}
}
