public class week3_2
{
    public static void main(String[] args)
    {
        //enter your code here...
		int num;
		for(int i=1; i<=5; i++){
			num = 1;
			for(int j=1; j<=i; j++){
				num=num*j;
			}
			System.out.println(num);
		}
    }
}