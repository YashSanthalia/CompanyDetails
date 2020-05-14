package companydetails;

import java.util.*;
public class Replace {

		static Scanner input = new Scanner(System.in);
	
		
		public static String replace(String originalString, String delimiter)
		{
			char[] orgnlString = originalString.toCharArray();
			char[] delimitter = delimiter.toCharArray();
			char[] before = new char[50];
			int k = 0, i;
			for(  i = 0 ; i < orgnlString.length ; i++ )
			{
				if( orgnlString[i] == delimitter[k] )
				{
					before[i] = orgnlString[i];
					k++;
					if( orgnlString[++i] == delimitter[k] )
					{
						before[i] = orgnlString[i];
						k++;
						if( orgnlString[++i] == delimitter[k] )
						{
							before[i] = orgnlString[i];
							break;
						}
						else
						{
							i--;
							k = 0;
						}
					}
					else
					{
						i--;
						k = 0;
					}
				}
				else
					before[i] = orgnlString[i];
			}
		String after = input.nextLine();
		char[] after1 = after.toCharArray();
		for( char c : after1 )
		{
			before[++i] = c;
		}
		
		String newString = new String(before);
		return newString;
	}
	}


