class Strong_numbertoprint1to5000
{
	public static void main(String[] args) 
	{
		for(int a=1; a<=50000; a++)
		{
			int num=a;
			int sum=0;
			int lastdigit=0;
			int temp=num;
			while(num!=0)
			{
				lastdigit=num%10;
				int factorial=1;
				for(int i=1; i<=lastdigit; i++)
				{
                  factorial=factorial*i;
				}
				sum=sum+factorial;
				num=num/10;
			}
			  if(sum==temp)
			  {
		      System.out.println(a);
		      }
		}
	}
}

