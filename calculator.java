
public class calculator implements implement {

	@Override
	public int add(int i, int j) 
	{
		return i+j;
	}

	@Override
	public int subs(int i, int j) 
	{
		return i-j;
	}

	@Override
	public int multi(int i, int j) 
	{
		return  i*j;
	}

	@Override
	public void display() {
		System.out.println("addition:"+this.add(10,20));
		System.out.println("substraction:"+this.subs(20,10));
		System.out.println("multiplication:"+this.multi(10,20));
	}
		public static void main(String arg[])
		{
	calculator calc = new calculator();
	calc.display();
	}

}
