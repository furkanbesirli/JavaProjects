package entities;

public class Gamer {
	
	private int gamerId;
	private String firstName;
	private String lastName;
	private String eMail;
	private String nationalityId;
	private String username;
	private String password;
	private String date;
	
	public Gamer() {
		
	}

	public Gamer(int gamerId, String firstName, String lastName, String eMail, String nationalityId, String username,
			String password, String date) {

		this.gamerId = gamerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.eMail = eMail;
		this.nationalityId = nationalityId;
		this.username = username;
		this.password = password;
		this.date = date;
	}

	public int getGamerId() {
		return gamerId;
	}

	public void setGamerId(int gamerId) {
		this.gamerId = gamerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String geteMail() {
		return eMail;
	}

	public void seteMail(String eMail) {
		this.eMail = eMail;
	}

	public String getNationalityId() {
		return nationalityId;
	}

	public void setNationalityId(String nationalityId) {
		this.nationalityId = nationalityId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
	
	
	
	
	
	
}
