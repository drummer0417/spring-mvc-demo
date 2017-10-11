package nl.androidappfactory.springdemo.mvc.customer;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.Range;

import nl.androidappfactory.springdemo.mvc.validation.CourseCode;

public class Customer {

	private final static int MAX_NAME_LENGTH = 30;

	@NotNull(message = "Is required")
	@Size(min = 1, message = "Is required")
	@Size(max = MAX_NAME_LENGTH, message = "the maximum length is " + MAX_NAME_LENGTH)
	private String firstName;

	@NotNull(message = "Is required")
	@Size(min = 1, message = "Is required")
	@Size(max = MAX_NAME_LENGTH, message = "the maximum length is " + MAX_NAME_LENGTH)
	private String lastName;

	@NotNull(message = "Is required")
	@Range(min = 1, max = 5, message = "value must be between 1 and 5")
	// (including)")
	// @Pattern(regexp = "[0-9]+", message = "")
	private Integer freePasses;

	@NotNull(message = "Is reuired")
	@Pattern(regexp = "\\A[1-9][0-9]{3}[ ]?([A-RT-Za-rt-z][A-Za-z]|[sS][BCbcE-Re-rT-Zt-z])\\z", message = "Format should be 1234AB or 1234 AB")
	private String postalCode;

	// Custom validation using my own annotation CourseCode...
	final static String COURSE_CODE_PREFIX = "AAP";
	@CourseCode(prefix = COURSE_CODE_PREFIX, message = "the Course code should start with \"" + COURSE_CODE_PREFIX
			+ "\"")
	private String courseCode;

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstname) {
		this.firstName = firstname;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastname) {
		this.lastName = lastname;
	}

	public Integer getFreePasses() {
		return freePasses;
	}

	public void setFreePasses(Integer freePasses) {
		this.freePasses = freePasses;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCourseCode() {
		return courseCode;
	}

	public void setCourseCode(String courseCode) {
		this.courseCode = courseCode;
	}

	@Override
	public String toString() {
		return "Customer [firstName=" + firstName + ", lastName=" + lastName + ", freePasses=" + freePasses
				+ ", postalCode=" + postalCode + ", courseCode=" + courseCode + "]";
	}

}
