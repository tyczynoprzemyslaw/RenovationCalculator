package pl.tyczyno.Calculator.controlles;

import java.util.regex.Pattern;

import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import pl.tyczyno.Calculator.RoomDimensions;


@Component
public class RoomValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		// TODO Auto-generated method stub
		return RoomDimensions.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object target, Errors errors) {
		RoomDimensions room = (RoomDimensions) target;
		double a = room.getA();
	
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "a", "required","Field is empty");
		
		//RoomDimensions room = (RoomDimensions)target;
		//Pattern pattern - Pattern.compile("[A-Z][a-zA-Z]{2,}");
		
	}
	
	

}
