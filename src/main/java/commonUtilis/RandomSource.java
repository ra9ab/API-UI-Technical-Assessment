package commonUtilis;

public  class RandomSource {

	public static String getValidPhoneNumber()
	{
		long number = (Math.round(Math.random()*100000000));
		String	PhoneNumber = "011"+Long.toString(number);
		return PhoneNumber;
	}
	
	public static String getValidPostalCode()
	{
		long number = (Math.round(Math.random()*100000));
		String	PhoneNumber = Long.toString(number);
		return PhoneNumber;
	}
	
	
	public static String getValiHomeNumber()
	{
		long number = (Math.round(Math.random()*1000000));
		String	PhoneNumber = Long.toString(number);
		return PhoneNumber;
	}
	




	public static String getValidName ()
	{

		// chose a Character random from this String 
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "abcdefghijklmnopqrstuvxyz"; 

		// create StringBuffer size of AlphaNumericString 
		StringBuilder First_Name = new StringBuilder(15); 

		for (int i = 0; i < 15; i++) { 

			// generate a random number between 
			int index = (int)(AlphaNumericString.length() 
					* Math.random()); 

			// add Character one by one in end of sb 
			First_Name.append(AlphaNumericString 
					.charAt(index)); 
		} 

		return First_Name.toString(); 
	} 





	
	public static String getValidEmail ()
	{
		String Email ;

		// chose a Character random from this String 
		String AlphaNumericString = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "0123456789"
				+ "abcdefghijklmnopqrstuvxyz"; 

		// create StringBuffer size of AlphaNumericString 
		StringBuilder sb = new StringBuilder(15); 

		for (int i = 0; i < 15; i++) { 

			// generate a random number between 
			int index = (int)(AlphaNumericString.length() 
					* Math.random()); 

			// add Character one by one in end of sb 
			sb.append(AlphaNumericString 
					.charAt(index)); 
		} 

		Email = sb.toString()+"@gmail.com";
		return Email; 

	}
	

	

	

	



}
