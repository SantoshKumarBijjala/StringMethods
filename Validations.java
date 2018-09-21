package Using_Strings;
public class Validations {
public static boolean isValidEmail(String s)
{
	boolean isValid=false;
	String[] n=s.split("@");
	if(n.length==2)
	{
		if(n[0].length()>=5)
		{
			String[] m=n[1].split("\\.");
			if(m.length==2)
			{
				if(n[0].length()>=2 && n[1].length()>=2 )
				{
					isValid=true;
				}
			}
		}
	}
	return isValid;
}
public static boolean isValidName(String name)
{
	boolean isValid=false;
	char[] ch=name.toCharArray();
	if(name.length()>=3)
	{
		if(name.charAt(0)>=65 && name.charAt(0)<=90)
		{
			for(int i=0;i<ch.length;i++)
			{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='o'||ch[i]=='u'||ch[i]=='y')
			{
				isValid=true;
			}
			}
		}
	}
	return isValid;
}
public static boolean isValidPanCard(String pan)
{
	boolean isValid=false;
	int c=0,c1=0;
	char[]ch=pan.toCharArray();
	if(pan.length()==10)
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65&&ch[i]<=90)
			{
				c++;
			}
		}
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=48&&ch[i]<=57)
			{
				c1++;
			}
		}
		if(c1>0&&c>0)
		{
			isValid=true;
		}
	}
	return isValid;
}
public static boolean isValidBankPswd(String pswd)
{
	char[]ch=pswd.toCharArray();
	int c=0,c1=0,c2=0,c3=0;
	boolean isValid=false;
	if(pswd.length()>=8)
	{
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>=65&&ch[i]<=90)
			{
				c++;
			}
			if(ch[i]>=97&&ch[i]<=122)
			{
				c1++;
			}
			if(ch[i]>=33&&ch[i]<=47)
			{
				c2++;
			}
			if(ch[i]>=48&&ch[i]<=57)
			{
				c3++;
			}
		}
		if(c>0&&c1>0&&c2>0&&c3>0)
		{
			isValid=true;
		}
	}
	return isValid;
}
	public static void main(String[] args) 
	{
		String s="santosh179santu@gmail.com";
		boolean b=isValidEmail(s);
		System.out.println(b);
		String name="Santosh";
		boolean ans=isValidName(name);
		System.out.println(ans);
		String pan="HDNDUJ1234";
		boolean o=isValidPanCard(pan);
		System.out.println(o);
		String pswd="S#ntosh123";
		boolean l=isValidBankPswd(pswd);
		System.out.println(l);
	}

}
