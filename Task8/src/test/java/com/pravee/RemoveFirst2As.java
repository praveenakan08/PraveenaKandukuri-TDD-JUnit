package com.pravee;

public class RemoveFirst2As 
{
	public String remove(String input)
	{
		
		String temp=input;
		int flag=0;
		
		if(input.length()==1 && input.charAt(0)=='A')
			temp="";
		
		else if(input.length()>0)
		{
			if(input.charAt(0)=='A')
		    {
		     	temp=temp.substring(1,temp.length());
			    flag=1;   
		    }
		
			if(flag==1 && input.charAt(1)=='A')
			    temp=temp.substring(1,temp.length());
			
			else if(flag==0 && input.charAt(1)=='A')
			    temp=temp.substring(0,1)+temp.substring(2,temp.length());
		}
		
		return temp;	
	}

}
