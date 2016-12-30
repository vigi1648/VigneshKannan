
public class Car implements vehicle {
	public void speed()
	{
		System.out.println("Speed of Car is 200 kmph");
	}
	

public static void main(String args[])
{
vehicle c=new Car();
c.speed();
vehicle b=new Bike();
b.speed();
}
}

