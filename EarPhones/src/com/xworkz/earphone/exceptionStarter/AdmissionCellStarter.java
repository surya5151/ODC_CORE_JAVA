package com.xworkz.earphone.exceptionStarter;

import com.xworkz.earphone.exceptionEvent.AdmissionCell;
import com.xworkz.earphone.exceptionEvent.exception.MBBSSeatException;

public class AdmissionCellStarter {

	public static void main(String[] args) throws MBBSSeatException {
		AdmissionCell admissionCell = new AdmissionCell();
		admissionCell.admitForMbbs("S", true, true );
		
	}

}
