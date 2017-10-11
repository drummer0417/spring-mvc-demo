package nl.androidappfactory.springdemo.mvc;

public class Student {

	private String firstName;

	private String lastName;

	private String country;

	private String favoriteLanguage;

	private String[] myOperatingSystems;

	public Student() {

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getMyOperatingSystems() {
		return myOperatingSystems;
	}

	public void setMyOperatingSystems(String[] myOperatingSystems) {
		this.myOperatingSystems = myOperatingSystems;
	}

	@Override
	public String toString() {
		return "Student [firstName=" + firstName + ", lastName=" + lastName + ", country=" + country
				+ ", favoriteLanguage=" + favoriteLanguage + ", myOperatingSystems=" + myOperatingSystems + "]";
	}

}
