package abstract2;

public abstract class mobile {
	abstract void call();
	void manage() 
	{
	System.out.println("messing ");

    }
}
class user1 extends mobile
{
	void call() 
	{
	System.out.println("calling  ");

    }	
}

