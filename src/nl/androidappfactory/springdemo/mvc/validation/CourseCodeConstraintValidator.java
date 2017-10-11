package nl.androidappfactory.springdemo.mvc.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class CourseCodeConstraintValidator implements ConstraintValidator<CourseCode, String> {

	private String coursePrefix;

	@Override
	public void initialize(CourseCode theCourseCode) {
		coursePrefix = theCourseCode.value().toUpperCase();
	}

	@Override
	public boolean isValid(String theCode, ConstraintValidatorContext theConstraintValidatorContext) {
		System.out.println("theCode / thePrefix: " + theCode + " / " + coursePrefix);
		if (theCode != null && coursePrefix != null) {
			return theCode.toUpperCase().startsWith(coursePrefix);
		} else {
			return true;
		}
	}

}
