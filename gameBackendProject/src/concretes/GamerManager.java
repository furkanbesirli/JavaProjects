package concretes;

import abstracts.GamerService;
import entities.Gamer;

public class GamerManager implements GamerService{

	@Override
	public void Add(Gamer gamer) {
		System.out.println( "Kisi sisteme kayıt edildi "+ gamer.getFirstName() + " " + gamer.getLastName() +  " ! sifre : " + gamer.getPassword()
        + " veri tabanina kaydedildi...");
		
	}

	@Override
	public void Update(Gamer gamer) {
		System.out.println("Kullanici bilgileriniz basariyla guncellendi. : "+gamer.getFirstName()+" "+gamer.getLastName());
		
	}

	@Override
	public void Delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " +gamer.getLastName() + " "+ "kullanici hesabi silindi.");
		
	}
	
	
	
	
	
}
