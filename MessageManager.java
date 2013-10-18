public class MessageManager {

	private String message;
    private String DEFAULT="Message manager reporting for action";
	
	public String print(){
		return (null != getMessage() ) ? getMessage() : DEFAULT ;
	}
   
   //
	public void setMessage(String message){
		this.message=message;
	}
	
	public String getMessage(){
		return message;
	}
}