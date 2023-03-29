package chap13_objectarray;

import chap13_objectarray.clazz.English;
import chap13_objectarray.clazz.ILecture;
import chap13_objectarray.clazz.Mathmetics;
import chap13_objectarray.clazz.Programming;

public class _02_interfaceArrary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ILecture [] lec = new ILecture[3];
		
		lec[0] = new English();
		lec[1] = new Mathmetics();
		lec[2] = new Programming();
		
		
		
		for(int i = 0; i < lec.length; i++) {
			lec[i].proceedLecture();
		
	}

}
}
