package pekan7_2511531007;

public class Akun_2511531007 {
	private String username, password, email;
	private int pinAngka;
	
	public void setUsername (String username) {
		this.username = username;
	}
	public void setPassword (String password) {
		this.password = password;
	}
	public void setEmail (String email) {
		this.email = email;
	}
	public void setPinAngka (int pinAngka) {
		this.pinAngka = pinAngka;
	}
	
	public boolean isPasswordValid() {
		return password != null && password.length()>=8;		
	}
	public boolean isEmailValid() {
		 return email != null && email.contains("@") && email.contains(".");
	}
}
