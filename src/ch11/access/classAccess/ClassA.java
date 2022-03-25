package ch11.access.classAccess;

import ch11.access.classAccess.x.ClassXX;

//import ch11.access.classAccess.x.ClassZZ;

public class ClassA {
	ClassB b = new ClassB();
	
	ClassXX x;
	
//	Not visible! Package accessible!
//	ClassZZ z;
}
