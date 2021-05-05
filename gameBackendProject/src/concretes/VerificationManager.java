package concretes;

import abstracts.VerificationService;
import entities.Gamer;

public class VerificationManager implements VerificationService{

	@Override
	public boolean confirm(Gamer gamer) {
		if(gamer.getFirstName().isEmpty() || gamer.getLastName().isEmpty() || gamer.getNationalityId().isEmpty() || gamer.geteMail().isEmpty() || gamer.getUsername().isEmpty() || gamer.getPassword().isEmpty() || gamer.getDate().isEmpty()) {
			
			//System.out.println("Girilen kullanici bilgileri bir kullaniciyla eslesmiyor. ");
			
			return false;
			
		}else {
			
			//System.out.println("Kullanici girisi dogrulandi.");
	
			return true;
			
		}
		
	}




	
}
