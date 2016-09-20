
public class Mom extends Thread{
	
	public void run()
	{
			
			do
			{
				System.out.println("mom");
				
				try {
					this.sleep(2*50);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}while(true);
	

		
	}

}
