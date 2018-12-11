package com.mrmrmr7.figure.interfaces;

import java.io.File;

import com.mrmrmr7.figure.entity.Sphere;

public interface Validator {	
	boolean isValidData(String data);
	boolean isValidFile(File file);
	boolean isValidFigure(Sphere figure);
}
