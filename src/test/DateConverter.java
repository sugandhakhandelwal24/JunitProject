package test;

import java.time.LocalDate;

import org.junit.jupiter.api.extension.ParameterContext;
import org.junit.jupiter.params.converter.ArgumentConversionException;
import org.junit.jupiter.params.converter.ArgumentConverter;

public class DateConverter implements ArgumentConverter{

	@Override
	 public Object convert(Object source, ParameterContext context) throws ArgumentConversionException {
        // TODO Auto-generated method stub
        
        
        if (!(source instanceof String)) {
            throw new IllegalArgumentException(
              "The argument should be a string: " + source);
        }
        try {
            String[] parts = ((String) source).split("/");
            int year = Integer.parseInt(parts[0]);
            int month = Integer.parseInt(parts[1]);
            int day = Integer.parseInt(parts[2]);
 
            return LocalDate.of(year, month, day);
        } catch (Exception e) {
            throw new IllegalArgumentException("Failed to convert", e);
        }
    }
    
    
    
}