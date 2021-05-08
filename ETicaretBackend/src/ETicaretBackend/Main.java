package ETicaretBackend;

import ETicaretBackend.business.concretes.AuthManager;
import ETicaretBackend.business.concretes.UserManager;
import ETicaretBackend.core.AmazonMailManagerAdapter;
import ETicaretBackend.core.GoogleMailManagerAdapter;
import ETicaretBackend.dataAccess.concretes.HibernateUserDao;
import ETicaretBackend.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
	
		UserManager userManager = new UserManager(new HibernateUserDao(), new AmazonMailManagerAdapter());
		User user4 = new User(4, "Aytug", "Kaya", "aytug@gmail.com", "123321", true);
		//userManager.add(user4);
				
		User user5 = new User(5, "Aytug", "Kaya", "aytug@gmail.com", "55521525", false);
		userManager.update(user5);	
		userManager.delete(3);
		System.out.println("========================");
		

		HibernateUserDao hibernateUserDao = new HibernateUserDao();
		GoogleMailManagerAdapter googleMailManagerAdapter = new GoogleMailManagerAdapter();
		AmazonMailManagerAdapter amazonMailManagerAdapter = new  AmazonMailManagerAdapter();

		
		AuthManager authManager =new AuthManager(new UserManager(hibernateUserDao, googleMailManagerAdapter));
		//authManager.register(user2);
		authManager.register(user5);
		UserManager userManager2 = new UserManager(hibernateUserDao, amazonMailManagerAdapter);
		
		userManager.getAll();
	
		
	}

}
