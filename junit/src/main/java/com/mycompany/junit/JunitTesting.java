package com.mycompany.junit;

public class JunitTesting 
{
	public String removeA(String data)
	{
		if (data.length() == 0)
			return data;
		else if(data.charAt(0)=='A' && data.charAt(1)=='A')
		{
			String result = data.substring(2);
			return result;
		}
		else if(data.charAt(0)=='A')
		{
			String result = data.substring(1);
			return result;
		}
		else if(data.charAt(1)=='A')
		{
			String result = data.substring(0,1)+data.substring(2);
			return result;
		}
		else
			return data;
	}
	
    public static void main( String[] args )
    {
        new JunitTesting();
    }
}
