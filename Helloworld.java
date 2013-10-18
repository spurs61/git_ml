public class Helloworld {

	public static void main(String[] argv){

		MessageManager messageManager = new MessageManager();
		System.out.println( messageManager.print() );
		
		messageManager.setMessage(" msg mgr version 20131018oct_fr1100");
		System.out.println( messageManager.print() );
	}

}