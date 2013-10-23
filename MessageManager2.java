/* class is the same as MessageManager - just cloned, to test github  */
public class MessageManager2 {

	private String message;
    private String DEFAULT="Message manager reporting for action";
	
	
	public MessageManager(String initialMessage){
		setMessage(initialMessage);
	}
	
	public String generateMessage(){
		return (null != getMessage() ) ? getMessage() : DEFAULT ;
	}
   
   //
	public void setMessage(String message){
		this.message=message;
	}
	
	public String getMessage(){
		return message;
	}
	
	
	public void print(){
		System.out.println( generateMessage() );				

	}

}