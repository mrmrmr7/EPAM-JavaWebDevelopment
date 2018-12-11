package com.mrmrmr7.figure.action;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mrmrmr7.figure.entity.Sphere;
import com.mrmrmr7.figure.interfaces.Validator;

public class Validation implements Validator{

	public boolean isValidData(final String data) {
		String remade = data.trim();		
		Pattern p = Pattern.compile("[\\d]+.+[\\d]+[\\s]+[\\d]+.+[\\d]+[\\s]+[\\d]+.+[\\d]");
		Matcher m = p.matcher(remade);
		return m.matches();
	} 

	public boolean isValidFile(File file) {
		return file.exists();
	}
	
	public boolean isValidFigure(Sphere figure) {
		return figure.getR() > 0;
	}

}
