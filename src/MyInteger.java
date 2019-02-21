
public class MyInteger 
{
	private int value;

	public MyInteger()
	{
		this.value = 1082;
	}

	public MyInteger(int value) 
	{
		if(value >= Integer.MIN_VALUE && value <= Integer.MAX_VALUE)
		{
		this.value = value;
		}
		else System.out.println("Invalid value");
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}
	
	public void isEven()
	{
		if (this.value % 2 == 0)
		{
	         System.out.println("The number is even.");
		}
	}
	public void isOdd()
	{
		if (this.value % 2 != 0)
		{
	         System.out.println("The number is odd.");
		}
	}

	public static int add(MyInteger int1, MyInteger int2)
	{
		int sum = int1.value + int2.value;
		return sum;
	}

	@Override
	public String toString() {
		return "MyInteger [value=" + value + "]";
	}
	
	public static void main(String[] args)
	{
		MyInteger int1 = new MyInteger();
		MyInteger int2 = new MyInteger(3);
		
		int1.toString();
		int1.isEven();
		int1.isOdd();
		
		int2.toString();
		int2.isEven();
		int2.isOdd();
		
		System.out.println(add(int1, int2));
	}
}
