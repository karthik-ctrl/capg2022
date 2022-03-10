package mocktest2;



class ABC

{
	String sen;
	
	public String getSen() {
		return sen;
	}

	public void setSen(String sen) {
		this.sen = sen;
	}

	public String LongestWord( String sen)
	{
		String s []=sen.split(" ",sen.length());
		int maxlen=0;
		int idx=0;
	
	for(int i=0;i<s.length;i++)
	{
		s[i] = s[i].replaceAll("[^a-zA-Z0-9]", "");
		int len=s[i].length();
		if(len>maxlen)
		{
			maxlen=len;
			idx=i;
		}
	}
	
		
		return s[idx];
		
	}
}

public  class Task2
{
	public static void main(String args[])
	{
		ABC obj =new ABC();
		System.out.println(obj.LongestWord("i love dogs"));
		
	}
}