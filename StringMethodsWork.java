
public class StringMethodsWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="ABCDECD";
		String str1="ACESFG";
		int a=str.length();
		System.out.println(a);
		char c=str.charAt(4);
		System.out.println(c);
		int d=str.indexOf('D');
		System.out.println(d);
		int e=str.lastIndexOf('M');
		System.out.println(e);
		String f=str.toLowerCase();
		System.out.println(f);
		String g=str.substring(4);
		System.out.println(g);
		String h=str.substring(2,6);
		System.out.println(h);
		char[]i=str.toCharArray();
		System.out.println(i);
		int j=str.indexOf("ABC");
		System.out.println(j);
		boolean k=str.contains("ABC");
		System.out.println(k);
		String l=str.replace('D','s');
		System.out.println(l);
		String m=str.replaceAll("ABC","SUN");
		System.out.println(m);
		String o=" santosh ";
		String p=o.trim();
		System.out.println(p);
		if(str.equals(str1))
		{
			System.out.println("equals");
		}
		else
		{
			System.out.println("not found");
		}
		String q=str.concat(str1);
		System.out.println(q);
		String rs=str+str1+15+67;
		System.out.println(rs);
	}

}
