package excelread;

import java.io.IOException;

public class ExcelMain {

	public static void main(String[] args) throws IOException {
		
		String s=ExcelCode.readStringData(1, 0); 
 		System.out.println(s); 
 		String s1=ExcelCode.readIntegerData(1, 1); 
 		System.out.println(s1); 
		
		String sr=ExcelCode.readStringData(2, 0); 
 		System.out.println(sr); 
 		String s2=ExcelCode.readIntegerData(2, 1); 
 		System.out.println(s2); 
		// TODO Auto-generated method stub

	}

}
