import java.util.Scanner;


public class Opdracht7 
{

	public static void main(String[] args)
	{
		
		char charArray[] = {'f','i','e', 't', 's'};
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Gok het woord van 5 letters");
		System.out.println("_ _ _ _ _");
		
		
		String s = sc.nextLine();
		char gok[] = s.toCharArray();
		String resultaat = "";
		

		for (int i = 0; i <=4;)
		{
			for (int x = 0; x <=4;x++)
			{
				if (gok[i] == charArray[i])
				{
					resultaat = (resultaat + "2");
					i++;
				}
		
				else if (gok[i] == charArray[x])
				{
					resultaat = (resultaat + "1");
					i++;
					
				}
				else if(x == 4)
				{
					resultaat = (resultaat + "0");
					i++;
		
				}
			}
		}
		
		System.out.println(resultaat);
		
				
		}
				
		
		
	
	
}
