package pregunta1;

public class Pares 
{
	public static void main(String[]args)
	{
		int i =2;
		
		while(i<100)
		{
			System.out.println(i);
			if(i%2 == 0)
			{
				System.out.println("Es par");
			}
			else
			{
				System.out.println("Es impar");
			}
			i++;
			
		}
	}
}
