
public class Player {

	private int health;
	private int act;

	public void setHealth(int health)
	{
		this.health=health;
		act=health;
	}

	public int getHealth()
	{
		return health;
	}

	public void lose()
	{
		health-=10;
	}

	public void fullrevive()
	{
		health=act;
	}

}
