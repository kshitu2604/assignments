package assignments;

public class Assignment2_3DArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][][] test = {
		    	 {{"Sub1","mathemathics","pass(78)"} ,{"Sub1","mathemathics","pass(78)"} ,{} ,{},{},{}},
		   		 {{} ,{} ,{} ,{"Sub4","Basic Electronics","Fail(19)"},{"Sub5","Engineering Physics","Fail(24)"},{}},
		   		 {{} ,{} ,{} ,{},{},{}},
		   		 {{} ,{} ,{} ,{"Sub4","Database\r\n"
		   		 		+ "Systems","Fail(19)"},{},{"Sub6","Software Engineering","Pass(87)"}},
		   		 {{} ,{} ,{} ,{},{},{}},
		   		 {{} ,{} ,{} ,{},{},{}},
		   		 {{} ,{} ,{} ,{},{},{}},
		   		 {{} ,{} ,{} ,{},{},{}},
		   		 };
			System.out.println( "Semester 2 Subject 4 value: " + test [1][3][1] + " and Semester 2 Subject 5 value: " + test [1][4][1] );
			System.out.println("the Status/Marks of Semester 4 Subject 3: "+ test[3][3][2] + " and  the Status/Marks of Subject 6: " + test[3][5][2] );
		   			 

	}

}
