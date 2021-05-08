package ETicaretBackend.core;

import ETicaretBackend.googleEmail.GoogleEmailManager;

public class GoogleMailManagerAdapter implements EmailService{

	private  GoogleEmailManager googleEmailManager;
	public GoogleMailManagerAdapter() {
		this.googleEmailManager = new GoogleEmailManager();
	
	}
	
	@Override
	public void send(String email, String message) {
		googleEmailManager.send(email, message);
		
		
	}

}
