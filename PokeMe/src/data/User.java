package data;

public class User {

	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String passwordRepeat;
	private String nickName;
	private String mood;

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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPasswordRepeat() {
		return passwordRepeat;
	}

	public void setPasswordRepeat(String passwordRepeat) {
		this.passwordRepeat = passwordRepeat;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	// public static String getMood() {
	// return mood;
	// }
	// public static void setMood(String mood) {
	// Property.mood = mood;
	// }

	public static final String URL = "http://192.168.3.5/#/";
	public static final String ADMINURL = "http://192.168.3.5/#/dashboard";

	public User(String firstName, String lastName, String nickName, String email, String password,
			String passwordRepeat) {
		setFirstName(firstName);
		setLastName(lastName);
		setNickName(nickName);
		setEmail(email);
		setPassword(passwordRepeat);
		setPasswordRepeat(passwordRepeat);
	}

	public User(String email, String password) {
		this.email = email;
		setEmail(email);
		setPassword(password);

	}
	public User(){
		
	}

}
