package resources;

public class ReqBodyupdate {
	static String s;
	
	 public void Add(String a,String b,String c,String d){
		s="{\"firstName\":\""+a+"\",\"lastName\":\""+b+"\",\"userEmail\":\""+c+"\",\"userRole\":\"customer\",\"occupation\":\"Student\",\"gender\":\"Male\",\"userMobile\":\""+d+"\",\"userPassword\":\"aA@8779983622\",\"confirmPassword\":\"8779983622\",\"required\":true}";
		
	}
	public static  String returnadd()
			{
		return s;
			}

}
