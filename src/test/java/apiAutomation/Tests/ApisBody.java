package apiAutomation.Tests;

public class ApisBody {
	public static String createPostBody(int id)
	{
		return "{\r\n"
				+ "	\"title\": \"My title\",\r\n"
				+ "    \"body\": \"Content of my post\",\r\n"
				+ "    \"userId\": "+id+"\r\n"
				+ "}";
	}

}
